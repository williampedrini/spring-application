/**
 * @desc this class will hold functions for the query controller used by the 'query.html' page.
 * examples include getAirports(), sendToLocationUrl(), setRunways()
 * @author wcustodio
 * @required $window, $scope, airportAPIService, countriesService, urlService
 */
angular.module("appTest").controller("queryCtrl", function ($window, $scope, airportAPI, countries, url) {

    //Pagination variables.
    $scope.currentPage = 1;
    $scope.numPerPage = 10;
    $scope.maxSize = 5;

    //Airport variables.
    $scope.airports = [];
    $scope.filteredAirports = [];

    //Configuration of the text areas used to search airports.
    $scope.countries = countries.data;
    $scope.selectedCountryByName = {};
    $scope.selectedCountryByCode = {};

    //Runways variables.
    $scope.runways = [];

    //Error handling variables.
    $scope.error = '';

    /**
     * @desc Set the runways to be shown at the modal '#runwaysModal'.
     * @param runways runways to be shown.
     */
    $scope.setRunways = function(runways){
        $scope.runways = runways;
    };

    /**
     * @desc Function responsible for retrieving all the airports filtered by a specific criteria.
     * @param $event Contains all information about the event which triggered this function.
     */
    $scope.getAirports = function ($event) {

        //Shows the button as loading button.
        var searchButton = $(event.target);
        $(searchButton).button('loading');

        var requestParam = {
            "countryName" : $scope.selectedCountryByName ? $scope.selectedCountryByName.title : '',
            "countryCode" : $scope.selectedCountryByCode ? $scope.selectedCountryByCode.title : ''
        };

        //Clean the state of the search objects before performe a new search.
        _setError(undefined);
        _setAirports(undefined);

        airportAPI.getAirports(requestParam).then(function onSuccess(response) {
            _successAirportRequest(response);
            //Reset the butto state to normal.
            searchButton.button('reset');
        }).catch(function onError(response) {
            _setError(response.data.errors.join(","));
            //Reset the butto state to normal.
            searchButton.button('reset');
        });
    };

    /**
     * @desc Creates a location url based on a latitude degree and a longitude degree.
     * @param latitude Value of the latitude.
     * @param longitude Value of the longitude.
     */
    $scope.sendToLocationUrl = function (latitude, longitude) {
        $window.location.href = url.makeLocationUrl(latitude, longitude);
    };

    /**
     * @desc Function called when a @GET airports request obtains a success status.
     * @param response Object which with response data from the @GET airports request.
     */
    var _successAirportRequest = function(response) {

        //Defines all the airports from the searh to be shown.
        _setAirports(response.data.airports);

        // Handler responsible for executing the pagination.
        $scope.$watch("currentPage + numPerPage", function() {
            var begin = (($scope.currentPage - 1) * $scope.numPerPage), end = begin + $scope.numPerPage;
            $scope.filteredAirports = $scope.airports.slice(begin, end);
        });
    };

    /**
     * @desc Defines the content of the variable 'error'.
     * @param error Content to be inserted into the variable.
     */
    var _setError = function(error) {
        $scope.error = error;
    };

    /**
     * @desc Defines the content of the variable 'airports'.
     * @param error Content to be inserted into the variable.
     */
    var _setAirports = function(airports){
        $scope.airports = airports;
    }
});
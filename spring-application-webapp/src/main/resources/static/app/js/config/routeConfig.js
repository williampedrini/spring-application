/**
 * @desc this class defines the existing page routes in the application.
 * @author wcustodio
 */
angular.module("appTest").config(function ($routeProvider) {
    $routeProvider.when("/", {
		templateUrl: "query.html",
		controller: "queryCtrl",
        resolve: {
            countries: function (countryAPI) {
                return countryAPI.getCountries();
            }
        }
	}).when('/query', {
        templateUrl: "query.html",
        controller: "queryCtrl",
        resolve: {
            countries: function (countryAPI) {
                return countryAPI.getCountries();
            }
        }
    });
});
/**
 * @desc this class will hold functions used to execute http requests to retrieve or manage the content of the countries.
 * examples include getCountries()
 * @author wcustodio
 * @required $http, configValue
 */
angular.module("appTest").factory("countryAPI", function ($http, config) {

	var _getCountries = function () {
		return $http.get(config.baseUrl + "/country");
	};

	return {
        getCountries: _getCountries
	};
});
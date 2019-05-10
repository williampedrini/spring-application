/**
 * @desc this class will hold functions used to execute http requests to retrieve or manage the content of the airports.
 * examples include getAirports()
 * @author wcustodio
 * @required $http, $httpParamSerializer, configValue
 */
angular.module("appTest").factory("airportAPI", function ($http, $httpParamSerializer, config) {

	var _getAirports = function (params) {
		return $http.get(config.baseUrl + "/airport?" + $httpParamSerializer(params));
	};

	return {
		getAirports: _getAirports
	};
});
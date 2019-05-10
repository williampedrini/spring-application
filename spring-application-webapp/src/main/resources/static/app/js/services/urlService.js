/**
 * @desc this class will hold functions used to manage specific urls used by the application.
 * examples include makeLocationUrl()
 * @author wcustodio
 * @required configValue
 */
angular.module("appTest").factory("url", function (config) {

	var _makeLocationUrl = function (latitude, longitude) {
        return config.googleMapsBaseUrl + latitude + "," + longitude + ",15z";
	};

	return {
        makeLocationUrl: _makeLocationUrl
	};
});
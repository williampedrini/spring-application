/**
 * @desc this class will hold functions used to configure the application.
 * examples include accessQueryPage()
 * @author wcustodio
 * @required $scope, $location, config
 */
angular.module("appTest").controller("appTestCtrl", function ($scope, $location, config) {

    //Variables used to define the static content into 'index.html' page.
    $scope.appName = config.appName;
    $scope.queryLinkName = 'Query';

    //Variable used to define when the route is on change.
    $scope.showLoading = false;

    $scope.accessQueryPage = function () {
        $location.path("/query");
    };

    $scope.$on('$routeChangeStart', function() {
        $scope.showLoading = true;
    });

    $scope.$on('$routeChangeSuccess', function() {
        $scope.showLoading = false;
    });
});
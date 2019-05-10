/**
 * @desc this class defines a directive which is responsible for showing error messages.
 * @author wcustodio
 */
angular.module("appTest").directive("uiAlert", function () {
	return {
		template: '<div class="alert alert-danger" ng-show="message"><strong>{{title}}</strong><p>{{message}}</p></div>',
		replace: true,
		restrict: "AE",
		scope: {
			title: "@",
			message: "="
		},
		transclude: true
	};
});
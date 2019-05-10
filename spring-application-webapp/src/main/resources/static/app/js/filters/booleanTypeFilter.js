/**
 * @desc this class defines a filter which will converter values of boolean fields to be shown to the user.
 * @author wcustodio
 */
angular.module("appTest").filter("booleanType", function () {
	return function (input) {
        switch(input) {
            case true:
                return 'Yes';
        	case false:
                return 'No';
            default:
                return ''
        }
	};
});
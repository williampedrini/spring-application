/**
 * @desc this class defines a filter which will converter values of the airport type to be shown to the user.
 * @author wcustodio
 */
angular.module("appTest").filter("airportType", function () {
	return function (input) {
        switch(input) {
            case 'small_airport':
                return 'Small-Sized Airport';
        	case 'medium_airport':
                return 'Medium-Sized Airport';
            case 'large_airport':
                return 'Large-Sized Airport';
            case 'seaplane_base':
                return 'Seaplane Base';
			case 'heliport':
                return 'Heliport';
			case 'closed':
                return 'Closed';
			case 'balloonport':
                return 'Balloon Port';
            default:
                return ''
        }
	};
});
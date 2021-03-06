package org.rozzie.processor.utils;

/**
 * Created by chamarap on 5/14/17.
 */
public class Constants {

	public static final String EVENT_MESSAGE = "=============================================\n"+
			"        ROZZIE EVENT TRIGGERED\n" + "=============================================\n";

	public static final String SCHEMA_KEY_PROPERTY = "key";

	public static class RequestUri {

		public static final String GET = "/info";
		public static final String CREATE = "/create";
		public static final String VALIDATE_JSON = "/validate";

		public static class AirPort {
			public static final String CONTROLLER = "/port";
		}
		public static class Baggage {
			public static final String CONTROLLER = "/bag";
		}
		public static class Flight {
			public static final String CONTROLLER = "/flight";
			public static final String CHANGE_DEPATURE = "/changeDepature";
			public static final String CHANGE_ARRIVAL = "/changeArrival";
			public static final String TAKE_OFF = "/takeOff";
		}
		public static class Passenger {
			public static final String CONTROLLER = "/passenger";
			public static final String CHECK_IN = "/checkin";
		}
		public static class Plane {
			public static final String CONTROLLER = "/plane";
		}

	}

	public static class EventName {
		public static final String FLIGHT_DEPATURE_TIMECHANGE = "depatureTimeChange";
		public static final String FLIGHT_ARRIVAL_TIMECHANGE = "arrivalTimeChange";
		public static final String FLIGHT_BOOKING = "bookingEvent";
	}
}

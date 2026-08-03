import java.time.LocalDateTime;

public class UsingLocalDateAndTime{
	public static void main(String[] args){
		LocalDateTime todaysDateTime = LocalDateTime.now();
		LocalDateTime meetingDateTime = LocalDateTime.of(2000,5,25,11,22,12);
		LocalDateTime classDateTime = LocalDateTime.parse("2028-10-15T02:00:00");
		
		
		System.out.printf("Meeting year is %s%n",meetingDateTime.getYear());
		System.out.printf("Meeting month is %s%n",meetingDateTime.getMonth());
		System.out.printf("Meeting day is %s%n",meetingDateTime.getDayOfMonth());
		System.out.printf("Meeting hour is %s%n",meetingDateTime.getHour());
		
		System.out.printf("The meeting date is %s%n",meetingDateTime.plusDays(5));
		System.out.printf("The meeting hours is %s%n",meetingDateTime.plusHours(5));
		System.out.printf("The meeting date is %s%n",meetingDateTime.minusMinutes(52));
		
		boolean isbefore = meetingDateTime.isBefore(classDateTime);
		boolean isafter = meetingDateTime.isAfter(classDateTime);
		boolean isEqual = meetingDateTime.equals(classDateTime);
		
		System.out.printf("Is %s the same as %s? %b%n",meetingDateTime,classDateTime,isEqual);
		
	}
}
package busRes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
 String PassengerName;
 int Phno;
 int BusNo;
 Date date;
 
 Booking(){
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter passengerName: ");
	 PassengerName = scanner.next();
	 
	 System.out.println("Enter phno: ");
	 BusNo = scanner.nextInt();
	
	 System.out.println("Enter busNo: ");
	 BusNo = scanner.nextInt();
	 
	 System.out.println("Enter date dd-mm-yyyy: ");
	 String dateInput = scanner.next();
	 SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
	 try {
		date = dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
  public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
	  int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == BusNo)
				capacity = bus.getCapacity();
		}
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.BusNo == BusNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}

	  
  
}


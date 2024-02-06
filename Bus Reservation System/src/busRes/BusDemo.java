package busRes;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Booking> bookings= new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,true,54));
		buses.add(new Bus(3,false,45));
		
		
		int userOption=1;
		Scanner scanner =new Scanner(System.in);
		
		for(Bus b:buses) {
			 b.displayBusInfo();
		 }
		
		while(userOption==1) {
		System.out.println("Enter 1 to book bus and 2 to exit");
		userOption = scanner.nextInt();
		if(userOption==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("your bus is booking");
			}
			else {
				System.out.println("sorry, Bus is full. Try another bus or date");
			}
		}

	}

}
}

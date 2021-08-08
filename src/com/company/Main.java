package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        Traveler traveler = new Traveler(" ", 0, 70000000 );
      //  Payment tripPayment = new Cash(1500.50f);
        traveler.setName("Juan Perez ");
        traveler.setAge(30);
        traveler.setPhone(70707070);

        Credit tripPaymentCredit = new Credit(0f, 0);
        tripPaymentCredit.setPrice(5000);
        tripPaymentCredit.setQuotas(5);


        Hotel hotelTrip= new Hotel("","","","");
        hotelTrip.setName("Barcelo Bavaro");
        hotelTrip.setCategory(" 5 Stars");
        hotelTrip.getEmailHotel();
        hotelTrip.setRoom(" Queen Room");

        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy");
        Date date = obj.parse("20-08-2021");
        Date date1 = obj.parse("12-09-2021");


        Trip trip = new Trip(traveler, tripPaymentCredit, hotelTrip, "", "", obj.format(date), obj.format(date1),"" );
        trip.setDestinationCountry("Republica Dominicana");
        trip.setDestinationCity("Punta Cana");
        trip.setReasonTrip("Working");
        trip.display();

        Cash tripPaymentCash = new Cash(0f);
        tripPaymentCash.setPrice(5000);
        tripPaymentCash.display();
    }
}

package org.example.Exercise_27_06_2024.jacksonapi.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Exercise_27_06_2024.gson.serialization.Booking;
import org.example.Exercise_27_06_2024.gson.serialization.Bookingdates;
import org.testng.annotations.Test;

public class Lab_296 {

    @Test
    public void SerializationJackson() throws JsonProcessingException {

        Booking booking = new Booking();
        booking.setFirstname("atul");
        booking.setLastname("singh");
        booking.setTotalprice(1144);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        System.out.println(jsonString);

    }


}

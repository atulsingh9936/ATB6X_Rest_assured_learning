package org.example.Exercise_27_06_2024.jacksonapi.deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Exercise_27_06_2024.gson.serialization.Booking;
import org.testng.annotations.Test;

public class Lab_296 {


    @Test
    public void deserialization() throws JsonProcessingException {
        String jsonString = "{\n" +
                "    \"firstname\" : \" Atul \",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        ObjectMapper objectMapper = new ObjectMapper();
        Booking booking = objectMapper.readValue(jsonString,Booking.class);
        System.out.println(booking);
        System.out.println(booking.getFirstname());
    }
}

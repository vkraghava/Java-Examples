package me.example.streams;

import me.example.exceptions.StreamsException;

import java.util.ArrayList;
import java.util.List;

public class StreamsWithException {

    public static void main(String args[]) throws StreamsException{
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("String 1");
        listOfStrings.add("String 2");
        listOfStrings.add("String 3");
        listOfStrings.add("String 4");
        listOfStrings.add("String 5");

        try {
            listOfStrings.stream().forEach(obj -> {

                try {
                    Integer.parseInt(obj);
                } catch (NumberFormatException ex) {
                    throw ex;
                }
            });
        } catch (NumberFormatException ex) {
            throw new StreamsException(ex.getMessage().toString());
        }

    }

}

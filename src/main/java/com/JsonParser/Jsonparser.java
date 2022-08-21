package com.JsonParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jsonparser {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser jsp = new JSONParser();
        FileReader fr = new FileReader(".\\src\\main\\resources\\employee.json");

        Object obj = jsp.parse(fr);
        JSONObject empjsonobj = (JSONObject)obj;
// Going to read key value pair for first name and last name
        String fname = (String)empjsonobj.get("firstname");
        String lname = (String)empjsonobj.get("lastname");
        Number vage = (Number)empjsonobj.get("Age");
        System.out.println("First Name : " +fname);
        System.out.println("Last Name : " +lname);
        System.out.println("Age is : " +vage);

// Going to read array "address"
        JSONArray Jarray = (JSONArray)empjsonobj.get("address");
        for (int i=0;i<Jarray.size();i++){
            JSONObject addr = (JSONObject)Jarray.get(i);
            String strnm = (String)addr.get("street");
            String citynm = (String)addr.get("city");
            String statename = (String)addr.get("state");

            System.out.println("Street name of " +i +" is >>>>>>> : " +strnm);
            System.out.println("City name of " +i +" is >>>>>>>> : " +citynm);
            System.out.println("State name of " +i +" is >>>>>>> : " +statename);
        }
    }
}

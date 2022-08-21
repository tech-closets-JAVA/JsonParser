package com.JsonParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Iterator;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class colorparser {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser jsp = new JSONParser();
        FileReader fr = new FileReader(".\\src\\main\\resources\\colors.json");

        Object obj = jsp.parse(fr);
        JSONObject empjsonobj = (JSONObject) obj;

// Going to read array "address"
        JSONArray Jarray = (JSONArray) empjsonobj.get("colors");
        for (int i = 0; i < Jarray.size(); i++) {
            JSONObject colors = (JSONObject) Jarray.get(i);
            JSONObject code = (JSONObject) colors.get("code");
            JSONArray rgba = (JSONArray) code.get("rgba");

            String strnm = (String) colors.get("color");
            String citynm = (String) colors.get("category");
            String statename = (String) colors.get("type");
            String hex = (String) code.get("hex");
//            String codeval = colors.get("code").;
//
            System.out.println("color is " + i + " is >>>>>>> : " + strnm);
            System.out.println("catgory is " + i + " is >>>>>>>> : " + citynm);
            System.out.println("State name is " + i + " is >>>>>>> : " + statename);
            System.out.println("Code name is " + i + " is >>>>>>> : " + code);
            System.out.println("Hex name is " + i + " is >>>>>>> : " + hex);
            System.out.println("rgba name is " + i + " is >>>>>>> : " + rgba);
        }
    }
}

package oimclient;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Class1 {
    public Class1() {
        super();
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        
        Date date=new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(dateFormat.format(date));
        
    }
}

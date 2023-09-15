/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author This PC
 */
public class Validation {
    private final static Scanner sc= new Scanner(System.in);
    
    public static int checkInputIntLimit(int min, int max){
        while(true){
            try{
                int result= Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max)
                    throw new Exception();
                else return result;             
            }catch(Exception e){
                System.out.println("Please input number in range ["+min+", "+max+"]!");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public static String checkInputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Not allowed empty!");
                System.out.println("Enter again; ");
            } else {
                return string;
            }
        }
    }
    
    public static int checkNumberBinary(){
        while(true){
            System.out.println("Required user enter the input value: ");
            String s= sc.nextLine();
            if(s.matches("[0-1]+")){
                int value= Integer.parseInt(s);
                return value;
            }else{
                System.out.println("Binary just enter number 0 or 1!");
            }
        }
    }
    
    public static int checkNumberDecimal(){
        while(true){
            System.out.println("Required user enter the input value: ");
            String s= sc.nextLine();
            if(s.matches("[0-9]+")){
                int value= Integer.parseInt(s);
                return value;
            }else{
                System.out.println("Decimal just enter number!");
            }
        }
    }
    
    public static String checkNumberHexa(){
        while(true){
            System.out.println("Required user enter the input value: ");
            String s= sc.nextLine();
            if(s.matches("[A-F0-9]+")){                
                return s;
            }else{
                System.out.println("Hexadecimal just contains (A->F and 0->9)!");
            }
        }
    }
    
    

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Stack;
import view.Validation;

/**
 *
 * @author This PC
 */
public class ChangeBaseNumber {
    
    public static String changeDecimal(int dec, int base){
        String result="";
        Stack<Integer> s= new Stack<>();
        
        while(dec!=0){
            s.push(dec%base);
            dec/=base;
        }
        
        while(!s.empty()){
            int r= s.pop();
            String sub;
            if(r<10) result= result + r ;
            else 
                result= result+ ((char) (r - 10 + 'A'));            
        }
        if(base==2){           
            for(int i=result.length(); i<4; i++){
                result= "0"+result;
            }
        }
        return result;
    }
    
    public static String changeBinary(int bin, int base){
        Stack<String> s= new Stack<>();
        int count=0, result=0;
        String sub="";
        if(base==10){
            while(bin>0){
                s.push(bin%10+"");
                bin/=10;
                count++;
            }         
            for(int i=count-1; i>=0; i--){
                int val= (int) Math.pow(2, i) * Integer.parseInt(s.pop());           
                result+=val;
            } 
            sub+=result+"";
        }
        else if(base==16){
            while(bin>0){
                s.push(bin%10000+"");               
                bin/=10000;
                count++;
            }                   
            for(int i=0; i<=count-1; i++){               
                sub+= changeDecimal(Integer.parseInt(changeBinary(Integer.parseInt(s.pop()), 10)), 16);
            }
        }else{
            sub+=bin;
        }
        return sub;
    }
    
    
    
    public static String changeHexa(String hexa, int base){
        String[] s= hexa.split("");
        String result="";
        int value=0;
        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case "A":
                    if (base == 2) {
                        result += changeDecimal(10, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i -1) * 10;                        
                    }                   
                    break;
                case "B":
                    if (base == 2) {
                        result += changeDecimal(11, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i -1) * 11;
                    }                   
                    break;
                case "C":
                    if (base == 2) {
                        result += changeDecimal(12, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i - 1) * 12;                     
                    }
                    break;
                case "D":
                    if (base == 2) {
                        result += changeDecimal(13, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i - 1) * 13;
                    }                    
                    break;
                case "E":
                    if (base == 2) {
                        result += changeDecimal(14, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i - 1) * 14;
                    }                   
                    break;
                case "F":
                    if (base == 2) {
                        result += changeDecimal(15, 2);
                    } else if (base == 10) {
                        value += Math.pow(16, s.length - i - 1) * 15;
                    }                   
                    break;
                default:
                    if (base == 2) {
                        result += changeDecimal(Integer.parseInt(s[i]), 2);
                    } else if (base == 10) {
                        value += Math.pow(Integer.parseInt(s[i]), s.length -i-1) * Integer.parseInt(s[i]);
                    }
                    break;
            }
        }
    if(base==16){
        result+=hexa;
    }else if(base==10){
        result+=value;
    }
        return result;
    }      
}

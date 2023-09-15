/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.ChangeBaseNumber;
import view.Menu;
import view.Validation;

/**
 *
 * @author This PC
 */
public class Manager extends Menu<String>{
    
    int base;
    Scanner sc= new Scanner(System.in);   
    public Manager(String title, String[] s){
        super(title,s);
    }
   
    @Override
    public void execute(int n) {       
        switch (n) {
            case 1:
                getBaseNumber();                                              
                System.out.println(ChangeBaseNumber.changeBinary(Validation.checkNumberBinary(), base));
                break;
            case 2:
                getBaseNumber();
                System.out.println(ChangeBaseNumber.changeDecimal(Validation.checkNumberDecimal(), base));
                break;
            case 3:
                getBaseNumber();
                System.out.println(ChangeBaseNumber.changeHexa(Validation.checkNumberHexa(), base));
                break;
            case 4:
                System.exit(0);
        }
    }
    
    public void getBaseNumber(){
        String title= "Required user choose the base number out";
        String[] s= new String[] {"binary", "decimal",  "hexadecimal"};       
        Menu menu= new Menu(title, s) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        base = 2;
                        break;
                    case 2:
                        base = 10;
                        break;
                    case 3:
                        base = 16;
                        break;                    
                }
            }
        };
        menu.run1();       
    }
    
}

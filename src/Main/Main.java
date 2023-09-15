/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import controller.Manager;

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "Required user choose the base number input";
        String[] s= new String[] {"binary", "decimal",  "hexadecimal", "exit"};
        Manager mana= new Manager(title, s);
        mana.run();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bms;

import java.util.Scanner;

/**
 *
 * @author Lab-1
 */
public class Bms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
		User user= new User(sc);
		Account acc= new Account(sc);
		Account_Manager acc_m= new Account_Manager(sc);
		user.register();
        // TODO code application logic here
    }
    
}

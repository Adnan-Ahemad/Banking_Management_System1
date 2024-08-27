/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms;

import java.util.Scanner;

/**
 *
 * @author Lab-1
 */
public class User {
private Scanner sc;
    public User(Scanner sc) {
        this.sc=sc;
    }
    public void register(){
        System.out.print("Full Name :");
        String full_name=sc.nextLine();
        System.out.println("Enter email :");
        String email=sc.nextLine();
        System.out.println("Enter Password : ");
        String pass=sc.nextLine();
        if(user_exists(email)){
            System.out.println("Email already exists!...");
            return;
        }
    }
    public String login() {
        System.out.println("Email :");
        String email=sc.nextLine();
        System.out.println("Password :");
        String pass=sc.nextLine();
    return null;
}

    private boolean user_exists(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

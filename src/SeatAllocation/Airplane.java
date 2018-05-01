/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllocation;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author J377301
 */
public class Airplane {
    
    public static void main(String[] args){
    
        //Initialise
        int rows = 12;
        int cols = 6;
        
        //Create an array to hold the number of rows and columns
        String[][] seats = new String[rows][cols];
        
        SeatingPlan.displaySeats(seats);
        
        Scanner input = new Scanner(System.in);
        SeatingPlan.makeBooking(seats, input);
        
        SeatingPlan.displaySeats(seats);
    }
}
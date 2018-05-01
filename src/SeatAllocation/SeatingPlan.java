package SeatAllocation;

import java.io.*;   
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J377301
 */
public class SeatingPlan {
    
   
    //Create 2D array that has 12 rows and 6 columns
    //private String [][] seats;
    //private char emptySeat='A';
    //private char filledSeat='*';
    
    //Create instances for Passenger
    Passenger p = new Passenger();
    
    //Display Seats
    public static void displaySeats (String [][] seats)
    {
        System.out.println("        Seats Plan \n");
        System.out.println("\tABCDEF\n");
        
        //nested loops displays the seats on the airplane
        for (int i=0; i<seats.length; i++)
        {
            //if((i+1)<6)
            //{
                System.out.print( String.format("%8s", "Row" +(i+1) + "  "));
            /* } else
            {
                System.out.print("Row"+(i+1)+ "  ");
            }*/
            for (int j =0; j <seats[i].length; j++)
            {
                System.out.print((seats[i][j]==null)?"*":seats[i][j] +" ");
            } //end of inner loop
            System.out.println();
        }
        System.out.print("\n");
        System.out.println("Row 1,2,3 are first class; "+ "the remaining rows are economy class");
        
    }
    
    //Display user menu
    public static void displayMenu()
    {
        System.out.println("Choose one of the options");
        System.out.println("1 Book a Seat");
        System.out.println("2 Cancel a booking  ");
        System.out.println("3 Output a human readable file.");
        System.out.println("4 Output a machine readable file");
        System.out.println("5 Exit program \n");
        System.out.println();
    }
    
    //Get respond from user
    public static char getRespond()
    {
        Scanner input = new Scanner(System.in);
        
        //Get user's response 
        System.out.print("Enter your choice:       ");
        String s = input.next();
        char choice = s.charAt(0);
        
        return choice;
    }
    
    //Method to act on user response
    public static void Menu (char response, String[][] seats)
    {
        Scanner input = new Scanner(System.in);
        
        switch(response)
        {
            case '1':
                System.out.println("Please book a seat.");
                input.nextLine();
                break;
            case '2':
                 System.out.println("Cancel a booking.");
                 input.nextLine();
                break;
            case '3':
                 System.out.println("Human readable file.");
                 input.nextLine();
                break;
            case '4':
                 System.out.println("machine readable file.");
                 input.nextLine();
                break;
            case '5':
                 System.out.println("Exit");
                 System.exit(1);
                break;
        }
    }
    
    //Make booking on seats
    public static void makeBooking(String[][] seats, Scanner input)
    {
        Scanner s = new Scanner(System.in);
        int selectedRow=0;
        int selectedColumn=0;
        
        if (seats[selectedRow][selectedColumn] == null)
        {
            System.out.println("Pick your seat");
            System.out.print("row   :");
            selectedRow = s.nextInt();
            System.out.print("column    :");
            selectedColumn= s.nextInt();
            seats[selectedRow][selectedColumn]="A";
            return;
        } 
    }
    /*public void printSeatingChart()
   {
  
         try
       {
           FileReader fr = new FileReader("seatingPlan.txt");
          
           
           int k;
           while((k=fr.read())!=-1)
           {
               
               System.out.print((char)k);
           }
          
           fr.close();
       }
        catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
    catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
        
    }*/
        
    

}
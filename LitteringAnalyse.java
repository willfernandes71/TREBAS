/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost--+6/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.williamproject;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class LitteringAnalyse 
{
   public void Calc (double femTotal, double malesTotal, double depositTotal,  double littersTotal)
   {
   double totalPeople = malesTotal + femTotal;
   double maleLitter, femLitter;
        
   maleLitter = (malesTotal/totalPeople) * ((littersTotal/totalPeople)*100);
        
   femLitter = (femTotal/totalPeople) * ((littersTotal/totalPeople)*100);
   
   System.out.println("The total of males who litter is: " + maleLitter);
   
   System.out.println("The total of females who litter is: " + femLitter);
   }        
 
public class Main 
    {
    public static void main(String[] args) 
        {
        double malesTotal, femTotal, litterTotal, depositTotal;
        
        LitteringAnalyse analyse = new LitteringAnalyse(); 
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Enter the total of Males: ");
        malesTotal= scan.nextInt();
       
        System.out.println("Enter the total of Females: ");
        femTotal= scan.nextInt();
        
        System.out.println("Enter the total of People who litter: ");
        litterTotal= scan.nextInt();
        
        System.out.println("Enter the total of People who deposit: ");
        depositTotal= scan.nextInt();
        
        analyse.Calc(malesTotal,femTotal,litterTotal,depositTotal);
        }
    }
}

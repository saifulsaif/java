/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class interest {
    
    interest(){
        System.out.println("Enater your inverst amount:");
        Scanner cr = new Scanner(System.in);
    
        System.out.println("Enter Investement Amount: ");
        double investmentAmount = cr.nextDouble(); 
        System.out.println("Enter Monthly Interest Rate");
        double monthlyInterestRate = cr.nextDouble(); 
        
        System.out.println("Enter number of years:");
        int year = cr.nextInt(); 
        
        
        double futureInvestmentValue = investmentAmount * (Math.pow((1+monthlyInterestRate),(year*12)));
        System.out.println(futureInvestmentValue);
        
    
    
    
    }
    
}

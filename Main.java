package com.mycompany.maventempmethod;

public class Main
    
    //definicja metody isPositive wraz z argumentem Temp typu int
    static void isPositive(int Temp) {
        
        if (Temp > 0)
        
        {
            System.out.println("Twoja temperatura to: " +  Temp + " stopni." + " " + "Temperatura jest dodatnia. HUra idziemy się opalać."); 
        }
        
        else if (Temp < 0)

        {
            System.out.println("Twoja temperatura to: " + Temp + " stopni." + " " + "Temperatura jest ujemna. Hura idziemy na narty.");
        }
        
        else 
        {
            System.out.println("Twoja temperatura to: " + Temp + " stopni." + " " + "Temperatura wynosi 0, więc nie jest tak źle.");
        }
        
    }
    
    public static void main(String[] args) {
        // wywoluje metode isPositive nadajac argumentowi Temp wartosc 10 
        isPositi(10);
    
}

}

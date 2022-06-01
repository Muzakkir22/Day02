package myapp.core;

import java.io.Console;

public class NumberSum {

    public static void main(String[] args) {

        Console cons = System.console();

        String input = "ABC";

        while (input.length() > 0) {
            input = cons.readLine("Please enter a text. Blank to end ");
            if (input.length() > 0) {
                System.out.printf(">>> %s\n", input.toUpperCase());
               
                int num=0;
                for(int i=0; i<args.length; i++){
                   num+= Integer.parseInt(args[i]);
                
                  System.out.println("The sum is " + num);
                   }
            }
        }
    }
}


    
    


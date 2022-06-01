package myapp.core;

import java.io.Console;
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        boolean stop = false;
        String input;
        int delIndex;

        // Add test data
        cart.add("apple");
        cart.add("orange");
        cart.add("pear");

        // main loop
        while (!stop) {
            input = cons.readLine("> ");
            
            System.out.printf("READ: %s\n", input);
            // list <list of space separated items>
            // del <idx>
            // end
            String[] terms = input.split(" ");
            String cmd = terms[0];

            switch (cmd) {
                case "add":
                    for (int i = 1; i < terms.length; i++) {
                        boolean found = false;
                        for (int j = 0; j < cart.size(); j++) {
                            if (terms[i].equals(cart.get(j))) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            cart.add(terms[i]);
                            SYstem.out.printf("Added %s to cart\n", terms[i]);
                        }
                    }
                    break;

                case "list":
                if (cart.size() > 0) {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.printf("%d. %s\n", (i + 1), cart.get(i));
                    }
                } else {
                    System.out.println("Your cart is empty");
                }
                    break; 

                case "del":
                    if (terms.length < 2) {
                        System.err.println("Please provide an index to delete");
                } else {
                   delIndex = Integer.parseInt(terms[1]) - 1;
                   if (delIndex < cart.size()) {
                       cart.removw(delIndex);
                       System.out.println("Deleted");
                } else {

                }
                   }
               }
                    break;   


            }
        }

        System.out.println("Welcome to your shopping cart");
    }
}
    
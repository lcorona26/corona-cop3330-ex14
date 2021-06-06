/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final String wisconsin = "WI";
    public static void main(String[] args) {
        App app = new App();
        String order = app.readOrder();
        String state = app.readState();
        float output = app.createOutput(order);
        app.printOutput(output, state);
    }

    private void printOutput(float output, String state) {
        if(state.equals(wisconsin)){
            String message = String.format("The subtotal is $%.2f.\n" + "The tax is $0.55.\n" + "The total is $%s.",
                    output, output+(output*.055));
            System.out.print(message);
            System.exit(0);
        }
        String message = String.format("The total is $%.2f", output);
        System.out.print(message);
    }

    private float createOutput(String order) {
        float orderInt = Float.parseFloat(order);
        return orderInt;
    }

    private String readOrder() {
        System.out.print("What is the order amount? ");
        String order = in.nextLine();
        return order;
    }

    private String readState() {
        System.out.print("What is the state? ");
        String state = in.nextLine();
        return state;
    }


}

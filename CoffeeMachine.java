package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {


        int water = 400;
        int milk = 540;
        int coffeebeans = 120;
        int cup = 9;
        int money = 550;

        System.out.println(
                "Write action (buy, fill, take, remaining, exit):");

        Scanner scanner = new Scanner(System.in);



        int waterF = 0;
        int milkF = 0;
        int cooffeebeansF = 0;
        int cupF = 0;
        int moneyF = 0;

        boolean exMode = true;
        while (exMode) {
            String command = scanner.nextLine();
            switch (command) {

                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: \n");
                    String elc = scanner.next();
                    if (elc.equals("back")){
                        System.out.println("Write action (buy, fill, take, remaining, exit):\n");break;}
                    if (elc.equals("1")) { if (water>=200 && coffeebeans>=16 && cup>=1) {
                        water -= 250;
                        coffeebeans -= 16;
                        money += 4;
                        cup -=1;

                        System.out.println("I have enough resources, making you a coffee!\n" +"\n"+"Write action (buy, fill, take, remaining, exit):\n");}
                    else if (water<200) {
                        System.out.println("Sorry, not enough water!");}
                    else if (coffeebeans<16){
                        System.out.println("Sorry, not enough coffeebeans!");}

                    else if (cup<1) {
                        System.out.println("Sorry, not enough cups!");
                    }}
//                                +
//                                "The coffee machine has:\n" +
//                                        water + " of water\n" +
//                                        milk + " of milk\n" +
//                                        coffeebeans + " of coffee beans\n" +
//                                        (cup - 1) + " of disposable cups\n" +
//                                        money + " of money\n");
                    else if (elc.equals("2")) { if (water>=350 && milk >=75 && coffeebeans>=20 && cup>=1) {
                        water -=350;
                        milk -=75;
                        coffeebeans -= 20;
                        money +=7;
                        cup -= 1;

                        System.out.println("I have enough resources, making you a coffee!\n" +"\n"+"Write action (buy, fill, take, remaining, exit):\n");}

                    else if (water<350) {
                        System.out.println("Sorry, not enough water!");}
                    else if (milk<75) {
                        System.out.println("Sorry, not enough milk!");}

                    else if (coffeebeans<20){
                        System.out.println("Sorry, not enough coffeebeans!");}

                    else if (cup<1) {
                        System.out.println("Sorry, not enough cups!");} }
//                                        +
//                                        "The coffee machine has:\n" +
//                                        water + " of water\n" +
//                                        milk + " of milk\n" +
//                                        coffeebeans + " of coffee beans\n" +
//                                        (cup - 1) + " of disposable cups\n" +
//                                        money + " of money\n");
                    else if (elc.equals("3")) { if (water>=200 && milk >=100 && coffeebeans >= 12 && cup >=1)
                        water -= 200;
                        milk -= 100;
                        coffeebeans -= 12;
                        money += 6;
                        cup -= 1;
                        System.out.println("I have enough resources, making you a coffee!\n" +"\n"+"Write action (buy, fill, take, remaining, exit):\n");}
                    else if (water<200) {
                        System.out.println("Sorry, not enough water!");}
                    else if (milk<100) {
                        System.out.println("Sorry, not enough milk!");}

                    else if (coffeebeans<12){
                        System.out.println("Sorry, not enough coffeebeans!");}

                    else if (cup<1) {
                        System.out.println("Sorry, not enough cups!");}
//                                +
//                                "The coffee machine has:\n" +
//                                water + " of water\n" +
//                                milk + " of milk\n" +
//                                coffeebeans + " of coffee beans\n" +
//                                (cup - 1) + " of disposable cups\n" +
//                                money + " of money\n");

                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int water1 = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int milk1 = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int coffeebeans1 = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int cups1 = scanner.nextInt();
                    water = water + water1;
                    milk = milk + milk1;
                    coffeebeans = coffeebeans + coffeebeans1;
                    cup = cup + cups1;
                    System.out.println("\n"+"Write action (buy, fill, take, remaining, exit):\n");
//                            +
//                            "The coffee machine has:\n" +
//                            water + " of water\n" +
//                            milk + " of milk\n" +
//                            coffeebeans + " of coffee beans\n" +
//                            (cup - 1) + " of disposable cups\n" +
//                            money + " of money\n");
                    break;
                case "take":
                    System.out.println("I gave you " + "$" + money);
                    money = 0;


                    System.out.println("\n"+"Write action (buy, fill, take, remaining, exit):" );
//                            +
//                            "\n" +
//                            "The coffee machine has:\n" +
//                            water + " of water\n" +
//                            milk + " of milk\n" +
//                            coffeebeans + " of coffee beans\n" +
//                            (cup - 1) + " of disposable cups\n" +
//                            money + " of money\n");
                    break;
                case "remaining": finishMode(water,milk,coffeebeans,cup,money);
                    System.out.println("\n"+"Write action (buy, fill, take, remaining, exit):" );
                    break;
                case "exit": exMode = false;
                    break;
            }
        }

    }

    public static void finishMode(int water, int milk, int coffeebeans, int cup, int money) {
        System.out.println("\n" +
                "The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeebeans + " of coffee beans\n" +
                cup + " of disposable cups\n" +  "$" +money + " of money\n");
    }
}

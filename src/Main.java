import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //Stage 1
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */

        //Stage 2
        /*
        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print("> ");
        int numOfCoffee = scanner.nextInt();

        //calculating ingredients
        int water = 200 * numOfCoffee;
        int milk = 50 * numOfCoffee;
        int coffeeBeans = 15 * numOfCoffee;

        System.out.println("For " + numOfCoffee + " cups of coffee you will need: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        */

        //Stage 3
        /*
        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print("> ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print("> ");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print("> ");
        int coffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        int numOfCoffee = scanner.nextInt();

        //calculating number of coffee machine can make
        if (water >= 200 && milk >= 50 && coffeeBeans >= 15) {

            int waterForCoffee = water / 200;
            int milkForCoffee = milk / 50;
            int coffeeBeansForCoffee = coffeeBeans / 15;

            int[] ingredientsArray = {waterForCoffee, milkForCoffee, coffeeBeansForCoffee};

            int numOfMakeableCoffee = ingredientsArray[0];

            for (int j : ingredientsArray) {
                if (j < numOfMakeableCoffee) {
                    numOfMakeableCoffee = j;
                }
            }

            if (numOfMakeableCoffee == numOfCoffee) {
                System.out.println("Yes, I can make that amount of coffee.");
            } else if (numOfMakeableCoffee > numOfCoffee) {
                int extraCoffee = numOfMakeableCoffee - numOfCoffee;
                System.out.println("Yes, I can make that amount of coffee (and even " + extraCoffee + " more than that).");
            } else {
                System.out.println("No, I can make only " + numOfMakeableCoffee + " cup(s) of coffee.");
            }

        } else {
            System.out.println("I don't have any more coffee :(");
        }
        */

        //Stage 4 and 5
        /*
        //initial resources
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;

        //arrays for each coffee
        int[] waterArray = {250, 350, 200};
        int[] milkArray = {0, 75, 100};
        int[] coffeeBeansArray = {16, 20, 12};
        int[] priceArray = {4, 7, 6};

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            System.out.print("> ");
            String selection = scanner.nextLine();

            if (selection.equalsIgnoreCase("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                System.out.print("> ");
                String coffee = scanner.nextLine();
                StringBuilder message = new StringBuilder();

                //check resources and make coffee if possible
                if (coffee.equals("1")) {
                    if (water < waterArray[0]) {
                        message.append("water");
                    }
                    if (milk < milkArray[0]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("milk");
                    }
                    if (coffeeBeans < coffeeBeansArray[0]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("coffee beans");
                    }
                    if (cups == 0) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("cups");
                    }

                    if (message.length() == 0) {
                        water = water - waterArray[0];
                        milk = milk - milkArray[0];
                        coffeeBeans = coffeeBeans - coffeeBeansArray[0];
                        money += priceArray[0];
                        cups--;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough " + message + "!");
                    }

                } else if (coffee.equals("2")) {
                    if (water < waterArray[1]) {
                        message.append("water");
                    }
                    if (milk < milkArray[1]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("milk");
                    }
                    if (coffeeBeans < coffeeBeansArray[1]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("coffee beans");
                    }
                    if (cups == 0) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("cups");
                    }

                    if (message.length() == 0) {
                        water = water - waterArray[1];
                        milk = milk - milkArray[1];
                        coffeeBeans = coffeeBeans - coffeeBeansArray[1];
                        money += priceArray[1];
                        cups--;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough " + message + "!");
                    }

                } else if (coffee.equals("3")) {
                    if (water < waterArray[2]) {
                        message.append("water");
                    }
                    if (milk < milkArray[2]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("milk");
                    }
                    if (coffeeBeans < coffeeBeansArray[2]) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("coffee beans");
                    }
                    if (cups == 0) {
                        if (message.length() > 0) {
                            message.append(", ");
                        }
                        message.append("cups");
                    }

                    if (message.length() == 0) {
                        water = water - waterArray[2];
                        milk = milk - milkArray[2];
                        coffeeBeans = coffeeBeans - coffeeBeansArray[2];
                        money += priceArray[2];
                        cups--;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough " + message + "!");
                    }

                } else if (coffee.equalsIgnoreCase("back")) {
                    System.out.println(" ");

                } else {
                    System.out.println("Wrong input! Try again.");
                }

                //add resources
            } else if (selection.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                System.out.print("> ");
                water += scanner.nextInt();
                scanner.nextLine();

                System.out.println("Write how many ml of milk you want to add: ");
                System.out.print("> ");
                milk += scanner.nextInt();
                scanner.nextLine();

                System.out.println("Write how many grams of coffee beans you want to add: ");
                System.out.print("> ");
                coffeeBeans += scanner.nextInt();
                scanner.nextLine();

                System.out.println("Write how many disposable cups you want to add: ");
                System.out.print("> ");
                cups += scanner.nextInt();
                scanner.nextLine();

                //take money
            } else if (selection.equalsIgnoreCase("take")) {
                System.out.println("I gave you $" + money);
                money = 0;

                //print remaining resources
            } else if (selection.equalsIgnoreCase("remaining")) {
                System.out.println(" ");
                System.out.println("The coffee machine has: ");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(coffeeBeans + " g of coffee beans");
                System.out.println(cups + " disposable cup");
                System.out.println("$" + money + " of money");
                System.out.println(" ");

            } else if (selection.equalsIgnoreCase("exit")) {
                System.out.println("See you next time! :)");
                break;

            } else {
                System.out.println("Wrong input! Try again.");
            }
        }*/

        //Stage 6
        //setting up machine state and types of coffee
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.loadData("docs/machineState.txt");

        CoffeeType espresso = new CoffeeType(250, 0, 16, 4);
        CoffeeType latte = new CoffeeType(200, 100, 12, 6);
        CoffeeType cappuccino = new CoffeeType(200, 100, 12, 6);

        while (true) {
            System.out.println("Write action (buy, login, exit): ");
            System.out.print("> ");
            String selection = scanner.nextLine();

            switch (selection.toLowerCase()) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    System.out.print("> ");
                    String choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            coffeeMachine.makeCoffee(espresso);
                            System.out.println(coffeeMachine.getMessage());
                            break;
                        case "2":
                            coffeeMachine.makeCoffee(latte);
                            System.out.println(coffeeMachine.getMessage());
                            break;
                        case "3":
                            coffeeMachine.makeCoffee(cappuccino);
                            System.out.println(coffeeMachine.getMessage());
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Wrong input! Try again.");
                    }
                    break;

                case "login":
                    System.out.println("Enter username: ");
                    System.out.print("> ");
                    String username = scanner.nextLine();
                    System.out.println("Enter password: ");
                    System.out.print("> ");
                    String password = scanner.nextLine();

                    if (username.equals(coffeeMachine.getUsername()) && password.equals(coffeeMachine.getPassword())) {
                        while (true) {
                            System.out.println("Write action: \n*** fill, remaining, take, exit ***");
                            System.out.print("> ");
                            String adminSelection = scanner.nextLine();

                            switch (adminSelection) {

                                case "fill":
                                    System.out.println("Write how much water(ml), milk(ml), coffee beans(g) and cups you want to add.");
                                    System.out.print("> ");
                                    coffeeMachine.fill(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                                    scanner.nextLine();
                                    System.out.println("Machine is filled!");
                                    break;

                                case "remaining":
                                    System.out.println();
                                    System.out.println("The coffee machine has:");
                                    System.out.println(coffeeMachine.getWater() + " ml of water");
                                    System.out.println(coffeeMachine.getMilk() + " ml of milk");
                                    System.out.println(coffeeMachine.getCoffeeBeans() + " g of coffee beans");
                                    System.out.println(coffeeMachine.getCups() + " disposable cups");
                                    System.out.println("$" + coffeeMachine.getMoney() + " of money");
                                    System.out.println();
                                    break;

                                case "take":
                                    System.out.println("I gave you $" + coffeeMachine.getMoney());
                                    coffeeMachine.take();
                                    break;

                                case "exit":
                                    System.out.println("Signing you out...");
                                    break;

                                default:
                                    System.out.println("Wrong input! Try again.");
                            }
                            if (adminSelection.equals("exit")) break;
                        }
                    } else {
                        System.out.println("Wrong username or password! Try again.");
                    }
                    break;

                case "exit":
                    System.out.println("See you next time! :)");
                    coffeeMachine.saveData("docs/machineState.txt");
                    return;

                default:
                    System.out.println("Wrong input! Try again.");
            }
        }
    }
}

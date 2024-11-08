import java.io.*;
import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    private String message = "";

    private String username = "admin";
    private String password = "admin123";

    //make coffee if machine has enough resources
    public void makeCoffee (CoffeeType coffeeType) {
        if (hasEnoughResources(coffeeType)) {
            water -= coffeeType.getWaterNeeded();
            milk -= coffeeType.getMilkNeeded();
            coffeeBeans -= coffeeType.getCoffeeBeansNeeded();
            cups--;
            money += coffeeType.getPrice();

            message = "I have enough resources, making you a coffee!";
        } else {
            message = "Sorry, not enough " + message + "!";
        }

    }

    //check resources for coffee
    private boolean hasEnoughResources(CoffeeType coffeeType) {
        boolean check = true;
        message = "";
        if (water < coffeeType.getWaterNeeded()) {
            message += "water";
            check = false;
        }

        if (milk < coffeeType.getMilkNeeded()) {
            if (!message.isEmpty()) {
                message += ", ";
            }
            message += "milk";
            check = false;
        }

        if (coffeeBeans < coffeeType.getCoffeeBeansNeeded()) {
            if (!message.isEmpty()) {
                message += ", ";
            }
            message += "coffee beans";
            check = false;
        }

        if (cups == 0) {
            if (!message.isEmpty()) {
                message += ", ";
            }
            message += "cups";
            check = false;
        }
        return check;
    }

    public void fill (int water, int milk, int coffeeBeans, int cups) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;
    }

    //save machine state to file
    public void saveData(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        Scanner scanner = new Scanner(System.in);

        String machineState = "";

        machineState += water + "; " + milk + "; " + coffeeBeans + "; " + cups + "; " + money + "\n" + username + "; " + password;

        fileWriter.write(machineState);
        fileWriter.close();
    }

    //load machine state from file
    public void loadData(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);

        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter("; |\n");

        water = scanner.nextInt();
        milk = scanner.nextInt();
        coffeeBeans = scanner.nextInt();
        cups = scanner.nextInt();
        money = scanner.nextInt();
        username = scanner.next();
        password = scanner.next();

    }

    public void take () {
        money = 0;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

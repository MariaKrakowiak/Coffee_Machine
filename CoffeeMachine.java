package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int bean = 120;
    static int cup = 9;
    static int money = 550;
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        printStart();
        String action = sca.next();
        while(!action.equalsIgnoreCase("exit")){

            if(action.equalsIgnoreCase("remaining")){
                remaining();
            }
            if(action.equalsIgnoreCase("buy")){
                buy();
            }
            if(action.equalsIgnoreCase("fill")){
                fill();
            }
            if(action.equalsIgnoreCase("take")){
                take();
            }



            printStart();
            action = sca.next();
        }System.exit(0);


    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        Scanner sca = new Scanner(System.in);
        int w = sca.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int m = sca.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int b = sca.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int c = sca.nextInt();
        water = water + w;
        milk = milk + m;
        bean = bean + b;
        cup = cup + m;
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sca = new Scanner(System.in);
        String type = sca.next();
        if(type.equalsIgnoreCase("2")){
            if(water - Type.LATTE.getWater() >=0 &&
                    milk - Type.LATTE.getMilk() >=0 &&
                    bean - Type.LATTE.getBean() >=0 &&
                    cup - 1 >=0){
                water = water - Type.LATTE.getWater();
                milk = milk - Type.LATTE.getMilk();
                bean = bean - Type.LATTE.getBean();
                money = money + Type.LATTE.getPrice();
                cup = cup - 1;
                System.out.println("I have enough resources, making you a coffee!\n");
            }else if(water - Type.LATTE.getWater() < 0){
                System.out.println("Sorry, not enough water!");
            }else if(milk - Type.LATTE.getMilk() < 0){
                System.out.println("Sorry, not enough milk!");
            }else if(bean - Type.LATTE.getBean() <0 ){
                System.out.println("Sorry, not enough beans!");
            }else if(cup - 1 <0){
                System.out.println("Sorry, not enough cups!");
            }
        }
        if(type.equalsIgnoreCase("1")){
            if(water - Type.ESPRESSO.getWater() >=0 &&
                    milk - Type.ESPRESSO.getMilk() >=0 &&
                    bean - Type.ESPRESSO.getBean() >=0 &&
                    cup - 1 >=0){
                water = water - Type.ESPRESSO.getWater();
                milk = milk - Type.ESPRESSO.getMilk();
                bean = bean - Type.ESPRESSO.getBean();
                money = money + Type.ESPRESSO.getPrice();
                cup = cup - 1;
                System.out.println("I have enough resources, making you a coffee!\n");
            }else if(water - Type.ESPRESSO.getWater() < 0){
                System.out.println("Sorry, not enough water!");
            }else if(milk - Type.ESPRESSO.getMilk() < 0){
                System.out.println("Sorry, not enough milk!");
            }else if(bean - Type.ESPRESSO.getBean() <0 ){
                System.out.println("Sorry, not enough beans!");
            }else if(cup - 1 <0){
                System.out.println("Sorry, not enough cups!");
            }
        }
        if(type.equalsIgnoreCase("3")){
            if(water - Type.CAPPUCCINO.getWater() >=0 &&
                    milk - Type.CAPPUCCINO.getMilk() >=0 &&
                    bean - Type.CAPPUCCINO.getBean() >=0 &&
                    cup - 1 >=0){
                water = water - Type.CAPPUCCINO.getWater();
                milk = milk - Type.CAPPUCCINO.getMilk();
                bean = bean - Type.CAPPUCCINO.getBean();
                money = money + Type.CAPPUCCINO.getPrice();
                cup = cup - 1;
                System.out.println("I have enough resources, making you a coffee!\n");
            }else if(water - Type.CAPPUCCINO.getWater() < 0){
                System.out.println("Sorry, not enough water!");
            }else if(milk - Type.CAPPUCCINO.getMilk() < 0){
                System.out.println("Sorry, not enough milk!");
            }else if(bean - Type.CAPPUCCINO.getBean() <0 ){
                System.out.println("Sorry, not enough beans!");
            }else if(cup - 1 <0){
                System.out.println("Sorry, not enough cups!");
            }
        }


    }

    private static void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                bean+" of coffee beans\n" +
                cup + " of disposable cups\n" +
                "$" + money + " of money\n"
        );
    }

    private static void printStart() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");

    }
}


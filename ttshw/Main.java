package com.ttshw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
	// write your code here
        pet dog1 = new pet();
        pet dog2 = new pet();
        pet dog3 = new pet();
        pet cat1 = new pet();
        pet cat2 = new pet();
        //String name;
        //int age;
        //String location;
        //String type;
        dog1.setName("Scrappy");
        dog1.setAge(1);
        dog1.setLocation("indoors");
        dog1.setType("dog");

        dog2.setName("Scooby");
        dog2.setAge(5);
        dog2.setLocation("indoors");
        dog2.setType("dog");

        dog3.setName("Shaggy");
        dog3.setAge(8);
        dog3.setLocation("indoors");
        dog3.setType("dog");

        cat1.setName("Kitty");
        cat1.setAge(3);
        cat1.setLocation("hybrid");
        cat1.setType("cat");

        cat2.setName("Katty");
        cat2.setAge(1);
        cat2.setLocation("Hybrid");
        cat2.setType("cat");
        System.out.println(dog1);
        //creating an arrayList
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cheetah");
        animals.add("Bear");
        if (animals.contains("Cheetah")) {
            System.out.println("I love that animal!");
        } else {
            System.out.println("No, I don't care for those.");
        }

        HashMap<String , pet> allPets = new HashMap<>();
        pet pet1 = new pet();
        pet1.setName("Kitty");
        pet1.setAge(4);
        pet1.setLocation("hybrid");
        pet1.setType("cat");
        allPets.put("My pet", pet1);

        pet pet2 = new pet();
        pet2.setName("Krinkles");
        pet2.setAge(8);
        pet2.setLocation("indoors");
        pet2.setType("dog");
        allPets.put("My sisters pet", pet2);

        System.out.println(pet1);
        System.out.println(pet2);

        System.out.println("Give me 5 numbers to print out.");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        int num3 = userInput.nextInt();
        int num4 = userInput.nextInt();
        int num5 = userInput.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
        nums.add(num5);

        System.out.println("Total-add:" + calculator.sumAll(nums));
        System.out.println("Total-product:" + num1 * num2 * num3 * num4 * num5);
        System.out.println("Highest value entered:" + Collections.max(nums));
        System.out.println("Lowest value entered:" + Collections.min(nums));
        //From the calculator class
        System.out.println("Add, first two numbers:" + calculator.toAdd(num1, num2));
        System.out.println("Subtract, first two numbers:" + calculator.toSubtract(num1, num2));
        System.out.println("Product, first two numbers:" + calculator.toMultiply(num1, num2));
        System.out.println("Division, first two numbers:" + calculator.toDivide(num1, num2));
        System.out.println("Modulus, first two numbers:" + calculator.toModulus(num1, num2));
    }
}

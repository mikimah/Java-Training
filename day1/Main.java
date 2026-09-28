package day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Select a program: ");
            System.out.println("1. Calculator");
            System.out.println("2. FizzBuzz");
            System.out.println("3. Reverse an array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Wrong input");
                scanner.nextLine();
            }
            ;
            if (choice == 4)
                break;
            switch (choice) {
                case 1:
                    int choice2 = 0;
                    double num1 = 0, num2 = 0;
                    do {
                        System.out.println("Select a symbol: ");
                        System.out.println("1. +");
                        System.out.println("2. -");
                        System.out.println("3. *");
                        System.out.println("4. /");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        try {
                            choice2 = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.print("Enter your choice: ");
                            scanner.nextLine();
                        }
                        ;
                        if (choice == 5)
                            break;
                        if (choice2 != 0) {
                            while (true) {
                                System.out.print("Enter the first number: ");
                                try {
                                    num1 = scanner.nextDouble();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Wrong input");
                                    scanner.nextLine();
                                }
                            }
                            ;
                            while (true) {
                                System.out.print("Enter the second number: ");
                                try {
                                    num2 = scanner.nextDouble();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Wrong input");
                                    scanner.nextLine();
                                }
                            }
                            ;
                            switch (choice2) {
                                case 1:
                                    System.out.println("Result: " + (num1 + num2));
                                    break;
                                case 2:
                                    System.out.println("Result: " + (num1 - num2));
                                    break;
                                case 3:
                                    System.out.println("Result: " + (num1 * num2));
                                    break;
                                case 4:
                                    System.out.println("Result: " + (num1 / num2));
                                    break;
                                default:
                                    break;
                            }
                        }

                    } while (choice2 != 0);
                    break;
                case 2:
                    int aLength;
                    do {
                        aLength = 0;
                        System.out.print("Enter the length of the array (-1 = quit): ");
                        try {
                            aLength = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Wrong input");
                            scanner.nextLine();
                        }
                        if (aLength < 0)
                            break;
                        int[] aArray = new int[aLength];
                        for (int i = 0; i < aArray.length; i++) {
                            System.out.print("a[" + i + "]: ");
                            try {
                                aArray[i] = scanner.nextInt();
                            } catch (Exception e) {
                                System.out.println("Wrong input");
                                scanner.nextLine();
                            }
                        }
                        for (int i = 0; i < aArray.length; i++) {
                            String temp = "";
                            if (aArray[i] % 3 == 0) {
                                temp += "Fizz";
                            }
                            if (aArray[i] % 5 == 0) {
                                temp += "Buzz";
                            }
                            if (temp == "") {
                                System.out.print(aArray[i] + " ");
                            } else
                                System.out.print(temp + " ");
                        }
                        System.out.println("");
                    } while (true);
                    break;
                case 3:
                    int aLength2;
                    while (true) {
                        aLength2 = 0;
                        System.out.print("Enter the length of the array (-1 = quit): ");
                        try {
                            aLength2 = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Wrong input");
                            scanner.nextLine();
                        }
                        if (aLength2 < 0)
                            break;
                        int[] aArray = new int[aLength2];
                        for (int i = 0; i < aArray.length; i++) {
                            System.out.print("a[" + i + "]: ");
                            try {
                                aArray[i] = scanner.nextInt();
                            } catch (Exception e) {
                                System.out.println("Wrong input");
                                scanner.nextLine();
                            }
                        }
                        while (true) {
                            int choice4 = 0;
                            System.out.println("1. Reverse array");
                            System.out.println("2. Print");
                            System.out.println("3. New array");
                            System.out.print("Enter your choice: ");
                            try {
                                choice4 = scanner.nextInt();
                            } catch (Exception e) {
                                System.out.println("Wrong input");
                                scanner.nextLine();
                            }
                            if (choice4 == 3)
                                break;
                            switch (choice4) {
                                case 1:
                                    for (int i = 0; i < (aArray.length / 2); i++) {
                                        int tempNum = aArray[i];
                                        aArray[i] = aArray[aArray.length - 1 - i];
                                        aArray[aArray.length - 1 - i] = tempNum;
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < aArray.length; i++) {
                                        System.out.print(aArray[i] + " ");
                                    }
                                    System.out.println("");
                                    break;
                                default:
                                    break;
                            }
                        }

                    }

                    break;
                default:
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

}

package org.example;

import java.util.Scanner;

public class UserInterface {

    // Main menu for selecting which sorting algorithm to run
    public static void mainMenu() {

        int userSelectionMain;
        Scanner userInputMain = new Scanner(System.in);

        System.out.println("Please select a sorting algorithm for benchmarking:");
        System.out.println("1) Bubble Sort");
        System.out.println("2) Heap Sort");
        System.out.println("3) Insertion Sort");
        System.out.println("4) Merge Sort");
        System.out.println("5) Quick Sort");
        System.out.println("6) Radix Sort");
        System.out.println("7) Selection Sort");

        userSelectionMain = userInputMain.nextInt();


        boolean repeat;
        boolean subRepeat;
        int userSelectionSub;
        Scanner userInputSub = new Scanner(System.in);

        do {

            repeat = false;

            switch (userSelectionMain) {

                case 1:
                    System.out.println("You have selected the Bubble Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 2:
                    System.out.println("You have selected the Heap Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 3:
                    System.out.println("You have selected the Insertion Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 4:
                    System.out.println("You have selected the Merge Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 5:
                    System.out.println("You have selected the Quick sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 6:
                    System.out.println("You have selected the Radix sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                case 7:
                    System.out.println("You have selected the Selection sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("You have selected the multithreaded benchmark");
                                break;
                            case 3:
                                System.out.println("You have selected all benchmarks");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select and option from 1-3");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;
                        }

                    } while(subRepeat);

                    userInputSub.close();
                    break;

                default:
                    System.out.println("Invalid option: Please select an option from 1-7");
                    repeat = true;
                    userSelectionMain = userInputMain.nextInt();
                    break;


            }

        } while (repeat);

        userInputMain.close();

    }


    // Sub menu for selecting benchmark type with relation to threads
    public static void subMenu() {

        System.out.println("Please select what type of benchmark you want to run with this algorithm");
        System.out.println("1) Single thread");
        System.out.println("2) Multi thread");
        System.out.println("3) All");


    }
}

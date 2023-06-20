package sortbench;

import java.util.Scanner;

public class UserInterface {

    // Main menu for selecting which sorting algorithm to run
    public static void mainMenu() {

        // try to fix incorrect input with try catch
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

            switch(userSelectionMain) {

                case 1:
                    System.out.println("You have selected the Bubble Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                BubbleSort.bubbleSort(TxtFileToArray.populateArray());
                                mainMenu();
                                break;
                            case 2:
                                System.out.println("Bubble Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;
                
                case 2:
                    System.out.println("You have selected the Heap Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                System.out.println("Heap Sort here");
                                break;
                            case 2:
                                System.out.println("Heap Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;
                
                case 3:
                    System.out.println("You have selected the Insertion Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the Insertion Sort algorithm");
                                break;
                            case 2:
                                System.out.println("Insertion Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close scanner to prevent a memory leak
                    break;

                case 4: 
                    System.out.println("You have selected the Merge Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the Merge Sort algorithm");
                                break;
                            case 2:
                                System.out.println("Merge Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;

                case 5:
                    System.out.println("You have selected the Quick Sort algoirthm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the Quick Sort algorithm");
                                break;
                            case 2:
                                System.out.println("Quick Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;

                case 6:
                    System.out.println("You have selected the Radix Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch(userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the single threaded benchmark");
                                break;
                            case 2:
                                System.out.println("Radix Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while (subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;

                case 7:

                    System.out.println("You have selected the Selection Sort algorithm");
                    subMenu();
                    userSelectionSub = userInputSub.nextInt();

                    do {

                        subRepeat = false;

                        switch (userSelectionSub) {

                            case 1:
                                System.out.println("You have selected the Selection Sort algorithm");
                                break;
                            case 2:
                                System.out.println("Selection Sort info here");
                                break;
                            default:
                                System.out.println("Invalid Option: Please select an option between 1 & 2");
                                subRepeat = true;
                                userSelectionSub = userInputSub.nextInt();
                                break;

                        }

                    } while(subRepeat);

                    userInputSub.close();   // close the scanner to prevent a memory leak
                    break;
                
                default:
                    System.out.println("Invalid option: Please select an option between 1 & 7");
                    repeat = true;
                    userSelectionMain = userInputMain.nextInt();
                    break;

            }

        } while (repeat);

        userInputMain.close();  // close the scanner to prevent a memory leak

    }

    // Sub menu for selecting an option after selecting a sorting algorithm
    public static void subMenu() {

        System.out.println("Please select one of the following options:");
        System.out.println("1) Run sorting algorithm");
        System.out.println("2) Information about this algorithm");

    }

}
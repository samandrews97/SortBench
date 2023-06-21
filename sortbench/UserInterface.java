package sortbench;

import java.util.Scanner;

public class UserInterface {

    // Main menu for selecting which sorting algorithm to run
    public static void mainMenu() {
            
            int userSelectionMain;
            Scanner userInputMain = new Scanner(System.in);

            // Main menu selections
            System.out.println("Please select a sorting algorithm for benchmarking:");
            System.out.println("1) Bubble Sort");
            System.out.println("2) Heap Sort");
            System.out.println("3) Insertion Sort");
            System.out.println("4) Merge Sort");
            System.out.println("5) Quick Sort");
            System.out.println("6) Radix Sort");
            System.out.println("7) Selection Sort");
            System.out.println("8) Exit");

            userSelectionMain = isNumber(userInputMain);

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
                        userSelectionSub = isNumber(userInputSub);
                            
                            do {

                                subRepeat = false;

                                switch(userSelectionSub) {

                                    case 1:
                                        BubbleSort.bubbleSort(TxtFileToArray.populateArray());
                                        subMenu();
                                        userSelectionSub = isNumber(userInputSub);
                                        subRepeat = true;
                                        break;
                                    case 2:
                                        BubbleSort.bubbleInfo();
                                        subMenu();
                                        userSelectionSub = isNumber(userInputSub);
                                        subRepeat = true;
                                        break;
                                    case 3:
                                        mainMenu();
                                        userInputSub.close();   // close the scanner to prevent a memory leak
                                        break;
                                    default:
                                        System.out.println("Invalid Option: Please select an option between 1 & 3");
                                        subRepeat = true;
                                        userSelectionSub = isNumber(userInputSub);
                                        break;

                                }
                            
                            } while (subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;
                
                    case 2:
                        System.out.println("You have selected the Heap Sort algorithm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch(userSelectionSub) {

                                case 1:
                                    HeapSort.heapSort(TxtFileToArray.populateArray());
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    HeapSort.heapInfo();
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 3");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while (subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;
                
                    case 3:
                        System.out.println("You have selected the Insertion Sort algorithm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch(userSelectionSub) {

                                case 1:
                                    System.out.println("You have selected the Insertion Sort algorithm");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    System.out.println("Insertion Sort info here");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 2");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while (subRepeat);

                        userInputSub.close();   // close scanner to prevent a memory leak
                        break;

                    case 4: 
                        System.out.println("You have selected the Merge Sort algorithm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch(userSelectionSub) {

                                case 1:
                                    System.out.println("You have selected the Merge Sort algorithm");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    System.out.println("Merge Sort info here");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 2");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while (subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;

                    case 5:
                        System.out.println("You have selected the Quick Sort algoirthm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch(userSelectionSub) {

                                case 1:
                                    System.out.println("You have selected the Quick Sort algorithm");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    System.out.println("Quick Sort info here");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 2");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while (subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;

                    case 6:
                        System.out.println("You have selected the Radix Sort algorithm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch(userSelectionSub) {

                                case 1:
                                    System.out.println("You have selected the single threaded benchmark");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    System.out.println("Radix Sort info here");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 2");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while (subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;

                    case 7:

                        System.out.println("You have selected the Selection Sort algorithm");
                        subMenu();
                        userSelectionSub = isNumber(userInputSub);

                        do {

                            subRepeat = false;

                            switch (userSelectionSub) {

                                case 1:
                                    System.out.println("You have selected the Selection Sort algorithm");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 2:
                                    System.out.println("Selection Sort info here");
                                    subMenu();
                                    userSelectionSub = isNumber(userInputSub);
                                    subRepeat = true;
                                    break;
                                case 3:
                                    mainMenu();
                                    userInputSub.close();   // close the scanner to prevent a memory leak
                                    break;
                                default:
                                    System.out.println("Invalid Option: Please select an option between 1 & 2");
                                    subRepeat = true;
                                    userSelectionSub = isNumber(userInputSub);
                                    break;

                            }

                        } while(subRepeat);

                        userInputSub.close();   // close the scanner to prevent a memory leak
                        break;
                
                    case 8:
                        System.out.println("Exiting program");
                        System.exit(0);
                
                    default:
                        System.out.println("Invalid option: Please select an option between 1 & 8");
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
        System.out.println("3) Main menu");

    }

    // Checks if the user input is a number. If it is not, displays an error message and asks for one.
    private static int isNumber(Scanner scanner) {

        while (true) {

            if (!scanner.hasNextInt()) {
                System.out.println("ERROR: Please enter a number to make a selection");
                scanner.next();
                continue;
            }

            break;

        }

        return scanner.nextInt();

    }

}
package org.example;

public class Main {




    public static void main(String[] args) {

        // Display user CPU information
        CPUInfo cpuInfo = new CPUInfo();
        cpuInfo.getInfo();
        System.out.println();

        // Display terminal interface
        UserInterface.mainMenu();

    }

}
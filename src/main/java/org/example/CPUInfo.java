package org.example;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class CPUInfo {

    public void getInfo() {

        // Using the Oshi library, get the information about the user's CPU
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        CentralProcessor cpu = hardwareAbstractionLayer.getProcessor();

        // Print this information
        System.out.println("CPU: " + cpu);

    }

}

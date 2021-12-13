import oshi.SystemInfo;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;

class CpuSerialNumber {

    static String generateLicenseKey() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        ComputerSystem computerSystem = hardwareAbstractionLayer.getComputerSystem();
        String processorSerialNumber = computerSystem.getSerialNumber();
        return processorSerialNumber;
    }
}

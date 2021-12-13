

public class ProjetoLoaderApplication {
    public static void main(String[] args) {

        String motherBoardID = MotherBoardSerialNumber.getMotherboardSN();
        String hddID = HardDiskSerialNumber.getSerialNumber("C");
        String cpuID = CpuSerialNumber.generateLicenseKey();

        System.out.println("CPU " + cpuID);
        System.out.println("HD " + hddID);
        System.out.println("MB " + motherBoardID);


    }
}
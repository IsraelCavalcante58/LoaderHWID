import java.sql.SQLOutput;

public class ProjetoLoaderApplication {
    public static void main(String[] args) {
        String cpuId = MotherBoardSerialNumber.getMotherboardSN();
//        javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)
//                        null, cpuId, "Motherboard serial number",
//                javax.swing.JOptionPane.DEFAULT_OPTION);

        String sn = HardDiskSerialNumber.getSerialNumber("C");
        javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)
                        null, sn, "Serial Number of C:",
                javax.swing.JOptionPane.DEFAULT_OPTION);
        System.out.println("HD " + sn);
        System.out.println(cpuId);
    }



}
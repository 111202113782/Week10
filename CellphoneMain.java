/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone;

public class CellphoneMain {
  public static void main(String[] args) {
    Cellphone cp = new Cellphone("Samsung", "S12 Ultra");
    cp.powerOn();
    cp.volumeUp();
    cp.volumeUp();
    cp.volumeDown();
    cp.powerOff();
    cp.powerOff();
    cp.topUpPulsa(50000);
    int sisaPulsa = cp.getSisaPulsa();
    System.out.println("Sisa pulsa: " + sisaPulsa);
    cp.tambahKontak("Bagus Prabaswara", "08123456789");
    cp.tambahKontak("Putri Jovanka", "0897654321");
    cp.lihatSemuaKontak();
    cp.cariKontak("Adrian Santoso");
    cp.cariKontak("Bagus Prabaswara");
  }
}

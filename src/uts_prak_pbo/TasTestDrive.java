package uts_prak_pbo;

public class TasTestDrive {
    public static void main(String[] args) {

        System.out.println("Backpack");
        Backpack bp = new Backpack();
        bp.cetakInfoBackpack();
        bp.hitungHargaSetelahDiskon();
        System.out.println(" ");
        System.out.println("Slingbag");
        Slingbag sb = new Slingbag();
        sb.cetakinfoSlingbag();
        sb.hitunghargaSetelahDiskon();
        System.out.println(" ");

    }
}

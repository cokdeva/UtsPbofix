package uts_prak_pbo;

public class Backpack extends Tas {

    void hitungHargaSetelahDiskon() {
        //hargabackpack
        Backpack bp = new Backpack();
        bp.setHargaJual(500000);
        double HB = bp.getHargaJual();
        System.out.println("Harga = Rp." + HB);

        //persendiskon
        double A = 4    ;
        double diskonBackpack = (50  + A) / 100;
        System.out.println("Diskon = " + (int) (diskonBackpack * 100) + "%");

        //harga pas diskon
        double hargaDiskon = HB * diskonBackpack;
        System.out.println("Jumlah Diskon = Rp." + hargaDiskon);

        //harga setelah diskon
        double setelahDiskon = HB - hargaDiskon;
        System.out.println("Harga Setelah Diskon = Rp." + setelahDiskon);

    }

    void cetakInfoBackpack() {
        Backpack bp = new Backpack();

        //jenistas
        bp.setJenisTas("Backpack....");
        String jn = bp.getJenisTas();

        //warnatas
        String[] jenisWarna = {"MERAH" , "PUTIH" , "BIRU" , "HIJAU" , "PINK" , "UNGU"};
        int w = (int) (Math.random() * 6);
        String warna = jenisWarna[w];
        bp.setWarnaDasar(warna);
        String warnaBackpack = bp.getWarnaDasar();

        //bahantas
        String[] jenisBahan = {"Suede", "Cordura", "Taslan", "Kanvas"};
        int b = (int) (Math.random() * 4);
        String bahan = jenisBahan[b];
        bp.setBahan(bahan);
        String bahanBackpack = bp.getBahan();

        //tampil
        System.out.println("Informasi Barang " + jn + "\n"
                + "Warna Backpack : " + warnaBackpack + "\n"
                + "Jenis Backpack : " + bahanBackpack
        );
    }
}

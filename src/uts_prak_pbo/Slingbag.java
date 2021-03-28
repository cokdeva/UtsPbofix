package uts_prak_pbo;

public class Slingbag extends Tas {

    void hitunghargaSetelahDiskon(){
        //harga slingbag
        Slingbag sb = new Slingbag();
        sb.setHargaJual(200000);
        double HB = sb.getHargaJual();
        System.out.println("Harga = Rp." + HB);

        //persen diskon
        double B = 9;
        double diskonSlingbag = (50  + B) / 100;
        System.out.println("Diskon " + (int) (diskonSlingbag * 100) + "%");

        //harga ketika diskon
        double hargaDiskon = HB * diskonSlingbag;
        System.out.println("Jumlah Diskon = Rp." + hargaDiskon);

        //harga setelah dipotong diskon
        double setelahDiskon = HB - hargaDiskon;
        System.out.println("Harga Setelah Diskon = Rp." + setelahDiskon);

}

        void cetakinfoSlingbag() {
            Slingbag sb = new Slingbag();

            //jenis slingbag
            sb.setJenisTas("Slingbag....");
            String jn = sb.getJenisTas();

            //warna slingbag
            String[] jenisWarna = {"Merah", "Putih", "Pink", "Biru", "Hijau", "Ungu", "Hitam", "Orange"};
            int w = (int) (Math.random() * 6);
            String warna = jenisWarna[w];
            sb.setWarnaDasar(warna);
            String warnaSlingbag = sb.getWarnaDasar();

            //bahan slingbag
            String[] jenisBahan = {"Suede", "Cordura", "Taslan", "Kanvas"};
            int b = (int) (Math.random() * 4);
            String bahan = jenisBahan[b];
            sb.setBahan(bahan);
            String bahanSlingbag = sb.getBahan();

            //tampil
            System.out.println("Informasi Barang" + jn + "\n"
                    + "Warna Slingbag : " + warnaSlingbag + "\n"
                    + "Jenis Slingbag : " + bahanSlingbag
            );
        }
    }


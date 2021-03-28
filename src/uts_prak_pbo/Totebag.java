package uts_prak_pbo;

public class Totebag extends Tas {

    private int jumlahWarna;

    public int getJumlahWarna() {
        return jumlahWarna;
    }

    public void setJumlahWarna(int jumlahWarna){
        this.jumlahWarna = jumlahWarna;
    }
    void hitungHargaSetelahDiskon(){
        Totebag tb = new Totebag();
        tb.setHargaJual(40000);
        double HB = tb.getHargaJual();
        System.out.println("Harga = Rp." + HB);

        tb.setJumlahWarna(5);
        double JK = tb.getJumlahWarna();

        double c = 1 + 1;
        double diskonTotebag = ((50 / JK) + c) / 100;
        System.out.println("Diskon = " + (int) (diskonTotebag * 100) + "%");

        double hargaDiskon = HB * diskonTotebag;
        System.out.println("Jumlah Diskon = Rp." + hargaDiskon);

        double setelahDiskon = HB - hargaDiskon;
        System.out.println("Harga Setelah Diskon = Rp." + setelahDiskon);

    }

    void cetakInfoTotebag(){
        Totebag tb = new Totebag();

        tb.setJenisTas("Totebag....");
        String jn = tb.getJenisTas();

        String[] jenisWarna = {"Merah", "Putih", "Biru", "Hijau", "Ungu"};
        int w = (int) (Math.random() * 5);
        String warna = jenisWarna[w];
        tb.setWarnaDasar(warna);
        String warnaTotebag = tb.getWarnaDasar();

        String[] jenisBahan = {"Blacu", "Kanvas", "Spoud", "Baby Kanvas"};
        int b = (int) (Math.random() * 4);
        String bahan = jenisBahan[b];
        tb.setBahan(bahan);
        String bahanTotebag = tb.getBahan();

        System.out.println("Informasi Barang " + jn + "\n"
                + "Warna Totebag : " + warnaTotebag + "\n"
                + "Jenis Totebag : " + bahanTotebag
        );
    }
}

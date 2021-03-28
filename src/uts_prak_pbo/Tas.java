package uts_prak_pbo;
public class Tas {

    private String jenisTas;
    private String warnaDasar;
    private String bahan;
    private double hargaJual;
    private double persenDiskon;

    public String getJenisTas() {
        return jenisTas;
    }

    public void setJenisTas(String jenisTas) {
        this.jenisTas = jenisTas;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public double getPersenDiskon() {
        return persenDiskon;
    }

    public void setPersenDiskon(double persenDiskon) {
        this.persenDiskon = persenDiskon;
    }

    void cetakinfo() {
        System.out.println("INFO PRODUK");
    }

    void hitungSetelahHargaDiskon(){
        System.out.println("Harga Setelah Diskon");
    }

    void hitungPotonganDiskon(){
        System.out.println("Harga Potongan Diskon");
    }
}


public class Personel {
    private int id;
    private String ad;
    private String soyad;
    private String tc;
    private String maas;

    public Personel(int id, String ad, String soyad, String tc, String maas) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.maas = maas;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTc() {
        return tc;
    }

    public String getMaas() {
        return maas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
    
}

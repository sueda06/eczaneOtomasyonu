
public class İlac {
    private String ad;
    private String turu;
    private String sonKul;

    public İlac(String ad, String turu, String sonKul) {
        this.ad = ad;
        this.turu = turu;
        this.sonKul = sonKul;
    }

    public String getAd() {
        return ad;
    }

    public String getTuru() {
        return turu;
    }

    public String getSonKul() {
        return sonKul;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public void setSonKul(String sonKul) {
        this.sonKul = sonKul;
    }
    
}

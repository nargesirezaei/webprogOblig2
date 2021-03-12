package soblig2.webprog;

public class Billett {
    private int antal;
    private String fornavn;
    private String etternavn;
    private String tel;
    private String epost;

    public Billett(){}

    public Billett(int antal, String fornavn, String etternavn, String tel, String epost) {
        this.antal = antal;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tel = tel;
        this.epost = epost;
    }

    public int getAntal() {
        return antal;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTel() {
        return tel;
    }

    public String getEpost() {
        return epost;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}

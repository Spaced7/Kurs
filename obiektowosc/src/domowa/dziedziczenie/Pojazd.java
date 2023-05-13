package domowa.dziedziczenie;

public abstract class Pojazd {

    private String marka;
    private String model;
    private int rokProdukcji;
    private String kolor;

    public Pojazd(String marka, String model, int rokProdukcji, String kolor) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.kolor = kolor;
    }

    public abstract int obliczWiek();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return marka + " " + model;
    }
}

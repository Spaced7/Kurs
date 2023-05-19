package metoda.abstrakcyjna;

public class Samochod {

    private String marka;
    private String model;

    private Przyspieszenie przyspieszenie;

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

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

    public Przyspieszenie getPrzyspieszenie() {
        return przyspieszenie;
    }

    public void setPrzyspieszenie(Przyspieszenie przyspieszenie) {
        this.przyspieszenie = przyspieszenie;
    }

    public String toString() {
        return marka + " " + model;
    }
}

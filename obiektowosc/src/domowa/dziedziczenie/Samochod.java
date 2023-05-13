package domowa.dziedziczenie;

import java.time.LocalDate;

public class Samochod extends Pojazd {

    private int przebieg;
    private String jakaSkrzyniaBiegow;

    public Samochod(String marka, String model, int rokProdukcji, String kolor, int przebieg, String jakaSkrzyniaBiegow) {
        super(marka, model, rokProdukcji, kolor);
        this.przebieg = przebieg;
        this.jakaSkrzyniaBiegow = jakaSkrzyniaBiegow;
    }

    @Override
    public int obliczWiek() {
        return LocalDate.now().getYear() - getRokProdukcji();
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getJakaSkrzyniaBiegow() {
        return jakaSkrzyniaBiegow;
    }

    public void setJakaSkrzyniaBiegow(String jakaSkrzyniaBiegow) {
        this.jakaSkrzyniaBiegow = jakaSkrzyniaBiegow;
    }
}

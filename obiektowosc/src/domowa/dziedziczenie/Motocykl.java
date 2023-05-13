package domowa.dziedziczenie;

import java.time.LocalDate;

public class Motocykl extends Pojazd {

    private int predkoscMaksymalna;
    private int liczbaBiegow;

    public Motocykl(String marka, String model, int rokProdukcji, String kolor, int predkoscMaksymalna, int liczbaBiegow) {
        super(marka, model, rokProdukcji, kolor);
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.liczbaBiegow = liczbaBiegow;
    }

    @Override
    public int obliczWiek() {
        return LocalDate.now().getYear() - getRokProdukcji();
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public void setPredkoscMaksymalna(int predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public int getLiczbaBiegow() {
        return liczbaBiegow;
    }

    public void setLiczbaBiegow(int liczbaBiegow) {
        this.liczbaBiegow = liczbaBiegow;
    }
}

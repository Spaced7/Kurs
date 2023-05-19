package kalkulator;

public enum Kalkulator {

    DODAWANIE {
        @Override
        public double Licz(double d1, double d2) {
            return d1 + d2;
        }
    },
    ODEJMOWANIE {
        @Override
        public double Licz(double d1, double d2) {
            return d1 - d2;
        }
    };

    public abstract double Licz(double d1, double d2);

}

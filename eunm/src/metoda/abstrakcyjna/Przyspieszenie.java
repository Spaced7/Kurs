package metoda.abstrakcyjna;

public enum Przyspieszenie {

    PRZYSPIESZ_SZYBKO {
        @Override
        public String przyspiesz() {
            return "przyspieszasz szybko";
        }
    },

    PRZYSPIESZ_WOLNO {
        @Override
        public String przyspiesz() {
            return "przyspieszasz wolno";
        }
    };

    public abstract String przyspiesz();

}

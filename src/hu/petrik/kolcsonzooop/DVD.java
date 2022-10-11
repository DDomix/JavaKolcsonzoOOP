package hu.petrik.kolcsonzooop;

public class DVD implements kolcsonozheto{

    private String cim;
    private int hossz;

    public DVD(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

    @Override
    public String megjelenithetoNev() {
        return String.format("%s (%d perc)",this.cim,this.hossz);
    }

    @Override
    public int meddigkolcsonozheto() {
        return 0;
    }
}

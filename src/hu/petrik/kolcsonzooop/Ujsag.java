package hu.petrik.kolcsonzooop;

public class Ujsag implements kolcsonozheto{
    private String cim;
    private int kiadasEv;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    public String getCim() {
        return cim;
    }

    public int getKiadasEv() {
        return kiadasEv;
    }

    public int getKiadasHet() {
        return kiadasHet;
    }

    @Override
    public String megjelenithetoNev() {
        return String.format("%s %d/%d.",this.cim,this.kiadasEv,this.kiadasHet);
    }

    @Override
    public int meddigkolcsonozheto() {
        return 0;
    }
}

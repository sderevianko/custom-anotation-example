package test;

public class BadTest {

    private String soname = "Senjame";
    private int ageInDays = 9000;

    public String ChangerSoname(String soname) {
        return "de " + soname;
    }

    public int ChangerAgeInDays(int ageInDays) {
        return ageInDays + 365;
    }
}

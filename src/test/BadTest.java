package test;

public class BadTest {

    final private String soname = "Senjame";
    final private int ageInDays = 9000;

    public String changeSoname(String soname) {
        return "de " + soname;
    }

    public int changeAgeInDays(int ageInDays) {
        return ageInDays + 365;
    }
}

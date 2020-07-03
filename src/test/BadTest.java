package test;

public class BadTest {

    private final String soname = "Senjame";
    private final int ageInDays = 9000;

    public String changeSoname(String soname) {
        return "de " + soname;
    }

    public int changeAgeInDays(int ageInDays) {
        return ageInDays + 365;
    }
}

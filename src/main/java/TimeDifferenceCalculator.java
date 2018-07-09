public class TimeDifferenceCalculator {

    private String result = "";

    public TimeDifferenceCalculator difference() {
        result =  "(5 minutes ago)";
        return this;
    }

    public TimeDifferenceCalculator convert() {
        return this;
    }

    public String asText() {
        return this.result.toString();
    }
}

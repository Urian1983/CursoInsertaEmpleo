package model;

public class TimeConversor {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeConversor (){
        this.seconds  = 0;
        this.minutes = 0;
        this.hours=0;
    }

    public void timeConversor(int secondsToConvert) {
        int minutesToConvert = secondsToConvert / 60;
        this.seconds= this.seconds + (secondsToConvert % 60);
        this.minuteConversor(minutesToConvert);

    }

    private void minuteConversor(int minutesToConvert) {
        this.hours = minutesToConvert/60;
        this.minutes = this.minutes + (minutesToConvert % 60);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

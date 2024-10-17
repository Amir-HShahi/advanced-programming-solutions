public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    /**
     * formats time,
     * if minute or second value have one digit,
     * final result will have a zero behind that value,
     * such as 2 -> 02
     * @return formatted time as "00:00:00"
     */
    public String getTime() {
        return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public int getSecond() {
        return this.second;
    }

    /**
     * set the second value if the input parameter is positive and less than sixty
     * @param second The {@code int} to be set as second
     */
    public void setSecond(int second) {
        if ((second >= 0) && (second < 60)) {
            this.second = second;
        } else if (!(second >= 0)) {
            System.out.println("- Value of the second can't be negative!\n");
        } else if (!(second >= 60)) {
            System.err.println("- Value of the second can't be greater than 60!\n");
        }
    }

    public int getMinute() {
        return this.minute;
    }

    /**
     * set minute value if the input parameter is positive and less than sixty
     * @param minute The {@code int} to be set as minute
     */
    public void setMinute(int minute) {
        if ((minute >= 0) && (minute < 60)) {
            this.minute = minute;
        } else if (!(minute >= 0)) {
            System.out.println("- Value of the minute can't be negative!\n");
        } else if (minute >= 60) {
            System.err.println("- Value of the minute can't be greater than 60!\n");
        }
    }

    public int getHour() {
        return this.hour;
    }

    /**
     * set hour value if the input parameter is positive
     * @param hour The {@code int} to be set as hour
     */
    public void setHour(int hour) {
        if (hour >= 0) {
            this.hour = hour;
        } else {
            System.out.println("- Value of the hour can't be negative!\n");
        } 
    }

}

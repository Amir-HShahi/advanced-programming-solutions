public class Main {

    public static void main(String[] args) {
        Time moment = new Time();
        //invalid inputs won't set
        moment.setSecond(12);
        moment.setMinute(70);
        moment.setHour(-2);

        moment.setMinute(31);
        moment.setHour(14);

        System.out.println("Time: " + moment.getTime());
    }
}
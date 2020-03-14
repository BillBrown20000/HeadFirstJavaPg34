public class alarmTester {

    public static void main(String[] args) {

        class alarm {

            double alarmTime;
            public String alarmMode;

            public void setAlarmTime(){
                System.out.println("the time is now 12pm");
            }
            public void getalarmTime(){
                System.out.println("the time has been changed to 1pm");
            }
            public void isalarmSet(){
                System.out.println("the time has been set to 5pm");
            }
            public void snooze(){
                System.out.println("the alarm will now be delayed for ten more mins");
            }
        }
    }
}

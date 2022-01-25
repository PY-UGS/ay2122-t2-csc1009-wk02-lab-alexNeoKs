public class time {
    public static void main(String[] args){
       

        long totalMilliseconds = System.currentTimeMillis();
        

        long totalSeconds = totalMilliseconds / 1000 ;
        long current_second = totalSeconds % 60;

        long totalMinutes = totalSeconds/60;

        long current_minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60 ;

        long current_hour = totalHours % 24;

        System.out.println("Current time is " + current_hour +":" + current_minute+":"+current_second); 
    }
}

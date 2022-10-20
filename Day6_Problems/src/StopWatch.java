import java.util.Scanner;

public class StopWatch {
    public long startTimer=0,stopTimer=0,elapsed;
    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start time : "+startTimer);
    }
    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop time : "+stopTimer);
    }
    public long getElapsed()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }
    public static void main(String[] args)
    {
        StopWatch sw=new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' to start time : ");
        sc.nextInt();
        sw.start();

        System.out.println("Enter '2' to stop time : ");
        sc.nextInt();
        sw.stop();

        long l=sw.getElapsed();
        System.out.println("Total time elapsed is in millisecond: "+l);
        int sec= (int) (l/1000);
        System.out.println("Converting millisecond to second : "+sec);
    }
}

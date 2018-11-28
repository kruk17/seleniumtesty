package manager;

public class Sleep {



    public static void sleep(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.getMessage();
        }
    }

    public static void sleep(int timeInMillis){
        try {
            Thread.sleep(timeInMillis);
        }
        catch (InterruptedException e){
            e.getMessage();
        }
    }
}

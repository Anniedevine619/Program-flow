
/**
 * Write a description of class programflow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class programflow
{
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        if (a == 5) {
            System.out.println("SUCCESS");
        }else { 
            System.out.println("FAILURE");
        }
        if (b == 2) {
            System.out.println("SUCCESS");
        }else {
            System.out.println("FAILURE");
        }
        if (b != 1) {
            System.out.println("SUCCESS");
        }else {
            System.out.println("FAILURE");
        }
        if (d == -8 && d == 4) {
            System.out.println("SUCCESS");
        }else {
            System.out.println("FAILURE");
        }
    }
    
    public static void main(String[] args)
    {
         programflow hw = new programflow();
         hw.run();
                
    }
}


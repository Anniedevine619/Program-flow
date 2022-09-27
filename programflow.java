
/**
 * Write a description of class programflow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class programflow
{
    public void run() {
        for (int i = 0; i< 15; i = i + 1) {
            System.out.println("I is equal to" + i);
        }
        for (int j = 10; j != 0; j = j - 2) {
            System.out.println("j is equal to" + j);
        }
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println("k is equal to" + k);
        }
    }
    
    public static void main(String[] args)
    {
         programflow hw = new programflow();
         hw.run();
                
    }
    
}



/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoops
{
   public static void main(String[] args) {
       WhileLoops hw = new WhileLoops();
       hw.run();
   }
   public void run() {
       int i = 0;
       while (i < 15) {
          System.out.println("i is" + i + "but is less than 15");
          i = i + 1;
       }
       i = 0;
       do {
           System.out.println("This loop will run as long as i<15");
           i++;
       } while (i < 15);
       i = 20;
       do {
           System.out.println("This loop will run at least once");
           i++;
       } while (i < 1);
       int k = 20;
       while (k > 5) {
           System.out.println("k is" + k + "but greater than 5");
           i--;
           k = k - 1;
       }
       k = 20;
       do {
           System.out.println("This loop will run as long as k > 5");
           i--;
           k = k - 1;
       } while (k > 5);
       k = 4;
       do {
           System.out.println("This loop will run at least once");
           i--;
       } while (k > 5);
       int a = 1;
       int b = 2;
       while (a < 10 && b <= 20) {
           System.out.println("a is" + a + "but less than 10 and b is" + b + "but less than or equal to 20");
           a = a + 1;
           b = b +1;
           i++;
       }
       a = 1;
       b = 2;
       do {
           System.out.println("This loop will run as long as a < 10 and b is less than or equal to 20");
           i++;
           a = a + 1;
           b = b + 1;
       } while (a < 10 && b <= 20);
       a = 11;
       b = 21;
       do {
           System.out.println("This loop will run at least once");
           i++;
       } while (a < 10 && b <= 20);
    }
}

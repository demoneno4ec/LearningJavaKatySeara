/*
  need output
  0 4
  0 3
  1 4
  1 3
  3 4
  3 3
 */

package fiveLeason;

public class MultiFor {
    public static void main (String[] args) {
        for (int x = 0; x < 4; ++x) {
            for (int y = 4; y > 2; --y){
                System.out.println(x + " " + y);
            }
            if (x == 1){
                ++x;
            }
            try{
                Integer.parseInt("фыв2");
                Integer test = 2;
            }catch (NumberFormatException e){
                System.out.println("Не правильный формат");
            }

        }
    }
}

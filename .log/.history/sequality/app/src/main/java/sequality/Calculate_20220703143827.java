package sequality;

import org.checkerframework.checker.units.qual.A;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    double ave;
    ave = (double) (x + y) / 2;
    System.out.print("Averege is" + ave);
    return ave;
  }
}

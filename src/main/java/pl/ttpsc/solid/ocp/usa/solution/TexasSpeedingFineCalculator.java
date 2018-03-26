package pl.ttpsc.solid.ocp.usa.solution;

import static jdk.nashorn.internal.objects.NativeMath.min;

public class TexasSpeedingFineCalculator implements SpeedingFineCalculator {

  private static final double SPEED_LIMIT_MPH = 60.0;
  private static final double MAX_FINE_DOLLARS = 500.0;

  @Override
  public double calculateSpeedingFineInDollars(double speedInMph) {
    if (speedInMph <= SPEED_LIMIT_MPH) {
      return 0.0;
    }
    return min(10.0 * (speedInMph - SPEED_LIMIT_MPH), MAX_FINE_DOLLARS);
  }
}

package pl.ttpsc.solid.ocp.usa.solution;

public class NewMexicoSpeedingFineCalculator implements SpeedingFineCalculator {

  private static final double SPEED_LIMIT_MPH = 70.0;

  @Override
  public double calculateSpeedingFineInDollars(double speedInMph) {
    if (speedInMph < SPEED_LIMIT_MPH) {
      return 0.0;
    }
    return 8.0 * (speedInMph - SPEED_LIMIT_MPH);
  }
}

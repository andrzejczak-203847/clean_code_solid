package pl.ttpsc.solid.dip.weathertracker.solution;

public class Phone implements AlertSender {

  @Override
  public String generateWeatherAlert(String alert) {
    String content = "Is is " + alert;
    return content;
  }
}

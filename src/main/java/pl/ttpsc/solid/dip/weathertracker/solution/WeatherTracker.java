package pl.ttpsc.solid.dip.weathertracker.solution;


import javafx.scene.control.Alert;
import pl.ttpsc.solid.dip.weathertracker.violation.Emailer;
import pl.ttpsc.solid.dip.weathertracker.violation.Phone;

public class WeatherTracker {
    String currentConditions;
    AlertSender phoneSender;
    AlertSender emailSender;

    public WeatherTracker(AlertSender phoneSender, AlertSender emailSender) {
        this.phoneSender = phoneSender;
        this.emailSender = emailSender;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phoneSender.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailSender.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}

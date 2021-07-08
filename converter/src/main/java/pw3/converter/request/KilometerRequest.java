package pw3.converter.request;

public class KilometerRequest {
    private double kilometer;

    public KilometerRequest(){}

    public KilometerRequest(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }
}

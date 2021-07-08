package pw3.converter.request;

public class KnotRequest {
    private double knot;
    public KnotRequest(){}

    public KnotRequest(double miles) {
        this.knot = miles;
    }

    public double getKnot() {
        return knot;
    }

    public void setKnot(double knot) {
        this.knot = knot;
    }
}

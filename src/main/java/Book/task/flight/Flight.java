package Book.task.flight;

import java.math.BigDecimal;

public class Flight {

    private String airportFrom;
    private String airportTo;
    private BigDecimal distance;

    public Flight(String airportFrom, String airportTo, BigDecimal distance) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.distance = distance;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public BigDecimal getDistance() {
        return distance;
    }
}

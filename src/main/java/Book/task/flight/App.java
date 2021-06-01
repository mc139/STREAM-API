package Book.task.flight;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Flight warber = new Flight("WARSAW", "BERLIN", new BigDecimal("1000"));
        Flight lonban = new Flight("LONDON", "BANGKOK", new BigDecimal("4000"));
        Flight manlax = new Flight("MANCHESTER", "LAS VEGAS", new BigDecimal("5300"));
        Flight bervan = new Flight("BERLIN", "VANCOUVER", new BigDecimal("8000"));
        Flight wrober = new Flight("WROCLAW", "BERLIN", new BigDecimal("800"));

        List<Flight> flightList = new ArrayList();
        flightList.add(warber);
        flightList.add(lonban);
        flightList.add(manlax);
        flightList.add(bervan);
        flightList.add(wrober);

        List<BigDecimal> collectedDistance = flightList.stream()
                .map(App::getDistance)
                .collect(Collectors.toList());

        System.out.println(collectedDistance);

        BigDecimal[] totalWithCount
                = collectedDistance.stream()
                .filter(Objects::nonNull)
                .map(bd -> new BigDecimal[]{bd, BigDecimal.ONE})
                .reduce((a, b) -> new BigDecimal[]{a[0].add(b[0]), a[1].add(BigDecimal.ONE)})
                .get();
        BigDecimal average = totalWithCount[0].divide(totalWithCount[1]);
        System.out.println("average distance is: " + average);
    }

    private static BigDecimal getDistance(Flight f) {
        return f.getDistance();
    }
}

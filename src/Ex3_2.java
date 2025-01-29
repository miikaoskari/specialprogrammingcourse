import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3_2
{
    public static void main(String[] args)
    {
        City la = new City("los angeles", "usa", 3219009);
        City ny = new City("new york", "usa", 902873);
        City tokyo = new City("tokyo", "japan", 90924239);
        City helsinki = new City("helsinki", "finland", 291378);

        Set<City> cities = Set.of(la, ny, tokyo, helsinki);

        Stream<City> city_stream = cities.stream();

        // 1. print all cities
        city_stream.forEach(city -> System.out.println(city.getName() + " " + city.getLocation() + " " + city.getPopulation()));

        // 2. print all cities from finland
        city_stream = cities.stream().filter(city -> city.getLocation().equals("finland"));
        city_stream.forEach(city -> System.out.println(city.getName() + " " + city.getLocation() + " " + city.getPopulation()));

        // 3. new set all cities where population 100_000 - 300_000
        city_stream = cities.stream().filter(city -> city.getPopulation() >= 100_000 && city.getPopulation() <= 300_000);
        Set<City> cities1 = city_stream.collect(Collectors.toSet());
        for (City city : cities1)
        {
            System.out.println(city.getName());
        }
    }
}

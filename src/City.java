public class City
{
    private String name;
    private String location;
    private int population;

    public City(String name, String location, int population)
    {
        this.name = name;
        this.location = location;
        this.population = population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

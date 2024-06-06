public class City {
    String name;
    int population;
    Country country;

    public City(String name, int population, Country country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Mesto " + name + " lezi v zemi " + country.name;
    }

    String getLanguageName(){
        return this.country.language.languageName;
    }
}

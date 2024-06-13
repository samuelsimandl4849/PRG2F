public class Country {
    String name;
    int population;
//    String language;
    CountryLanguage language;

    public Country(String name, int population, CountryLanguage language) {
        this.name = name;
        this.population = population;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Zeme: " + name + " ma " + population + " obyvatel a jazyk je " + language.languageName;
    }
}

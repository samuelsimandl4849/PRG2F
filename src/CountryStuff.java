public class CountryStuff {
    public static void main(String[] args) {
        CountryLanguage lang = new CountryLanguage("English", true);
        System.out.println(lang);
        Country c = new Country("Australia", 16000000, lang);
        System.out.println(c);
        City city = new City("Melbourne", 3000000, c);
        System.out.println(city);
        System.out.println(city.country);
        System.out.println(city.getLanguageName());
    }
}

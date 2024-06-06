public class CountryLanguage {
    String languageName;
    boolean isOfficial;

    public CountryLanguage(String languageName, boolean isOfficial) {
        this.languageName = languageName;
        this.isOfficial = isOfficial;
    }

    @Override
    public String toString() {
        return "jazyk: " + languageName;
    }

    public static void main(String[] args) {
        CountryLanguage lang = new CountryLanguage("English", true);
        System.out.println(lang.languageName);
        System.out.println(lang);

    }
}

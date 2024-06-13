package oop;

public class Country {

    private int population;
    private String name, countryCode;
    private double area;

    public Country(int population, String name, String countryCode, double area) {
        this.population = population;
        this.name = name;
        this.countryCode = countryCode;
        this.area = area;
    }


    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getArea() {
        return area;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3){
            this.countryCode = countryCode;
        }
        System.out.println("Nelze nastavit");
    }

    public void setPopulation(int population) {
        if (population > 0){
            this.population = population;
        }
    }
}


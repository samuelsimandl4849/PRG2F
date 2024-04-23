package oop;

public class CountryPractice {
    public static void main(String[] args) {
        //vytvorte dve zeme, vypiste, ktera ma vic obyvatel
        Country a = new Country("Australia", "AUS",
                7741220.00, 18886000);
        Country c = new Country("Canada",
                "CAN", 9970610.00, 31147000);
        System.out.println("Vice obyvatel ma:");
        if (a.getPopulation() > c.getPopulation()){
            System.out.println(a.getName());
        } else {
            System.out.println(c.getName());
        }
    }
}

class Country {
    private String name, countryCode;
    private double area;
    private int population;

    public Country(String name, String countryCode, double area, int population) {
        this.name = name;
        this.countryCode = countryCode;
        this.area = area;
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3) {
            this.countryCode = countryCode;
        }
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }

    public void setPopulation(int population) {
        if (population > 0) {
            this.population = population;
        }
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

    public int getPopulation() {
        return population;
    }
}
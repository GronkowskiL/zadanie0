public class Phone {
    final String brand;
    final String model;
    Integer yearOfProduction;
    Double batteryLife;
    String color;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setBatteryLife(Double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

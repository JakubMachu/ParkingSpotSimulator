public class Car {
    private String brand;
    private String color;
    private int licensePlate;
    private String nationality;

    public Car(String brand, String color, String nationality, int licensePlate) {
        this.brand = brand;
        this.color = color;
        this.nationality = nationality;
        this.licensePlate = licensePlate;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String brand;
        private String color;
        private String nationality;
        private int licensePlate;


        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setLicensePlate(int licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public CarBuilder setNationality(String nationality) {
            return this;
        }

        public Car build() {
            return new Car(brand, color, nationality, licensePlate);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s with license plate number: %s - from: %s entered parking spot.", color ,brand, licensePlate, nationality);
    }
}

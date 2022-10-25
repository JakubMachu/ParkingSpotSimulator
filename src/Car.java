public class Car {
    private String brand;
    private String color;
    private int licensePlate;
    private String nationality;

    public Car(String brand, String color, int licensePlate, String nationality) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.nationality = nationality;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String brand;
        private String color;
        private int licensePlate;
        private String nationality;



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
            this.nationality = nationality;
            return this;
        }

        public Car build() {
            return new Car(brand, color, licensePlate, nationality);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s with license plate number: %s - from: %s entered parking spot.", color ,brand, licensePlate, nationality);
    }
}

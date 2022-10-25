import java.lang.reflect.Array;
import java.util.Random;

public class CarGenerator extends Thread {
    private String[] colors = new String[]{"Black", "White", "Red", "Blue", "Grey", "Yellow", "Green", "Orange"};
    private String[] brand = new String[]{"BMW", "Audi", "Mercedes", "Honda", "Ford", "Fiat", "Kia", "Land Rover"};
    private String[] nationality = new String[]{"Czechia", "Slovakia", "Poland", "Germany", "Australia", "Canada"};
    Random random = new Random();

    private Car createNewCar() {
        return Car.builder()
                .setColor(colors[random.nextInt(colors.length)])
                .setLicensePlate(random.nextInt(10000, 100000))
                .setBrand(brand[random.nextInt(brand.length)])
                .setNationality(nationality[random.nextInt(nationality.length)])
                .build();
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(random.nextInt(5000));
                Car newGeneratedCar = createNewCar();
                System.out.println(newGeneratedCar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

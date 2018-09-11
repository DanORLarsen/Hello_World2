import java.awt.*;

public class Main {

    public static void main(String[] args) {

      //  System.out.println("Hello World!");

        Car myCar = new Car( 25,
                "asdf15354",
                Color.BLUE,
                true);

        Car sallyCar = new Car(15,
                "SALLY RICH",
                Color.BLACK,
                false);

        Car danCar = new Car(17,"d312321", Color.RED, false);

        System.out.println("My car License plate: " + myCar.licensePlate);
        System.out.println("Sally car License plate: " + sallyCar.licensePlate);
        System.out.println("dan car License plate: " + danCar.licensePlate);

        System.out.println("car color "+myCar.paintColor.toString());

        myCar.changePaintColor(Color.RED);

        System.out.println("car color "+myCar.paintColor.toString());

    }
}
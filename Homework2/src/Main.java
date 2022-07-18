import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

  public static void main(String[] args) {

    Car[] carList = UtilClass.setNumberOfArray(10);

    Car car1 = new Car(CarBrands.VOLVO, "XC90", "vagon", 3.5, 5, "disel", 2015);
    double carStartTime = car1.start();

    carList[0] = car1;
    Car car2 = new Car(CarBrands.AUDI, "A4", "vagon", 2.5, 5, "disel", 2011);
    carList[1] = car2;
    Car car3 = new Car(CarBrands.PEUGEOT, "308", "hatchbag", 1.6, 5, "petrol", 2010);
    carList[2] = car3;
    Car car4 = new Car(CarBrands.TESLA, "TypeS", "sedan", 0, 4, "electricity", 2019);
    carList[3] = car4;
    Car car5 = new Car(CarBrands.FORD, "Fiesta", "hatchbag", 1.2, 5, "petrol", 2002);
    carList[4] = car5;
    Car car6 = new Car(CarBrands.FIAT, "Punto", "hatchbag", 1.6, 3, "petrol", 2003);
    carList[5] = car6;
    Car car7 = new Car(CarBrands.VW, "Pollo", "hatchbag", 1.4, 3, "disel", 2002);
    carList[6] = car7;
    Car car8 = new Car(CarBrands.MB, "ML350", "vagon", 3.5, 5, "disel", 2012);
    carList[7] = car8;
    Car car9 = new Car(CarBrands.MAZDA, "3", "sedan", 2.0, 4, "petrol", 2015);
    carList[8] = car9;
    Car car10 = new Car(CarBrands.RENAULT, "Duster", "hatchbag", 2.0, 5, "petrol", 2009);
    carList[9] = car10;

    System.out.println("==================================All cars==================================");

    for (Car car : carList) {
      System.out.println(car.toString());
    }
    System.out.println("==================================Special cars==================================");


    for (int i = 1; i <= 5; i++) {
      System.out.println(carList[i].toString());
    }
    System.out.println("==================================Method working==================================");
    double carStopTime = car1.stop();
    double timeResult = carStopTime - carStartTime;
    double distance = car1.distance(timeResult, 110.5);

    System.out.println(distance);

    System.out.println("==================================Sort comparable==================================");
    List<Car> listOfrCars = Arrays.asList(carList);
    Collections.sort(listOfrCars);
    for(Car car: listOfrCars)
    System.out.println(car.toString());

  }
}
























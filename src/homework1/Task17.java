package homework1;

public class Task17 {
  public static void task17() {
   //17. Все элементы массива поделить на значение наибольшего элемента этого массива.

    int[] myArray = {10, 2, 7, 10, 5, 4, 5, 9, 7, -3, -9};
    double max = 0;
    for (int j : myArray) {
      if (j > max) {
        max = j;
      }
    }
    System.out.println("Max massive's element " + max);

    for (double el : myArray){
      double element = el/max;
      System.out.println("Massive element after division " + element);
    }
  }
}

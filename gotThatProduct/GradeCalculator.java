package gotThatProduct;

public class GradeCalculator {
    public static int sumOfElements(int[] array) {
     int sum = 0;
     for (int i : array) {
         sum = sum + i;
     }
     return sum;
    }

}

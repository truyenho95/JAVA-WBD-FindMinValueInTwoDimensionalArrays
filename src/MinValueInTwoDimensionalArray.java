public class MinValueInTwoDimensionalArray {
  public static void main(String[] args) {
    int[][] twoDimensionalArrays = {
      {1,3,5},
      {9,6,16},
      {92,-10,6}
    };

    int minValueInTwoDimensionalArray = findMinValueInTwoDimensionalArrays(twoDimensionalArrays);
    System.out.print("Giá trị nhỏ nhất trong mảng là: ");
    System.out.println(minValueInTwoDimensionalArray);
  }

  public static int findMinValueInTwoDimensionalArrays(int[][] arr) {
    int min = arr[0][0];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (min > arr[i][j]) {
          min = arr[i][j];
        }
      }
    }
    return min;
  }
}

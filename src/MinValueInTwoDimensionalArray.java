import java.util.Scanner;

public class MinValueInTwoDimensionalArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Độ rộng của ma trận là:");
    int height = scanner.nextInt();
    System.out.println("Độ dài của ma trận là:");
    int width = scanner.nextInt();
    int[][] twoDimensionalArrays = new int[height][width];

    System.out.println("Nhập mảng:");
    for (int i = 0; i < twoDimensionalArrays.length; i++)
      for (int j = 0; j < twoDimensionalArrays[0].length; j++) {
        System.out.print("Nhập giá trị phần tử có chỉ số [" + i + "][" + j + "]");
        twoDimensionalArrays[i][j] = scanner.nextInt();
      }

    System.out.println("Mảng vừa nhập là:");
    for (int i = 0; i < twoDimensionalArrays.length; i++) {
      for (int j = 0; j < twoDimensionalArrays[0].length; j++) {
        System.out.print(twoDimensionalArrays[i][j]+"\t");
      }
      System.out.print("\n");
    }

    int minValueInTwoDimensionalArray = findMinValueInTwoDimensionalArrays(twoDimensionalArrays);
    System.out.print("Giá trị nhỏ nhất trong mảng là: ");
    System.out.println(minValueInTwoDimensionalArray);
  }

  public static int findMinValueInTwoDimensionalArrays(int[][] arr) {
    int min = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (min > arr[i][j]) {
          min = arr[i][j];
        }
      }
    }
    return min;
  }
}

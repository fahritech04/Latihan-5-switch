import java.util.*;

public class Latihan01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nilai : ");
    char nilai = input.next().charAt(0);

    switch(nilai){
      case 'A':
      System.out.println("Excellent");
      break;
      case 'B':
      System.out.println("Good");
      break;
      case 'C':
      System.out.println("Average");
      break;
      case 'D':
      System.out.println("Fail");
      break;
    }

  }
}
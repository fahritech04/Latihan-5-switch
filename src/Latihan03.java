import java.util.*;

public class Latihan03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Tujuan : ");
    String tujuan = input.nextLine();
    int harga, penumpang, total;

    switch(tujuan){
      case "Jakarta":
      harga = 145000;
      penumpang = input.nextInt();
      total = penumpang * harga;
      System.out.println("Tujuan = " + tujuan + "\nPenumpang = " + penumpang + "\nTotal harga = " + total);
      break;
      case "Bogor":
      harga = 200000;
      penumpang = input.nextInt();
      total = penumpang * harga;
      System.out.println("Tujuan = " + tujuan + "\nPenumpang = " + penumpang + "\nTotal harga = " + total);
      break;
      case "Garut":
      harga = 75000;
      penumpang = input.nextInt();
      total = penumpang * harga;
      System.out.println("Tujuan = " + tujuan + "\nPenumpang = " + penumpang + "\nTotal harga = " + total);
      break;
      case "Purwakarta":
      harga = 75000;
      penumpang = input.nextInt();
      total = penumpang * harga;
      System.out.println("Tujuan = " + tujuan + "\nPenumpang = " + penumpang + "\nTotal harga = " + total);
      break;
    }
  }
}
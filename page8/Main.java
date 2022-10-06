import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("Ferrari", "Merah");
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau");

    System.out.println("【Info Mobil】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("Masukkan jarak yang akan ditempuh: ");
    int carDistance = scanner.nextInt();
    // Panggil method instance `run` dan berikan `carDistance` sebagai argument
    // public void run(int distance) {
    // System.out.println("Bergerak " + distance + "km ...");
    // if (distance <= this.fuel) {
    //   this.distance += distance;
    //   this.fuel -= distance;
    // } else {
    //   System.out.println("Bahan bakar tidak cukup");
    // }
    // System.out.println("Jarak: " + this.distance + "km");
    // System.out.println("Bahan Bakar: " + this.fuel + "L");
  //}
     car.run(carDistance);
    
    System.out.println("-----------------");
    System.out.print("Masukkan jumlah isi ulang bahan bakar: ");
    int litre = scanner.nextInt();
    car.charge(litre);
    
    System.out.println("=================");
    System.out.println("【Info Sepeda】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("Masukkan jarak yang akan ditempuh: ");
    int bicycleDistance = scanner.nextInt();
    // Panggil method instance `run` dan berikan `bicycleDistance` sebagai argument
  //   public void run(int distance) {
  //   System.out.println("Bergerak " + distance + "km ...");
  //   this.distance += distance;
  //   System.out.println("Jarak: " + this.distance + "km");
  // }
    bicycle.run(bicycleDistance);
  }
}

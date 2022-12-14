class Car extends Vehicle {
  private int fuel = 50;

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    // Tulis ulang code duplikat dibawah ini menggunakan `super`
    // System.out.println("Nama: " + this.getName());
    // System.out.println("Warna: " + this.getColor());
    // System.out.println("Jarak: " + this.getDistance() + "km");
    // System.out.println("Bahan Bakar: " + this.fuel + " L");
    super.printData();
  }

  public void charge(int litre) {
    System.out.println("Menambahkan " + litre + "L ...");
    if (litre <= 0) {
      System.out.println("Tidak ada bahan bakar tertambahkan");
    } else if (litre + this.fuel >= 100) {
      System.out.println("Tangki sekarang penuh");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println("Bahan Bakar: " + this.fuel + "L");
  }
}

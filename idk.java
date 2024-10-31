class bike {
  int gear = 5;
  void braking() {
      System.out.println("stoping");
  }
  public static void main(String[] args) {
        bike newbike = new bike();
        newbike.braking();
    }
    
}


public class main {
    public static void main(String[] args) {
        bike bike2 = new bike();
        bike2.braking();
}
}
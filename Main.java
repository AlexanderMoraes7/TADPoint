class Main {
  public static void main(String[] args) {
    double x = 10;

    int[] y = new int[10];

    TADPonto p = new TADPonto();
    p.getCoordX();
    try{
    p.setCoordY(2000);
    } catch (Exception ex) {
      System.out.println("Coordenada Y inválida");
    }
    System.out.println(p.getCoordY());
  }
}

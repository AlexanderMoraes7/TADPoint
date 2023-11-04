public class TADPonto{
  private int coordX;
  private int coordY;

  public TADPonto(){
    this.coordX = 0;
    this.coordY = 0;
  }

  public TADPonto(int coordX, int coordY){
    this.coordX = coordX;
    this.coordY = coordY;
  }

  public int getCoordX(){
    return this.coordX;
  }
  
  public int getCoordY(){
    return this.coordY;
  }

  public void setCoordX(int coordX){
    this.coordX = coordX;
  }

  public void setCoordY(int coordY) throws Exception{

    if ((coordY > 0) && (coordY < 600)){
      this.coordY = coordY;
    } else {
      throw new Exception();
    }
  }
}

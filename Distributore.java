  public class Distributore 
  {
  private int gettone;
  public Distributore()
  {
    gettone=0;
  }

  public int getGettone()
  {
    return gettone;
  }

  public void InserisciGettone(int gettone)
  {
    this.gettone+=gettone;
  }

  public boolean EspelliLattina()
  {
    boolean lattina=false;
    if (gettone>=3)
       {
        lattina=true;
        gettone-=3;
       }
    return lattina;
 }
}

import java.util.Scanner;
public class App 
{
  public static void main(String args[])
  {
  //variable to contain the result
  int scelta; 
  int gettone;
  ///////////////////////////////
  Scanner  ngettone = new Scanner(System.in); //keyboard input for gettone
  Scanner inputscelta = new Scanner(System.in); //keyboard input for scelta
  Distributore distributore = new Distributore(); //object distributore with getLattina() and EspelliLattina()

  do
  {
    System.out.println("----------------------------------------------------------");
    System.out.println("-----------                                     ----------");  
    System.out.println("-----------     THIS IS A LIFE HACK             ----------");
    System.out.println("-----------                                     ----------"); 
    System.out.println("-----------     Distributore Lattine            ----------");
    System.out.println("----------------------------------------------------------");
    System.out.println("1) Inserisci Gettone");
    System.out.println("2) Mostra Gettoni");
    System.out.println("3) Prendi Lattina");
    System.out.println("4) Esci");
    System.out.println();
  do
  {
    System.out.println("Scegli cosa fare: ");
    scelta = inputscelta.nextInt(); //input integer number from keyboard for scelta
    System.out.println();
  }while (scelta<1 || scelta>4);
  
  switch(scelta)
  {
    case 1:
           System.out.println("Inserisci il/i gettone/i: ");
           gettone = ngettone.nextInt(); //input integer number from keyboard for gettone
           distributore.InserisciGettone(gettone);
           System.out.println("Hai aggiunto: "+gettone+" gettone/i");
           System.out.println();
           break;
    case 2:
           System.out.println("In questo momento hai: "+distributore.getGettone()+" gettone/i");
           System.out.println();
           break;
    case 3:
           if (distributore.EspelliLattina())
              System.out.println("Ecco a te una lattina");
           else 
               System.out.println("Non hai abbastanza gettoni");
           System.out.println();
           break;
     case 4:
           System.out.println("Termino il programma");
           break;
      }
    }while(scelta!=4);
  } 
}

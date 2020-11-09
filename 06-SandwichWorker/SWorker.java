import javax.swing.*;
import java.util.List;

public class SWorker extends SwingWorker<Boolean,Integer> {

  public SWContenedor cSandwich, cPan, cHam, cSandwichT;
  public int time;
  private String name;
  public boolean bandera;
  public SWorker(String name) { this.name = name; }
  Resultados resultados;

  protected Boolean doInBackground() {

    int t = cSandwich.getCantidad();
    int cantTotal = 0;

    for(int i=1; i<=t; i++) {
          if(cPan.getCantidad() >= 2 && cHam.getCantidad() >= 1 && cSandwich.getCantidad() >= 1) {

            int cantPan = cPan.getCantidad() - 2;
            int cantHam = cHam.getCantidad() - 1;

            cPan.setCantidad(cantPan);
            cHam.setCantidad(cantHam);

            cPan.setText(Integer.toString(cPan.getCantidad()));
            cHam.setText(Integer.toString(cHam.getCantidad()));

            cantTotal++;
            cSandwichT.setCantidad(cantTotal);
            cSandwichT.setText(Integer.toString(cSandwichT.getCantidad()));

            cSandwich.setCantidad(cSandwich.getCantidad() - 1);
            cSandwich.setText(Integer.toString(cSandwich.getCantidad()));

            try { Thread.sleep(time); } catch(Exception e) {}

          } else {
            System.out.println("No hay recursos");
            break;
          }

    } //end for

    return true;
  } //end doInBackground()

  protected void done() {
    try {

      if(name == "User1") {
        System.out.println("User1");
        resultados.valor1 = get();
        resultados.sandwichesHechos += cSandwichT.getCantidad();       
      }

      if(name == "User2") {
        System.out.println("User2");
        resultados.valor2 = get();
        resultados.sandwichesHechos += cSandwichT.getCantidad();       
      }
      
      boolean res = resultados.acabaronAmbosThreads();
      if(res) {
        resultados.mostrarResultados(cPan.getCantidad(), cHam.getCantidad());
      }

      // System.out.println("Fin de la simulacion");
    } catch (Exception e) {
      //TODO: handle exception
    }
  } //end done()

}

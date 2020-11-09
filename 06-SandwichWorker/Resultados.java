import javax.swing.JOptionPane;

public class Resultados {
    public boolean valor1, valor2;
    public int sandwichesHechos;
    private String name;
    public Resultados(){
        // System.out.println(name + ", " + valor);
    }

    public boolean acabaronAmbosThreads() {
        if (valor1 && valor2) { 
            return true; 
        }
        return false;
    }

    public void mostrarResultados(int cPan, int cHam) {
        String msgRes = "**********RESULTADOS***********\n";
        msgRes += "Ingredientes sobrantes\n";
        msgRes += "\tPan: " + cPan + "\n";
        msgRes += "\tHamon: " + cHam + "\n";
        msgRes += "----------------------------\n";
        msgRes += "Sanwiches preparados: " + sandwichesHechos;
        JOptionPane.showMessageDialog(null, msgRes);
    }
}
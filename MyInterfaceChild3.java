public class MyInterfaceChild3 extends Thread {

    public MyInterface3Contenedor1 c1;
    String name;
    Thread t;

    public MyInterfaceChild3(String name) {
        this.name = name;
        this.t = new Thread(this, this.name);
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " ha solicitado quitar un valor");
            c1.quitarValor();
            System.out.println("");
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
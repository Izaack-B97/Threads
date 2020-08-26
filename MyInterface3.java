public class MyInterface3 {

    public static void main(String[] args) {
        
        MyInterface3Contenedor1 c1 = new MyInterface3Contenedor1();

        MyInterfaceChild3 mic1 = new MyInterfaceChild3("Pepe");
        MyInterfaceChild3 mic2 = new MyInterfaceChild3("Chuy");
    
        mic1.c1 = c1;
        mic2.c1 = c1;

        mic1.start();
        mic2.start();

    }

}
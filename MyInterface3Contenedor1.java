public class MyInterface3Contenedor1 {
    private int cantidadTotal = 10;
    
    public synchronized void quitarValor() {
        System.out.println(Thread.currentThread().getName() + " se acepto la solicitud");
        cantidadTotal--;
        System.out.println(Thread.currentThread().getName() + " quito un valor a la cantidad total y ahora el total es " + cantidadTotal);
    }
}
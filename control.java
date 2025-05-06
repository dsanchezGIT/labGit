public class control implements Runnable {
    public void run() {
        System.out.println("Hola mundo desde un hilo");
    }
    public static void main(String[] args) {
        control hilo = new control();
        Thread t = new Thread(hilo);
        t.start();
    

        // cambio abril 1
        
}

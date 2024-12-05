package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) throws Exception {

        // Crear objetos
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        // System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        // System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 17.1);
        // System.out.println(monitorLenovo);

        // Creamos un objeto de tipo computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo,
                ratonLenovo);
        // System.out.println(computadoraLenovo);

        // Creo 10 objetos distintos de Raton
        Raton ratonHP = new Raton("USB", "HP");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Raton ratonAsus = new Raton("USB", "Asus");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Raton ratonMicrosoft = new Raton("Bluetooth", "Microsoft");
        Raton ratonLogitech = new Raton("USB", "Logitech");
        Raton ratonRazer = new Raton("Bluetooth", "Razer");
        Raton ratonSteelSeries = new Raton("USB", "SteelSeries");

        // Creo 10 objetos distintos de teclado
        Teclado tecladoHP = new Teclado("USB", "HP");
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Teclado tecladoAsus = new Teclado("USB", "Asus");
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Teclado tecladoMicrosoft = new Teclado("Bluetooth", "Microsoft");
        Teclado tecladoLogitech = new Teclado("USB", "Logitech");
        Teclado tecladoRazer = new Teclado("Bluetooth", "Razer");
        Teclado tecladoSteelSeries = new Teclado("USB", "SteelSeries");

        // Creo 10 objetos distintos de Monitor
        Monitor monitorHP = new Monitor("HP", 20.1);
        Monitor monitorDell = new Monitor("Dell", 22.1);
        Monitor monitorApple = new Monitor("Apple", 24.1);
        Monitor monitorAsus = new Monitor("Asus", 25.1);
        Monitor monitorAcer = new Monitor("Acer", 26.1);
        Monitor monitorMicrosoft = new Monitor("Microsoft", 27.1);
        Monitor monitorLG = new Monitor("LG", 28.1);
        Monitor monitorSamsung = new Monitor("Samsung", 29.1);
        Monitor monitorViewSonic = new Monitor("ViewSonic", 30.1);

        // Ahora creo 6 objetos distintos Computadora
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        Computadora computadoraMicrosoft = new Computadora("Computadora Microsoft", monitorMicrosoft, tecladoMicrosoft, ratonMicrosoft);

        // Creamos una orden
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();

        orden1.agregarComputadoras(computadoraLenovo);
        orden1.agregarComputadoras(computadoraHP);
        orden2.agregarComputadoras(computadoraDell);
        orden2.agregarComputadoras(computadoraApple);
        orden3.agregarComputadoras(computadoraAsus);
        orden3.agregarComputadoras(computadoraAcer);
        orden3.agregarComputadoras(computadoraMicrosoft);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();

    }
}

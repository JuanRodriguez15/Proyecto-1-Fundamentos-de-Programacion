import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Bienvenido");
    System.out.println("");
    Main p = new Main();
    p.mostrarMenu();
  }

  public void mostrarMenu() {
    Scanner entrada = new Scanner(System.in);

    Sensor s = new Sensor();

    System.out.println("Si ingresa el número 0, se finaliza la ejecución del programa");
    System.out.println("Si ingresa el número 1, se creara un vehiculo una vez de la información del mismo ");
    System.out.println(
        "Si ingresa el numero 2, se mostrara la información de todos los vehiculos almacenados hasta el momento");
    System.out.println("Si ingresa el numero 3, se mostrara la cantidad de vehiculos almacenados hasta el momento");
    System.out.println("Si ingresa el numero 4, se mostrara la información de todos los vehiculos de color verde");
    System.out.println(
        "Si ingresa el numero 5, se mostrara la información la información de los vehiculos de modelo entre 2000 y 2021");
    System.out.println("Si ingresa el numero 6, se creara una instancia de sensor");
    System.out.println(
        "Si ingresa el numero 7, se mostrara la información de todos los sensores almacenados hasta el momento");
    System.out.println("Si ingresa el numero 8, se mostrara la cantidad de sensores almacenados hasta el momento");
    System.out.println("Si ingresa el numero 9, se mostrara los sensores tipo temperatura ");
    System.out.println(
        "Si ingresa el numero 666, se mostrara los sensores tipo temperatura ordenados por valor de menor a mayor");
    while (true) {

      int n = entrada.nextInt();
      switch (n) {
        case 0:
          System.exit(0);
          break;
        case 1:
          System.out.println("Ingrese el modelo");
          int modelo = entrada.nextInt();

          System.out.println("Ingrese la marca");
          String marca = entrada.next();

          System.out.println("Ingrese el valor");
          double valor = entrada.nextInt();

          System.out.println("Ingrese el color");
          String color = entrada.next();

          if (Vehiculo.vehiculos.length <= 10) {
            Vehiculo vehiculito = new Vehiculo(modelo, marca, valor, color);

          } else {
            System.out.println("Error base de datos llena");
          }

          break;
        case 2:
          System.out.println(Vehiculo.toStringVehiculos());

          break;
        case 3:
          System.out.println(Vehiculo.cantidadVehiculos());
          break;

        case 4:
          for (int i = 0; i < Vehiculo.posAñadir; i++) {

            String culor = Vehiculo.vehiculos[i].getColor();

            if (culor.equals("verde")) {

              System.out.println(Vehiculo.vehiculos[i]);
            }
          }
          break;

        case 5:
          for (int i = 0; i < Vehiculo.posAñadir; i++) {
            if (Vehiculo.vehiculos[i].getModelo() >= 2000 && Vehiculo.vehiculos[i].getModelo() <= 2021) {
              System.out.println(Vehiculo.vehiculos[i]);
            }
          }
          break;
        case 6:
          System.out.println("Ingrese el tipo del sensor: ");
          String tipo = entrada.next();
          System.out.println("Ingrese el valor del sensor: ");
          double valorr = entrada.nextDouble();
          s.anadirSensor(new Sensor(tipo, valorr));
          break;
        case 7:
          System.out.println(s.toStringSensores());
          break;
        case 8:
          System.out.println("Cantidad de sensores: " + s.cantidadSensores());
          break;
        case 9:
          for (int i = 0; i < Sensor.posAñadir; i++) {

            if (Sensor.sensores[i].getTipo().equals("temperatura")) {
              System.out.println(Sensor.sensores[i]);
            }

          }
          break;

        case 666:
          System.out.println(s.newArraySensoresTemperaturaOrdenados());
          break;
        default:
          System.out.println("Opcion no valida");
          break;
      }
    }
  }
}
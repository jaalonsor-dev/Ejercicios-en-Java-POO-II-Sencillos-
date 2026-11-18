public class Vehiculo {
    // Atributos
    String tipo;
    String marca;
    String modelo;
    String color;
    String motor;
    String velocidad;
    int placa;
    int anio;

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("La Marca del vehiculo es: " + marca);
        System.out.println("El Modelo es: " + modelo);
        System.out.println("El Año de este vehiculo es: " + anio);
        System.out.println("El Color es: " + color);
        System.out.println("El Tipo es: " + tipo);
        System.out.println("El Motor es: " + motor);
        System.out.println("La velocidad maxima es en km/h : " + velocidad);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de tipo Vehiculo
        Vehiculo miCarro = new Vehiculo();

        // Asignar valores a los atributos
        miCarro.marca = "BMW";
        miCarro.modelo = "m3 gtr";
        miCarro.anio = 2005;
        miCarro.color = "Azul con blanco";
        miCarro.tipo = "Deportivo";
        miCarro.motor = "V8 P60B40 de 4.0 litros";
        miCarro.velocidad = "295 km/h";

        // Usar el método
        miCarro.mostrarInfo();
    }
}
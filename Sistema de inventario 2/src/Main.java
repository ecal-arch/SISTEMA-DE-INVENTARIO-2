import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Francisco", 23, "Sistemas");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());

        Vehiculo vehiculo1 = new Vehiculo("M-842XRV", "Nissan", "Sentra", "Azul", 2022);
        Vehiculo vehiculo2 = new Vehiculo("T-317HQC", "Kia", "Sportage", "Rojo", 2021);
        Vehiculo vehiculo3 = new Vehiculo("R-965WBN", "Mazda", "Cx-5", "Plata", 2024);
        System.out.println("Placa"+ vehiculo1.getPlaca() + "Marca" + vehiculo1.getMarca() + "Modelo" + vehiculo1.getModelo() + "Color" + vehiculo1.getColor() + "Año" + vehiculo1.getYear() );
        System.out.println("Placa"+ vehiculo2.getPlaca() + "Marca" + vehiculo2.getMarca() + "Modelo" + vehiculo2.getModelo() + "Color" + vehiculo2.getColor() + "Año" + vehiculo2.getYear() );
        System.out.println("Placa"+ vehiculo3.getPlaca() + "Marca" + vehiculo3.getMarca() + "Modelo" + vehiculo3.getModelo() + "Color" + vehiculo2.getColor() + "Año" + vehiculo3.getYear() );

    }
}



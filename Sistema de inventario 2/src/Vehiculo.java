public class Vehiculo {
    //Atributos
    String placa;
    String marca;
    String modelo;
    String color;
    int year;

    public Vehiculo(String placa, String marca,String modelo, String color, int year){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
    }
    public String getPlaca(){return  placa;}
    public void setPlaca(String placa){this.placa = placa;}

    public String getMarca(){return  marca;}
    public void setMarca(String Marca){this.marca = marca;}

    public String getModelo(){return  modelo;}
    public void setModelo(String Modelo){this.modelo = modelo;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}
}

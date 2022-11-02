public class Vehiculo{

    public static Vehiculo [] vehiculos = new Vehiculo[10];
    public static int tamano=10;
    public static int posAñadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){
        
    }
    public Vehiculo(int mo, String ma, double va){
        this(mo,ma,va,"verde"); 
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this();
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co;

        this.vehiculos[posAñadir]=this;
        posAñadir++;        
    }

    public void setModelo(int mo){
        this.modelo=mo;
    }

    public int getModelo(){
        return this.modelo; 
    }

    public void setMarca(String ma){
        this.marca=ma;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setValorComercial(double va){
        this.valorComercial=va;
    }

    public double getValorComercial(){
        return valorComercial;
    }

    public void setColor(String co){
        this.color=co;
    }

    public  String getColor(){
        return this.color;
    }
     
    public  String toString(){
        String informacionVehiculo = "Vehiculo { Modelo="+this.getModelo()+" ";
        informacionVehiculo = "  "+informacionVehiculo +"Marca="+this.getMarca()+" ";
        informacionVehiculo = "  "+informacionVehiculo +"ValorComercial="+this.getValorComercial()+" ";
        informacionVehiculo = "  "+informacionVehiculo +"Color="+this.getColor()+" ";
        return informacionVehiculo;
    }

    public static String toStringVehiculos(){
        String listaVehiculos="";

        for(int i=0;i<posAñadir;i++){
            listaVehiculos=listaVehiculos+vehiculos[i].toString();    
        }
        return listaVehiculos;

        }

    public static int cantidadVehiculos(){
        return posAñadir;   
    }


}
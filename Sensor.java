public class Sensor {

    private String tipo;
    private double valor;

    public static Sensor sensores[] = new Sensor[8];
    int tamano = 8;
    public static int posAñadir = 0;

    public Sensor() {}

    public Sensor(String ti, double va) {
        this.tipo = ti;
        this.valor = va;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setTipo(String ti) {
        this.tipo = ti;
    }

    public void setValor(double va) {
        this.valor = va;
    }

    public String toString(){
        return "Tipo: " + this.tipo + " Valor: " + this.valor + "\n";
    }

    public void anadirSensor(Sensor s) {
        if (posAñadir < tamano) {
            sensores[posAñadir] = s;
            posAñadir++;
        }else{
            System.out.println("No hay espacio para mas sensores");
        }
    }

    public String toStringSensores(){
        String r = "";
        for(int i = 0; i < posAñadir; i++){
            r += sensores[i].toString();
        }
        return r;
    }

    public int cantidadSensores(){
        return posAñadir;
    }

    public String newArraySensoresTemperaturaOrdenados(){
        String ans = "";
        Sensor sensoresTemperatura[] = new Sensor[8];
        int posAnadirSensoresTemperatura = 0;
        for(int i = 0; i < posAñadir; i++){
            if(sensores[i].getTipo().equals("Temperatura") || sensores[i].getTipo().equals("temperatura")){
                sensoresTemperatura[posAnadirSensoresTemperatura] = sensores[i];
                posAnadirSensoresTemperatura++;
            }
        }
        for(int i = 0; i < posAnadirSensoresTemperatura; i++){
            for(int j = 0; j < posAnadirSensoresTemperatura - 1; j++){
                if(sensoresTemperatura[j].getValor() > sensoresTemperatura[j + 1].getValor()){
                    Sensor add = sensoresTemperatura[j];
                    sensoresTemperatura[j] = sensoresTemperatura[j + 1];
                    sensoresTemperatura[j + 1] = add;
                }
            }
            }
        for(int i = 0; i < posAnadirSensoresTemperatura; i++){
            ans += sensoresTemperatura[i].toString();
        }
        return ans;
    }
}
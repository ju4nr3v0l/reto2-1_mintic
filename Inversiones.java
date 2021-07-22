public class Inversiones {
    private int vTiempo;
    private double vMonto;
    private double vInteres;

    public Inversiones(){

    }

    public Inversiones(int vTiempo, double vMonto, double vInteres){
        this.vTiempo = vTiempo;
        this.vMonto = vMonto;
        this.vInteres = vInteres;
    }

    /**
     * Método para comparar la diferencia en el total de
     * intereses generados para el proyecto.
     * @return Respuesta al Reto.
     */
    public String validarInversion( int vTiempo,double vMonto, double vInteres ) {
        double respuesta = generarInteresesCompuesto(vTiempo, vMonto,  vInteres) - generarInteresesSimple(vTiempo, vMonto,  vInteres);
        if( respuesta > 0){
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $"+respuesta+".";
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }


    }

    public double generarInteresesCompuesto(int vTiempo,double vMonto, double vInteres ){
        return vMonto * (Math.pow((1 + vInteres), vTiempo) - 1);
    }
    public double generarInteresesSimple(int vTiempo,double vMonto, double vInteres ){
        return vMonto * vInteres * vTiempo;
    }
}

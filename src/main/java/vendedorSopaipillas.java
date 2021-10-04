public class vendedorSopaipillas {

    private String nombreVendedor;
    private int cantidad;
    private int precio;
    private int montoRecivido;

    public vendedorSopaipillas(String nombreVendedor, int cantidad) {
        this.nombreVendedor = nombreVendedor;
        this.cantidad =cantidad;
        this.precio= 250;

    }

    public void setMontoRecivido(int montoRecivido) {
        this.montoRecivido = montoRecivido;
    }
    public int getMontoRecivido() {
        return montoRecivido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public int precioFinal () {
        return getCantidad()*getPrecio();
    }
    public int devolverVuelto(){
        return montoRecivido-precioFinal();

    }
    public void mostrarVenta(){
        System.out.println("Gracias por su compra");
        System.out.println(" Usted fue atendido por "+getNombreVendedor());
        System.out.println(getCantidad()+ " sopaipillas");
        System.out.println("TOTAL : " + precioFinal());
        System.out.println("Monto recibido "+getMontoRecivido());
        System.out.println("SU VUELTO : " +devolverVuelto());


    }

}

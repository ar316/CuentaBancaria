public class Movimiento {

    private String tipoMovimiento;
    private double monto;
    
    public Movimiento(String tipoMovimiento, double monto) {
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Movimiento [tipoMovimiento=" + tipoMovimiento + ", monto=" + monto + "]";
    }
    
    
}

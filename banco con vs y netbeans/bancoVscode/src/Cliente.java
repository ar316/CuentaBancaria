import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {
    private String username;
    private String nCuenta;
    private double balance;
    ArrayList<Movimiento> movimientos;

    public Cliente(String username, String nCuenta, double balance) {
        this.username = username;
        this.nCuenta = nCuenta;
        this.balance = balance;
        movimientos = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "Cliente [username=" + username + ", nCuenta=" + nCuenta + ", balance=" + balance + "]";
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getnCuenta() {
        return nCuenta;
    }
    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void agregarMov(Movimiento movi) {
        movimientos.add(movi);
    }
    
    public void capturarMov(int i){
        if(i == 1){
            String monto =  JOptionPane.showInputDialog(null,  "digite la cantidad a depositar");
            double amount =Double.parseDouble(monto); 
            Movimiento mov = new Movimiento("deposito", amount);
            agregarMov(mov);
            deposito(amount);  
            JOptionPane.showConfirmDialog(null, "el deposito se ha realizdo correctamente", "Deposito", i, i, null);
        }
        else if(i == 2){
            String monto =  JOptionPane.showInputDialog(null,  "digite la cantidad a retirar");
            double amount =Double.parseDouble(monto); 
            Movimiento mov = new Movimiento("retiro", amount);
            agregarMov(mov);
            retiro(amount);
            JOptionPane.showConfirmDialog(null, "retiro realizado correctamente", "retiro", i, i, null);
        }  
    }

    public void verMovimiento(){
        for(Movimiento mov : movimientos){
            System.out.println(mov);
        }
    }

    public void deposito(double amount) {
        balance += amount;
    } 
    public void retiro(double amount) {
        balance -= amount;
    }


    private String display(){
        String  cadena = "";
        if(!movimientos.isEmpty()){
          for(Movimiento e: movimientos){
              cadena += e.toString() + "\n";
          }
          return cadena;
        }else{
          return "Aun no hay movimientos de este cliente";
        }
      }
  
    public void info(){
         JOptionPane.showMessageDialog(null,"Lista de movimientos"+"\n"+display());
      }
}

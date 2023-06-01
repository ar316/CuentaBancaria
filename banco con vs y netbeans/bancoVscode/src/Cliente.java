public class Cliente {
    private String username;
    private String nCuenta;
    private double balance;

    public Cliente(String username, String nCuenta, double balance) {
        this.username = username;
        this.nCuenta = nCuenta;
        this.balance = balance;
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
    
    
}

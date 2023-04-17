public class AccountBank {
	private Cliente cliente;
	private String AccountNumber;
	private double Saldo;
	
	public AccountBank(Cliente cliente, String accountNumber, double saldo) {
		super();
		this.cliente = cliente;
		AccountNumber = accountNumber;
		Saldo = saldo;
	}

	@Override
	public String toString() {
		return "AccountBank [cliente=" + cliente + ", AccountNumber=" + AccountNumber + ", Saldo=" + Saldo + "]";
	}
	
	
	

	


}

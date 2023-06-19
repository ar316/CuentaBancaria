import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {
    private String nombre;
    ArrayList<Cliente> clients;

  //constructor del banco 
    public Banco(String nombre) {
        this.nombre = nombre;
        clients = new ArrayList<>();
    }
    //metodo para agregar clientes a la lista
    public void AgregarCliente(Cliente c) {
        this.clients.add(c);
    }
      //convierte una lista de Clientes en un String para mostrarlo por JoptionPane
    private String display(){
      String  cadena = "";
      if(!clients.isEmpty()){
        for(Cliente e: clients){
            cadena += e.getUsername() +" " +e.getBalance()+ "\n";
        }
        return cadena;
      }else{
        return "Aun no hay Clientes";
      }
    }
    //muestra la cadena display() en un JoptionPane
    public void info(){
       JOptionPane.showMessageDialog(null,"Lista de Clientes"+"\n"+display());
    }
    //metodo para capturar datos del cliente 
    public void capturarDatos(){
      String nombre =JOptionPane.showInputDialog(null,  "nombre");
			String ncuenta =  JOptionPane.showInputDialog(null,  "numero de cuenta");
			String balance =  JOptionPane.showInputDialog(null,  "Balance");
			double monto =Double.parseDouble(balance) ;	
			Cliente client = new Cliente(nombre,ncuenta,monto);
      AgregarCliente(client);
    }
    //metodo para validar si existe el cliente
    public Cliente exite(String nomb){
      for(Cliente c : clients){
        if(c.getUsername().equals(nomb)){
          return c;
        }
      }
      return null;
    }

    public void agregarMov(String nombre){
      Cliente movCliente = exite(nombre);
      int op = tiposDeMovimiento();
      if(movCliente!=null){
        if(op == 1){
          movCliente.capturarMov(1);
        }else if(op == 2){
          movCliente.capturarMov(2);
         
        }
      }else{
        JOptionPane.showMessageDialog(null, "Cliente no existe");
      }
    }

    public int tiposDeMovimiento(){
      int op = -1;
      while(op != 0){
        String opcion = JOptionPane.showInputDialog(null,"opciones:"+ "\n"
        + "1.realizar deposito"+"\n"
        + "2.realizar retiro"+"\n");
        op = Integer.parseInt(opcion);
    
        switch(op){
          case 1:
            return 1;
          case 2:
            return 2; 
          default:
         }

       }
      return op;
      }

      public void verMov(String nombre){
        Cliente actual = exite(nombre);
        if(actual!=null){
        actual.info();
        }
      }
}
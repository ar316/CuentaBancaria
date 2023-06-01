import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {
    private String nombre;
    ArrayList<Cliente> clients;


    public Banco(String nombre) {
        this.nombre = nombre;
        clients = new ArrayList<>();
    }

    public void AgregarCliente(Cliente c) {
        this.clients.add(c);
    }

    private String display(){
      String  cadena = "";
      if(!clients.isEmpty()){
        for(Cliente e: clients){
            cadena += e.getUsername() +" " +e.getBalance()+ "\n";
        }
        return cadena;
      }else{
        return "no hay clientes";
      }
    }

    public void info(){
       JOptionPane.showMessageDialog(null,"Lista de Clientes"+"\n"+display());
    }
    
    
     
}

import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    

    public void AgregarSucursal(Sucursal s)
{
    this.sucursales.add(s);
}
    


 public void verInstrumentos(){
        for (Sucursal sucu : sucursales) {
            System.out.println(sucu.getNombre());
            sucu.verInstrumentos();
        }
    }
}

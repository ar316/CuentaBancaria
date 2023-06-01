import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> instruments;
    private String nombre;


    
    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instruments = new ArrayList<>();
        
    }

    public void verInstrumentos(){
        for (Instrumento instrumento : instruments) {
            System.out.println(instrumento);
        }
    }

    public void agregarInstrumento(Instrumento instrumento){
        instruments.add(instrumento);
    }

    public Object getNombre() {
        return this.nombre;
    }


    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> intrumentosTipo = new ArrayList<>();
        for(Instrumento ins: instruments) {
            if(ins.getTipo().equals(tipo))
                intrumentosTipo.add(ins);

        }

        return intrumentosTipo;

    }

    public ArrayList<Instrumento> getInstruments() {
        return instruments;
    }
   
   


}

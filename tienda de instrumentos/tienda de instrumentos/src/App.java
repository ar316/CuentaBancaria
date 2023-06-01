

public class App {
    public static void main(String[] args) throws Exception {
      Fabrica f = new Fabrica();

      Sucursal guitarras = new Sucursal ("guitarras");
      guitarras.agregarInstrumento(new Instrumento("100", 100000, TipoInstrumento.PERCUSION));
      guitarras.agregarInstrumento(new Instrumento("200", 200000, TipoInstrumento.CUERDA));
      guitarras.agregarInstrumento(new Instrumento("300", 500000, TipoInstrumento.CUERDA));
      f.AgregarSucursal(guitarras);
      
      guitarras.instrumentosPorTipo(TipoInstrumento.CUERDA);
    }              

}
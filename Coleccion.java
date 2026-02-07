
import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Instrumento>instrumentos;

    public Coleccion() {
        instrumentos = new ArrayList<>();
    }
    public Coleccion(ArrayList<Instrumento>coleccion){
        this.instrumentos = coleccion;
    }

    public void agregarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos){
        this.instrumentos = instrumentos;
    }
    public ArrayList<Instrumento> getInstrumentos(){
        return instrumentos;
    }
    public void consultarPorTipoInstrumento(String tipoInstrumento){
        for(Instrumento instrumento : instrumentos){
            if(instrumento.getTipo().equalsIgnoreCase(tipoInstrumento)){
                System.out.println(instrumento);
            }
        }
    }

    public void consultaPorAutor(String autor){
        for(Instrumento instrumento : instrumentos){
            if(instrumento.getAutor().equalsIgnoreCase(autor)){
                System.out.println(instrumento);
            }
        }
    }

    public void consultarPorCondicion(String condicion){
        for(Instrumento instrumento : instrumentos){
            if(condicion.equalsIgnoreCase("estres") && instrumento.getEstres()){
                System.out.println(instrumento);
            }
            if(condicion.equalsIgnoreCase("ansiedad") && instrumento.getAnsiedad()){
                System.out.println(instrumento);
            }
        }
    }

    public void consultarPorEvaluacion(String evaluacion){
        boolean valor = evaluacion.equalsIgnoreCase("si");

        for(Instrumento instrumento : instrumentos){
            if(instrumento.isValidacion() == valor){
                System.out.println(instrumento);
            }
        }
    }
    public void ordenarPorClave(){
        instrumentos.sort((a, b) -> a.getClave() - b.getClave());
    }

    public void ordenarPorPrimerAutor(){
        instrumentos.sort((a, b) -> a.getAutor().compareToIgnoreCase(b.getAutor()));
    }

    public void eliminarInstrumentoPorClave(int clave){
        instrumentos.removeIf(i -> i.getClave() == clave);
    }


    public void consultarInstrumentosPorCondicionYvalidados(String condicion){
        for(Instrumento instrumento : instrumentos){

            boolean cumpleCondicion =
                    (condicion.equalsIgnoreCase("estres") && instrumento.getEstres()) ||
                            (condicion.equalsIgnoreCase("ansiedad") && instrumento.getAnsiedad());

            if(cumpleCondicion && instrumento.isValidacion()){
                System.out.println(instrumento);
            }
        }
    }


}

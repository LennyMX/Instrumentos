public class Instrumento {
    private String nombre;
    private String autor;
    private String tipo;
    private String forma;
    private boolean estres;
    private boolean ansiedad;
    private boolean validacion;
    private boolean confiabilidad;
    private int clave;
    private int cita;


    public Instrumento(String nombre,String forma, String autor, String tipo, boolean validacion, boolean confiabilidad, int clave, int cita, boolean estres, boolean ansiedad) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.validacion = validacion;
        this.confiabilidad = confiabilidad;
        this.clave = clave;
        this.cita = cita;
        this.estres = estres;
        this.ansiedad = ansiedad;
        this.forma = forma;
    }

    public Instrumento() {
        this.nombre = "Control del aire";
        this.autor = "Bryan Patron";
        this.tipo = "Estres";
        this.validacion = true;
        this.confiabilidad = false;
        this.ansiedad = false;
        this.estres = false;
        this.clave = 0;
        this.cita = 0;
        this.forma = "";
    }

    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setEstado(boolean paraQueEs) {
        paraQueEs = true;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public boolean isConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(boolean confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getCita() {
        return cita;
    }
    public void setCita(int cita) {
        this.cita = cita;
    }
    public boolean getEstres() {
        return estres;
    }
    public void setEstres(boolean estres) {
        this.estres = estres;
    }
    public boolean getAnsiedad() {
        return ansiedad;
    }
    public void setAnsiedad(boolean ansiedad) {
        this.ansiedad = ansiedad;
    }


    @Override
    public String toString() {
        return clave + " | " + nombre + " | " + forma + " | " + autor + " | " +
                tipo + " | " +
                (estres ? "Estrés " : "") +
                (ansiedad ? "Ansiedad " : "") +
                " | Val:" + validacion + " | Conf:" + confiabilidad + " | Cita:" + cita;
    }

}

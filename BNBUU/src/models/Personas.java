package models;

import java.util.ArrayList;

public class Personas {

    private String usuario;
    private String apellido;
    private String password;
    private String cedula;
    private String telefono;
    
    private int claveNumerica;
    private double saldoDeLaCuenta;
    private int numeroSimpe;
    private String usuarioSimpe;
    private double saldoCuentaSimpe;
    private boolean estadoCuentaSimpe;
    private ArrayList<String> comprobantesSimpe = new ArrayList<>();
    private double saldoCuentaAhorro;
    private boolean estadoCuentaAhorro;
    String comentario;

    public Personas(String usuario, String apellido, String password, String cedula, String telefono, double saldoDeLaCuenta, double saldoCuentaSimpe, double saldoCuentaAhorro) {
        this.usuario = usuario;
        this.apellido = apellido;
        this.password = password;
        this.cedula = cedula;
        this.telefono = telefono;
        this.saldoDeLaCuenta = saldoDeLaCuenta;
        this.saldoCuentaSimpe = saldoCuentaSimpe;
        this.saldoCuentaAhorro = saldoCuentaAhorro;
    }
    
    public Personas(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getClaveNumerica() {
        return claveNumerica;
    }

    public void setClaveNumerica(int claveNumerica) {
        this.claveNumerica = claveNumerica;
    }

    public double getSaldoDeLaCuenta() {
        return saldoDeLaCuenta;
    }

    public void setSaldoDeLaCuenta(double saldoDeLaCuenta) {
        this.saldoDeLaCuenta = saldoDeLaCuenta;
    }

    public int getNumeroSimpe() {
        return numeroSimpe;
    }

    public void setNumeroSimpe(int numeroSimpe) {
        this.numeroSimpe = numeroSimpe;
    }

    public String getUsuarioSimpe() {
        return usuarioSimpe;
    }

    public void setUsuarioSimpe(String usuarioSimpe) {
        this.usuarioSimpe = usuarioSimpe;
    }

    public double getSaldoCuentaSimpe() {
        return saldoCuentaSimpe;
    }

    public void setSaldoCuentaSimpe(double saldoCuentaSimpe) {
        this.saldoCuentaSimpe = saldoCuentaSimpe;
    }

    public boolean isEstadoCuentaSimpe() {
        return estadoCuentaSimpe;
    }

    public void setEstadoCuentaSimpe(boolean estadoCuentaSimpe) {
        this.estadoCuentaSimpe = estadoCuentaSimpe;
    }

    public ArrayList<String> getComprobantesSimpe() {
        return comprobantesSimpe;
    }

    public void setComprobantesSimpe(ArrayList<String> comprobantesSimpe) {
        this.comprobantesSimpe = comprobantesSimpe;
    }

    public double getSaldoCuentaAhorro() {
        return saldoCuentaAhorro;
    }

    public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
        this.saldoCuentaAhorro = saldoCuentaAhorro;
    }

    public boolean isEstadoCuentaAhorro() {
        return estadoCuentaAhorro;
    }

    public void setEstadoCuentaAhorro(boolean estadoCuentaAhorro) {
        this.estadoCuentaAhorro = estadoCuentaAhorro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public void retirarDinero(double cantidad, String cuentaDestino){  //Resta a saldoDeLaCuenta una cantidad ingresada.

        switch (cuentaDestino) {
            case "1" -> {
                saldoDeLaCuenta -= cantidad;
            }
            case "2" -> {
                saldoCuentaAhorro -= cantidad;
            }
            case "3" -> {
                saldoCuentaSimpe -= cantidad;
            }
        }
    }
    
    public void depositarDinero(double cantidad, String cuentaDestino){  //Suma a saldoDeLaCuenta una cantidad ingresada.
        
        switch (cuentaDestino) {
            case "1" -> {
                saldoDeLaCuenta += cantidad;
            }
            case "2" -> {
                saldoCuentaAhorro += cantidad;
            }
            case "3" -> {
                saldoCuentaSimpe += cantidad;
            }
        }
    }
    
    public void mostarHistorial(){
        for(String i : comprobantesSimpe){
            System.out.println(i);
        }
    }
}

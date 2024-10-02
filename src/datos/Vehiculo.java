/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Arturo
 */
public class Vehiculo {
    private String placa;
    private String tipo;
    private String modelo;
    private boolean automatico;
    private String marca;

    public Vehiculo(String placa, String tipo, String modelo, boolean automatico, String marca) {
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.automatico = automatico;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + "placa=" + placa + ", tipo=" + tipo + ", modelo=" + modelo + ", automatico=" + automatico + ", marca=" + marca;
    }
    
    

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the automatico
     */
    public boolean isAutomatico() {
        return automatico;
    }

    /**
     * @param automatico the automatico to set
     */
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private int precioPorDia(){
        if(tipo.equalsIgnoreCase("SEDAN")){
            return 40000;
        } else if (tipo.equalsIgnoreCase("CAMIONETA")){
            return 60000;
        } else
            return 100000;
    }
    
    private int incrementoPorAutomatico(){
        if(automatico){
            return (int) (precioPorDia()*0.1f);
        }
        return 0;
    }
    
    private int incrementoPorModelo(){
        if(modelo.equalsIgnoreCase("ULTIMO")){
            return (int) (precioPorDia()*0.2f);
        }
        return 0;
    }
    
    public int precioTotalPorDia(){
        return precioPorDia()+incrementoPorAutomatico()+incrementoPorModelo();
    }
}

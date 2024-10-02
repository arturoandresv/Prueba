/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Arturo
 */
public class Empresa {

    private Vehiculo vehiculos[] = new Vehiculo[1000];
    private int numeroVehiculos = 0;

    public Empresa() {
    }

    @Override
    public String toString() {
        return "Empresa: " + mostrar() + ", numeroVehiculos=" + numeroVehiculos;
    }

    public void addVehiculo(Vehiculo v) {
        vehiculos[numeroVehiculos++] = v;
    }

    /**
     * @return the vehiculos
     */
    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    /**
     * @param vehiculos the vehiculos to set
     */
    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * @return the numeroVehiculos
     */
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    private String mostrar() {
        String lis = "";
        for (int i = 0; i < numeroVehiculos; i++) {
            lis += "" + vehiculos[i].toString() + "\n";
        }
        return lis;
    }

    public int costoPorDiaAutoDadaPlaca(String placa) {
        for (int i = 0; i < numeroVehiculos; i++) {
            if (placa.equalsIgnoreCase(vehiculos[i].getPlaca())) {
                return vehiculos[i].precioTotalPorDia();
            }
        }
        return 0;
    }

    public void cambiarModeloDadaPlaca(String placa, String modelo) {
        for (int i = 0; i < numeroVehiculos; i++) {
            if (placa.equalsIgnoreCase(vehiculos[i].getPlaca())) {
                vehiculos[i].setModelo(modelo);
            }
        }
    }

    public float porcentajeVehiculosAutomaticos() {
        int numeroAutomaticos = 0;
        for (int i = 0; i < numeroVehiculos; i++) {
            if (vehiculos[i].isAutomatico()) {
                numeroAutomaticos++;
            }
        }
        return (float) numeroAutomaticos / numeroVehiculos * 100;
    }

    public void eliminarPorPlaca(String placa) {
        for (int i = 0; i < numeroVehiculos; i++) {
            if (placa.equalsIgnoreCase(vehiculos[i].getPlaca())) {
                moverIzquierda(i--);
                numeroVehiculos--;
            }
        }
    }

    private void moverIzquierda(int i) {
        for (int j = i; j < numeroVehiculos - 1; j++) {
            vehiculos[j] = vehiculos[j + 1];
        }
    }

    /*
    public String listaMarcas(){
        String marcas = "";
        for (int i = 0; i < numeroVehiculos; i++) {
            if(!marcas.contains(vehiculos[i].getMarca().toLowerCase())){
                marcas += "" + vehiculos[i].getMarca().toLowerCase()+"\n";
            }
        }
        return marcas;
    }
     */
    public String listaMarcas() {
        String marcas[] = new String[numeroVehiculos];
        int nmarcas = 0;

        for (int i = 0; i < numeroVehiculos; i++) {
            if (buscarMarca(marcas, vehiculos[i].getMarca(), nmarcas).equals(" ")) {
                marcas[nmarcas++] = vehiculos[i].getMarca();
            }
        }

        return mostrarMarcas(marcas, nmarcas);
    }

    public String buscarMarca(String[] marcas, String m, int nmarcas) {
        if (nmarcas != 0) {
            for (int i = 0; i < nmarcas; i++) {
                if (marcas[i].equalsIgnoreCase(m)) {
                    return marcas[i];
                }
            }
        }
        return " ";
    }

    private String mostrarMarcas(String marcas[], int nmarcas) {
        String lis = "";
        for (int i = 0; i < nmarcas; i++) {
            lis += "" + marcas[i]+ "\n";
        }
        return lis;
    }

}

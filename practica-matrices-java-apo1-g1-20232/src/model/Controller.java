package model;

import model.SalaCine;
import model.MatrizNumerica;


public class Controller {

    private SalaCine cinemark; // Declarando sala de cine
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;
    private MatrizNumerica matriz3;



    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
        
    }

    public void IniciarlizarMatrices(int filas, int columnas){
        matriz1 = new MatrizNumerica(filas, columnas);
        matriz2 = new MatrizNumerica(filas, columnas);
        matriz3 = new MatrizNumerica(filas, columnas);
    }

    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1() {
        return matriz1;
    }

    public MatrizNumerica getMatriz2() {
        return matriz2;
    }


    public MatrizNumerica sumaMatrices() {
        int[][] resultado = matriz1.sumaMatrices(matriz1.getMatriz(), matriz2.getMatriz());

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                matriz3.insertarValor(i, j, resultado[i][j]);
            }
        }
        return matriz3;
    }




}

package model;

public class MatrizNumerica {
    
    private int[][] matriz;
    
    private int cantidadFilas;
    private int cantidadColumnas;

    public MatrizNumerica(int cantidadFilas, int cantidadColumnas) {
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.matriz = new int[cantidadFilas][cantidadColumnas]; // inicializar matriz
    }

    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    public int [][] getMatriz() {
        return matriz;
    }

    public int [][] sumaMatrices(int[][] matriz1, int[][] matriz2) { 
        int[][] resultado = new int[matriz1.length][matriz2[0].length];
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz2[0].length; j++){
                resultado[i][j] = (matriz1[i][j] + matriz2[i][j]);
            }
        }
        return resultado;
    }



}
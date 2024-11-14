package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new  Matriz();
//        Random rd = new Random();
//        Random random = new Random();
        while (true){
            System.out.println("ingrese un valor para la celda. O ingrese FIN para terminar el ingreso");
            String valor = sc.nextLine();
            if (valor.equalsIgnoreCase("FIN")){
                break;
            }
            System.out.println("ingrese el valor que quiera que posea la celda: ");
            int fila = sc.nextInt();
            sc.nextLine();
            System.out.println("En que posicion desea almacenar el valo? ");
            int pos = sc.nextInt();
            sc.nextLine();
            matriz.agregarCelda(fila,pos, valor);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Los valores guardados en ala matriz son: ");
        matriz.mostrarMatriz();
        System.out.println("------------------------------------------");
        System.out.println("vamos a buscar una celda");
        System.out.println();
        System.out.print("Ingrese la cantidad de filas de la celda: ");
        int filaBuscada = sc.nextInt();
        System.out.print("Ingrese la cantudad de columnas para obtener la celda: ");
        int columnaBuscada = sc.nextInt();

        String valorObtenido = matriz.obtenerValor(filaBuscada, columnaBuscada);
        System.out.println("La celda es (" + filaBuscada + ", " + columnaBuscada + "): " + valorObtenido);


    }
    static class Celda{
        int fila;
        int col;
        String valor;
        public Celda(int fila, int col, String valor ){
            this.fila= fila;
            this.col= col;
            this.valor= valor;
        }
        public String toString() {
            return "Celda{"+
                    "Fila= "+ fila +
                    ", columna= "+col+
                    ", nombre= "+valor+ "\"" +
                    "}";
        }
    }
    static class  Matriz{
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        public void agregarCelda(int fila, int pos, String valor){
            Celda celda = new  Celda(fila, pos, valor);
            matrizCuadrada.add(celda);
        }
        public void mostrarMatriz(){
            for (Celda m: matrizCuadrada){
                System.out.println(m);
            }
        }
        public String obtenerValor(int fila, int columna) {
            for (Celda celda : matrizCuadrada) {
                if (celda.fila == fila && celda.col == columna) {
                    return celda.valor;
                }
            }
            return "La fila y columna indicada no ha coinciden";
        }
    }
}

        
//  --------------------------------------------------------------------------------------------------------------------

//  1)
//        ArrayList<Integer> V1 = new ArrayList<Integer>();
//        while (true){
//            System.out.println("ingrese un  numero para rellenar el array: ");
//            int numIn = sc.nextInt();
//            V1.add(numIn);
//            if (numIn == 0){
//                System.out.println("ingresaste el numero 0, saliendo del programa");
//                System.out.println(" --------------------------------------------");
//                for (Integer v: V1)
//                System.out.println("los numeros añadidos al array son: "+ v);
//                break;
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------

//  2)
//        ArrayList<Integer> CN = new ArrayList<Integer>();
//        for (int i=0; i < 3; i++) {
//            System.out.println("ingrese un numero: ");
//            int num = sc.nextInt();
//            CN.add(num);
//        }
//        int numMayor = CN.get(0);
//        int numMenor = CN.get(0);
//        for (Integer n : CN) {
//            if (n > numMayor) {
//                numMayor = n;
//            }
//            if (n < numMenor) {
//                numMenor = n;
//            }
//        }
//        int Dif = numMayor - numMenor;
//        System.out.println("--------------------------------------------");
//        System.out.println("El numero mayor que ingreso es: " + numMayor);
//        System.out.println("El numero menor que ingreso es: " + numMenor);
//        System.out.println("La diferencia entre los numeros es: " + Dif);
//  3)------------------------------------------------------------------------------------------------------------------

//        for (int i = 0; i < 20; i++) {
//            int numero = random.nextInt(50) * 2;
//            Al.add(numero);
//        }
//        int suma = 0;
//        for (Integer n : Al) {
//            suma += n;
//        }
//        double promedio =  (double) suma /Al.size();
//        int contIgual =0;
//        for (Integer n : Al) {
//            if (n == promedio)
//                contIgual++;
//        }
//        int contMayor =0;
//        for (Integer n : Al) {
//            if (n > promedio)
//                contMayor++;
//        }
//        int contMenor =0;
//        for (Integer n : Al) {
//            if (n < promedio)
//                contMenor++;
//        }
//        System.out.println("El promedio aritmético es: " + promedio);
//        System.out.println("Los numeros iguales al promedio son: " + contIgual);
//        System.out.println("Los numeros mayores al promedio son: " + contMayor);
//        System.out.println("Los numeros menores al promedio son: " + contMenor);
//    }

//  4)------------------------------------------------------------------------------------------------------------------
//        for (int i = 0; i < 20; i++) {
//            int numero = random.nextInt(50);
//            num.add(numero);
//        }
//        System.out.println("ingrese el valor que desea buscar: ");
//        int numBuscar = sc.nextInt();
//        for (Integer n : num) {
//            if (num.get(n) == numBuscar) {
//                System.out.println("el numero " + numBuscar + " encontrado coincide, se ubica en la posicion: " + n);
//                System.out.println("fin del algoritmo");
//                break;
//            } else if (num.get(n) != numBuscar) {
//                System.out.println("no se encontro un numero que se pueda comparar");
//            }
//        }

//  --------------------------------------------------------------------------------------------------------------------
//  5)
//        for (int i = 0; i < 10; i++) {
//            System.out.println("ingrese un numero: ");
//            int num = sc.nextInt();
//            numeros.add(num);
//        }
//        ArrayList<Integer> v1 = new ArrayList<Integer>();
//        ArrayList<Integer> v2 = new ArrayList<Integer>();
//
//        Collections.sort(numeros);
//        for (Integer n1: numeros){
//            v1.add(n1);
//        }
//        Collections.sort(numeros, Collections.reverseOrder());
//        for (Integer n2: numeros){
//            v2.add(n2);
//        }
//        System.out.println("los datos de la lista 1: ");
//        for (Integer u1: v1){
//            System.out.println(u1);
//        }
//        System.out.println("los datos de la lista 1: ");
//        for (Integer u2: v2){
//            System.out.println(u2);
//        }

//    }
//}
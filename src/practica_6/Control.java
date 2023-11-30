/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author felix
 */
public class Control {
    int[] arreglo1;
    int[] arreglo2;
    int[] arreglo3;
    int[] arreglo4;
    int[] arreglo5;
    int[] arreglo6;
    int[] arreglo7;
    int[] arreglo8;
    int[] arreglo9;
    int[] arreglo10;
    Random rndm;
    public Control ()
    {
        arreglo1 = new int[100];
        arreglo2 = new int[500];
        arreglo3 = new int[1000];
        arreglo4 = new int[1500];
        arreglo5 = new int[2000];
        arreglo6 = new int[3000];
        arreglo7 = new int[4000];
        arreglo8 = new int[5000];
        arreglo9 = new int[7000];
        arreglo10 = new int[10000];
        rndm = new Random();
        asignarValoresCaso1();
    }
    public void inicializarCSV() throws IOException
    {
        this.tiemposMergeSortCaso1();
        this.tiemposMergeSortCaso2();
        this.tiemposMergeSortCaso3();
        this.tiemposParallelSortCaso1();
        this.tiemposParallelSortCaso2();
        this.tiemposParallelSortCaso3();
        this.tiemposQuickSortCaso1();
        this.tiemposQuickSortCaso2();
        this.tiemposQuickSortCaso3();
        this.tiemposSortCaso1();
        this.tiemposSortCaso2();
        this.tiemposSortCaso3();
    }
    
    private void asignarValoresCaso1 ()
    {
        for (int i = 0; i < arreglo1.length; i++)
        {
            arreglo1[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo2.length; i++)
        {
            arreglo2[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo3.length; i++)
        {
            arreglo3[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo4.length; i++)
        {
            arreglo4[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo5.length; i++)
        {
            arreglo5[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo6.length; i++)
        {
            arreglo6[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo7.length; i++)
        {
            arreglo7[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo8.length; i++)
        {
            arreglo8[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo9.length; i++)
        {
            arreglo9[i] = rndm.nextInt();
        }
        for (int i = 0; i < arreglo10.length; i++)
        {
            arreglo10[i] = rndm.nextInt();
        }
    }
    private void asignarValoresCaso2 ()
    {
        for (int i = 0; i < arreglo1.length; i++)
        {
            arreglo1[i] = i;
        }
        for (int i = 0; i < arreglo2.length; i++)
        {
            arreglo2[i] = i;
        }
        for (int i = 0; i < arreglo3.length; i++)
        {
            arreglo3[i] = i;
        }
        for (int i = 0; i < arreglo4.length; i++)
        {
            arreglo4[i] = i;
        }
        for (int i = 0; i < arreglo5.length; i++)
        {
            arreglo5[i] = i;
        }
        for (int i = 0; i < arreglo6.length; i++)
        {
            arreglo6[i] = i;
        }
        for (int i = 0; i < arreglo7.length; i++)
        {
            arreglo7[i] = i;
        }
        for (int i = 0; i < arreglo8.length; i++)
        {
            arreglo8[i] = i;
        }
        for (int i = 0; i < arreglo9.length; i++)
        {
            arreglo9[i] = i;
        }
        for (int i = 0; i < arreglo10.length; i++)
        {
            arreglo10[i] = i;
        }
    }
    private void asignarValoresCaso3 ()
    {
        for (int i = 0; i < arreglo1.length; i++)
        {
            arreglo1[i] = arreglo1.length - i;
        }
        for (int i = 0; i < arreglo2.length; i++)
        {
            arreglo2[i] = arreglo2.length - i;
        }
        for (int i = 0; i < arreglo3.length; i++)
        {
            arreglo3[i] = arreglo3.length - i;
        }
        for (int i = 0; i < arreglo4.length; i++)
        {
            arreglo4[i] = arreglo4.length - i;
        }
        for (int i = 0; i < arreglo5.length; i++)
        {
            arreglo5[i] = arreglo5.length- i;
        }
        for (int i = 0; i < arreglo6.length; i++)
        {
            arreglo6[i] = arreglo6.length - i;
        }
        for (int i = 0; i < arreglo7.length; i++)
        {
            arreglo7[i] = arreglo7.length - i;
        }
        for (int i = 0; i < arreglo8.length; i++)
        {
            arreglo8[i] = arreglo8.length - i;
        }
        for (int i = 0; i < arreglo9.length; i++)
        {
            arreglo9[i] = arreglo9.length - i;
        }
        for (int i = 0; i < arreglo10.length; i++)
        {
            arreglo10[i] = arreglo10.length - i;
        }
    }
    //Escritura
    public void escribirValoresCSV (String dirección, long[] datos) throws IOException
    {
        FileWriter archivo = new FileWriter(dirección);
        BufferedWriter out = new BufferedWriter(archivo);
        String[] dimensiones = {"100", "500", "1000", "1500",
        "2000", "3000", "4000", "5000", "7000", "10000"}; 
        for (int i = 0; i < datos.length; i++)
        {
            out.write(String.valueOf(i+1) + "," + dimensiones[i] + "," + String.valueOf(datos[i]) + "\n");
        }
        out.close();
    }
    //Casos de mergeSort
    //Caso 1
    public long[] tiemposMergeSortCaso1 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso1();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        mergeSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso1).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 2
     public long[] tiemposMergeSortCaso2 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso2();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        mergeSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso2).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 3
      public long[] tiemposMergeSortCaso3 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso3();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        mergeSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso3).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //QuickSort
    //Caso 1
       public long[] tiemposQuickSortCaso1 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso1();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        recursivo(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\quickSort(caso1).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 2
     public long[] tiemposQuickSortCaso2 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso2();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        recursivo(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\quickSort(caso2).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 3
      public long[] tiemposQuickSortCaso3 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso3();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        recursivo(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        recursivo(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        mergeSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\quickSort(caso3).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Sort
      //Caso 1
       public long[] tiemposSortCaso1 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso1();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\sort(caso1).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 2
    public long[] tiemposSortCaso2 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso2();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\sort(caso2).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    public long[] tiemposSortCaso3 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso3();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.sort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\sort(caso3).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //ParallelSort
    //Caso 1
     public long[] tiemposParallelSortCaso1 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso1();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\parallelSort(caso1).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Caso 2
     public long[] tiemposParallelSortCaso2 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso2();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\parallelSort(caso2).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
     public long[] tiemposParallelSortCaso3 () throws IOException
    {
        long[] tiempos = new long[10];
        long inicio;
        long fin;
        inicio = System.nanoTime();
        asignarValoresCaso3();
        //Creamos las copias de los arreglos
        int[] auxArreglo1 = new int[100];
        int[] auxArreglo2 = new int[500];
        int[] auxArreglo3 = new int[1000];
        int[] auxArreglo4 = new int[1500];
        int[] auxArreglo5 = new int[2000];
        int[] auxArreglo6 = new int[3000];
        int[] auxArreglo7 = new int[4000];
        int[] auxArreglo8 = new int[5000];
        int[] auxArreglo9 = new int[7000];
        int[] auxArreglo10 = new int[10000];
        System.arraycopy(arreglo1, 0, auxArreglo1, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, auxArreglo2, 0, arreglo2.length);
        System.arraycopy(arreglo3, 0, auxArreglo3, 0, arreglo3.length);
        System.arraycopy(arreglo4, 0, auxArreglo4, 0, arreglo4.length);
        System.arraycopy(arreglo5, 0, auxArreglo5, 0, arreglo5.length);
        System.arraycopy(arreglo6, 0, auxArreglo6, 0, arreglo6.length);
        System.arraycopy(arreglo7, 0, auxArreglo7, 0, arreglo7.length);
        System.arraycopy(arreglo8, 0, auxArreglo8, 0, arreglo8.length);
        System.arraycopy(arreglo9, 0, auxArreglo9, 0, arreglo9.length);
        System.arraycopy(arreglo10, 0, auxArreglo10, 0, arreglo10.length);
        //Tiempos:
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo1);
        fin = System.nanoTime();
        tiempos[0] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo2);
        fin = System.nanoTime();
        tiempos[1] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo3);
        fin = System.nanoTime();
        tiempos[2] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo4);
        fin = System.nanoTime();
        tiempos[3] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo5);
        fin = System.nanoTime();
        tiempos[4] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo6);
        fin = System.nanoTime();
        tiempos[5] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo7);
        fin = System.nanoTime();
        tiempos[6] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo8);
        fin = System.nanoTime();
        tiempos[7] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo9);
        fin = System.nanoTime();
        tiempos[8] = fin - inicio;
        
        inicio = System.nanoTime();
        Arrays.parallelSort(auxArreglo10);
        fin = System.nanoTime();
        tiempos[9] = fin - inicio;
        String dirección = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\parallelSort(caso3).csv";
        this.escribirValoresCSV(dirección, tiempos);
       return tiempos;
    }
    //Algoritmos de ordenamiento
    //Recursivo
     public void recursivo(int a[])
     {
         recursivo(a, 0, a.length-1);
     }
     public void recursivo(int a[], int ini, int fin)
    {
        int izq = ini;
        int der = fin;
        int pos = ini;
        int aux;
        boolean band = true;
        while (band == true)
        {
            band = false;
            while ((a[pos] <= a[der]) && (pos < der || pos > der))
            {
                der -= 1;
            }
            if (pos < der || pos > der)
            {
                aux = a[pos];
                a[pos] = a[der];
                a[der] = aux;
                pos = der;
                while (a[pos] >= a[izq] && (pos > izq || pos < izq))
                {
                    izq += 1;
                }
                if (pos < izq || pos > izq)
                {
                    band = true;
                    aux = a[pos];
                    a[pos] = a[izq];
                    a[izq] = aux;
                    pos = izq;
                }
            }
        }
        if (pos-1 > ini)
        {
            recursivo(a, ini, pos-1);
        }
        if (fin > pos+1)
        {
            recursivo(a, pos+1, fin);
        }
    }
    public void mergeSort(int arreglo[])
    {
        mergeSort(arreglo, 0, arreglo.length-1);
    }
    public void mergeSort(int arreglo[], int izq, int der)
    {
        if (izq < der)
        {
            int medio = (izq+der)/2;
            mergeSort(arreglo, izq, medio);
            mergeSort(arreglo, medio+1, der);
            merge(arreglo, izq, medio, der);
        }
    }
    public void merge(int arreglo[], int izq, int medio, int der)
    {
        int i;
        int j;
        int k;
        int[] aux = new int[arreglo.length];
        for (i = izq; i <= der; i++)
        {
            aux[i] = arreglo[i];
        }
        i = izq;
        j = medio+1;
        k = izq;
        while (i <= medio && j <= der)
        {
            if (aux[i] <= aux[j])
            {
                arreglo[k++] = aux[i++];
            }
            else
            {
                arreglo[k++] = aux[j++];
            }
        }
        while(i <= medio)
        {
            arreglo[k++] = aux[i++];
        }
}
}

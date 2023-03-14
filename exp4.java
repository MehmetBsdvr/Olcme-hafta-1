

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class exp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int[] array1 ={200,1,30,100,65};
        int[] array2 ={5,10,31,1000,65};
        int[] array3 ={5,500,32,10,6};
        int[] array4 ={5,3,300,100,650};
        System.out.println("Selection sort Saralama");
        int[] Yazdır=Selection(array1);
        Yazdırma(Yazdır);        
        System.out.println();
        System.out.println("Bubble sort Sıralama");
        int[] Yazdır2=Bubble(array2);
        Yazdırma2(Yazdır2);
        System.out.println();
        System.out.println("İnsertion sort Sıralama");
        int[] Yazdır3=İnsertion(array3);
        Yazdırma3(Yazdır3);
        System.out.println();
        System.out.println("Shell sort Sıralama");
        int[] Yazdır4=Shellsort(array4);
        Yazdırma4(Yazdır4);
        
          
    }


    public static int[] Selection(int[] array1) {
       // Selection Sort Sıralama.
       
       for(int i=0;i<array1.length-1;i++){
           for(int j=i+1;j<array1.length;j++){
              
               if(array1[j]<array1[i]){
                   int T=array1[i];
                   array1[i]=array1[j];
                   array1[j]=T;
               }
           }
       }         
        return array1;
    }

    public static void Yazdırma(int[] Sıralama1) {
       long beginTime =System.nanoTime();
       long endTime=System.nanoTime();
 
       beginTime = System.currentTimeMillis();
       for(int i=0;i<Sıralama1.length;i++){
           System.out.print(Sıralama1[i]+" ");
       }
       endTime = System.currentTimeMillis();
       System.out.println("Çalışma Süresi : " + ((double) (endTime-beginTime)) / 1000);
    }
    public static int[] Bubble(int[] array2){
        // Bubble sort sıralma. 
        for(int i=1;i<array2.length;i++){
            for(int j=1;j<array2.length-1;j++){
             
                if(array2[j+1]<array2[j]){
                    int T=array2[j];
                    array2[j]=array2[j+1];
                    array2[j+1]=T;
                }
            }
        }
     return array2;
    }
    public static void Yazdırma2(int[] Sıralama2){
        long beginTime =System.nanoTime();
        long endTime=System.nanoTime();
        for(int i=0;i<Sıralama2.length;i++){
            System.out.print(Sıralama2[i]+" ");
        }
       endTime = System.currentTimeMillis();
       System.out.println("Çalışma Süresi : " + ((double) (beginTime-endTime)) / 1000);
    }

    public static int[] İnsertion(int[] array3) {
        for (int i = 1; i < array3.length; i++) {
            int var = array3[i];
            int j = i-1;
            while(j>-1 && array3[j]>var) {
                array3[j+1] = array3[j];
                j--;
            }
            array3[j+1] = var;
        }
        
        return array3;
    }
    public static void Yazdırma3(int[] Sıralama3){
        long beginTime =System.nanoTime();
        long endTime=System.nanoTime();
        for(int i=0;i<Sıralama3.length;i++){
            System.out.print(Sıralama3[i]+" ");
        }
       endTime = System.currentTimeMillis();
       System.out.println("Çalışma Süresi : " + ((double) (beginTime-endTime)) / 1000);
    }

    public static int[] Shellsort(int[] array4) {
        int M=array4.length/2;
        while(M>2){
            for(int i=M;i<array4.length;i++){
                int g=array4[i],j=i;
                if((j>M) && (array4[j-M]>g) ){
                    array4[j]=array4[j-M];
                    j=j-M;
                }
                array4[j]=g;
            }
        }
        return array4;
        
    }

    public static void Yazdırma4(int[] Sıralama4) {
        long beginTime =System.nanoTime();
        long endTime=System.nanoTime();
       for(int i=0;i<Sıralama4.length;i++){
            System.out.print(Sıralama4[i]+" ");
        }
       endTime = System.currentTimeMillis();
       System.out.println("Çalışma Süresi : " + ((double) (beginTime-endTime)/1000));
    }
    
    
}

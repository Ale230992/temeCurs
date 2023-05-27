package com.company;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main<tablouFructe> {

    public static void main(String[] args) {
	// write your code here

        String prop = "Maria merge cu bicicleta";
        System.out.println(prop.charAt(7));

        String zi = "Azi este o zi minunata";
        System.out.println(zi.replace("z","t"));

        String fruct = "Mere";
        System.out.println(fruct.replaceFirst("e","a"));

        String numere = "236524";
        System.out.println("236524".substring(2,4));

        int i=100;
        do{
            System.out.print(i+","+" ");
            i=i-2;
        }while(i>=0);

        System.out.println();

        String[] tablouFructe = {"mere","pere", "visine", "portocale"};
        for (String p: tablouFructe){
            System.out.print(p+ " ");
        }

        System.out.println();

        int z;
        for(z=1; z<=100; z=z+1) {
            System.out.print(z + "," + " ");
        }

//        int n = 5;
//        int sum = 0;
//        for(int x=1; x<=n; x++){
//            sum = sum + x;
//        }
//        System.out.println("Sum is"+ sum);

        //Exemplu 1 ppt 2(3) slide 51

        Integer[] array = {2,4,6,8};
        boolean b = Arrays.asList(array).contains(4);
        System.out.println(b);

        //Exemplu 2 ppt 2(3) slide 52

        String[] array1 = {"a","b","c","d"};
        boolean b1 = Arrays.asList(array1).contains("d");
        System.out.println(b1);

        //Problema 1 ppt 2(3) slide 53

        int [] sir = {1, 5, 2, 8, 9, 14, 3, 4, 17, 10, 11};
        int maxim = 0;
        for(int t=0; t<sir.length; t=t+1){
            if (sir[t]>maxim)
                maxim=sir[t];
            System.out.println("Maximul este"+maxim);
        }

        //Problema 2 ppt 2(3) slide 55

        int nr=4;
        if(nr>=5 && nr<=10){
            System.out.println("Numarul"+ nr +"se afla in intervalul [5,10]");
        }
        else{
            System.out.println("Numarul" + nr +" nu se afla in intervalul [5,10]");
        }

        //Problema 8 tema ppt 2(3) slide 60

        int n = 5;  //just taking n=5
        int sum = 0;
        int x=1;
        do{
            sum = sum + x;
            x++;
        }while(x<=n);
        System.out.println("Sum is "+sum);
    }
}










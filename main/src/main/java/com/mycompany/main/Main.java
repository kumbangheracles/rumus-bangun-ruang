/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author herkel
 */
import java.util.Scanner;
public class Main {
    
    //deklarasi rumus
    //KUBUS
    private static float luasKubus(float r){
        float hasil = 6 * r * r;
        return hasil;
    }
    private static float volKubus(float r){
        float hasil = r * r * r;
        return hasil;
    } 
    
    //BALOK
    private static float luasBalok(float l, float p, float t){
        float hasil = (2 * p * l) + (2 * p * t) + (2 * l * t);
        return hasil;
    }
    
    private static float volBalok(float l, float p, float t){
        float hasil = p*l*t;
        return hasil;
    }
    
    //Limas segiempat
    private static float luaslimasSegi4(float sisi, float luasSisiTegak){
        float hasil = (sisi * sisi) +(4 * luasSisiTegak);
        return hasil;
    }
    
    private static float vollimasSegi4(float luasAlas, float tinggi){
        float hasil = (1/3) * (luasAlas * tinggi);
        return hasil;
    }
    

    //Mentampilkan rumus
    //Tampil kubus
    private static void tampilkubus(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rumus kubus ===");
        while(true){
        System.out.println("1. Luas kubus ");
        System.out.println("2. volume kubus ");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("=== Rumus luas kubus ===");
            System.out.println("Luas = 6 x r x r");
            System.out.print("Masukkan nilai rusuk: ");
            float r = input.nextFloat();
            System.out.printf("hasil luas kubus: %.0f",luasKubus(r));
            break;
        }
        else if(pilih == 2){
            System.out.println("=== Rumus volume kubus ===");
            System.out.println("Volume = r x r x r");
            System.out.print("Masukkan nilai rusuk: ");
            float r = input.nextFloat();
            System.out.printf("hasil volume kubus: %.0f",volKubus(r));
            break;
        }
        else{
            System.out.println("Error!!");
        }
        }
        
    }
    //Tampil balok
    private static void tampilBalok(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rumus Balok ===");
        while(true){
        System.out.println("1. Luas Balok ");
        System.out.println("2. volume Balok ");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("=== Rumus luas balok ===");
            System.out.println("Luas = (2 x p x l) + (2 x p x t) + (2 x l x t)");
            System.out.print("Masukkan nilai panjang: ");
            float p = input.nextFloat();
            System.out.print("Masukkan nilai lebar: ");
            float l = input.nextFloat();
            System.out.print("Masukkan nilai tinggi ");
            float t = input.nextFloat();
            System.out.printf("hasil luas balok: %.0f",luasBalok(p,l,t));
            break;
        }
        else if(pilih == 2){
            System.out.println("=== Rumus volume balok ===");
            System.out.println("volume = p x l x t ");
            System.out.print("Masukkan nilai panjang: ");
            float p = input.nextFloat();
            System.out.print("Masukkan nilai lebar: ");
            float l = input.nextFloat();
            System.out.print("Masukkan nilai tinggi ");
            float t = input.nextFloat();
            System.out.printf("hasil volume balok: %.0f",volBalok(p,l,t));
            break;
        }
        else{
            System.out.println("Error!!");
        }
        }
    }
    
    //Tampil Limas Segiempat
    private static void tampilLimasSegi4(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rumus Limas Segiempat ===");
        while(true){
        System.out.println("1. Luas Permukaan Limas Segiempat ");
        System.out.println("2. volume Limas Segiempat ");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("=== Rumus luas permukaan limas Segiempat ===");
            System.out.println("Luas = (sisi x sisi) + (4 x luas sisi tegak) ");
            System.out.print("Masukkan nilai sisi: ");
            float sisi = input.nextFloat();
            System.out.print("Masukkan nilai sisi: ");
            float luasSisiTegak = input.nextFloat();
            System.out.printf("hasil luas kubus: %.0f",luaslimasSegi4(sisi,luasSisiTegak));
            break;
        }
        else if(pilih == 2){
            System.out.println("=== Rumus volume Limas Segiempat ===");
            System.out.println("Volume = 1/3 x alas x tinggi ");
            System.out.print("Masukkan nilai alas ");
            float alas = input.nextFloat();
            System.out.print("Masukkan nilai tinggi ");
            float tinggi = input.nextFloat();
            System.out.printf("hasil volume kubus: %.0f",vollimasSegi4(alas,tinggi));
            break;
        }
        else{
            System.out.println("Error!!");
        }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rumus Bangun Ruang ===");
        while(true){
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segi Empat");
            System.out.print("Masukkan pilihan anda: ");
            int pilih = input.nextInt();
            if(pilih == 1){
                tampilkubus();
                break;
            }
            else if(pilih == 2){
                tampilBalok();
                break;
            }
            else if(pilih == 3){
                tampilLimasSegi4();
                break;
            }
            else{
                System.out.println("Error!!!");
            }
        }
       
    }
}

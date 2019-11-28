/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11_2;

/**
 *
 * @author doutedasolla
 */
public class Bol11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Media a = new Media("Nombre", "Autor", 20);
        String nom = a.getNom();
        String autor = a.getAutor();
        int duradaSegons = a.getDuradaSegons();

        System.out.println("Los datos son: " + nom + "," + autor + "," + duradaSegons);

    }

}

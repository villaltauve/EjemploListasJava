/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo941g01t.listasenjava;

import java.util.List;
import java.util.ArrayList;

public class ListasEnJava {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        
        nombre.add("Carlos");
        nombre.add("Ana");
        nombre.add("Beatriz");
        
        System.out.println("Lista de nombres inicial: " + nombre);
        
        nombre.remove("Carlos");
        System.out.println("Lista despues de remover a Carlos: " + nombre);
        
        nombre.remove(1);
        System.out.println("Lista despues de remover al index 1" + nombre);
    }
}




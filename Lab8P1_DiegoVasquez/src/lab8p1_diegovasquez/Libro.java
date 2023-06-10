/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_diegovasquez;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Diego Vasquez
 */
public class Libro {
    private String NombreLibro;
    private String NombreAutor;
    private int año;
    public Libro(){
        
    }// fin constructor vacio
    public Libro(String NombreLibro, String NombreAutor, int año){
        this.NombreLibro = NombreLibro;
        this.NombreAutor = NombreAutor;
        this.año = año;
//        System.out.println(NombreLibro);
//        System.out.println(NombreAutor);
//        System.out.println(año);
    }//fin libro
    public void setNombreLibro(String NombreLibro){
        this.NombreLibro = NombreLibro;
    }
    public String getNombreLibro(){
        return this.NombreLibro;
    }
    public void setNombreAutor(String NombreAutor){
        this.NombreAutor = NombreAutor;
    }
    public String getNombreAutor(){
        return this.NombreAutor;
    }
    public void setaño(int año){
        this.año = año;
    }
    public int getaño(){
        return this.año;
    }
    
    
}

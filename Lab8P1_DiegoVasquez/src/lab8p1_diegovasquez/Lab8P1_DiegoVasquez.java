/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_diegovasquez;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Diego Vasquez
 */
public class Lab8P1_DiegoVasquez {
static Scanner lea = new Scanner(System.in);
static Scanner sc = new Scanner(System.in);
static Libro[][] Librero;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        boolean done1 = false;
        //Libro[][] Librero = new Libro[][];
        Libro L = new Libro();
        while (seguir){
            System.out.println("=MENU=");
            System.out.println("1.Crear Biblioteca");
            System.out.println("2.Modificar Librero");
            System.out.println("3.Salir");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1:{
                    Librero = llenarLibrero();
                    done1 = true;
                }
                break;
                case 2:{
                    if(done1 == false){
                        System.out.println("Primero llene el librero con la opcion 1 :p");
                        break;
                    }else{
                        
                        System.out.println("Ingrese el titulo del libro: ");
                        String BookName = sc.nextLine();
                        System.out.println("Ingrese el escritor: ");
                        String BookAutor = sc.nextLine();
                        System.out.println("Ingrese el año: ");
                        int year = lea.nextInt();
                        
                        ModificarLibro(BookName, BookAutor, year, Librero);
                    }
                }
                break;
                case 3:{
                    seguir = false;
                }
                break;
                default :{
                    System.out.println("opcion invalida");
                }
                break;
            }//
        }//fin while
        // TODO code application logic here
    }//fin main
    public static Libro[][] llenarLibrero(){
        System.out.println("Ingrese la cantidad de filas para el librero: ");
        int filas = lea.nextInt();
        while (filas < 0 ){
            System.out.println("Numero invalido de filas \n Intentelo de nuevo:");
            filas = lea.nextInt();
        }//fin vali filas
        System.out.println("Ingrese la cantidad de columnas para el librero: ");
        int columnas = lea.nextInt();
        while (columnas < 0 ){
            System.out.println("Numero invalido de columnas \n Intentelo de nuevo:");
            columnas = lea.nextInt();
        }//fin vali columnas
        Libro[][] Librero = new Libro[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el título del libro: ");
                String NombreLibro = sc.nextLine();
                System.out.println("Ingrese el escritor: ");
                String NombreAutor = sc.nextLine();
                System.out.println("Ingrese el año de publicación: ");
                int año = lea.nextInt();
                Libro libro = new Libro(NombreLibro, NombreAutor, año);
                Librero[i][j] = libro;
                System.out.println("El libro fue agregado exitoamente :)");
                System.out.println("");
//                System.out.println(Librero[i][j].getNombreLibro());
            }//fin for j
        }//fin for i
        
        System.out.println("El librero completo es:");
        PrintLibrero(Librero);
        return Librero;
    }//fin llenarLibrero
    public static void PrintLibrero(Libro[][] Librero){
        int filas = Librero.length;
        int columnas = Librero[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Libro book = Librero[i][j];
                String bookname = book.getNombreLibro();
                System.out.print("["+bookname+"]");
            }//fin for j
            System.out.println("");
        }//fin for i
        System.out.println("");
    }//fin Print
    public static void ModificarLibro(String bookname, String bookmaker, int año, Libro[][] Librero){
        int diditchange = 0;
        for (int i = 0; i < Librero.length; i++) {
            for (int j = 0; j < Librero[0].length; j++) {
                Libro book = Librero[i][j];
                String nombrelibro = book.getNombreLibro();
                String nombreautor = book.getNombreAutor();
                int year = book.getaño();
                if(bookname.equals(nombrelibro) && bookmaker.equals(nombreautor) && year == año){
                    System.out.println("El libro fue encontrado en la fila "+(i+1)+" columna "+ (j+1));
                    System.out.println("");
                    System.out.println("Ingrese el titulo del libro: ");
                    String NewBookName = sc.nextLine();
                    book.setNombreLibro(NewBookName);
                    System.out.println("Ingrese el escritor: ");
                    String NewAuthor = sc.nextLine();
                    book.setNombreAutor(NewAuthor);
                    System.out.println("Ingrese el año de publicación: ");
                    int AñoNuevo = lea.nextInt();
                    book.setaño(AñoNuevo);
                    Librero[i][j] = book;
                    System.out.println("El libro fue modificado exitosamente :D");
                    
                    diditchange++;
                    
                }//fin if       
            }//fin for j
        }//fin i
        
        if(diditchange > 0){
            System.out.println("");
            System.out.println("El librero modificado es: ");
            PrintLibrero(Librero);
        }else{
            System.out.println("El libro no fue encontrado :(");
        }
    }//fin modificador
}//fin clase

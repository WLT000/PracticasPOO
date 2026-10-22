
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Walter Loza
 */
public class Persona {
    int numeroCedula;
    String nombre;
    String apellido;
    Date fechaNacimiento;
    float estatura;
    double peso;
    
    public Persona(){
}

    public Persona(String nombre, String apellido, int numeroCedula){

        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCedula = numeroCedula;
    }
    public Persona(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        
    }
    public Persona(float estatura){
        this.estatura = estatura;
    }
    public Persona(double peso){
        this.peso = peso;
    }
    
    public int calcularEdad(Date fechaNacimiento){
        return 18;
    } 
    public double calcularIMC(){
        double calcularIMC = peso/estatura*estatura;
        
        return calcularIMC;
    }
    public boolean mayorDeEdad(int limiteEdad){
        if (18 >= limiteEdad){
            return true;
        }else{
            return false ;
        }
           
       
    }
     
}

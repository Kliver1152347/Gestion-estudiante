
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
 String nombre, apellido;
 int edad;
 long codigo;
 
 public Estudiante(String nombre,String apellido, long codigo, int edad){
 this.nombre=nombre;
 this.apellido=apellido;
 this.codigo=codigo;
 this.edad=edad;
    }
    
    public String getNombre(){
    return nombre;}
    
    public String getApellido(){
    return apellido;}
    
    public long getCodigo(){
    return codigo;}
    
    public int getEdad(){
    return edad;}
    
    public void setNombre(String nombre){
    this.nombre=nombre;
}
    public void setApellido(String apellido){
    this.apellido=apellido;}
    
    public void setCodigo(long codigo){
    this.codigo=codigo;}
    
    public void setEdad(int edad){
    this.edad=edad;}
    
    public void imprimirInfoEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de Estudiante: " + codigo);
    }
    
}

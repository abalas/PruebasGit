package PracticaJavaDoc;

/**
 * Representa a un empleado dentro de una empresa, almacenando información 
 * básica como su nombre, edad, salario y departamento.
 * 
 * @author Andrei Balas 
 * @version 1.1
 * @since 2025-03-06
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre       Nombre del empleado
     * @param edad         Edad del empleado
     * @param salario      Salario del empleado
     * @param departamento Departamento en el que trabaja el empleado
     */
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre actual del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el empleado.
     * 
     * @param nombre Nombre actualizado del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del empleado.
     * 
     * @return La edad actual del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del empleado.
     * 
     * @param edad Nueva edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el salario del empleado.
     * 
     * @return El salario en la moneda de la empresa
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Modifica el salario del empleado.
     * 
     * @param salario Nuevo salario asignado al empleado
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtiene el departamento en el que trabaja el empleado.
     * 
     * @return El nombre del departamento actual del empleado
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Cambia el departamento en el que trabaja el empleado.
     * 
     * @param departamento Nuevo departamento al que pertenece el empleado
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Muestra la información detallada del empleado en la consola.
     * Incluye el nombre, edad, salario y departamento.
     */
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Edad: " + edad + ", Salario: " + salario + ", Departamento: " + departamento);
    }
}

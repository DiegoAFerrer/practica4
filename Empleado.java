public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;

    public Empleado (String id, String nombre, double salarioBase){
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public String mostrarInfo(){
        String info = "Id: " + this.id + " Nombre: " + this.nombre + " Salario Base: " + this.salarioBase;
        return info;
    }
}

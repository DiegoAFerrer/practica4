public class EmpleadoFreelance extends Empleado implements Beneficiable{
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String id, String nombre, double salarioBase, int horasTrabajadas, double tarifaHora){
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario(){
        return (horasTrabajadas * tarifaHora) + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion(){
        double porcentaje = 5;
        if(horasTrabajadas > 160){
            return salarioBase * (porcentaje/100);
        }
        else{
            return 0;
        }
    }

    @Override
    public double aplicarDescuentoSeguro(){
        int porcentaje = 3;
        return calcularSalario() * (porcentaje/100);
    }

    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    public double getTarifaHora(){
        return this.tarifaHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora){
        this.tarifaHora = tarifaHora;
    }
}
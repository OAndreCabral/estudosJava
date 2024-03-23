package BExercicio2POO;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentual) {
        grossSalary = grossSalary + (grossSalary * (percentual / 100));
    }

    public String toString() {
        return name  + ", " + "$" + String.format("%.2f", netSalary());
    }
}

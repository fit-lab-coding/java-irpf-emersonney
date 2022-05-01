package fit.core;
public class IrpfCalculator {
     
    static Double salario = 1903.98;

    public static double calculateBaseSalary(double totalSalary) {
      totalSalary = totalSalary - (totalSalary * 0.11);
      return totalSalary;
    }
  
    public static double calculateDiscount(double baseSalary) {
      return baseSalary - salario;
    }
  
    public static double calculateTaxLayer(double baseSalary) {
      if (baseSalary <= 1903.98){
        return 0.0;
      }else if (baseSalary <= 2826.65){
        return 0.075;
      }else if (baseSalary <= 3751.05){
        return 0.15;
      }else if (baseSalary <= 4664.68){
        return 0.225;
      }else{
        return 0.275;
      } 
    }
  
    public static double calculateExemption() {
      return salario;
    }
  
    public static double calculateIrpf(double totalSalary) {
      var baseSalary = calculateBaseSalary(totalSalary);
      var discountValue = calculateDiscount(baseSalary);
      var taxa = calculateTaxLayer(baseSalary);
      return discountValue * taxa;
    }

}

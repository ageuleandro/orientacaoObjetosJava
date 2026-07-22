package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	//Login criado
	
	
	public double netSalary() {
		double netSal = this.grossSalary - this.tax;
		return netSal;				
		
	}
	
	public void increaseSalary (double porcent) {
		double aumento = (porcent/100) * this.grossSalary;
		this.grossSalary += aumento;
	}
	
	public String toString() {
		return
			"Funcionário: "
			 +name+", "+this.netSalary();
				
				
	}//Nova Feature de Login criada
	
	
	
	
	
	
	
	
	
	

}

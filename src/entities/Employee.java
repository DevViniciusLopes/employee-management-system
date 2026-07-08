package entities;

public class Employee {

	private int id;
	private String name;
	private double salario;
	private String cargo;
	
	public Employee(int id, String name, double salario, String cargo) {
		
		this.id = id;
		this.name = name;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	}



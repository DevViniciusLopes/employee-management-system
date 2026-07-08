package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int select = 1;
		List <Employee> list = new ArrayList<>();
		 
		while (select != 0) {
		
		System.out.println("1 - Cadastrar funcionário");
		System.out.println("2 - Listar funcionários");
		System.out.println("3 - Buscar funcionários");
		System.out.println("4 - Aumentar salário");
		System.out.println("5 - Remover funcionários");
		System.out.println("0 - Sair");
		
		
		select = sc.nextInt();
		
		switch(select) {
		case 1: 
		
		System.out.println("Insira os dados do funcionário a ser cadastrado:");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		double salario= sc.nextDouble();
		sc.nextLine();
		String cargo =sc.nextLine();
		
		Employee emp = new Employee(id,name,salario,cargo);
		list.add(emp);
		break;
		
		case 2:
		}
		
			
		
			
		
		}
		
	}

}

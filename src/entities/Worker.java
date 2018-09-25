package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departamento departamento;
	private List<HourContract> contracts = new ArrayList<>(); // Quando possuir uma lista crie um array list e não
																// adicione a lista no contrutor

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departamento departamento) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departamento = departamento;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) { // adciona contratos a lista
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) { // remove contratos na lista
		contracts.remove(contract);
	}

	public double income(int year, int month) { // método passando paramento mes e ano
		double sum = baseSalary; //soma recebe salário base
		Calendar cal = Calendar.getInstance(); // cal recebe calendario
		for (HourContract c : contracts) { // 
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}

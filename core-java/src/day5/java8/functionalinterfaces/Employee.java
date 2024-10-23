package day5.java8.functionalinterfaces;

class Employee{
	private String empName;
	private String job;
	private Integer salary;

	@Override
	public String toString() {
		return "Employee{" +
				"empName='" + empName + '\'' +
				", job='" + job + '\'' +
				", salary=" + salary +
				'}';
	}

	public Employee(String empName, String job, Integer salary) {
		this.empName = empName;
		this.job = job;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
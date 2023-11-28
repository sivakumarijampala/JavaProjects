package Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsFeuji {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		// Add EmpTable data to the list
		try {
			employeeList.add(new Employee(7369, "SMITH", "CLERK", 7902, dateFormat.parse("1980-12-17"), 800, 0, 20));
			employeeList
					.add(new Employee(7499, "ALLEN", "SALESMAN", 7698, dateFormat.parse("1981-02-20"), 1600, 300, 30));
			employeeList
					.add(new Employee(7521, "WARD", "SALESMAN", 7698, dateFormat.parse("1981-02-22"), 1250, 500, 30));
			employeeList.add(new Employee(7566, "JONES", "MANAGER", 7839, dateFormat.parse("1981-04-02"), 2975, 0, 20));
			employeeList.add(
					new Employee(7654, "MARTIN", "SALESMAN", 7698, dateFormat.parse("1981-09-28"), 1250, 1400, 30));
			employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1981-05-01"), 2850, 0, 30));
			employeeList.add(new Employee(7782, "CLARK", "MANAGER", 7839, dateFormat.parse("1981-06-09"), 2450, 0, 10));
			employeeList.add(new Employee(7788, "SCOTT", "ANALYST", 7566, dateFormat.parse("1987-07-13"), 3000, 0, 20));
			employeeList.add(new Employee(7839, "KING", "PRESIDENT", 0, dateFormat.parse("1981-11-17"), 5000, 0, 10));
			employeeList
					.add(new Employee(7844, "TURNER", "SALESMAN", 7698, dateFormat.parse("1981-09-08"), 1500, 0, 30));
			employeeList.add(new Employee(7876, "ADAMS", "CLERK", 7788, dateFormat.parse("1987-07-13"), 1100, 0, 20));
			employeeList.add(new Employee(7900, "JAMES", "CLERK", 7698, dateFormat.parse("1981-03-12"), 950, 0, 30));
			employeeList.add(new Employee(7902, "FORD", "ANALYST", 7566, dateFormat.parse("1981-03-12"), 3000, 0, 20));
			employeeList.add(new Employee(7934, "MILLER", "CLERK", 7782, dateFormat.parse("1982-01-23"), 1300, 0, 10));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

		 //employeeList.stream().filter(e->e.getHiredate().after(dateFormat.parse("2020-12-31"))).forEach(e->System.out.println(e));

		System.out.println("****************");
		System.out.println("emp name and their commission");
		employeeList.stream().forEach(e -> System.out.println(e.geteName() + "--->" + e.getComm()));

		System.out.println("***************");
		System.out.println("deptno and there total salary");
		Map<Integer, Integer> g = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.summingInt(e -> e.getSal())));
		System.out.println(g);

		System.out.println("****************");
		System.out.println("employee name and final salary");
		employeeList.stream().forEach(e -> System.out
				.println("Name:  " + e.geteName() + "---> " + "final salary: " + e.getSal() + e.getComm()));

		System.out.println("*****************");
		System.out.println("sorting salary");
		employeeList.stream().sorted((e1, e2) -> e2.getSal() - e1.getSal())
				.forEach(e -> System.out.println(e.getSal()));

		System.out.println("************");
		System.out.println("find 5 th highest salary");
		Employee e = employeeList.stream().sorted((e1, e2) -> e2.getSal() - e1.getSal()).skip(4).findFirst().get();
		System.out.println(e.getSal());

		System.out.println("***************");

		// getting department and their max salary
		Map<Integer, Object> m1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSal)),
								e2 -> e2.map(Employee::getSal).orElse(0))));
		System.out.println(m1);

		Map<Integer, List<Employee>> d = new HashMap<>();

		// getting who are getting max salary employees
		for (Employee e2 : employeeList) {
			int dept = e2.getDeptNo();
			int maxsalary = (int) m1.get(dept);
			if (e2.getSal() == maxsalary) {
				d.computeIfAbsent(dept, k -> new ArrayList<>()).add(e2);
			}

		}

		d.forEach((dept, emp) -> {
			System.out.println("department--->" + dept);
			emp.forEach(e4 -> System.out.println(e4.geteName() + " " + e4.getSal()));
		});

		System.out.println("**************");
		System.out.println("sub ordinates");

		List<Employee> sub = employeeList.stream().filter(employee -> !subordinate(employee, employeeList))
				.collect(Collectors.toList());

		sub.forEach(t -> System.out.println(t.geteName()));

		System.out.println("************");
		System.out.println("department-wise minimum salary, maximum salary, total salary, and average salary.");
		Map<Integer, IntSummaryStatistics> stat = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.summarizingInt(e1 -> e1.getSal())));
		System.out.println(stat);

		System.out.println("******");
		System.out.println("employees getting high salary then managers");
		List<Employee> high = employeeList.stream().filter(emp -> highSalary(emp, employeeList))
				.collect(Collectors.toList());
		high.forEach(e7 -> System.out.println(e7.geteName()));
	}

	public static boolean subordinate(Employee emp, List<Employee> allemployees) {
		int empno = emp.getEmpNo();
		return allemployees.stream().anyMatch(r -> r.getMgr() == empno);
	}

	public static boolean highSalary(Employee e, List<Employee> allEmp) {
		int mgrNo = e.getMgr();
		double empSal = e.getSal();
		if (mgrNo == 0) {
			return false;
		}
		double mgrSal = allEmp.stream().filter(e9 -> e9.getEmpNo() == mgrNo).mapToDouble(Employee::getSal).findFirst()
				.orElse(0);
		return empSal > mgrSal;

	}
}

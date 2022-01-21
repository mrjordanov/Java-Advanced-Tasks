package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> departments = new LinkedHashMap<>();
        List<Employee> peoples = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String nameOfEmployee = info[0];
            double salaryOfEmployee = Double.parseDouble(info[1]);
            String positionOfEmployee = info[2];
            String departmentOfEmployee = info[3];
            Employee employee = null;
            if (info.length == 4) {
                employee = new Employee(nameOfEmployee, salaryOfEmployee, positionOfEmployee, departmentOfEmployee);
                peoples.add(employee);
                departments.putIfAbsent(employee.getDepartment(), new ArrayList<>());
                List<Double> amount = new ArrayList<>();
                amount.add(employee.getSalary());
                departments.get(departmentOfEmployee).add(salaryOfEmployee);


            } else if (info.length == 5) {
                if (info[4].contains("@")) {
                    String emailOfEmployee = info[4];
                    employee = new Employee(nameOfEmployee, salaryOfEmployee, positionOfEmployee, departmentOfEmployee, emailOfEmployee);
                    peoples.add(employee);
                    departments.putIfAbsent(employee.getDepartment(), new ArrayList<>());
                    List<Double> amount = new ArrayList<>();
                    amount.add(employee.getSalary());
                    departments.get(departmentOfEmployee).add(salaryOfEmployee);
                } else {
                    int ageOfEmployee = Integer.parseInt(info[4]);
                    employee = new Employee(nameOfEmployee, salaryOfEmployee, positionOfEmployee, departmentOfEmployee, ageOfEmployee);
                    peoples.add(employee);
                    departments.putIfAbsent(employee.getDepartment(), new ArrayList<>());
                    List<Double> amount = new ArrayList<>();
                    amount.add(employee.getSalary());
                    departments.get(departmentOfEmployee).add(salaryOfEmployee);
                }
            } else if (info.length == 6) {
                String emailOfEmployee = info[4];
                int ageOfEmployee = Integer.parseInt(info[5]);
                employee = new Employee(nameOfEmployee, salaryOfEmployee, positionOfEmployee, departmentOfEmployee, emailOfEmployee, ageOfEmployee);
                peoples.add(employee);
                departments.putIfAbsent(employee.getDepartment(), new ArrayList<>());
                List<Double> amount = new ArrayList<>();
                amount.add(employee.getSalary());
                departments.get(departmentOfEmployee).add(salaryOfEmployee);
            }

        }


        String last = "";
        double maxAVv = 0;
        for (Map.Entry<String, List<Double>> entry : departments.entrySet()) {
            double avv = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if (avv > maxAVv) {
                maxAVv = avv;
                last = entry.getKey();
            }
        }
        System.out.println("Highest Average Salary: " + last);

        List<Employee> sorted = peoples.stream().sorted((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary())).toList();
        for (Employee emp : sorted) {
            if (last.equals(emp.getDepartment())) {
                System.out.println(emp.toString());
            }
        }

    }
}

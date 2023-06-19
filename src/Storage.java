public class Storage {

    private Employee[] employees = new Employee[10];

    public Storage() {
        employees[0] = new Employee("Петров", "Петр", "Петрович", 1, 125_000.33);
        employees[1] = new Employee("Иванов", "Иван", "Иванович", 2, 135_000.75);
        employees[2] = new Employee("Семенов", "Семен", "Семенович", 3, 133_000.99);
        employees[3] = new Employee("Александрова", "Александра", "Александровна", 4, 215_000.09);
        employees[4] = new Employee("Смирнова", "Мария", "Николаевна", 5, 207_000.04);
        employees[5] = new Employee("Николаев", "Николай", "Николаевич", 6, 181_000.91);
        employees[6] = new Employee("Самойлова", "Елена", "Павловна", 7, 125_000.56);
        employees[7] = new Employee("Куликов", "Михаил", "Александрович", 8, 223_000.07);
        employees[8] = new Employee("Морозова", "Вероника", "Петровна", 9, 329_000);
        employees[9] = new Employee("Соловьев", "Петр", "Кириллович", 10, 166_000.66);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateAllSalaries() {
        double salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }
        return salaries;
    }

    public Employee findPoorEmployee() {
        Employee poorEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < poorEmployee.getSalary()) {
                poorEmployee = employee;
            }
        }
        return poorEmployee;
    }

    public Employee findRichEmployee() {
        Employee richEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > richEmployee.getSalary()) {
                richEmployee = employee;
            }
        }
        return richEmployee;
    }

    public double calculateAverageSalary() {
        double allSalary = calculateAllSalaries();
        double averageSalary = allSalary / employees.length;
        return averageSalary;
    }

    public void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}


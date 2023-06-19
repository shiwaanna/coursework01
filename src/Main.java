public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + storage.calculateAllSalaries());
        System.out.println("Сотрудник с минимальной зарплатой " + storage.findPoorEmployee());
        System.out.println("Сотрудник с максимальной зарплатой " + storage.findRichEmployee());
        System.out.println("Среднее значение зарплат: " + storage.calculateAverageSalary());
        storage.printFullName();
    }
}
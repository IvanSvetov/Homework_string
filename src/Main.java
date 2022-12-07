public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Task 2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        String fixedFullname = fullName.replace('ё', 'е');
        System.out.println(fixedFullname);
    }
}
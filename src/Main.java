import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();


        if (day.equals("Дуйшомбу")) {
            Days days = Days.MONDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Шейшемби")) {
            Days days = Days.TUESDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Шаршенби")) {
            Days days = Days.WEDNESDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Бейшемби")) {
            Days days = Days.THURSDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Жума")) {
            Days days = Days.FRIDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Ишемби")) {
            Days days = Days.SATURDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Жекшемби")) {
            Days days = Days.SUNDAY;
            System.out.println(days.getRaspisanie());
        } else if (day.equals("Pacписание")) {
            Days days1 = Days.MONDAY;
            System.out.println(days1.getRaspisanie());
            Days days2 = Days.TUESDAY;
            System.out.println(days2.getRaspisanie());
            Days days3 = Days.WEDNESDAY;
            System.out.println(days3.getRaspisanie());
            Days days4 = Days.THURSDAY;
            System.out.println(days4.getRaspisanie());
            Days days5 = Days.FRIDAY;
            System.out.println(days5.getRaspisanie());
            Days days6 = Days.SATURDAY;
            System.out.println(days6.getRaspisanie());
            Days days7 = Days.SUNDAY;
            System.out.println(days7.getRaspisanie());
        }


    }
}
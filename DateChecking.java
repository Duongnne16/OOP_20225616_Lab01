import java.util.Arrays;
import java.util.Scanner;

public class DateChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khoi tao cac mang
        String[] january = {"January", "Jan.", "Jan", "1"};
        String[] february = {"February", "Feb.", "Feb", "2"};
        String[] march = {"March", "Mar.", "Mar", "3"};
        String[] april = {"April", "Apr.", "Apr", "4"};
        String[] may = {"May", "5"};
        String[] june = {"June", "Jun", "6"};
        String[] july = {"July", "Jul", "7"};
        String[] august = {"August", "Aug.", "Aug", "8"};
        String[] september = {"September", "Sept.", "Sep", "9"};
        String[] october = {"October", "Oct.", "Oct", "10"};
        String[] november = {"November", "Nov.", "Nov", "11"};
        String[] december = {"December", "Dec.", "Dec", "12"};
        String strMonth;
        String strYear;
        int month = 0;
        int year;
        int days;

        // Nhan dang thang
        while (month == 0) {
            System.out.print("Enter month: ");
            strMonth = sc.nextLine();
            if (Arrays.asList(january).contains(strMonth)) month = 1;
            else if (Arrays.asList(february).contains(strMonth)) month = 2;
            else if (Arrays.asList(march).contains(strMonth)) month = 3;
            else if (Arrays.asList(april).contains(strMonth)) month = 4;
            else if (Arrays.asList(may).contains(strMonth)) month = 5;
            else if (Arrays.asList(june).contains(strMonth)) month = 6;
            else if (Arrays.asList(july).contains(strMonth)) month = 7;
            else if (Arrays.asList(august).contains(strMonth)) month = 8;
            else if (Arrays.asList(september).contains(strMonth)) month = 9;
            else if (Arrays.asList(october).contains(strMonth)) month = 10;
            else if (Arrays.asList(november).contains(strMonth)) month = 11;
            else if (Arrays.asList(december).contains(strMonth)) month = 12;
            else {
                System.out.println("Invalid month. Please try again.");
            }
        }

        // Nhan dang nam
        while (true){
            System.out.print("Enter year: ");
            strYear = sc.nextLine();

            if (!strYear.matches("\\d+")){
                System.out.println("Invalid year. Please try again.");
                continue;
            }
            year = Integer.parseInt(strYear);
            if (year < 0) {
                System.out.println("Invalid year. Please try again.");
            }
            else break;
        }

        // Tu thang va nam tinh so ngay cua thang
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                days = 29;
            }
            else days = 28;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        }
        else {
            days = 30;
        }

        System.out.println(month + "/" + year + " have " + days + " days");
    }
}

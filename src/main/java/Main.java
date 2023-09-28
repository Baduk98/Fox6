import ru.netology.fox.fox6.services.CalcService;

public class Main {

    public static void main(String[] args) {
        CalcService service = new CalcService();

        int income = 75_000;
        int expense = 25_000;
        int threshold = 50_000;

        int count = service.calculate(income, expense, threshold);

        System.out.println(count);




    }
}

package homeWork_2;
import java.time.LocalDate;

public class DateCommand implements Command {

    @Override
    public String getName() {
        return "Date";
    }

    @Override
    public void execute() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}

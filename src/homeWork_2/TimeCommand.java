package homeWork_2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCommand implements Command {

    @Override
    public String getName() {
        return "Time";
    }

    @Override
    public void execute() {
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}

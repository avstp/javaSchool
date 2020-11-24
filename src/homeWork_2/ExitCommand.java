package homeWork_2;

public class ExitCommand implements Command {
    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public void execute() {
        System.out.println("Конец программы Shell");
    }
}

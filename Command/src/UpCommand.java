
public class UpCommand implements ICommand {
	
    private Screen screen;

    public UpCommand(Screen s) {
        this.screen = s;
    }

    @Override
    public void execute() {
        screen.rollUp();
    }

}

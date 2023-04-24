
public class DownCommand implements ICommand {
	
	private Screen screen;

    public DownCommand(Screen s) {
        this.screen = s;
    }

    @Override
    public void execute() {
        screen.rollDown();
    }

}

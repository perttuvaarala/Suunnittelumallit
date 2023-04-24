
public class WallButton {

    private ICommand command;

    public WallButton(ICommand command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}

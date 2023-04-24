
public class Main {

	public static void main(String[] args) {

        Screen screen = new Screen();
        ICommand upCommand = new UpCommand(screen);
        ICommand downCommand = new DownCommand(screen);

        WallButton upButton = new WallButton(upCommand);
        WallButton downButton = new WallButton(downCommand);

        upButton.push();
        downButton.push();

	}

}

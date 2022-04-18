import java.io.IOException;

public class ClearTest {

	public static void main(String[] args) {
		   try {
		        if (System.getProperty("os.name").contains("Windows"))
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        else
		            Runtime.getRuntime().exec("clear");
		    } catch (IOException | InterruptedException ex) {}
	}

}

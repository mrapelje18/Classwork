import java.io.File;

public class fileSearch {
	public static String search(File f) {
		if (!f.isDirectory()) {
			if (f.isFile())
				return f.getPath();
		} else {
			search(f.listFiles()[0]);
		}
		return "not found";
	}
	public static void main(String[] args) {
		search(C:);
	}
}

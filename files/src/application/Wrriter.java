package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Wrriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morning", "good afternoon", "Good night" };
		String path = "C:\\Users\\bleac\\OneDrive\\Área de Trabalho\\Out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

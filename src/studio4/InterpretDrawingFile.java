package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		boolean tf = in.nextBoolean();
		double decimal1 = in.nextDouble();
		double decimal2 = in.nextDouble();
		double decimal3 = in.nextDouble();
		double decimal4 = in.nextDouble();
		StdDraw.setPenColor(num1, num2, num3);
	
		
		StdDraw.square(decimal1, decimal2, decimal3);
			
			
		
		
		
	}
	
	
}

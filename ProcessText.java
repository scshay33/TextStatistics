import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author stephenshay
 *
 *This class tests the TextStatistics class
 *It requires at least one text file as command line input
 */


public class ProcessText {
	
	static TextStatistics textStat;
	static ArrayList<TextStatistics> statArray=new ArrayList<TextStatistics>();
	
	public static void main(String[] args) {

		
	if(args.length<1) {
		System.err.println("Usage: java ProcessText file1 [file2 ...]");
	}
	
	if(args.length>=1) {
		
	
		for(int i=0;i<args.length;i++) {
			File file=new File (args[i]);
		
			
			if(file.exists()) {	
				statArray.add(new TextStatistics(file));
			}	
		 
			else {
			System.out.println("That is not a file!");
			}
		
		}
	for(int i=0;i<=statArray.size()-1;i++) {
		
		
		
		System.out.println(statArray.get(i));
		}
		
	}	
}

}

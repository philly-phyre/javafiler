
public class Filer {
	
	final static int read = 1;
	final static int write = 2;
	
	public static void main(String[] args) {
		
		pl("********************************************************");
		pl("Welcome, and thank you for using Text File");
		pl("Manager, Version 0.0 . ");
		pl("");
		pl("********************************************************");
		pl("This software was created by Phil Carpenter at");
		pl("Tempest Design Studios &copy; 2015");
		pl("This program allows you to read and write to");
		pl("files using a few different methods.");
		pl("");
		pl("********************************************************");
		pl("You may either choose to either write to a file, or");
		pl("read from an existing file.");
		pl("You may also either name a file, or choose one from the file");
		pl("tree screen.");
		pl("");
		pl("********************************************************");
		pl("");
		p("Would you like to run the program?:   ");
		
		boolean running = TextIO.getlnBoolean();
		while(running){
			pl("Would you like to read the contents of an existing file [1], or");
			p("rather write to a file [2]?:     ");
			
			int choice = TextIO.getlnInt();
			
			
			while(choice != read && choice != write){
				pl("********************************************************");
				p("Please choose a valid option [1 or 2]:    ");
				choice = TextIO.getlnInt();
			} // end while(choice) //
			
			if(choice == read) {
				FileRead.Reader();
			} else if (choice == write) {
				FileWrite.Writer();
			} else; // end if(choice) //
			
			p("Run program again?:         ");
			running = TextIO.getlnBoolean();
		} // end while(running) //
		
		
		pl("********************************************************");
		pl("////////////////////////////////////////////////////////");
		pl("");
		pl("");
		pl("Thank you for choosing Tempest's Software! We hope it suited");
		pl("your needs completely.");
		pl("");
		pl("");
		pl("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		pl("********************************************************");
		
		System.exit(0);
		
	}
	
	
	
	public static void pl(String x) {
		TextIO.putln(x);
	} // end pl() //
	
	public static void p(String y) {
		TextIO.put(y);
	} // end p() //
	
	public static void pf(String z) {
		TextIO.putf(z);
	} // end pf() //
	
}

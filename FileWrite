
public class FileWrite {
	
	public static void Writer() {
		
		pl("********************************************************");
		pl("********************************************************");
		pl("You are now using VeryBasic File Writer v.0,");
		pl("created by TDS/2015.");
		pl("");
		pl("");
		pl("********************************************************");
		pl("Note that when writing to a file:");
		pl("");
		pl("If the file does not exist, it will be");
		pl("created and written to.");
		pl("");
		pl("Existing files will be replaced, or");
		pl("\"overwritten\"...");
		pl("");
		pl("All writing will be copied as written;");
		pl("whitespace and symbols included.");
		pl("********************************************************");
		pl("");
		pl("Would you like to specify a file name [1],");
		p("or choose a file from the tree [2]?     ");
		
		int choice = TextIO.getInt();
		if (choice == 1){
			WriteFile();
		} else {
			WriteUser();
		} // end if(choice) //
		
	} // end Writer() //
	
	public static String lastfile = new String();
	
	public static void WriteUser() {
		boolean writing;
		do {
			pl("********************************************************");
			pl("Begin writing content to fill file.");
			pl("");
			pl("Return a line with a single SPACE or"); 
			pl("\"\\n\" to represent line breaks in your");
			pl("writing procedure.");
			pl("");
			pl("Return an EMPTY line when finished writing,");
			pl("and you will be then prompted to select a file");
			pl("to save your writing to.");
			pl("********************************************************");
			
			String input = TextIO.getln();
			String value = new String();
			
			do {
				if (input.equals(" ") || input.equals("\\n")) {
					value += "\\n" + "\\n";
				} else {
					value += input + " ";
				} // end if/else //
				input = TextIO.getln();
			} while(!(input.equals(""))); // end do/while(input) //
			pl("********************************************************");
			pl("Please choose a file to write/rewrite.");
			pl("");
			pl("");
			TextIO.writeUserSelectedFile();
			lastfile = TextIO.getOutputFileName();
			pl(value);
			TextIO.writeStandardOutput();
			pl("");
			pl("********************************************************");
			pl("Would you like to write to another file?");
			writing = TextIO.getlnBoolean();		
		} while(writing);// end do/while(writing) //
		
	} // end WriteUser() //
	
	public static void WriteFile() {
		boolean writing;
		do{
			pl("********************************************************");
			pl("Begin writing content to fill file.");
			pl("");
			pl("Return a line with a single SPACE or"); 
			pl("\"\\n\" to represent line breaks in your");
			pl("writing procedure.");
			pl("");
			pl("Return an EMPTY line when finished writing,");
			pl("and you will be then prompted to select a file");
			pl("to save your writing to.");
			pl("********************************************************");
			
			String input = TextIO.getln();
			String value = new String();
			
			do {
				if (input.equals(" ") || input.equals("\\n")) {
					value += "\\n" + "\\n";
				} else {
					value += input + " ";
				} // end if/else //
				input = TextIO.getln();
			} while(!(input.equals(""))); // end do/while(input) //
			pl("********************************************************");
			String filename = new String();
			p("Please specify a file name:      ");
			filename = TextIO.getln();
			TextIO.writeFile(filename);
			lastfile = TextIO.getOutputFileName();
			pl(value);
			TextIO.writeStandardOutput();
			pl("");
			pl("********************************************************");
			p("Would you like to write to another file?   ");
			writing = TextIO.getlnBoolean();
		} while(writing); // end do/while(writing) //
		
	} // end WriteFile() //
	
	
	
	public static void pl(String x) {
		TextIO.putln(x);
	} // end pl() //
	
	public static void p(String y) {
		TextIO.put(y);
	} // end p() //
	
	public static void pf(String z) {
		TextIO.putf(z);
	} // end pf() //
	
} // end FileWrite //

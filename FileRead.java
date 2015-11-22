
public class FileRead {
	
	public static void Reader() {
		TextIO.putln("********************************************************");
		TextIO.putln("********************************************************");
		TextIO.putln("You are now using VeryBasic File Reader v.0,");
		TextIO.putln("created by TDS/2015.");
		TextIO.putln("");
		TextIO.putln("");
		TextIO.putln("********************************************************");
		TextIO.putln("Would you like to read from the last file in this");
		TextIO.put("session [1], or choose a file from the tree [2]?     ");
		
		int choice = TextIO.getInt();
		if (choice == 1){
			ReadLast();
		} else {
			ReadUser();
		} // end if(choice) //
	} // end Reader() //
	
	public static void ReadUser() { 
		TextIO.putln("********************************************************");
		TextIO.putln("Would you like to begin reading a file of");
		TextIO.put("your choosing?:     ");
		boolean reading = TextIO.getBoolean();
		while (reading) {
			TextIO.putln("");
			TextIO.putln("");
			TextIO.readUserSelectedFile();
			String y = TextIO.getln();
			TextIO.writeStandardOutput();
			TextIO.putln("********************************************************");
			TextIO.putln("Here is the data from the file you've");
			TextIO.putln("requested:    ");
			TextIO.putln("");
			TextIO.putln("********************************************************");
			TextIO.putln("////////////////////////////////////////////////////////");
			TextIO.putln("");
			TextIO.putln("");
			TextIO.putln(y);
			TextIO.putln("");
			TextIO.putln("");
			TextIO.putln("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			TextIO.putln("********************************************************");
			TextIO.readStandardInput();
			TextIO.put("Read from another file?:     ");
			reading = TextIO.getBoolean();
		} // end while(reading) //
		
	} // end ReadUser() //
	
	public static void ReadLast() {
		TextIO.putln("********************************************************");
		TextIO.putln("You are now using VeryBasic File Reader v.0");
		TextIO.putln("created by TDS/2015");
		TextIO.putln("");
		TextIO.putln("");
		String file = new String();
		String contents = new String();
		TextIO.putln("********************************************************");
		TextIO.putln("Would you like to begin reading from the last");
		TextIO.put("file written to in this session?     ");
		boolean reading = TextIO.getBoolean();
		while(reading) {
			TextIO.putln("");
			TextIO.putln("");
			file = FileWrite.lastfile;
			TextIO.putln("********************************************************");
			TextIO.putln("Here are the contents of the last file");
			TextIO.putln("you worked on this session, if any.");
			TextIO.putln("");
			TextIO.readFile(file);
			contents = TextIO.getln();
			TextIO.writeStandardOutput();
			TextIO.putln("********************************************************");
			TextIO.putln("////////////////////////////////////////////////////////");
			TextIO.putln(contents);
			TextIO.putln("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			TextIO.putln("********************************************************");
			TextIO.readStandardInput();
			TextIO.putln("");
			TextIO.put("Would you like to print it again?    ");
			reading = TextIO.getBoolean();
		} // end while(reading) //
		
	} // end ReadLast() //
	
	
}

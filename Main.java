//Import File Class 
// import java.io.File;
// import java.io.IOException;

// public class Main{
//     public static void main(String[] args) throws IOException{
//         //File name specified
//         File fl = new File("lol.txt");
        
//     }
// }




//Creating an Input Stream
// INputStream obj =new FileInputSteam();


// Steams in Java 
// 1. In Java, sequence of data is known as a stream.
// 2. This concept is used to perform I/O operations on a file;
// 3. There are two types of streams.


     

// 1. Input Stream:

// The Java InputStream class is the superclass of all input streams. The input stream is used to read data from numerous input devices like the keyboard, network, etc. InputStream is an abstract class, and because of this, it is not useful by itself. However, its subclasses are used to read data.

// There are several subclasses of the InputStream class, which are as follows:

//     AudioInputStream
//     ByteArrayInputStream
//     FileInputStream
//     FilterInputStream
//     StringBufferInputStream
//     ObjectInputStream

// Creating an InputStream
// InputStream obj = new FileInputStream();


// Methods of InputStream
// S No. 	Method 	Description
// 1 	read() 	Reads one byte of data from the input stream.
// 2 	read(byte[] array)() 	Reads byte from the stream and stores that byte in the specified array.
// 3 	mark() 	It marks the position in the input stream until the data has been read.
// 4 	available() 	Returns the number of bytes available in the input stream.
// 5 	markSupported() 	It checks if the mark() method and the reset() method is supported in the stream.
// 6 	reset() 	Returns the control to the point where the mark was set inside the stream.
// 7 	skips() 	 Skips and removes a particular number of bytes from the input stream.
// 8 	close() 	Closes the input stream.
// 2. Output Stream:

// The output stream is used to write data to numerous output devices like the monitor, file, etc. OutputStream is an abstract superclass that represents an output stream. OutputStream is an abstract class and because of this, it is not useful by itself. However, its subclasses are used to write data.

// There are several subclasses of the OutputStream class which are as follows:

//     ByteArrayOutputStream
//     FileOutputStream
//     StringBufferOutputStream
//     ObjectOutputStream
//     DataOutputStream
//     PrintStream

// Creating an OutputStream

// // Creating an OutputStream
// OutputStream obj = new FileOutputStream();

// Here, an output stream is created using FileOutputStream.

//     Note: We can create an output stream from other subclasses as well as OutputStream.

// Methods of OutputStream
// S. No. 	Method 	Description
// 1. 	write() 	Writes the specified byte to the output stream.
// 2. 	write(byte[] array) 	Writes the bytes which are inside a specific array to the output stream.
// 3. 	close() 	Closes the output stream.
// 4. 	flush() 	Forces to write all the data present in an output stream to the destination.

// Based on the data type, there are two types of streams :
// 1. Byte Stream:

// This stream is used to read or write byte data. The byte stream is again subdivided into two types which are as follows:

//     Byte Input Stream: Used to read byte data from different devices.
//     Byte Output Stream: Used to write byte data to different devices.

// 2. Character Stream:

// This stream is used to read or write character data. Character stream is again subdivided into 2 types which are as follows:

//     Character Input Stream: Used to read character data from different devices.
//     Character Output Stream: Used to write character data to different devices.

// Owing to the fact that you know what a stream is, let’s polish up File Handling in Java by further understanding the various methods that are useful for performing operations on the files like creating, reading, and writing files.

// The following table depicts several File Class methods:
// Method Name 	Description 	Return Type
// canRead() 	 It tests whether the file is readable or not.  	Boolean
// canWrite() 	It tests whether the file is writable or not. 	Boolean
// createNewFile() 	It creates an empty file. 	Boolean
// delete() 	It deletes a file. 	Boolean
// exists() 	It tests whether the file exists or not. 	Boolean
// length() 	Returns the size of the file in bytes. 	Long
// getName() 	 Returns the name of the file. 	String
// list() 	Returns an array of the files in the directory. 	String[] 
// mkdir() 	 Creates a new directory. 	Boolean
// getAbsolutePath() 	Returns the absolute pathname of the file. 	String


//Create new file
/* 
import java.io.File;
import java.io.IOException;
public class Main{
    public static void main(String[] args){
        try{
            File Obj = new File("myFile.txt");
            if(Obj.createNewFile()){
                System.out.println("File created:"+Obj.getName());

            }
            else{
                System.out.println("File already exists");

            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}*/

//Read from a File: We will use the Scanner class in order to read contents from a file. Following is a demonstration of how to read contents from a file in Java :
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        File Obj = new File("myFile.txt");
        Scanner scan = new Scanner(Obj);
        while(scan.hasNextLine()){
            String data = scan.nextLine();
            System.out.println(data);
        }
        scan.close();
        
    }
}
*/

//create new file

// import java.io.File;
// import java.io.IOException;

// public class Main{
//     public static void main(String[] args) throws IOException{
//         File Obj = new File("Lol.txt");
//         if(Obj.createNewFile()){
//             System.out.println("File creates!");
//         }
//         else{
//             System.out.println("File exists!");
//         }
//     }
// }


//file reader
/* 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        File Obj = new File("Lol.txt");
        Scanner Reader = new Scanner(Obj);
        while(Reader.hasNextLine()){
            String data = Reader.nextLine();
            System.out.println(data);
        }
        Reader.close();
    }
}
*/

//Write to a file
/*
//Import the FileWriter class
import java.io.FileWriter;
// IMort the IOException class for hadling errors
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        try{
            FileWriter Writer = new FileWriter("Lol.txt");
            Writer.write("It's short, simple and cristle clear\n we are having fun");
            Writer.close();
            System.out.println("Successfully writter!");

        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Error Occured");
        }
    }
}
*/


//Delete a file


// import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File obj = new File("Lol.txt");
//         if(obj.delete()){
//             System.out.println("File is delete!"+obj.getName());
//         }
//         else{
//             System.out.println("Error!");
//         }
//     }
// }


//Write to a file
/* 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        String str;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        FileWriter writer = new FileWriter("Lol.txt");
        for(int i=0 ; i<str.length(); i++){
            writer.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        writer.close();
        scan.close();
    }
}*/


//Reading data from a file using filereader
/* 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        int ch;
        FileReader fr = null;
        try{
            fr = new FileReader("Lol.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        while((ch = fr.read()) !=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
*/



// //    Java Program to Create a temporary file
//  import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File obj = new File("practice.txt");
//         if(obj.createNewFile()){
//             System.out.println("file created!");
//         }
//         if(obj.delete()){
//             System.out.println("fiile deleted!");
//         }
        
//     }
// }

// //    Java Program to Write into a file

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         File obj = new File("roughwork.txt");
//         try {
//             Scanner scan = new Scanner(System.in);
//             System.out.print("Enter the text:    ");
//             String s = scan.nextLine(); 
//             FileWriter writer = new FileWriter(obj,true);
//             writer.write("\n");
//             writer.write(s);
//             scan.close();
//             writer.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
        
//     }
// }



// //   Java Program to Rename a file in java
// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         File file = new File("/mnt/programming731/javap/Lol.txt");
//         File rename = new File("/mnt/programming731/javap/roughwork.txt");
//         boolean flag = file.renameTo(rename);
//         if(flag == true){
//             System.out.println("File Successfully Renamed");

//         }
//         else{
//             System.out.println("Operation Failed");
//         }
//     }
// }

//    Java Program to Make a File Read-Only

// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         boolean flag;
//         try{
//             File file = new File("Lol.txt");
//             file.createNewFile();
//             flag = file.setReadOnly();
//             System.out.println("Is File is read-only?:"+flag);
//             flag = file.canWrite();
//             System.out.println("Is File is writable?:" + flag);

//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }


// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         try{
//         File file = new File("Lol.txt");
//         file.setWritable(false);
//         if(!file.canWrite()){
//             System.out.println("This File is read only.");

//         }
//         else{
//             System.out.println("This File is writable.");

//         }
//     }
//     catch(Exception e){
//         System.out.println("unable to change ");
//     }

//     }
// }



// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         File obj = new File("Lol.txt");
//         boolean flag = obj.setWritable(true);
//         System.out.println("The file "+obj.getAbsolutePath()+" writable:   "+flag);

//     }
// }


//obj.setReadonly(); //sets the file obj to readonly;
//obj.setWritable(true or false);// Writable for true and readonly for false;


// In Java, we can copy the contents of one file to another file. This can be done by the FileInputStream and FileOutputStream classes.

// FileInputStream Class

// It is a byte input stream class which helps in reading the bytes from a file. It provides different methods to read the data from a file.

//     FileInputStream fin = new FileInputStream(filename);

// This creates a FileInputStream object fin given a filename to it from where it will copy the content or do read operation.
// Methods used:

// 1. read(): This method is used to read a byte of data. It returns that byte as an integer value or return -1 if the end of file is reached.

// 2. close(): This method is used to close the FileInputStream.

// FileOutputStream Class

// It is a byte output stream class which helps in writing the bytes to a file. It provides different functions to write the data to a file.

//     FileOutputStream fout = new FileOutputStream(filename);

// This creates a FileOutputStream object fout given a filename to which it will write the read content.
// Methods used:

// 1. write(): This method is used to write a byte of data to the FileOutputStream.

// 2. close(): This method is used to close the FileInputStream.

// File Class

//     File f = new File(filename);


// This creates an File object named f, given a string object which is the file name or location path of that file which is to be accessed.

// Note: If the filename given here does not exist, then the File class will create a new file of that name.  



// import java.io.*;
// import java.util.*;
// public class Main{
//     public static void main(String[] args) throws Exception{
//         Scanner sc = new Scanner(System.in);
//         //get the source file name
//         System.out.println("Enter the source filename from where you have to read/copy:");
//         String a = sc.nextLine();
//         //source file
//         File x = new File(a);
//         //get the destination file name
//         System.out.println("Enter the destination filename where you have to write/copy:");
//         String b = sc.nextLine();
//         //destination file
//         File y = new File(b);
//         // methord call
//         copyContent(x, y);
//         sc.close();
//     }
//     public static void copyContent(File a, File b) throws Exception{
//         FileInputStream in = new FileInputStream(a);
//         FileOutputStream out = new FileOutputStream(b);
//         try{
//             int n;
//             //read() function to read the 
//             //byte of data
//             while ((n = in.read()) != -1){
//                 //write() function to write
//                 //the byte of data
//                 out.write(n);
//             }
//         }
//         finally{
//             if (in != null){
//                 //close() function to close the 
//                 // stream
//                 in.close();
//             }
//             if (out != null){
//                 out.close();
//             }
//         }
//         System.out.println("File Copied");
//     }
// }





// import java.io.*;
// import java.util.*;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the name of File to check:");
//         String a = scan.nextLine();
//         System.out.println("Enter the character:");
//         char c = scan.next().charAt(0);
//         compare(a, c);
//         scan.close();

//     }
//     public static void compare(String a,char c)throws IOException{
//         FileInputStream in = new FileInputStream(a);
//         int n,m=0,o=0;
//         ArrayList<Integer> posi = new ArrayList<Integer>();
//         while((n = in.read()) != -1){
//             o++;
//             if((char)n == c){
//                 m++;
//                 posi.add(o);
//             }
//         }
//         System.out.println("the characher "+c+" ouccours "+m+" times at \n"+posi);
//         in.close();
//     }
// }

// Java Program to print all the  Strings that match a given  Pattern from a File 

// // Importing Classes/Files 
// import java.io.*; 

// // Importing Special Class 
// // for matching patterns 
// import java.util.regex.*; 

// public class Main { 

// 	// Main driver method 
// 	public static void main(String[] args) 
// 		throws IOException 
// 	{ 

// 		// Try block for detecting exception 
// 		try { 

// 			// Creating a file 
// 			FileWriter writer = new FileWriter("test.txt"); 

// 			// Writing in file 
// 			writer.write("Writing in the test file!\nLol lol hu ha hu ha hi \n lol and the stadium here in licknoe buzzing india right on top hi "); 
// 			writer.close(); 
// 			// Success Message 
// 			System.out.println( 
// 				"Successfully wrote to the file.\n"); 
// 		} 

// 		// Catch block to handle exception 
// 		catch (IOException e) { 

// 			// Catching any error 
// 			System.out.println("An error occurred."); 
// 			e.printStackTrace(); 
// 		} 

// 		// FileReader 
// 		BufferedReader read = new BufferedReader( 
// 			new FileReader("test.txt")); 

// 		// The regex pattern 
// 		Pattern pattern = Pattern.compile("lol"); 

// 		System.out.println("Matched Content:"); 
// 		// For each line of input, try matching the pattern 

// 		String line; 
// 		while ((line = read.readLine()) != null) { 

// 			// For each match in the 
// 			// line, extract and print it 
// 			Matcher match = pattern.matcher(line); 

// 			while (match.find()) { 

// 				// One method: 
// 				// System.out.println(match.group(0)); 

// 				// Another method: 
// 				// Get the starting position of the text 
// 				int start = match.start(0); 

// 				// Get ending position 
// 				int end = match.end(0); 

// 				// Print whatever matched. 
// 				System.out.println( 
// 					line.substring(start, end)); 
// 			} 
// 		} 
//         read.close();
// 	} 
// }





  
    // Java Program to Append a String in an Existing File
    // Java Program to Read content from one file and writing it into another file
    // Java Program to Read and printing all files from a zip file



//     // Java Program to Create a new file
// import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         Scanner scan = new Scanner(System.in);
//         String nameFile = scan.nextLine();
//         String extention = ".txt";
//         File obj = new File(nameFile+extention);
//         if(obj.createNewFile()){
//             System.out.println("File created!");
//         }
//         else if(obj.exists()){
//             System.out.println("file exits!");
//         }
//         else{
//             System.out.println("error ocurred!");
//         }
//         scan.close();
//     }
// }




    // Java Program to Create a temporary file

// import java.io.File;
// import java.io.IOException;

// public class Main{
//     public static void main(String[] args) throws IOException{
//         String prefix = "tempFile";
//         String suffix = ".txt";
//         File directoryPath = new File("/mnt/programming731/javapractice/");
//         File tempFile = File.createTempFile(prefix,suffix,directoryPath);
//         System.out.println("file created!");
//         tempFile.delete();
//         }
// }



// import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File file = File.createTempFile("Temp",".txt",new File("/mnt/programming731/javapractice/"));
//         System.out.println(file.getAbsolutePath());
//         file.deleteOnExit();

//     }
// }



//     // Java Program to Write into a file
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// public class Main {

//     public static void main(String[] args) throws IOException{
//         File obj = new File("mango.txt");
//         FileWriter writer = new FileWriter(obj,true);
//         writer.write("hi there, how are you ?");
//         writer.close();
//     }
// }




//     // Java Program to Rename a file in java
// import java.io.File;
// public class Main {

//     public static void main(String[] args){
//         File obj = new File("mango.txt");
//         File obj2 = new File("Apple.txt");
//         if(obj.renameTo(obj2)){
//             System.out.println("the file was renamed!");
//         }
//         else{
//             System.out.println("Error!");
//         }
//     }
// }




//     // Java Program to Make a File Read-Only
// import java.io.File;
// public class Main {

//     public static void main(String[] args){
//         File obj = new File("Apple.txt");
//         if(obj.setWritable(false)){
//             System.out.println("Set to readable only!");
//         }
//         else{
//             System.out.println("ERROR!");
//         }
//     }
// }






    // Java Program to Compare Paths of Two files
// import java.io.File;
// public class Main {

//     public static void main(String[] args){
//         File obj1 = new File("Apple.txt");
//         File obj2 = new File("rough.txt");
//         compare(obj1, obj2);

//     }
//     public static void compare(File obj1, File obj2){
//         String ad1 = obj1.getAbsolutePath();
//         String ad2 = obj2.getAbsolutePath();
//         System.out.println(ad2);
//         System.out.println(ad1);
//     }
// }



// Java Program to Copy one file into another file

// import java.io.*;
// import java.util.*;
// public class Main {

//     public static void main(String[] args)throws IOException{
//         File obj1 = new File("Lol.txt");
//         File obj2 = new File("rough.txt");
//         copy(obj2, obj1);

//     }
//     public static void copy(File obj1,File obj2) throws IOException{
//         FileInputStream in = new FileInputStream(obj1);
//         FileOutputStream out = new FileOutputStream(obj2);
//         try{
//             int n;
//             while((n = in.read()) != -1){
//                 out.write((char)n);

//             }
//         }
//         finally{
//             if(in != null){
//                 in.close();
//             }
//             if(out != null){
//                 out.close();
//             }
//         }
//         System.out.println("File Copied!");
//     }
// }

  // Java Program to Print all the Pattern that Matches Given Pattern From a File

  import java.io.*;
  import java.util.*;
  public class Main{
    public static void main(String[] args){
        
    }
  }




















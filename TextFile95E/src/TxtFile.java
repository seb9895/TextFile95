import java.io.IOException;
import java.io.RandomAccessFile;

public class TxtFile {
 public static void main(String[] args) {
	String TextFile = "this is a text file";
	byte[] buff = TextFile.getBytes();
	try {
		RandomAccessFile raf = new RandomAccessFile("TextFile.txt", "rw");
		raf.write(buff);
	}catch(IOException ex){
		ex.printStackTrace();
	}
	}
	}
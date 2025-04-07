package io_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Use DataInputStream and DataOutputStream for reading/writing Java primitive data types.
public class DataOutputStreamEx {
	
	public static void main(String[] args) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
			dos.writeInt(100);
			dos.writeDouble(45.67);
			dos.writeUTF("Hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println(i + ", " + d + ", " + s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

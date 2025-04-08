package io_stream;

import java.io.*;

// Buffered Streams improve performance by reducing direct I/O operations on disk.
// Use BufferedInputStream/OutputStream when reading/writing large files.
public class BufferedStreamsEx {

    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/java_programs/input.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir") + "/java_programs/output.txt"))) {
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            System.out.println("done with successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

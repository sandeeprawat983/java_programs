package strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

// Use Charset for Encoding and Decoding Strings
/*
 * When working with strings that need to be encoded (e.g., for network transmission) 
 * or decoded (e.g., from external sources), always specify the character set explicitly. 
 * Java’s java.nio.charset.Charset ensures predictable behavior across platforms.
 */
public class CharsetExample {
	
	public static void main(String[] args) {
		String original = "Hello, Java!";
		
		// encode the string into bytes
		byte[] encodedBytes = original.getBytes(StandardCharsets.UTF_8);
		System.out.println("Encoded Bytes: " + Arrays.toString(encodedBytes));
		
		// decode the bytes back into a string
		String decoded = new String(encodedBytes, StandardCharsets.UTF_8);
		System.out.println("Decoded String: " + decoded);
	}

}

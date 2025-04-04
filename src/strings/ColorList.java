package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorList {

	String getAllColors1(String filename) throws FileNotFoundException, IOException {
		String retVal = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filename)));
		for (String line; (line = br.readLine()) != null;) {
			retVal += line + "\n";
		}
		return retVal;
	}

	String getAllColors2(String filename) throws FileNotFoundException, IOException {
		StringBuilder retVal = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filename)));
		for (String line; (line = br.readLine()) != null;) {
			retVal.append(line);
			retVal.append("\n");
		}
		return retVal.toString();
	}

}

package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ColorList {

	String getAllColors1(String filename) throws IOException {
		String retVal = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(this.getClass().getResourceAsStream(filename))));
		for (String line; (line = br.readLine()) != null;) {
			retVal += line + "\n";
		}
		return retVal;
	}

	String getAllColors2(String filename) throws IOException {
		StringBuilder retVal = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(this.getClass().getResourceAsStream(filename))));
		for (String line; (line = br.readLine()) != null;) {
			retVal.append(line);
			retVal.append("\n");
		}
		return retVal.toString();
	}

}

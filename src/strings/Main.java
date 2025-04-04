package strings;

import java.io.IOException;

public class Main {
	
  public static void main(String[] args) throws IOException {
    long startTime = System.currentTimeMillis();
    ColorList colorList = new ColorList();
    String allColorNames = colorList.getAllColors2("colorNames.dat");
    System.out.print(allColorNames);
    long endTime = System.currentTimeMillis();
    System.out.println("Took "+(endTime - startTime) + " ms");
  }
  
}
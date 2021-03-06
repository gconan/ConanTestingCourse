package pset6;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestGenerator {
	
	/**change this location, if you have to manually, and it should work properly*/
	public String locationOfWebpage = "file:///Users/conangammel/Desktop/min.html";
	public static int testnumber;
	public String[] xyz = {"-1", "0", "1", "four"};
    public String[] button = {"\t\twe.click();\n", "\n\t\t//dontClick()"};
	
    public static void main(String[] a) {
    	testnumber = 0;
        String suite = new MinWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }
    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
}
    String packageDecl() {
        return "package pset6;\n";
}
    String imports() {
        return "import static org.junit.Assert.*;\n\n"
                + "import org.junit.Test;\n\n"
        		+ "import org.junit.BeforeClass;\n"
                + "import org.junit.Before;\n"
        		+ "import org.junit.AfterClass;\n"
                + "import org.openqa.selenium.By;\n"
                + "import org.openqa.selenium.WebDriver;\n"
                + "import org.openqa.selenium.WebElement;\n"
                + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
}
    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("/**\n* This test suite is designed for the min.html\n* 27 of my tests fail when used as regression tests for minandmax.html since those 27\n* tests actually use valid numbers and the \"max\" radio\n* button is checked by default; and thus these tests are faulty and need updating\n*/\npublic class MinWebTestSuite {\n\n\tpublic static WebDriver wd;\n\tpublic static String webpage = \""+locationOfWebpage+"\";\n");
        sb.append(makeBeforeClass());
        sb.append(makeBefore());
        sb.append(makeAfterClass());
        
        StringBuilder test = new StringBuilder();
        
        for(int i=0; i<xyz.length; i++){
        	
        	for(int j=0; j<xyz.length; j++){
        		
        		for(int k=0; k<xyz.length; k++){
        			
        			for(int m=0; m<button.length; m++){
        				test.append("\t\tWebElement we = wd.findElement(By.id(\"x\"));\n");
        				test.append("\t\twe.sendKeys(\""+xyz[i]+"\");\n\n");
        				
        				test.append("\t\twe = wd.findElement(By.id(\"y\"));\n");
        				test.append("\t\twe.sendKeys(\""+xyz[j]+"\");\n\n");
        				
        				test.append("\t\twe = wd.findElement(By.id(\"z\"));\n");
        				test.append("\t\twe.sendKeys(\""+xyz[k]+"\");\n\n");
        				
        				test.append("\t\twe = wd.findElement(By.id(\"computeButton\"));\n");
        				test.append(button[m]+"\n");
        				
        				test.append(assertStatement(i, j, k, m));
        				
        				sb.append(makeTest(test.toString()));
        				test = new StringBuilder();
        				
        			}
        			
        		}
        	}
        	
        }
        
        
        sb.append("}\n");
        return sb.toString();
    }
    
    private String assertStatement(int i, int j, int k, int m) {
    	//Indices into the xyz array
    	int neg = 0; //-1
        int zero = 1; //0
        int pos = 2; //1
        int invalid = 3;
        
        if(m==1){
        	return "\t\tassertTrue(wd.findElement(By.id(\"result\")).getText().equals(\"\"));\n"; //button not clicked
        }//after this "if" we know that m==0 so it will be clicked
        
        
        if(i==invalid || j==invalid || k==invalid){//one of the three strings is "four"
        	return "\t\tassertTrue(wd.findElement(By.id(\"result\")).getText().equals(\"Please enter integer values only!\"));\n";
        }//after this "if" we know that all values are valid and that the button is clicked
        
        return "\t\t//this test will fail when run on updated calculations of min/max\n\t\tassertTrue(wd.findElement(By.id(\"result\")).getText().equals(\"min("+xyz[i]+", "+xyz[j]+", "+xyz[k]+") = "+xyz[Math.min(i,Math.min( j,k))]+"\"));\n";
        
	}
	public String makeTest(String test){
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("\t@Test\n");
		sb.append("\tpublic void test"+testnumber+"(){\n");
		sb.append(test);
		sb.append("\t}\n");
		testnumber++;
		return sb.toString();
    }
    
	public String makeBefore(){
    	return "\n\t/**\n\t* Refresh the browser before each test\n\t*/\n\t@Before\n\tpublic void refresh(){\n\t\twd.navigate().refresh();\n\t}\n";
    }
    
    public String makeBeforeClass(){
    	return "\n\t/**\n\t* Init driver before the entire test suite\n\t*/\n\t@BeforeClass\n\tpublic static void beforeClass(){\n\t\twd = new FirefoxDriver();\n\t\twd.get(webpage);\n\t}\n";
    }
    
    public String makeAfterClass(){
    	return "\n\t/**\n\t* Quit FireFox after the tests are done running\n\t*/\n\t@AfterClass\n\tpublic static void quit(){\n\t\twd.quit();\n\t}\n\n";
    }
    // implement any helper methods that you need in this class
}
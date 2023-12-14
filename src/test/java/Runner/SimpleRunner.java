package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Simple.feature"},
		glue = {"Steps"}
		
		
		)

public class SimpleRunner {
	
	public static void main(String[] args) {
        String str = "madam";
        
        String rev ="";
        
        int len = str.length();
        for(int i=len-1; i<=0; i--){
            rev = rev + str.charAt(i);
        }
      
      if(str.equals(rev)){
          System.out.println("its a palendrom string");
      }
      else{
          System.out.println("not a palendrom");
      }
      
    }

}

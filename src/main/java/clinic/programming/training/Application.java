package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
	public int countWords(String string){
		String[] seperatedWords=StringUtils.split(string,' ');
		return (seperatedWords==null)?0:seperatedWords.length;
	}
    public void greet(){
		List<String> greetings=new ArrayList<>();
		greetings.add("Hello");
		
		for(String greeting:greetings){
			System.out.println("Greeting : "+greeting);
		}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		String s="I have four words";
		System.out.println("Word count : "+app.countWords(s));
    }
}

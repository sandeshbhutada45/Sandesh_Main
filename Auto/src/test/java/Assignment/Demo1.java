package Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.netty.util.internal.SystemPropertyUtil;

public class Demo1 {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDir);
        String timestamp = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(new Date());
      
        
        
//        07/20/2023 10:19:27
        System.out.println(timestamp);
			
		
		

		
	}

}

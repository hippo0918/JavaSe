import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;
public class TestProperties {
	public static void main(String[] args) {
	
		/**
			写properties文件
		**/
		Properties p = new Properties();
		p.setProperty("name","lizebin");
		p.setProperty("age","22");
		p.setProperty("gender","male");
		
		try {
			p.store(new FileWriter("lizebin.properties"), "Create Date :" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
		} catch(IOException e) {
			e.printStackTrace();
		}
		String relativelyPath = System.getProperty("user.dir"); 
		System.out.println("relativelyPath = " + relativelyPath);
		/**
			读Properties文件
		**/
		Properties loadProperties = new Properties();
		try {
			loadProperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("lizebin.properties"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(loadProperties.getProperty("name","lzb"));
		
		
	}
}
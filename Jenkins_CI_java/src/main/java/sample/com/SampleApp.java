package sample.com;

import java.util.ArrayList;
import java.util.List;

public class SampleApp {

	public List<String> list;
	
	public SampleApp() {
	List<String>	list=new ArrayList<>();
		list.add("Java");
		list.add("JavaScript");
		list.add("HTML");
		list.add("CSS");
		this.list = list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
		
		SampleApp sampleApp=new SampleApp();
		
		System.out.println("Element on no 3 is : "+sampleApp.list.get(3));
		
	}

}

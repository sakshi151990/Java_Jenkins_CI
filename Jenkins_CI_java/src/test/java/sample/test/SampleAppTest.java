package sample.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import sample.com.SampleApp;

public class SampleAppTest {
	public SampleApp sampleApp;
	
	@Before
	public void init()
	{
		
		 sampleApp=new SampleApp();
	}
	
	@Test
	public void sampleTest()
	{
		Assert.assertEquals("CSS", sampleApp.list.get(3));
	}
	
}

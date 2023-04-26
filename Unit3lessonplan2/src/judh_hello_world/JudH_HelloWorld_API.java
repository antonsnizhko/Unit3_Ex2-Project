package judh_hello_world;

public class JudH_HelloWorld_API {
	
	public static JudH_HelloWorld helloWorld;
	
	public String createHello(String fName, String mName, String lName)
	{
		String rValue = "";
		try
		{
			JudH_HelloWorld helloWorld = new JudH_HelloWorld(fName, mName, lName);
			rValue = helloWorld.toString();
		}
		catch(Exception err)
		{
			rValue = "Error: " + err.toString();
		}
		return rValue;
	}
	
	public String createHelloWorldObject()
	{
		String rValue = "";
		try
		{
			helloWorld = new JudH_HelloWorld();
			rValue =  "JudH_HelloWorld object created successfully";
		}
		catch(Exception err)
		{
			rValue = "Error: " + err.toString();
		}
		return rValue;
	}
}
package judh_hello_world;

public class JudH_HelloWorld {
	

		
		private String fName;
		private String mName;
		private String lName;

		public JudH_HelloWorld()
		{
			setfName("Huda");
			setmName("Sami");
			setlName("Judeh");
		}
		
		public JudH_HelloWorld(String fName, String mName, String lName)
		{
			setfName(fName);
			setmName(mName);
			setlName(lName);
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getmName() {
			return mName;
		}

		public void setmName(String mName) {
			this.mName = mName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}
		
		public String toString()
		{
			String rValue = getfName() + " " + getmName() + " " + getlName();
			return rValue;
		}
	}



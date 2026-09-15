
public class ConsoleInput {

	public static int getInt() {
		String objString=getString();
		int data=Integer.parseInt(objString);
		return data;
	}
	public static float getFloat() {
		String objString=getString();
		float data1=Float.parseFloat(objString);
		return data1;
	}
	public static String getString() {
		try {
			byte arrInput[]=new byte[100];
			int length=System.in.read(arrInput);
			byte[] arrFinal=new byte[length-2];
			System.arraycopy(arrInput, 0, arrFinal,0 , length-2);
			String objString=new String(arrFinal);
			return objString;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

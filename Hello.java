
class Hello
{
	public static void main(String args[]) 
	{
		// Type casting
		// Example  1 
		// Implict convirsion & Explicite conversion
		int  a = 257;
		byte b = 127;

		b = (byte) a;        
		System.out.println(b);
		
		int d = 12;
		byte c = (byte)d;
		System.out.println(c); 

		float f = 5.6f;
		int i = (int) f;		// Convirsion
		System.out.println(i);

		byte e = 10; 
		byte g = 20;
		int x = e + g;        // Type promotion
		System.out.println(x);

	}
}
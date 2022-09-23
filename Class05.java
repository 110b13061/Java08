package java08;
class CBox{
	int length;
	int width;
	int height;
}
public class Class05 {
	public static void main(String[] args) {
		int length=1;
		int width=1;
		int height=1;
		int a = length*width*height;
		int b = (length*width)+(width*height)+(length*height)*2;
		int c = length+width+height;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

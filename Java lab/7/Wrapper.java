
public class Wrapper {
	int i=5;
	float f=2.3f;
	char c='A';
	boolean b=true;
	//Converting primitive data type into object.
	Integer i1 = new Integer(i);
	Float f1= new Float(f);
	Character c1 = new Character(c);
	Boolean b1 = new Boolean(b);
	//getting primitive data type from object.
	System.out.println("i =" + i1.intValue());
	System.out.println("f =" + f1.floatValue());
	System.out.println("c =" + c1.charValue());
	System.out.println("b =" + b1.booleanValue());
	//Parsing from string
	int i=Integer.parseInt("2");
	float f=2.3f;
	char c='A';
	boolean b=true;
}


}

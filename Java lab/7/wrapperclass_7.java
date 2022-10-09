public class wrapperclass {
    public static void main(String[] args)
    {
        int i=5;
        float f=2.3f;
        char c='A';
        boolean b=true;
        //Converting primitive data type into object.
        int i1 = i;
        float f1= f;
        char c1 = c;
        boolean b1 = b;
        //getting primitive data type from object.
        System.out.println("i =" + i1);
        System.out.println("f =" + f1);
        System.out.println("c =" + c1);
        System.out.println("b =" + b1);
        //Parsing from string
        i=Integer.parseInt("2");
        f=2.3f;
        c = 'A';
        b=true;
    }

}

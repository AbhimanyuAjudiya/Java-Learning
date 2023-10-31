class MyObject {
    int value;

    MyObject(int value) {
        this.value = value;
    }
}

public class PassByReferenceExample {
    public static void main(String[] args) {
        MyObject myObject = new MyObject(10);

        System.out.println("Before calling modifyObject: " + myObject.value);
        modifyObject(myObject);
        System.out.println("After calling modifyObject: " + myObject.value);
    }

    public static void modifyObject(MyObject obj) {
        obj.value = 20;
        System.out.println("Inside modifyObject: " + obj.value);
    }
}

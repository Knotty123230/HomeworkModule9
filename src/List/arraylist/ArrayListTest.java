package List.arraylist;

public class ArrayListTest {
    public static void main(String[] args) {
        arrayListTest();
    }

    public static void arrayListTest() {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("1111");
        myArrayList.add('a');
        myArrayList.add("aldlaldaldla");
        myArrayList.add(1);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));
    }
}

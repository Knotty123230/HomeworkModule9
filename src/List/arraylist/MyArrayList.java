package List.arraylist;

import java.util.Arrays;

public class MyArrayList {

    private Object[] myArr = new Object[0];
    private int size = 0;

    public void add(Object ob) {
        myArr = Arrays.copyOf(myArr, myArr.length + 1);
        myArr[size] = ob;
        size++;
    }

    public Object[] remove(int indexToRemove) {
        int index = 0;
        Object[] myArrNew = new Object[myArr.length - 1];
        for (int j = 0; j < myArr.length; j++) {
            if (j + 1 == indexToRemove) {
                continue;
            } else if (j + 1 != indexToRemove) {
                myArrNew[index] = myArr[j];
                index++;
            }

        }
        return myArr = Arrays.copyOf(myArrNew, myArrNew.length);
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > myArr.length) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException index " + index);
        }
        return myArr[index];
    }

    public Object[] clear() {
        size = 0;
        return myArr = new Object[]{};

    }

    public int size() {
        return myArr.length;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArr=" + Arrays.toString(myArr) +
                '}';
    }
}



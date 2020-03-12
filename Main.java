//Elena Voinu
public class Main {
    public static void main(String[] args){
    DynamicArray array = new DynamicArray(5);
        System.out.println("Initial array capacity is "+array.getInitialCapacity());
        System.out.println("Elements in the array: "+array.getSize());

        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        array.addElement(6);
        array.displayArray();
        System.out.println("Elements in the array "+array.getSize());

    }
}

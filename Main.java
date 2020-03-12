//Elena Voinu
public class Main {
    public static void main(String[] args){
        
        //create object of the DynamicArray class
        DynamicArray array = new DynamicArray(5);
        
        //displaying the initial capacity of the array
        System.out.println("Initial array capacity is "+array.getInitialCapacity());
        
         //displaying how many elements are in the array
        System.out.println("Elements in the array: "+array.getSize());

        //adding elements in the array, one at a time
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        array.addElement(6);
        
        //display the array with all the added elemnts
        array.displayArray();
        
         //displaying how many elements are in the array
        System.out.println("Elements in the array "+array.getSize());

    }
}

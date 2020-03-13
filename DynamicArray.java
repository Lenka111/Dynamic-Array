//Elena Voinu
import java.util.Arrays;

public class DynamicArray
{
//instance fields
private  int[] array;
    
// size = how many elements are in the array
private  int size;
    
//how many elements the array can hold(length)
private  int initialCapacity;

//constructor with initial capacity as a parameter
public DynamicArray(int initialCapacity){
    this.initialCapacity=initialCapacity;
    
    //setting the size of the array
    this.array=new int[initialCapacity];
}

    //get the size of the array
    public int getSize() {
        return size;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    private boolean isEmpty(){
        return size==0;
    }

   private void resize(){
        int []array1 = new int[initialCapacity*2];
        //copy elements from first array to the second array
        for (int i = 0; i < initialCapacity; i++) {
            array1[i] = array[i];
        }
        array=array1;
        initialCapacity=initialCapacity*2;


    }
    public void addElement(int value){
    //resize if the size equals the capacity(array is full)
    if(size==initialCapacity){
        resize();
    }
    //value will be stored at the next available index
    array[size] = value;
    size++;
        System.out.println("New element added: " + value);

    }
    //insert a value at a specified index
     public void insertAtIndex(int index, int value){
    //check if there's room for insertion
    if(size==initialCapacity){
        resize();
    }
    System.out.println("Inserted value "+ value + " at index "+ index);
    //array at specified index = the value entered
    array[index] = value;
         
    //increase size 
    size++;

    }

    public void displayArray(){

        for (int j =0; j < size;j++) {
           // System.out.println(array[j]);
        }
        System.out.print("Displaying the array...");
        System.out.println(Arrays.toString(array));


    }

}

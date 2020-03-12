//Elena Voinu
import java.util.Arrays;

public class DynamicArray
{
private  int[] array;
private  int size;
private  int initialCapacity;

//constructor
public DynamicArray(int initialCapacity){
    this.initialCapacity=initialCapacity;
    this.array=new int[initialCapacity];
}


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
    if(size==initialCapacity){
        resize();
    }
    array[size] = value;
    size++;
        System.out.println("New element added: " + value);

    }

    public void displayArray(){

        for (int j =0; j < size;j++) {
           // System.out.println(array[j]);
        }
        System.out.print("Displaying the array...");
        System.out.println(Arrays.toString(array));


    }

}

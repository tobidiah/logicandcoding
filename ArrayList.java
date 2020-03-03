/**
 * The class ArrayList
 *
 * @author  Jake Tawney
 * @version 3/10/2019
 */

public class ArrayList{
    private int[] data;
    private int last; //index of the last element
    
    //set initial capacity to 10
    public ArrayList(){
        data = new int[10];
        last = -1;  //fix
    }

    //returns the number of elements in the list (not the capacity)
    public int size(){
        return last + 1;
    }



    //Precondition: 0 <= index <= last
    //return the element at that index
    public int get(int index){
        return data[index];
    }



    //Precondition:  0 <= index <= last
    //sets the value at index to the newValue
    public void set(int index, int newValue){
        data[index] = newValue;
        
    }



    //Precondition:  0 <= index <= last
    //value at index is removed from the list – all elements shift down
    //returns removed value
    public int remove(int index){
        int temp = data[index];
        for(int x = index; x<last; x++){
            data[x] = data[x+1];
        }
        last = last - 1;
        return temp;
    }

    //Precondition:  0 <= index <= last+1
    //Inserts newValue at index.  Everything from index on gets shifted up
    public void add(int index, int newValue){
        if (last <= data.length - 1){
            resize();
        }
       
        for(int x = last +1; x<index; x--){
            data[x] = data[x-1];
        }
        data[index] = newValue;
        last = last + 1;
    }

    
    //adds newValue to the end of the list
    public void add(int newValue){
        add(last+1, newValue);
        
    }


    //private method means "not accessible outside the class"
    //This is intentional.
    //This method should double the capacity
    private void resize(){
        int[] temp = new int[2*data.length];
        for(int x = 0; x < data.length; x++){
            temp[x] = data[x];
        }
        data = temp;
     }


    //returns, for example, "[3, 6, 7, 9]"
    //This will be helpful for your debugging
    public String toString(){
        String perry = java.util.Arrays.toString(data);
        return perry;
    }


    //returns true if two lists have exactly the same elements
    //in exactly the same order
    public boolean equals(ArrayList otherList){
        if(otherList.size() != this.size()){
            return false;
        }
        for(int i = 0; i < this.size(); i++){
            if( this.get(i) != otherList.get(i)){
                return false;
            }
        }
        return true;
    }
}
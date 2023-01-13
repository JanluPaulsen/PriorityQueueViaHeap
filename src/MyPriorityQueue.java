public class MyPriorityQueue {
    private final int[] data;//heap data
    private int n;//current size of the heap

    //default constructor
    public MyPriorityQueue(){
        data = new int[100];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void add(int value){
        data[n] = value;
        n++;
        shiftUp(n-1);
    }

    public void shiftUp(int position){
        int i = position;//child
        int j = i/2;//parent
        while (j >= 0 && i != j){
            if (data[i] > data[j]){ //child greater than the parent
                swap(i, j); //swap parent and child
            }
            i = j;//make the parent the child
            i = i/2;//find the next parent up the hierarchy
        }
    }

    public void swap(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public int remove(){
        int returnValue = data[0];
        if (n == 1){
            n--;
        }else {
            data[0] = data[n-1];
            n--;
            shiftDown(0);
        }
        return returnValue;
    }

    public void shiftDown(int position){
        int i = position;//parent
        int j = 2 * i + 1;//child (calculate left)
        while (j < n){
            if (j + 1 < n){
                j++;
            }
            if (data[i] >= data[j]){ //if true we have a heap
                return;
            }
            swap(i, j);
            i = j;
            j = 2 * i + 1;
        }
    }

    public void display(){
        for (int i = 0; i < n; i++){
            System.out.println(data[i] + " ");
        }
    }
}

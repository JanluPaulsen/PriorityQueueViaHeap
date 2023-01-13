public class PriorityQueueViaHeap {
    public static void main(String[] args) {
        MyPriorityQueue q = new MyPriorityQueue();

        int[] someRandomData = {6, 4, 5, 2, 7, 1, 3, 8, 0, 9};

        q.display();

        for (int i = 0; i < someRandomData.length; i++){
            q.add(someRandomData[i]);
        }

        q.display();

        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}

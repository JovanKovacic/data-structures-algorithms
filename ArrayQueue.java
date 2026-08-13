public class ArrayQueue {

    private String[] queue;
    private int size;

    public ArrayQueue() {
        queue = new String[10];
        size = 0;
    }

    public String add(String s) {

        if(size == queue.length) {
            String[] newQueue = new String[size * 2];

            for(int i = 0; i < queue.length; i++) {
                newQueue[i] = queue[i];
            }

            queue = newQueue;
        }

        queue[size] = s;
        size++;

        return s;

    }

    public String remove() {

        String s = queue[0];

        for(int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        queue[size - 1] = null;
        size --;

        return s;

    }

    public String peek() {
        return queue[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

public class ArrayStack {

    private String[] stack;
    private int size;

    public ArrayStack() {
        stack = new String[100];
        size = 0;
    }

    public String peek() {
        return stack[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String push(String s) {

        if(size == stack.length) {
            String[] newStack = new String[size * 2];
            for(int i = 0; i<stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }

        stack[size] = s;
        size++;

        return s;

    }

    public String pop() {
        String retStr = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return retStr;
    }

    public int search(String s) {
        for(int i = size - 1; i >= 0; i--) {
            if(stack[i].equals(s)) return size - i;
        }

        return -1;
    }

    public int size() {
        return size;
    }

}

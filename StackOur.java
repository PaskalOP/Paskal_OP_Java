public class StackOur {

    int[] array;
    int top;

    public StackOur(int size) {
        array = new int[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(int num) {
        top++;
        array[top] = num;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой!");
        }
        return array[top];
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой!");
        }
        return array[top--];
    }

    public static void main(String[] args) {
        StackOur st = new StackOur(100);
        st.push(1);
        st.push(2);
        st.push(45);

        System.out.println("Size:" + st.size());

        System.out.println("Pop: " + st.pop());

        System.out.println("Size:" + st.size());

    }
}

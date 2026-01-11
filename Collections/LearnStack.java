import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(57);
        st.push(45);
        st.push(69);
        st.push(72);

        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.peek());
    

    }
    
    
}

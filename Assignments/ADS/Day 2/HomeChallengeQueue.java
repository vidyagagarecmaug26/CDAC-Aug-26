import java.util.Stack;

public class HomeChallengeQueue<T> {
	
	private Stack<T> A= new Stack<>();
	private Stack<T> B= new Stack<>();
	
	public void enqueue(T x) {
		A.push(x);
	}
	
	public T dequeue() {
		if(A.isEmpty()&& B.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		if(B.isEmpty()) {
			while(!A.isEmpty()) {
				B.push(A.pop());
			}
		}
		return B.pop();
	}
	
	public T peek() {
		if(A.isEmpty()&&B.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		if(B.isEmpty()) {
			while(!A.isEmpty()) {
				B.push(A.pop());
			}
		}
		return B.peek();
	}
	public boolean isEmpty() {
        return A.isEmpty() && B.isEmpty();
    }

    public int size() {
        return A.size() + B.size();
    }

    public static void main(String[] args) {

    	HomeChallengeQueue<Integer> q =
                new HomeChallengeQueue<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeue = " + q.dequeue());
        System.out.println("Dequeue = " + q.dequeue());

        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Peek = " + q.peek());
        System.out.println("Dequeue = " + q.dequeue());
        System.out.println("Dequeue = " + q.dequeue());
        System.out.println("Dequeue = " + q.dequeue());

        System.out.println("Queue empty = " + q.isEmpty());
    }
}

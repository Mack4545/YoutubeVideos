public class SortStack { 

  private static void sort(MyStack<Integer> a) throws Exception {
      MyStack<Integer> b = new MyStack<>();
      while(!a.isEmpty()) {
        int tmp = a.pop();
        while(!b.isEmpty() && b.peek() < tmp) {
          a.push(b.pop());
        }
        b.push(tmp);
      }
      while(!b.isEmpty()) {
        a.push(b.pop());
      }
   }
  
  public static void main(String[] args) throws Exception {
		
      MyStack<Integer> r = new MyStack<>();
      r.push(11);
      r.push(79);
      r.push(2);
      r.push(1);
      r.push(18);
      r.push(4);
      r.push(12);
      sort(r);
      System.out.println("Done Sorting");
      while(!r.isEmpty()) {
        System.out.println(r.pop());
      }
    
  }
   
  public class MyStack<T> {
	
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
		
	}
	
	private StackNode<T> top;
	
	public T pop() throws Exception {
		if(top == null) throw new Exception("Empty Stack");
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek() throws Exception {
		if(top == null) throw new Exception("Empty Stack");
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
   }

}

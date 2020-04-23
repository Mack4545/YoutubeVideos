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

}

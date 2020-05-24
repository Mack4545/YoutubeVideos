public class StackMin {
  public static void main(String[] args) throws Exception {
      StackWithMin2 stack = new StackWithMin2();
      stack.push(1);
      stack.push(4);
      stack.push(5);
      stack.push(-1);
      stack.push(9);
      System.out.println(stack.min());
      stack.pop();
      stack.pop();
      System.out.println(stack.min());
  }

  public class StackWithMin2 extends MyStack<Integer>{
    MyStack<Integer> s2;
    public StackWithMin2() {
      s2 = new MyStack<Integer>();
    }

    public void push(int value) throws Exception {
      if(value <= min()) {
        s2.push(value);
      }
      super.push(value);
    }

    public Integer pop() throws Exception {
      int value = super.pop();
      if(value == min()) {
        s2.pop();
      }
      return value;
    }

    public int min() throws Exception {
      if(s2.isEmpty()) {
        return Integer.MAX_VALUE;
      } else {
        return s2.peek();
      }
    }

  }
}

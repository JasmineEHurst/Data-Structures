
public class testStack {

	public static void main(String[] args) throws Exception {
		StackLinkedList stack = new StackLinkedList();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		System.out.println();
		System.out.println(stack.pop());
		System.out.println();
		System.out.println(stack.peek());
		System.out.println();
		System.out.println(stack.getSize());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.println();
		System.out.println(stack.isEmpty());
		
	}

}

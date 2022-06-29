package Collection.list;

import java.util.Stack;

public class L2_Stack {

	public static void main(String[] args) {
		
		Stack<String > animal= new Stack<>();
        animal.push("Dog");
        animal.push("cat");
        animal.push("lion");
        animal.push("horse");
        animal.push("tiger");
        
        System.out.println(animal);
        
        System.out.println(animal.peek()); //show the top element
        
        animal.pop();  //top element exit(tiger)
        System.out.println(animal.peek());
        
        System.out.println(animal);
	}

}

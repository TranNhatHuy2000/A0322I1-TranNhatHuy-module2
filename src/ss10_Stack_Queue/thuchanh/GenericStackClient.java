package ss10_Stack_Queue.thuchanh;
public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack stack = new MyGenericStack();
        stack.push("Five");
        stack.push("For");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of Stack after push operation " + stack.size());
        System.out.println("1.2 Pop element form stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3.3 Size of Stack after pop operation: "+ stack.size() );
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}

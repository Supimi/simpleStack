
public class StackMain {

    public static void main(String args[]){
        Stack<String> s = new Stack<>(3);
        Stack<Employee> s1 = new Stack<>(10);
        try{
            s.push("Dog");
            s.push("Cat");
            s.push("Ant");
            String ss = s.pop();
            System.out.println(ss);
            System.out.println(s.peak());
            s.printStack();

        }catch(Exception e){
            System.out.println(e);
        }



    }
}

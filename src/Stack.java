import java.util.ArrayList;

public class Stack<T>{

    private ArrayList<T> arrayList;
    private int size;


    public Stack(int size){
        boolean isSet= this.setSize(size);
        if(isSet){
            this.setArrayList(new ArrayList<>());
        }
    }


    private void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public int getSize() {
        return size;
    }

    private boolean setSize(int size){
        if(size>=0){
            this.size = size;
            return true;
        }else{
            System.out.println("Stack size should be grater than or Equal to Zero");
            return false;
        }

    }


    public void push(T newObj) throws Exception{
        if(this.getSize()>arrayList.size()){
            this.arrayList.add(newObj);
        }else{
            throw new Exception("Number of Elements should not exceed the size of the Stack.");
        }
    }

    public T pop() throws Exception{
        if(this.isEmpty()){
           throw new Exception("Empty Stack cannot be popped.");
        }
        int index = arrayList.size()-1;
        T obj = arrayList.get(index);
        arrayList.remove(index);
        return  obj;

    }

    public void printStack(){
        StringBuilder stackString= new StringBuilder();
        for(T obj:arrayList){
            stackString.append(arrayList.indexOf(obj)+":"+obj.toString()+ "\n");
        }
        System.out.println(stackString);
    }

    public boolean isEmpty(){
        if(arrayList.size()==0){
            return true;
        }
        return false;
    }

    public T peak(){
        if(!this.isEmpty()){
            return arrayList.get(0);
        }
        return null;
    }


}

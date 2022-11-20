package LanguageFundamentals.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
//		PriorityQueue<String> queue=new PriorityQueue<String>();
//		queue.add("Amit Sharma");
//		queue.add("Vijay Raj");
//		queue.add("JaiShankar");
//		queue.add("Raj");
//		System.out.println("head:"+queue.element());
//		System.out.println("head:"+queue.peek());
//		System.out.println("iterating the queue elements:");
//		Iterator itr=queue.iterator();
//		while(itr.hasNext()){
//		System.out.println(itr.next());
//		}
//		queue.remove();
//		queue.poll();
//		System.out.println("after removing two elements:");
//		Iterator<String> itr2=queue.iterator();
//		while(itr2.hasNext()){
//		System.out.println(itr2.next());
//		}

//		Stack<String> stack = new Stack<String>();
//		stack.push("Ayush");
//		stack.push("Garvit");
//		stack.push("Amit");
//		stack.push("Ashish");
//		stack.push("Garima");
//		stack.pop();
//		Iterator<String> itr=stack.iterator();
//		while(itr.hasNext()){
//		System.out.println(itr.next());
//		}


//		Vector<String> v=new Vector<String>();
//		LinkedList<String> al=new LinkedList<String>();
//		al.add("Ravi");//Adding object in arraylist
//		al.add("Vijay");
//		al.add("Ravi");
//		al.add("Ajay");
//		//al.remove(1);
//		System.out.println(al.get(2));

//		Iterator itr=al.iterator();
//		while(itr.hasNext()){
//		System.out.println(itr.next());
//		}
//		System.out.println(al.indexOf("Ajay"));

//		ArrayList<String> list=new ArrayList<String>();//Creating arraylist
//		list.add("Ravi");//Adding object in arraylist
//		list.add("Vijay");
//		list.add("Ravi");
//		list.add("Ajay");
        //Traversing list through Iterator
        //list.contains("Ravi");
//		System.out.println(list.indexOf("Ajay"));
//		System.out.println(list.get(2));
//		list.remove(1);
//		Iterator itr=list.iterator();
//		while(itr.hasNext()){
//		System.out.println(itr.next());
    }
}

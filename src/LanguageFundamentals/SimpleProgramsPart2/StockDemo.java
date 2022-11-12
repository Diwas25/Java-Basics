package LanguageFundamentals.SimpleProgramsPart2;


class Stack{
    int stch[] = new int[10];
    int tos; // top of stack
    Stack() {
        tos = -1;
    }
    void push(int item) {
        if(tos == 9) {
            System.out.println("Stack is Full");
        }
        else {
            stch[++tos] = item;
        }
    }

    int pop() {
        if(tos<0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return stch[tos--];
        }
    }
}

public class StockDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for(int i=0; i<10;i++) {
            mystack1.push(i);
        }
        for(int i=10; i<20;i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1");
        for(int i=0; i<10;i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2");
        for(int i=0; i<10;i++) {
            System.out.println(mystack2.pop());
        }
    }
}


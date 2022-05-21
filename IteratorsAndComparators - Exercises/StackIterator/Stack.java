package StackIterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer> {
    List<Integer> stack;


    public Stack(List<Integer> stack) {
        this.stack = stack;
    }

    public int pop() {
        int elementPosition = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return stack.get(elementPosition);
    }

    public void push(int stack) {
        this.stack = new ArrayList<>(stack);
    }

    @Override
    public Iterator<Integer> iterator() {
        return iterator();
    }
}

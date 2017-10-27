package main;

import context.Context;
import strategy.BubbleSort;

public class Test {

    public static void main(String[] args) {
	Context c = new Context(20);
	c.sortAndShow();
	System.out.println();
	c.setSort(new BubbleSort());
	c.sortAndShow();
    }

}

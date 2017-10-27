package context;

import java.util.Random;

import strategy.NoSort;
import strategy.Sort;

public class Context {

    private Sort sort;
    private int data[];
    private int size;

    public Context(int size) {
	this.size = size;
	this.sort = new NoSort();
	data = new int[size];
	generateRandomNumbers();
    }

    public void setSort(Sort sort) {
	this.sort = sort;
    }

    public void sortAndShow() {
	sort.sort(data, size);
	for (int i = 0; i < size; i++) {
	    System.out.println(data[i]);
	}
    }

    private void generateRandomNumbers() {
	Random generator = new Random();
	for (int i = 0; i < size; i++) {
	    data[i] = generator.nextInt();
	}
    }
}

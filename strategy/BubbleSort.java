package strategy;

public class BubbleSort extends Sort {

    @Override
    public void sort(int[] data, int size) {
	for (int i = 0; i < size - 1; i++) {
	    for (int j = i + 1; j < size; j++) {
		if (data[i] > data[j]) {
		    int tmp = data[i];
		    data[i] = data[j];
		    data[j] = tmp;
		}
	    }
	}
    }

}

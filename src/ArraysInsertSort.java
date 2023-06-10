public class ArraysInsertSort {
    private long[] a;
    private int nElements;

    public ArraysInsertSort(int max) {
        a = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        a[nElements++] = value;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.println(a[i]);
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElements; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

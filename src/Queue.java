public class Queue {
    double[] tab;
    int headQueue;
    int tailQueue;

    public Queue(int maxSize) {
        tab = new double[maxSize];
        headQueue = 0;
        tailQueue = 0;
    }

    int getMaximumQueueSize() {
        return tab.length;
    }

    boolean isEmpty() {
        if (tailQueue == 0)
            return true;
        else
            return false;
    }

    int getSize() {
        return tailQueue;
    }

    void push(double element) throws ArrayIndexOutOfBoundsException {
        if (tailQueue < tab.length) {
            tab[tailQueue] = element;
            tailQueue++;
        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepelnienie kolejki, operacja nie powiodla sie");
        }
    }

    double pop() throws IndexOutOfBoundsException {
        if (tailQueue < 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła sie");
        }
        double elementQueue = tab[headQueue];
        tailQueue--;
        for (int i = 0; i < tailQueue; i++) {
            tab[i] = tab[i + 1];
        }
        return elementQueue;
    }

    void display() throws IndexOutOfBoundsException {
        if (tailQueue == 0) {
            throw new IndexOutOfBoundsException(
                    "Kolejka jest pusta, operacja nie powiodla sie");
        }

        for (int i = 0; i < tailQueue; i++) {
            System.out.println(tab[i]);
        }
    }

    void multiPop(int amountElements) {
        if (amountElements < tailQueue) {
            for (int i = amountElements; i > 0; i--) {
                System.out.println(pop());
            }
        }
    }

    void clear() {
        for (int i = 0; i < tailQueue; i++) {
            tab[i] = 0.0;
        }
        tailQueue = 0;
    }
}

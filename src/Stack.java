public class Stack {
    double[] tab;
    int firstFree;

    public Stack(int maxSize) {
        tab = new double[maxSize];
        firstFree =0;
    }

    int getMaximumStackSize(){
        return tab.length;
    }

    boolean isEmpty(){
        if(firstFree == 0)
            return true;
        else
            return false;
    }

    int getSize(){
        return firstFree;
    }

    void push(double element) throws ArrayIndexOutOfBoundsException{
        if(firstFree < tab.length){
            tab[firstFree] = element;
            firstFree++;
        }else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepelnienie stosu, operacja nie powodła się");
        }
    }

    double pop() throws IndexOutOfBoundsException{
        if(firstFree < 0){
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }
        double elementStack = tab[firstFree - 1];
        firstFree--;
        return  elementStack;
    }

    void display() throws IndexOutOfBoundsException{
        if(firstFree == 0){
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła sie");
        }
        int temp = firstFree -1;
        do {
            System.out.println(tab[temp]);
            temp--;
        }while (temp > -1);
    }

    void multiPop(int amountElements){
        if(amountElements < firstFree){
            for(int i=amountElements; i>0;i--){
                System.out.println(pop());
            }
        }
    }

    void clear(){
        for (int i=0; i<firstFree; i++){
            tab[i] = 0.0;
        }
        firstFree = 0;
    }
}

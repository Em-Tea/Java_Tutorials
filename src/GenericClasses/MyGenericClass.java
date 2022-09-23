package GenericClasses;

public class MyGenericClass <T, T2> {       //make sure to denote the generic name
    T x;
    T2 y;


    MyGenericClass (T x, T2 y){
        this.x = x;
        this.y = y;
    }

    public T getValue() {
        return x;
    }

    public T2 getValue2() {
        return y;
    }

}

package test;

import java.util.Collections;

public class Test {

    private String name = "jack";

    public Test() {

    }

    public int power(int x, int y) {

        Collections.synchronizedList()

        if(y == 0) return 1;
        if(y == 1) return x;

        int result = power(x, y>>1);
        if((y & 1) == 0) {
            return result * result;
        }else {
            return result * result * x;
        }
    }
}

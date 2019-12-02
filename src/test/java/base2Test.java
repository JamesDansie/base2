import org.junit.Test;

import static org.junit.Assert.*;

public class base2Test {

    @Test
    public void NormalCase() {
        assertTrue("25 is 5 squared, returns true",
                base2.isSquare(25));
    }

    @Test
    public void FailCase(){
        assertFalse("7 does not have a square, returns false",
                base2.isSquare(7));
    }

    @Test
    public void cubicCase(){
        assertFalse("3 cubed is 27, does not have a square root",
                base2.isSquare(27));
    }

    @Test(expected = IllegalArgumentException.class)
    public void boundsCase(){
        assertTrue("-1 will be out of bounds",
                base2.isSquare(-1));
    }

}
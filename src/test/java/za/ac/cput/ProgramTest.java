package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    private Program program1;
    private Program program2;

    @BeforeEach
    void setUp() {
    program1 = new Program();
    program2 = new Program();
    }

    @Test
    void testEquality(){
    assertSame(program1, program2);
    }

    @Test
    void testIdentity(){
    assertSame(program1, program2);
    }

}
/**
 * Created by Rakhdakh on 5/8/2016.
 */

import org.junit.Test;
import org.mockito.*;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestMyTATA {

    @Mock
    BigInteger bi;

    @Test
    public void DoIThough(){
        assertEquals(703,37*19);
    }

    @Test
    public void AlwaysMockingBluff(){
        BigInteger zaura = mock(BigInteger.class);
        BigInteger tatara = zaura.not();
        assertEquals(tatara,zaura.not());
    }
}

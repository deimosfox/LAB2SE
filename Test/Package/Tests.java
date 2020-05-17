package Package;



import org.junit.Assert;
import org.junit.Test;

public class Tests {
    public final SimpleCommands Instance = new SimpleCommands();
    private final Interface inter = new Interface();

    public Tests() {
    }

    @Test
    public void main() {
        Assert.assertEquals(15.0D, this.Instance.Sum(10.0D, 5.0D), 1.0E-7D);
        Assert.assertEquals(5.0D, this.Instance.Dec(10.0D, 5.0D), 1.0E-7D);
        Assert.assertEquals(50.0D, this.Instance.Mult(10.0D, 5.0D), 1.0E-7D);
        Assert.assertEquals(2.0D, this.Instance.Dev(10.0D, 5.0D), 1.0E-7D);
    }

    @Test
    public void testMenu() {
        Assert.assertEquals(0L, (long)this.inter.selectoption("end"));
        Assert.assertEquals(-1L, (long)this.inter.selectoption("Kukareku"));
    }
}
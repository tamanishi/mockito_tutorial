import org.example.Main;
import org.example.StaticSample;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Date;

public class MainTest {
    @Test
    public void testMain() {
        // Mockito.CALLS_REAL_METHODSでテスト対象クラス内でネストしたメソッドをモックできる
        try(MockedStatic<StaticSample> mock = Mockito.mockStatic(StaticSample.class, Mockito.CALLS_REAL_METHODS)) {
            mock.when(()->StaticSample.getSystemTime()).thenReturn(new Date());
            Main main = new Main();
            main.main(new String[1]);
        }
    }
}

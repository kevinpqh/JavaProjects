import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class HasGlobalTimeout {
    public static String log;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per
    // method tested

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(9); // sleep for 100 seconds
    }


}

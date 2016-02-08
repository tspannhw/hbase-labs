import java.io.File;
import java.io.IOException;
import java.lang.Exception;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhoenixBasicsTest {
    private static final Logger logger = LoggerFactory.getLogger(PhoenixBasicsTest.class);

    @Test
    public void testRun() throws Exception {
        System.out.println("just testin'");
        String args[] = new String[0];
        new PhoenixBasics().main(args);
    }
}
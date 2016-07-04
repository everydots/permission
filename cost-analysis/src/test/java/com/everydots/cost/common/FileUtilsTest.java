package com.everydots.cost.common;

import com.everydots.common.S3File;
import org.junit.Test;

import java.util.List;

/**
 * Created by mxxiao on 7/4/16.
 */
public class FileUtilsTest {

    @Test
    public void testRetrieveFiles() throws Exception {
        FileUtils fileUtils = new FileUtils();
        List<S3File> s3Files = fileUtils.retrieveClassPathFiles("reports");
        System.out.println(s3Files.size());
    }
}
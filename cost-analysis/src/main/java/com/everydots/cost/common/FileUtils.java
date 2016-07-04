package com.everydots.cost.common;

import com.everydots.common.S3File;
import org.apache.commons.lang.ArrayUtils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static final String FILE_KEY = "file";

    public static List<S3File> retrieveClassPathFiles(String folderName) {

        ArrayList<S3File> s3Files = new ArrayList<S3File>();
        try {
            URL reportsUrl = Thread.currentThread()
                    .getContextClassLoader().getResource(folderName);
            if (reportsUrl != null && reportsUrl.getProtocol().equals(FILE_KEY)) {
                File[] files = new File(reportsUrl.toURI()).listFiles();
                if (ArrayUtils.isEmpty(files)) {
                    return s3Files;
                }
                for (File file : files) {
                    s3Files.add(new S3File()
                            .withKey(file.getName())
                            .withFile(file));
                }
            }

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return s3Files;
    }
}

package com.src.restapi_springboot.uploads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.multipart.MultipartFile;

public class fileUploadUtil {
    public static String saveFile(String filename, MultipartFile multipartFile) throws IOException {
        Path uploadDirectory = Paths.get("file-Upload");

        String fileCode = RandomStringUtils.randomAlphanumeric(8);

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadDirectory.resolve(filename + "-" + fileCode );
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException ioe) {
            throw new IOException("Error save uploaded file " + filename, ioe);
        }
        return fileCode;
    }
}
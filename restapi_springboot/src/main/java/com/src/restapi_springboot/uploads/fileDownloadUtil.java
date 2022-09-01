package com.src.restapi_springboot.uploads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.core.io.UrlResource;

import java.nio.file.Paths;
public class fileDownloadUtil {
    private Path FoundFile;
    public UrlResource gefileAsResouce(String fileCode) throws IOException {
        
        

        Path uploadDirectory = Paths.get("Files-upload");

       
        Files.list(uploadDirectory).forEach(file->{
            if(file.getFileName().toString().startsWith(fileCode)){
                FoundFile = file;
                return;
            }
            
        });
        if(FoundFile != null){
            return new UrlResource(FoundFile.toUri());
        }
        return null;
    }
}

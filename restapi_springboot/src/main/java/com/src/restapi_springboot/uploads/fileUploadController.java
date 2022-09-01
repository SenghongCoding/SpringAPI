package com.src.restapi_springboot.uploads;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class fileUploadController {

    @PostMapping("/uploadfile")
    public ResponseEntity<fileUploadResponse> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException{
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
         Long size = multipartFile.getSize();
        
         fileUploadResponse response = new fileUploadResponse();
          String fileCode = fileUploadUtil.saveFile(fileName , multipartFile);
         response.setFileName(fileName);
         response.setSize(size);
         response.setDownload("/downloadfile/" + fileCode);

        return new ResponseEntity<>(response , HttpStatus.OK) ;
    }
}

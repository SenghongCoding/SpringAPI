// package com.src.restapi_springboot.uploads;

// import java.io.IOException;

// import javax.annotation.Resource;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// @Controller
// public class fileDownloadController {
    
//     @GetMapping("/downloadfile/{fileCode}")
//     public ResponseEntity<?> downloadfile(@PathVariable("fileCode") String fileCode){
//         fileDownloadUtil downloadUtil = new fileDownloadUtil();
//         Resource resource = null;;
//         try{
//             resource = downloadUtil.gefileAsResouce(fileCode);
//         }catch(IOException e){
//             return new ResponseEntity.internalServerError().build();
//         }
//         if(resource == null){
//             return new ResponseEntity<>("file not found", HttpStatus.NOT_FOUND);
//         }
//         String contentType = "application.octet-stream";
//         String headerValue = "attachment ; filename= \"" + resource.getFileName() + "\"";
//         return null;
//     }
// }

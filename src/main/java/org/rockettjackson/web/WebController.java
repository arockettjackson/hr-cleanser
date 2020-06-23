package org.rockettjackson.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RequestMapping("/rest")
public class WebController {

    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @RequestMapping("/upload")
    public void uploadFile(CommonsMultipartFile file) {
        logger.info("User has uploaded a file {}", file.getName());
    }
}

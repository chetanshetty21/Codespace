package com.xworkz.saree.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.saree.configuration.WebConfiguration;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SareeImageController {
	public SareeImageController() {
		log.info("creating" + this.getClass().getSimpleName());
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("img") MultipartFile multipartFile) throws IOException {

		log.info("multipartFile" + multipartFile);
		log.info(multipartFile.getOriginalFilename());
		log.info(multipartFile.getContentType());
		log.info("size" + multipartFile.getSize());
		log.info("bytes" + multipartFile.getBytes());

		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\saree-files\\" + multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "UploadImage";

	}

	@GetMapping("/download")
	public void OnDownload(HttpServletResponse response, @RequestParam String fileName) throws IOException {
		response.setContentType("image/jpeg");
		log.info("OnDownload");
		File file = new File("D:\\saree-files\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
	}

}

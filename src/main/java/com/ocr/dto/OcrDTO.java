package com.ocr.dto;

import org.springframework.web.multipart.MultipartFile;

public class OcrDTO {

	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public OcrDTO setFile(MultipartFile file) {
		this.file = file;
		
		return this;
	}
		
}

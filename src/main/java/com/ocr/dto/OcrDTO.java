package com.ocr.dto;

import org.springframework.web.multipart.MultipartFile;

public class OcrDTO {

	private MultipartFile file;
	private String result;

	public String getResult() {
		return result;
	}

	public OcrDTO setResult(String result) {
		this.result = result;
		
		return this;
	}

	public MultipartFile getFile() {
		return file;
	}

	public OcrDTO setFile(MultipartFile file) {
		this.file = file;
		
		return this;
	}
		
}

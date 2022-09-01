package com.ocr.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ocr.dto.OcrDTO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@RestController
public class ControllerOcr {

	@PostMapping("/ocr/en")
	public OcrDTO engOcr(@RequestParam("file") MultipartFile file) throws TesseractException, IllegalStateException, IOException 
	{
		return this.callOcr(file, "eng");
	}
	
	@PostMapping("/ocr/pt")
	public OcrDTO porOcr(@RequestParam("file") MultipartFile file) throws TesseractException, IllegalStateException, IOException 
	{
		return this.callOcr(file, "por");
	}
	
	@PostMapping("/ocr")
	public OcrDTO notLangOcr(@RequestParam("file") MultipartFile file) throws TesseractException, IllegalStateException, IOException 
	{
		return this.callOcr(file, "");
	}
	
	/**
	 * Chama o recurso de OCR.
	 * @param file
	 * @param language
	 * @return OcrDto
	 * @throws TesseractException
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public OcrDTO callOcr(MultipartFile multipartFile, String language) throws TesseractException, IllegalStateException, IOException 
	{
		String nameTempFile = this.getNameForTempFile();
		File tempFile = new File(nameTempFile);
		multipartFile.transferTo(tempFile);
		
		Tesseract tesseractApi = new Tesseract();
		if (!language.isEmpty()) {
			tesseractApi.setLanguage(language);			
		}

		OcrDTO ocr = new OcrDTO();
		String result = tesseractApi.doOCR(tempFile);
		tempFile.delete();
		ocr.setResult(result);
		
		return ocr;
	}
	
	/**
	 * Retorna um nome para o arquivo temporário.
	 * @return String
	 */
	public String getNameForTempFile() 
	{
		int number = (int) (Math.random()*10000);
		String nameTempFile = "/tmp/tempFile"+number+".png";
		return nameTempFile;
	}
	
}

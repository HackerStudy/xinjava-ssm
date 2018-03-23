package com.it.java.utility;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.it.java.pojo.FileUser;

/**
 * 文件操作类
 * @author hasee
 *
 */
@Service
public class FileUtility {
	
	//文件上传
	public String FileUpload(FileUser user){
		//1.获取文件
		MultipartFile headimage = user.getHeadimage();
		String headimageName = null;
		
		//2.判断是否为空
		boolean empty = headimage.isEmpty();
		if(!empty){
			
			//设置存储路径
			String uploadPath = "E:\\文件存储";
			
			//获取文件名字
			headimageName = headimage.getOriginalFilename();
			
			//把文件存入硬盘
			try {
				headimage.transferTo(new File(uploadPath+File.separator+headimageName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		return headimageName;
	}
	
	//文件下载
	public ResponseEntity<byte[]> FileDownload(String fileName) throws IOException{
		
		//设置路径
		String downloadFilePath="D:\\文件存储";
		
		//新建文件
		File file = new File(downloadFilePath+File.separator+fileName);
		
		//设置http头信息
		HttpHeaders headers = new HttpHeaders();
		
		String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
		
		//通知浏览器以(attachment)下载方式打开
        headers.setContentDispositionFormData("attachment", downloadFileName);
		
		//二进制数据流文件下载
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
		System.out.println(1);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
}

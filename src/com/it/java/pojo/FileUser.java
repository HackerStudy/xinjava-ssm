package com.it.java.pojo;

import org.springframework.web.multipart.MultipartFile;

public class FileUser {
	
	
    
    private MultipartFile headimage;//上传文件会自动绑定到该属性


	public MultipartFile getHeadimage() {
		return headimage;
	}

	public void setHeadimage(MultipartFile headimage) {
		this.headimage = headimage;
	}
  
     //省略getter和setter方法
    
    
}

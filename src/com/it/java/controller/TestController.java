package com.it.java.controller;



import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.FileUser;

/**
 * 测试
 * @author hasee
 *
 */
@Controller
public class TestController {
	
	/*登录校验拦截器
	 * 
	 * 1.获得session
	 * 2.获得登录标识
	 * 3.判断标识是否存在
	 *    //=>存在放行
	 *    //=>不存在重定向到登录页面	
	 * 
	 * */
	
	
	@RequestMapping(value = "/iiiitemlist.action")
	public ModelAndView itemList(Integer id){
		
		
		
		System.out.println("进来了"+id);
		ModelAndView mav = new ModelAndView();
		
		//httpSession.setAttribute("manager", manager);//request.getSession.setAttribute("manager",manager); 
		
		mav.setViewName("test");
		return mav;
	}
	
	
	//文件上传
	@RequestMapping(value="/gggggotoAction.action",method=RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file,
            HttpServletRequest request){

        if (!file.isEmpty()) {

            @SuppressWarnings("unused")
			String contextPath = request.getContextPath();//"/SpringMvcFileUpload"
            @SuppressWarnings("unused")
			String servletPath = request.getServletPath();//"/gotoAction"
            @SuppressWarnings("unused")
			String scheme = request.getScheme();//"http"
       

            String storePath= "D:\\JAVA web";//存放我们上传的文件路径

            String fileName = file.getOriginalFilename();

            File filepath = new File(storePath, fileName);

            if (!filepath.getParentFile().exists()) {

                filepath.getParentFile().mkdirs();//如果目录不存在，创建目录

            }

            try {
                file.transferTo(new File(storePath+File.separator+fileName));//把文件写入目标文件地址

            } catch (Exception e) {

                e.printStackTrace();

                return "error";

            }

            return "success";//返回到成功页面

        }else {

            return "error";//返回到失败的页面
        }
	 }
	
	
	//文件下载
	//filename通过页面传的
	@RequestMapping(value="/ddddddownload.action",method=RequestMethod.GET) //匹配的是href中的download请求
    public ResponseEntity<byte[]> download(HttpServletRequest request,@RequestParam("filename") String filename,
            Model model) throws IOException{
        
    	String downloadFilePath="D:\\文件存储";//从我们的上传文件夹中去取
        
        File file = new File(downloadFilePath+File.separator+filename);//新建一个文件
        
        HttpHeaders headers = new HttpHeaders();//http头信息
        
        String downloadFileName = new String(filename.getBytes("UTF-8"),"iso-8859-1");//设置编码iso-8859-1传送到浏览器的是ios编码
        
        //通知浏览器以(attachment)下载方式打开
        headers.setContentDispositionFormData("attachment", downloadFileName);
        
        //二进制流数据（最常见的文件下载）
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
        
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
        
    }
    
    
    @RequestMapping(value="/rrrrrregister.action",method=RequestMethod.POST)
    public String reg(@ModelAttribute FileUser user,HttpServletRequest request,Map<String,Object> map){

        final String wrong="error";

        final String good="success";
        
        final String w = "userInfo";

        MultipartFile headimage = user.getHeadimage();//获取文件

        boolean empty = headimage.isEmpty();

        if (!empty) {

            String realPath = request.getServletContext().getRealPath("/images");

            String uploadPath="D:\\文件存储";

            String headimageName = headimage.getOriginalFilename();//获取文件名字存入数据库
            

            File imageFile = new File(uploadPath,headimageName);//获取文件位置+名字

            
            try {

                headimage.transferTo(new File(uploadPath+File.separator+headimageName));//把文件写入目标文件地址

            } catch (Exception e) {

                e.printStackTrace();

                return wrong;

            }
            //user通过数据查找
            map.put("user", user);

            return w;

        }else {
            return wrong;
        }
    }
}

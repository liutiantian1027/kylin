package com.liutiantian.kylin.controller;

import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class uploadController {
    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file){
        //文件上传
        if(file!=null && !file.isEmpty()){
            //获取文件的原始名称
            String fileOriginalFilename = file.getOriginalFilename();
            //拼接一个新名称
            String fileName = UUID.randomUUID()+"_"+fileOriginalFilename;
            //保存的文件地址
            File destFile = new File("E:\\pic",fileName);

            try {
                //执行保存
                file.transferTo(destFile);
                //头像保存的地址
                String userface = "http://localhost:92/img/"+fileName;
                return ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return ResultEntity.error(5001,"上传失败");
    }
}

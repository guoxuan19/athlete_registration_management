package com.qf.common.base.utils;

import com.qf.common.base.exception.FileException;
import com.qf.common.base.resp.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author 仇国轩
 */
@Slf4j
public class FileUploadUtils {
    /**
     * 上传文件
     *
     * @param multiFile 文件
     * @return boolean
     */
    public static boolean uploadToServer(MultipartFile multiFile) {
        String uploadPath = "C:/practice01-file-location/";
        String name = multiFile.getOriginalFilename();
        String[] split = name.split("\\.");
        String fileEnd = "." + split[split.length - 1];
        //构建文件对象
        File file = new File(uploadPath);
        //文件目录不存在则递归创建目录
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            if (!mkdirs) {
                log.error("创建文件夹异常");
                throw new FileException(ResponseStatus.FILE_UPLOAD_ERROR);
            }
        }
        InputStream ins = null;
        FileOutputStream outs = null;
        String s = UUID.randomUUID().toString().substring(0, 8) + fileEnd;
        try {
            //获取文件输入流
            ins = multiFile.getInputStream();
            //构建文件输出流
            outs = new FileOutputStream(uploadPath + s);
            int len;
            byte[] bytes = new byte[1024 * 1024 * 80];
            //读取一个bytes的文件内容
            while ((len = ins.read(bytes)) != -1) {
                outs.write(bytes, 0, len);
            }
            outs.close();
            log.info("上传成功：{}", uploadPath + s);
        } catch (IOException e) {
            log.error("文件上传异常");
            throw new FileException(ResponseStatus.FILE_UPLOAD_ERROR);
        } finally {
            try {
                if (outs != null) {
                    outs.close();
                }
                if (ins != null) {
                    ins.close();
                }
            } catch (IOException e) {
                log.error("关闭流异常");
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 新文件上传
     *
     * @param multiFile      文件
     * @param uploadPath     服务器上要存储文件的路径
     * @param uploadFileName 服务器上要存储的文件的名称
     * @return
     */
    public static boolean newUploadToServer(MultipartFile multiFile, String uploadPath, String uploadFileName) {
        //构建文件对象
        File file = new File(uploadPath);
        //文件目录不存在则递归创建目录
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            if (!mkdirs) {
                log.error("创建文件夹异常");
                return false;
            }
        }
        try {
            //获取文件输入流
            InputStream inputStream = multiFile.getInputStream();
            //构建文件输出流
            FileOutputStream outputStream = new FileOutputStream(uploadPath + uploadFileName);
            int copy = FileCopyUtils.copy(inputStream, outputStream);
            log.info("上传成功,文件大小：{}", copy);
            return true;
        } catch (IOException e) {
            log.error("文件上传异常", e);
            e.printStackTrace();
        }
        return false;
    }

}

package shop.mtcoding.fileapp.pic;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class PicRequest {
    @Data
    public static class UploadDTO{
        private String title; // 키 값이 title
        private MultipartFile imgFile; // 이미지 파일
    }
}

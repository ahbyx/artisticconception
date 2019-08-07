package cn.mlgj.artisticconception;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.mlgj.artisticconception.mapper")
public class ArtisticconceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtisticconceptionApplication.class, args);
    }

}

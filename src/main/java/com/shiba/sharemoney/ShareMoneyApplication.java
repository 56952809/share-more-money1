package com.shiba.sharemoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author sharemoney
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ShareMoneyApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ShareMoneyApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  享钱启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}

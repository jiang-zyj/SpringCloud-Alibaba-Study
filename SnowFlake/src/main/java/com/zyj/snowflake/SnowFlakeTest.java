package com.zyj.snowflake;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: Cloud2020
 * @ClassName com.zyj.snowflake.SnowFlakeTest
 * @author: YaJun
 * @Date: 2021 - 09 - 13 - 20:20
 * @Package: PACKAGE_NAME
 * @Description:
 */
public class SnowFlakeTest {

    public static void main(String[] args) {

        System.out.println("11111111111111111111111111111111111111111".length());

        long time = 2199023255551L;

        Date date = new Date();
        date.setTime(time);
        // 可以使用到 2039-09-07
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));

        System.out.println(2039-1970);

    }

}

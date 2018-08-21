package com.torres.study.Encoder;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/13
 */
public class URLEncoderTest {

    public static void main(String[] args) {
        //System.out.println("宁CFA915 encode="+URLEncoder.encode("宁CFA911"));

        System.out.println("150torres26984625".substring("150torres26984625".length()-8));

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Long currentTime =1506800779L;
        Date date = new Date(currentTime);
        System.out.println("date="+date);

    }
}

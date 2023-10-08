package com.qf.common.base.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeUtils {
    public static Date getCurrentTimeInUTC() throws ParseException {
        LocalDateTime now = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = now.atZone(zoneId).toLocalDateTime();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = localDateTime.format(df);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date da = dateFormat.parse(date);
        System.out.println(da);
        return da;

    }
}

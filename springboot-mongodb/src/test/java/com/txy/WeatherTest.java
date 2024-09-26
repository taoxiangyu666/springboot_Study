package com.txy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 16:41
 * @Description :
 */
public class WeatherTest {
    public static void main(String[] args) {
            try {
                // 创建 URL 对象
                URL url = new URL("https://tianqi.2345.com/xinyu1d/57796.htm");

                // 打开连接
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                // 读取响应
                Document doc = Jsoup.parse(connection.getInputStream(), StandardCharsets.UTF_8.name(), url.toString());

                // 解析空气质量数据
                Map<String, String> airQualityData = parseAirQuality(doc);

                // 打印结果
                airQualityData.forEach((key, value) -> System.out.println(key + ": " + value));

                // 断开连接
                connection.disconnect();

            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static Map<String, String> parseAirQuality(Document doc) {
        // 解析 AQI
        Element aqiElement = doc.selectFirst(".aqi-map-con span");
        String aqi = aqiElement != null ? aqiElement.text() : "N/A";

        // 解析 空气质量
        Element kqzlElement = doc.selectFirst(".aqi-map-con em");
        String kqzl = kqzlElement != null ? kqzlElement.text() : "N/A";

        // 解析 PM2.5
        Element pm25Element = doc.selectFirst(".aqi-map-list-th:contains(PM2.5) ~ .aqi-map-style .aqi-map-style-tip em");
        String pm25 = pm25Element != null ? pm25Element.text() : "N/A";


        Element pm25AElement = doc.selectFirst(".aqi-map-list-th:contains(PM2.5) ~ .aqi-map-style .aqi-map-style-tip span");
        String pm25a = pm25AElement != null ? pm25AElement.text() : "N/A";

        // 解析 PM10
        Element pm10Element = doc.selectFirst(".aqi-map-list-th:contains(PM10) ~ .aqi-map-style .aqi-map-style-tip em");
        String pm10 = pm10Element != null ? pm10Element.text() : "N/A";

        Element pm10AElement = doc.selectFirst(".aqi-map-list-th:contains(PM10) ~ .aqi-map-style .aqi-map-style-tip span");
        String pm10a = pm10AElement != null ? pm10AElement.text() : "N/A";

        // 解析 O3
        Element o3Element = doc.selectFirst(".aqi-map-list-th:contains(O3) ~ .aqi-map-style .aqi-map-style-tip em");
        String o3 = o3Element != null ? o3Element.text() : "N/A";

        Element o3AElement = doc.selectFirst(".aqi-map-list-th:contains(O3) ~ .aqi-map-style .aqi-map-style-tip span");
        String o3a = o3AElement != null ? o3AElement.text() : "N/A";

        // 解析 NO2
        Element no2Element = doc.selectFirst(".aqi-map-list-th:contains(NO2) ~ .aqi-map-style .aqi-map-style-tip em");
        String no2 = no2Element != null ? no2Element.text() : "N/A";

        Element no2AElement = doc.selectFirst(".aqi-map-list-th:contains(NO2) ~ .aqi-map-style .aqi-map-style-tip span");
        String no2a = no2AElement != null ? no2AElement.text() : "N/A";

        // 解析 SO2
        Element so2Element = doc.selectFirst(".aqi-map-list-th:contains(SO2) ~ .aqi-map-style .aqi-map-style-tip em");
        String so2 = so2Element != null ? so2Element.text() : "N/A";

        Element so2AElement = doc.selectFirst(".aqi-map-list-th:contains(SO2) ~ .aqi-map-style .aqi-map-style-tip span");
        String so2a = so2AElement != null ? so2AElement.text() : "N/A";

        // 解析 CO
        Element coElement = doc.selectFirst(".aqi-map-list-th:contains(CO) ~ .aqi-map-style .aqi-map-style-tip em");
        String co = coElement != null ? coElement.text() : "N/A";

        Element coAElement = doc.selectFirst(".aqi-map-list-th:contains(CO) ~ .aqi-map-style .aqi-map-style-tip span");
        String coa = coAElement != null ? coAElement.text() : "N/A";


        // 解析 备注
        Elements coElement1 = doc.select("ul.aqi-map-tf li");
        String remark = coElement1 != null ? coElement1.text() : "N/A";

        Element coElement2 = doc.selectFirst("p.aqi-map-type");
        String remark2 = coElement2 != null ? coElement2.text() : "N/A";

        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHH");
       // String format = dtf.format(date) +LocalTime.now().getHour();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //String id = dateTimeFormatter.format(LocalTime.now());
        LocalTime now = LocalTime.now();
        String s = new Date().toString();

        LocalDateTime now1 = LocalDateTime.now();
        String format1 = dtf.format(now1);


        // 返回结果
        return new LinkedHashMap<String, String>() {{
            put("AQI", aqi);
            put("remark", remark);
            put("KQZL", kqzl);
            put("PM2.5", pm25);
            put("PM10", pm10);
            put("O3", o3);
            put("NO2", no2);
            put("SO2", so2);
            put("CO", co);
            put("PM2.5CN", pm25a);
            put("PM10CN", pm10a);
            put("O3CN", o3a);
            put("NO2CN", no2a);
            put("SO2CN", so2a);
            put("COCN", coa);
        }};
    }
}

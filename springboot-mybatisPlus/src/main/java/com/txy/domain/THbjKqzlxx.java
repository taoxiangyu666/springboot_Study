package com.txy.domain;
import java.util.Date;

/**
 * @Author : taoxy
 * @Date: 2024/9/14 16:51
 * @Description : 环保局-空气质量信息对象 t_hbj_kqzlxx
 */

public class THbjKqzlxx {
    private static final long serialVersionUID = 1L;

    /** 主键。年+月+日+时，如：2018032814 */
    private String id;

    /** AQI指数 */

    private String aqi;

    /** 空气质量：优、良、轻度污染。。。 */

    private String kqzl;

    /** PM2.5(μg/m³0 */

    private String pm25;

    /** PM10(μg/m³) */

    private String pm10;

    /** 二氧化硫（μg/m³） */

    private String os2;

    /** 二氧化氮(μg/m³) */

    private String no2;

    /** 一氧化碳(mg/m³) */

    private String co;

    /** 臭氧(μg/m³) */

    private String o3;

    /** 备注 */

    private String bz;

    /** 发布机构 */

    private String fbjg;

    /** 发布时间 */

    private String fbsj;

    /** 数据类型（Y年报，M月报，D日报，H 时报） */

    private String datacode;

    /** 入库时间 */

    private Date rksj;

    /** PM2.5质量 */

    private String pm25zl;

    /** PM10质量 */

    private String pm10zl;

    /** 二氧化硫质量 */

    private String os2zl;

    /** 二氧化氮质量 */

    private String no2zl;

    /** 一氧化碳质量 */

    private String cozl;

    /** 臭氧质量 */

    private String o3zl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getKqzl() {
        return kqzl;
    }

    public void setKqzl(String kqzl) {
        this.kqzl = kqzl;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getOs2() {
        return os2;
    }

    public void setOs2(String os2) {
        this.os2 = os2;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getFbjg() {
        return fbjg;
    }

    public void setFbjg(String fbjg) {
        this.fbjg = fbjg;
    }

    public String getFbsj() {
        return fbsj;
    }

    public void setFbsj(String fbsj) {
        this.fbsj = fbsj;
    }

    public String getDatacode() {
        return datacode;
    }

    public void setDatacode(String datacode) {
        this.datacode = datacode;
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getPm25zl() {
        return pm25zl;
    }

    public void setPm25zl(String pm25zl) {
        this.pm25zl = pm25zl;
    }

    public String getPm10zl() {
        return pm10zl;
    }

    public void setPm10zl(String pm10zl) {
        this.pm10zl = pm10zl;
    }

    public String getOs2zl() {
        return os2zl;
    }

    public void setOs2zl(String os2zl) {
        this.os2zl = os2zl;
    }

    public String getNo2zl() {
        return no2zl;
    }

    public void setNo2zl(String no2zl) {
        this.no2zl = no2zl;
    }

    public String getCozl() {
        return cozl;
    }

    public void setCozl(String cozl) {
        this.cozl = cozl;
    }

    public String getO3zl() {
        return o3zl;
    }

    public void setO3zl(String o3zl) {
        this.o3zl = o3zl;
    }

    @Override
    public String toString() {
        return "THbjKqzlxx{" +
                "id='" + id + '\'' +
                ", aqi='" + aqi + '\'' +
                ", kqzl='" + kqzl + '\'' +
                ", pm25='" + pm25 + '\'' +
                ", pm10='" + pm10 + '\'' +
                ", os2='" + os2 + '\'' +
                ", no2='" + no2 + '\'' +
                ", co='" + co + '\'' +
                ", o3='" + o3 + '\'' +
                ", bz='" + bz + '\'' +
                ", fbjg='" + fbjg + '\'' +
                ", fbsj='" + fbsj + '\'' +
                ", datacode='" + datacode + '\'' +
                ", rksj=" + rksj +
                ", pm25zl='" + pm25zl + '\'' +
                ", pm10zl='" + pm10zl + '\'' +
                ", os2zl='" + os2zl + '\'' +
                ", no2zl='" + no2zl + '\'' +
                ", cozl='" + cozl + '\'' +
                ", o3zl='" + o3zl + '\'' +
                '}';
    }
}

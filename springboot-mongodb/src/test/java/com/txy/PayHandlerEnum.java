package com.txy;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 11:09
 * @Description :
 */
public enum PayHandlerEnum {

    ALI_PAY("ALI_PAY", "AliPayHandler"),
    WEIXIN_PAY("WEIXIN_PAY", "WeixinPayHandler");
    final String code;

    final String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    PayHandlerEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public static String getNameByCode(String code){
        PayHandlerEnum[] payHandlerEnums = values();
        for (PayHandlerEnum payHandlerEnum : payHandlerEnums) {
            if (payHandlerEnum.getCode().equals(code)){
                return payHandlerEnum.getName();
            }
        }
        return null;
    }
}

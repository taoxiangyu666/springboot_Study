package com.txy.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * 数据台账对象 data_ledger_info
 * 
 * @author yhkj
 * @date 2021-05-21
 */

@TableName(value = "data_ledger_info")
@Data
public class DataLedgerInfo
{
    private static final long serialVersionUID = 1L;
    /** 台账主键 */

    @TableId(value = "id")
    private Long ledgerId;

    /** 台账标识 */
    @TableField(value = "ledgerCode")
    private String ledgerCode;

    /** 台账名称 */

    private String ledgerName;

    /** 委办局主键 */

    private Long bureauId;

    /** 系统分类主键 */

    private Long classityId;

    /** 高频库主键 */

    private String frequencyId;

    /** 行业分类主键 */

    private Long trafficId;

    /** 数据库主键 */

    private Long dsId;

    /** 数据库用户名 */

    private String dsUserCode;

    /** 台账类型 */

    private String ledgerType;

    /** 数据表数据类型 */

    private String ledgerDataType;

    /** 当前数据量 */

    private Long currentTotalCount;

    /** 表占用空间 */

    private Long spaceUsingCount;

    /** 是否统计状态 */

    private String isStatisticsFlag;

    /** 是否统计更新数据量状态 */

    private String isDayDataFlag;

    /** 是否统计空间状态 */

    private String isSpaceFlag;

    /** 动态数据异常预警天数 */

    private Long dynamicDataAlertDay;

    /** 动态数据错误预警天数 */

    private Long dynamicDataErrorDay;

    /** 静态数据统计周期 */

    private String staticDataCycle;

    /** 静态数据周期截止日期 */

    private Long staticDataCycleEndDay=0l;

    /** 静态数据统计周期起始月 */

    private Long staticDataCycleStartMonth=0l;

    /** 静态数据异常预警天数 */

    private Long staticDataCycleAlertDay=0l;

    /** 统计任务状态(总数据量) */

    private String taskStatusDataCount;

    /** 统计任务状态(日增数据量) */

    private String taskStatusDayDataCount;

    /** 统计任务状态(空间占用) */

    private String taskStatusSpaceUsing;

    /** 数据表中更新字段 */

    private String ledgerUpdateField;

    /** 台账状态 */

    private String ledgerStatus;

    /** 上报状态 */

    private String reportStatus;


    /** 最近正常上报日期 */

    private Date lastUpdateDate;

    /** 上报状态 */

    private Long ledgerSort;


}

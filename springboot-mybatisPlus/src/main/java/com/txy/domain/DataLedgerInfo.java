package com.txy.domain;

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

    /**
     * 台账主键
     */
    @TableId(value = "ledger_id")
    private Long ledgerId;
    /**
     * 台账标识
     */
    private String ledgerCode;
    /**
     * 台账名称
     */
    private String ledgerName;
    /**
     * 台账排序
     */
    private Integer ledgerSort;
    /**
     * 数据库用户名
     */
    private String dsUserCode;
    /**
     * 委办局主键
     */
    private Long bureauId;
    /**
     * 行业分类主键
     */
    private Long trafficId;
    /**
     * 所属系统ID;
     */
    private Long classityId;
    /**
     * 数据库主键
     */
    private Long dsId;
    /**
     * 台账类型
     */
    private String ledgerType;
    /**
     * 数据表数据类型
     */
    private String ledgerDataType;
    /**
     * 当前数据量
     */
    private Long currentTotalCount;
    /**
     * 表占用空间
     */
    private Long spaceUsingCount;
    /**
     * 是否统计状态
     */
    private String isStatisticsFlag;
    /**
     * 是否统计更新数据量状态
     */
    private String isDayDataFlag;
    /**
     * 是否统计空间状态
     */
    private String isSpaceFlag;
    /**
     * 动态数据异常预警天数
     */
    private Integer dynamicDataAlertDay;
    /**
     * 动态数据错误预警天数
     */
    private Integer dynamicDataErrorDay;
    /**
     * 静态数据（含静态数据文件）统计周期
     */
    private String staticDataCycle;
    /**
     * 静态数据（含静态数据文件）统计周期截止日期
     */
    private Integer staticDataCycleEndDay;
    /**
     * 静态数据（含静态数据文件）统计周期异常预警天数
     */
    private Integer staticDataCycleAlertDay;
    /**
     * 静态数据（含静态数据文件）统计周期起始月
     */
    private Integer staticDataCycleStartMonth;
    /**
     * 统计任务状态(总数据量)
     */
    private String taskStatusDataCount;
    /**
     * 统计任务状态(日增数据量)
     */
    private String taskStatusDayDataCount;
    /**
     * 统计任务状态(空间占用)
     */
    private String taskStatusSpaceUsing;
    /**
     * 数据表中更新字段
     */
    private String ledgerUpdateField;
    /**
     * 台账状态
     */
    private String ledgerStatus;
    /**
     * 最近正常上报日期
     */
    private Date lastUpdateDate;
    /**
     * 删除标志
     */
    private String delFlag;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建人名称
     */
    private String createByName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新人名称
     */
    private String updateByName;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 操作时间
     */
    private Date rksj;
    /**
     * 上报状态
     */
    private String reportStatus;
    /**
     *
     */
    private String frequencyId;
}

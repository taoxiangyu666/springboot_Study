package com.txy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 元数据信息
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2024-09-03 00:52:10
 * @since jdk1.8
 */
@TableName(value = "srdg_data_meta_info")
@Data
public class SrdgDataMetaInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
     * 数据源id
     */
    private Integer connectionId;
    /**
     * 表名
     */
    private String tableName;
    /**
     * 中文表名
     */
    private String descName;
    /**
     * 数据来源
     */
    private String sourceName;
    /**
     * 排序号
     */
    private Integer orderNumber;
    /**
     * 查询条件（json数组）
     */
    private String queryParam;
    /**
     * 查询语句（json数组）
     */
    private String queryDesc;
    /**
     * 状态（0正常 1停用）
     */
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
    /**
     * 创建者id
     */
    private Long createId;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新者id
     */
    private Long updateId;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 备注
     */
    private String remark;
    /**
     *
     */
    private String querySql;
    /**
     *
     */
    private Long deptId;
}

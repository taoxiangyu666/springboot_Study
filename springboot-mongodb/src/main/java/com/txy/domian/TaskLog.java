package com.txy.domian;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="mailto:idler41@163.com">linfuxin</a> created on 2024-06-13 15:13:08
 */
@Data
@Document(collection = "dg_task_log")
public class TaskLog implements Serializable {

    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 追踪id
     */
    @Indexed
    private String traceId;

    /**
     * 作业配置id
     */
    @Indexed
    private Integer taskId;

    /**
     * 作业名称
     */
    private String taskName;

    /**
     * 调度id
     */
    private Integer cronId;

    /**
     * 规则引擎id
     */
    private Integer flowId;

    /**
     * 规则引擎名称
     */
    private String flowName;

    /**
     * 规则引擎实例id
     */
    private String flowInstanceId;

    /**
     * sql模式： 0-导航 1-sql
     */
    private Integer sqlMode;

    /**
     * 读取端分库分表类型：0-单库单表 1-单库分表 2-分库单表- 3-分库分表
     */
    private Integer shardTable;

    /**
     * 查询表数量
     */
    private Integer subTable;

    /**
     * 全量查询：0-全量查询 1-增量查询
     */
    private Integer fullFetch;

    /**
     * 写入库主键类型：0-无主键 1-单主键 2-联合主键
     */
    private Integer writerKeyType;

    /**
     * 子任务数完成数
     */
    private Integer subTasksCompleted;

    /**
     * 子任务数
     */
    private Integer subTasks;

    /**
     * 并发度
     */
    private Integer concurrent;

    /**
     * 状态：0-未开始 1-运行中 2-已完成 3-部分失败 4-完全失败 5-其他异常
     */
    private Integer status;

    /**
     * 数据总量
     */
    private Long dataCount;

    /**
     * 插入数据量
     */
    private Long insertVal;

    /**
     * 更新数据量
     */
    private Long updateVal;

    /**
     * 异常信息
     */
    private String error;

    /**
     * 任务开始时间
     */
    @Indexed
    private LocalDateTime createTime;

    /**
     * 任务结束时间
     */
    private LocalDateTime endTime;

    //关联单位id
    private Integer sourceId;

    @Transient
    @JsonIgnore
    private transient AtomicLong insertCount;

    @Transient
    @JsonIgnore
    private transient AtomicLong updateCount;


}

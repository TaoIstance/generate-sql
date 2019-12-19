package com.ht.model;

import java.util.Date;

public class CareService {
    /** 主键ID */
    private Integer id;

    /** 工种 */
    private Integer workTypeId;

    /** 服务名称 */
    private String serviceName;

    /** 服务介绍 */
    private String serviceExplain;

    /** 启用状态 */
    private Byte serviceStatus;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkTypeId() {
        return workTypeId;
    }

    public void setWorkTypeId(Integer workTypeId) {
        this.workTypeId = workTypeId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getServiceExplain() {
        return serviceExplain;
    }

    public void setServiceExplain(String serviceExplain) {
        this.serviceExplain = serviceExplain == null ? null : serviceExplain.trim();
    }

    public Byte getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Byte serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
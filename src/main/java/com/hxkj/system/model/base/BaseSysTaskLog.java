package com.hxkj.system.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysTaskLog<M extends BaseSysTaskLog<M>> extends Model<M> implements IBean {

    public Integer getId() {
        return get("id");
    }

    public void setId(Integer id) {
        set("id", id);
    }

    public Integer getTaskId() {
        return get("task_id");
    }

    public void setTaskId(Integer taskId) {
        set("task_id", taskId);
    }

    public String getResult() {
        return get("result");
    }

    public void setResult(String result) {
        set("result", result);
    }

    public java.util.Date getStartTime() {
        return get("start_time");
    }

    public void setStartTime(java.util.Date startTime) {
        set("start_time", startTime);
    }

    public java.util.Date getEndTime() {
        return get("end_time");
    }

    public void setEndTime(java.util.Date endTime) {
        set("end_time", endTime);
    }

    public Integer getCostTime() {
        return get("cost_time");
    }

    public void setCostTime(Integer costTime) {
        set("cost_time", costTime);
    }

    public String getRemark() {
        return get("remark");
    }

    public void setRemark(String remark) {
        set("remark", remark);
    }

}
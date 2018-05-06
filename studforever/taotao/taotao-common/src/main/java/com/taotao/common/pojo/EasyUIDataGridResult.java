package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: Lgc
 * @date: 2018/3/12
 * @version: V1.0
 */
public class EasyUIDataGridResult implements Serializable{
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}

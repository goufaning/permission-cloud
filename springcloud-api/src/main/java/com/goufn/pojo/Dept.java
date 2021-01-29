package com.goufn.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * dept表
 *
 * @author goufn
 * @version V1.0
 * @date 2021/1/29 12:19 下午
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable {
    /** 序号 */
    private long deptno;
    /** 名称 */
    private String dname;
    /** 数据在哪个数据库 */
    private String db_source;

    public Dept(String name) {
        this.dname = name;
    }
}

package com.snowalker.shardingjdbc.snowalker.demo.pojo.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Aoheng
 * @date: 2022/4/2 16:02
 */
@Data
public class UserQuery implements Serializable {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 外部关联Id
     */
    private String userOutId;

}

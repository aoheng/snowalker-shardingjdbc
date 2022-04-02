package com.snowalker.shardingjdbc.snowalker.demo.complex.sharding.entity;

import lombok.Data;

/**
 * @author snowalker
 * @version 1.0
 * @date 2019/3/23 10:48
 * @className UserInfoEntity
 * @desc 用户实体
 */
@Data
public class UserInfoEntity {

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

package com.sgh.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="t_user")
public class User {
    @KeySql(useGeneratedKeys = true) //设置主键自动增长
    @Column(name="id")
    @Id
    private int id;
    @Column(name="t_name")
    private String name;
    @Column(name="t_password")
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "t_birth")
    private Date birth;
}

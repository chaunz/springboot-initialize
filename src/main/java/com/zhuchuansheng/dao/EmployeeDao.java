package com.zhuchuansheng.dao;

import com.zhuchuansheng.entity.Employee;

import java.util.List;

/**
 * @author zhuchuansheng
 * @date: 2019/12/2
 * @time: 16:34
 */
public interface EmployeeDao {

    List<Employee> queryEmployeeAll();
}

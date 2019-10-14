package com.atguigu.mapper;


import com.atguigu.pojo.Dept;

@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}

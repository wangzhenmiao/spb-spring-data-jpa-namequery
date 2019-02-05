package com.wangzhen.spbspringdatajpanamequery.repository;

import com.wangzhen.spbspringdatajpanamequery.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName StudentRepository
 * @Description
 * @Author momo
 * @Date 2019/2/5 下午2:11
 **/
public interface StudentRepository extends JpaRepository<Student, Integer> {
    /**
     * 查询班级下的所有学生
     * @param clazzName
     * @return
     */
    List<Student> findStudentsByClazzName(String clazzName);
}
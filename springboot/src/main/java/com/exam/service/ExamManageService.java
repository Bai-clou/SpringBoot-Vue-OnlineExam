package com.exam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.ExamManage;

import java.util.List;

public interface ExamManageService {

    /**
     * 不分页查询所有考试信息
     */
    List<ExamManage> findAll();

    /**
     * 分页查询
     * @param page
     * @return
     */
    IPage<ExamManage> findAll(Page<ExamManage> page);

    ExamManage findById(Integer examCode);

    int delete(Integer examCode);

    int update(ExamManage exammanage);

    int add(ExamManage exammanage);

    ExamManage findOnlyPaperId();
}

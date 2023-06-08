package com.exam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.Message;

public interface MessageService {
    //分页查询
    IPage<Message> findAll(Page page);

    //通过ID查询
    Message findById(Integer id);

    int delete(Integer id);

    int update(Message message);

    int add(Message message);
}

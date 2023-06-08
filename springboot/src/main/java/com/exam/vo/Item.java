package com.exam.vo;

import lombok.Data;

//题目模型
@Data
public class Item {

    private String subject;//考试科目

    private Integer paperId;//考试编号

    private Integer multiNumber;//选择题

    private Integer fillNumber;//填空题

    private Integer judgeNumber;//判断题
}

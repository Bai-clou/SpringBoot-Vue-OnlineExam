package com.exam.vo;

import lombok.Data;

//答案模型
@Data
public class AnswerVO {
    private String question;//问题题目
    private String subject;//考试科目
    private String score;//分数（默认为2）
    private String section;//所属章节
    private String level;//难度等级
    private String type;//类型
}

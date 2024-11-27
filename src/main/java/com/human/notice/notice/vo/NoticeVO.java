package com.human.notice.notice.vo;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component()
@Getter
@Setter
public class NoticeVO {
    private int n_idx;
    private String n_category;
    private String n_title;
    private String n_content;
    private Date n_regdate;
    private Date n_update;
    private char n_status;

    public NoticeVO() {
    }
}

package com.human.notice.notice.controller;


import com.human.notice.notice.service.NoticeService;
import com.human.notice.notice.vo.NoticeVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NoticeControllerImpl implements NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private NoticeVO noticeVO;

    @Override
    @GetMapping("/notice/notice_list.do")
    public ModelAndView listNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List listNotice = noticeService.listNotice();
        ModelAndView mav = new ModelAndView("notice/listNotice");
        mav.addObject("listNotice", listNotice);
        return mav;

    }
}

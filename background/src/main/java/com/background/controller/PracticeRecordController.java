package com.background.controller;

import com.background.mapper.PracticeRecordMapper;
import com.background.pojo.PracticeRecord;
import com.background.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@RestController
@CrossOrigin
public class PracticeRecordController {
    @Autowired
    private PracticeRecordMapper practiceRecordMapper;

    /**
     * List all recordsss
     * @return
     */
    @RequestMapping("/record")
    public Result list(){
        List<PracticeRecord> list = practiceRecordMapper.list();
        return Result.success(list);
    }
}

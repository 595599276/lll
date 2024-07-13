package com.background.mapper;

import com.background.pojo.PracticeRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PracticeRecordMapper {

    @Select("select * from practice_record")
    public List<PracticeRecord> list();
}

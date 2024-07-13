package com.background.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PracticeRecord {
    private LocalDate day;
    private String time;
    private Integer id;
    private String location;
    private String participants;
}

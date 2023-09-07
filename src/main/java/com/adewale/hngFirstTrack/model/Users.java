package com.adewale.hngFirstTrack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String slack_name ;
    private LocalDateTime current_day;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
}

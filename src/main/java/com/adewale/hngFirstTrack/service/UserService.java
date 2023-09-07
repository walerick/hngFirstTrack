package com.adewale.hngFirstTrack.service;

import com.adewale.hngFirstTrack.helper.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

@Data
@Service
@AllArgsConstructor
public class UserService {
    public UserResponse getUserInfo(){
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("EEEE");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        String utcTime = dateFormat.format(new Date());
        String current_day = currentTime.format(dayFormat);

        UserResponse response = new UserResponse();
        response.setSlack_name("Adewale");
        response.setCurrent_day(current_day);
        response.setUtc_time(utcTime);
        response.setTrack("backend");
        response.setGithub_file_url("");
        response.setGithub_repo_url("");
        response.setStatus_code(200);

        return response;

    }
}

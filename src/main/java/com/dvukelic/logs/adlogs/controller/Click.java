package com.dvukelic.logs.adlogs.controller;

import com.dvukelic.logs.adlogs.dto.Clicks;
import com.dvukelic.logs.adlogs.service.impl.ClickServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping(value = "/api/v1/ad/click/")
public class Click {
    Logger logger = LoggerFactory.getLogger(Click.class);

    @Autowired
    private  ClickServiceImpl clickService;

    @GetMapping("number/of/by/campaign/{campaign_id}")
    ResponseEntity<Clicks> getAmountOfClickByCampaign(@PathVariable Integer campaign_id){
        Clicks amountOfClicks = clickService.getAmountOfClickByCampaign(campaign_id);
        return ResponseEntity.ok().body(amountOfClicks);
    }

    @GetMapping("number/of/by/campaign/and/date/{campaign_id}")
    ResponseEntity<Clicks> getAmountOfClickByCampaignANdDate(@PathVariable Integer campaign_id,
                                                             @RequestParam("from") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dateTimeFrom,
                                                             @RequestParam("to") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dateTimeTo){
        Clicks amountOfClicks = clickService.getAmountOfClickByCampaignAndTime(campaign_id,dateTimeFrom,dateTimeTo);
        return ResponseEntity.ok().body(amountOfClicks);
    }


}

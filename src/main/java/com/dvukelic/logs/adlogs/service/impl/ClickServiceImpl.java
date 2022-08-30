package com.dvukelic.logs.adlogs.service.impl;

import com.dvukelic.logs.adlogs.dao.ClickAdLog;
import com.dvukelic.logs.adlogs.dto.Clicks;
import com.dvukelic.logs.adlogs.repository.ClickAdLogRepository;
import com.dvukelic.logs.adlogs.service.ClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClickServiceImpl implements ClickService {

    @Autowired
    ClickAdLogRepository clickAdLogRepo;

    @Override
    public Clicks getAmountOfClickByCampaign(int campaign) {
        Clicks clicks = new Clicks();

        clicks.setNumberOfClicks(clickAdLogRepo.numberOfEventsByCampaign(campaign));
        return clicks;
    }
}

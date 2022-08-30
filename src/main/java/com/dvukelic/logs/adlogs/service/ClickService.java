package com.dvukelic.logs.adlogs.service;

import com.dvukelic.logs.adlogs.dto.Clicks;

public interface ClickService {

    Clicks getAmountOfClickByCampaign(int campaignId);
}

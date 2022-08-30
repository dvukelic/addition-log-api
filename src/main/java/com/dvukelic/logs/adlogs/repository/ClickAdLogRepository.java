package com.dvukelic.logs.adlogs.repository;

import com.dvukelic.logs.adlogs.dao.ClickAdLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ClickAdLogRepository extends JpaRepository<ClickAdLog, String> {
    @Query("SELECT COUNT(cal) FROM ClickAdLog cal WHERE cal.campaign=:pCampaign")
    int numberOfEventsByCampaign(@Param("pCampaign") int pCampaign);

    @Query("SELECT COUNT(cal) FROM ClickAdLog cal WHERE cal.campaign=:pCampaign AND (cal.timestamp>:pFrom AND cal.timestamp<:pTo) ")
    int numberOfEventsByCampaignAndDate(@Param("pCampaign") int pCampaign,
                                        @Param("pFrom") Date pFrom,
                                        @Param("pTo") Date pTo);

}
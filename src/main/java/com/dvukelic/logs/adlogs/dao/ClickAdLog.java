package com.dvukelic.logs.adlogs.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "click_ad_log")
public class ClickAdLog {
    @Id
    @Column(name = "id", length = 100)
    private String id;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "campaign")
    private Integer campaign;

    @Column(name = "banner")
    private Integer banner;

    @Column(name = "content_unit")
    private Integer contentUnit;

    @Column(name = "network")
    private Integer network;

    @Column(name = "browser")
    private Integer browser;

    @Column(name = "operating_system")
    private Integer operatingSystem;

    @Column(name = "country")
    private Integer country;

    @Column(name = "state")
    private Integer state;

    @Column(name = "city")
    private Integer city;
}
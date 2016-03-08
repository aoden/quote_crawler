package com.tdt.crawler.model;

import com.sleepycat.persist.model.PrimaryKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "photos")
public class Photos {

    @PrimaryKey
    @GeneratedValue
    protected Long id;
    protected int keywordLevel;
    protected String searchString;
    protected String category;
    protected String title;
    protected String imageURL;
    protected String sourceURL;
    protected boolean disable = false;
    protected int downloaded;
    @Column(name = "imgURL_exists")
    protected boolean urlExisted;
    protected int reviewed;
    @Column(name = "reviewed_by")
    protected String reviewedBy;
    @Column(name = "reviewed_date")
    protected Date reviewDate;
    protected boolean addedToWordpress;
}

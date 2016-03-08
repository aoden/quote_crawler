package com.tdt.crawler.model;

import com.sleepycat.persist.model.Entity;
import com.sleepycat.persist.model.PrimaryKey;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
@Builder
@Data
public class Author {

    @PrimaryKey
    @GeneratedValue
    protected Long id;
    protected String slug;
    protected Timestamp dateAdded;
    protected boolean gotImage;
    protected Date born;
    protected Date died;
    protected String bio;
    @OneToMany(mappedBy = "author")
    protected List<Quote> quotes;
}

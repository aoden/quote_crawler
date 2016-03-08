package com.tdt.crawler.model;

import com.sleepycat.persist.model.Entity;
import com.sleepycat.persist.model.PrimaryKey;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quotes")
@Builder
@Data
public class Quote {

    @PrimaryKey
    @GeneratedValue
    protected Long id;
    protected String quote;
    protected boolean imagesCreated;
    protected int views;
    @ManyToOne
    @JoinColumn(name = "author_id")
    protected Author author;
    @ManyToOne
    @JoinColumn(name = "cat_id")
    protected Category category;
}

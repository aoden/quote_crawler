package com.tdt.crawler.model;

import com.sleepycat.persist.model.PrimaryKey;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
public class Category {

    @Column(name = "cat_ID")
    @PrimaryKey
    @GeneratedValue
    protected Integer id;
    protected String category;
    protected int categoryCount;
    protected boolean gotBing;
    @OneToMany(mappedBy = "category")
    protected List<Quote> quotes;
}

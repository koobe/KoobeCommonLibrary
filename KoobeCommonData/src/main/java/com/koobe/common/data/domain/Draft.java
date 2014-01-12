package com.koobe.common.data.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Draft Book Master Entity
 */
@Entity
public class Draft {

    public enum DraftStatus {
        CONVERTING, READY, PUBLISHED;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private DraftStatus status;

    private Integer progress;

    private Date dateCreated;

    private Date lastUpdated;

    @PrePersist
    protected void onCreate() {
        setDateCreated(new Date());
        setLastUpdated(new Date());
    }

    @PreUpdate
    protected void onUpdate() {
        setLastUpdated(new Date());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public DraftStatus getStatus() {
        return status;
    }

    public void setStatus(DraftStatus status) {
        this.status = status;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}

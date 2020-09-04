package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Yuegangao {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String psr;

    @Column(name = "firstIndex")
    private String firstindex;

    @Column(name = "secondIndex")
    private String secondindex;

    @Column(name = "ecologicalFactor")
    private String ecologicalfactor;

    private String unit;

    private String standard;

    @Column(name = "currentValue")
    private String currentvalue;

    @Column(name = "finishTime")
    private Date finishtime;

    private String comment;

    private String citation;

    /**
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return psr
     */
    public String getPsr() {
        return psr;
    }

    /**
     * @param psr
     */
    public void setPsr(String psr) {
        this.psr = psr;
    }

    /**
     * @return firstIndex
     */
    public String getFirstindex() {
        return firstindex;
    }

    /**
     * @param firstindex
     */
    public void setFirstindex(String firstindex) {
        this.firstindex = firstindex;
    }

    /**
     * @return secondIndex
     */
    public String getSecondindex() {
        return secondindex;
    }

    /**
     * @param secondindex
     */
    public void setSecondindex(String secondindex) {
        this.secondindex = secondindex;
    }

    /**
     * @return ecologicalFactor
     */
    public String getEcologicalfactor() {
        return ecologicalfactor;
    }

    /**
     * @param ecologicalfactor
     */
    public void setEcologicalfactor(String ecologicalfactor) {
        this.ecologicalfactor = ecologicalfactor;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    /**
     * @param standard
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * @return currentValue
     */
    public String getCurrentvalue() {
        return currentvalue;
    }

    /**
     * @param currentvalue
     */
    public void setCurrentvalue(String currentvalue) {
        this.currentvalue = currentvalue;
    }

    /**
     * @return finishTime
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * @param finishtime
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return citation
     */
    public String getCitation() {
        return citation;
    }

    /**
     * @param citation
     */
    public void setCitation(String citation) {
        this.citation = citation;
    }
}
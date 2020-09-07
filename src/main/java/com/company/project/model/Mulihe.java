package com.company.project.model;

import javax.persistence.*;

public class Mulihe {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String psr;

    @Column(name = "firstIndex")
    private String firstindex;

    @Column(name = "indexId")
    private String indexid;

    @Column(name = "secondIndex")
    private String secondindex;

    private String unit;

    /**
     * 现状值，如果没有具体值用1/0表示是否
     */
    @Column(name = "currentValue")
    private Float currentvalue;

    private String rules;

    private Float standard;

    private String citation;

    private String comment;

    @Column(name = "data_2018")
    private Float data2018;

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
     * @return indexId
     */
    public String getIndexid() {
        return indexid;
    }

    /**
     * @param indexid
     */
    public void setIndexid(String indexid) {
        this.indexid = indexid;
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
     * 获取现状值，如果没有具体值用1/0表示是否
     *
     * @return currentValue - 现状值，如果没有具体值用1/0表示是否
     */
    public Float getCurrentvalue() {
        return currentvalue;
    }

    /**
     * 设置现状值，如果没有具体值用1/0表示是否
     *
     * @param currentvalue 现状值，如果没有具体值用1/0表示是否
     */
    public void setCurrentvalue(Float currentvalue) {
        this.currentvalue = currentvalue;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return rules;
    }

    /**
     * @param rules
     */
    public void setRules(String rules) {
        this.rules = rules;
    }

    /**
     * @return standard
     */
    public Float getStandard() {
        return standard;
    }

    /**
     * @param standard
     */
    public void setStandard(Float standard) {
        this.standard = standard;
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
     * @return data_2018
     */
    public Float getData2018() {
        return data2018;
    }

    /**
     * @param data2018
     */
    public void setData2018(Float data2018) {
        this.data2018 = data2018;
    }
}
package com.company.project.model;

import javax.persistence.*;

@Table(name = "assessmentResult_2019")
public class Assessmentresult2019 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "indexId")
    private String indexid;

    @Column(name = "secondIndex")
    private String secondindex;

    private String unit;

    private String rules;

    private Float standard;

    private Float guangzhou;

    private Float shenzhen;

    private Float zhuhai;

    private Float foshan;

    private Float huizhou;

    private Float dongguan;

    private Float zhongshan;

    private Float jiangmen;

    private Float zhaoqing;

    private String comment;

    /**
     * @return id
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
     * @return standrad
     */
    public Float getStandard() {
        return standard;
    }

    /**
     * @param standard
     */
    public void setStandrad(Float standard) {
        this.standard = standard;
    }

    /**
     * @return guangzhou
     */
    public Float getGuangzhou() {
        return guangzhou;
    }

    /**
     * @param guangzhou
     */
    public void setGuangzhou(Float guangzhou) {
        this.guangzhou = guangzhou;
    }

    /**
     * @return shenzhen
     */
    public Float getShenzhen() {
        return shenzhen;
    }

    /**
     * @param shenzhen
     */
    public void setShenzhen(Float shenzhen) {
        this.shenzhen = shenzhen;
    }

    /**
     * @return zhuhai
     */
    public Float getZhuhai() {
        return zhuhai;
    }

    /**
     * @param zhuhai
     */
    public void setZhuhai(Float zhuhai) {
        this.zhuhai = zhuhai;
    }

    /**
     * @return foshan
     */
    public Float getFoshan() {
        return foshan;
    }

    /**
     * @param foshan
     */
    public void setFoshan(Float foshan) {
        this.foshan = foshan;
    }

    /**
     * @return huizhou
     */
    public Float getHuizhou() {
        return huizhou;
    }

    /**
     * @param huizhou
     */
    public void setHuizhou(Float huizhou) {
        this.huizhou = huizhou;
    }

    /**
     * @return dongguan
     */
    public Float getDongguan() {
        return dongguan;
    }

    /**
     * @param dongguan
     */
    public void setDongguan(Float dongguan) {
        this.dongguan = dongguan;
    }

    /**
     * @return zhongshan
     */
    public Float getZhongshan() {
        return zhongshan;
    }

    /**
     * @param zhongshan
     */
    public void setZhongshan(Float zhongshan) {
        this.zhongshan = zhongshan;
    }

    /**
     * @return jiangmen
     */
    public Float getJiangmen() {
        return jiangmen;
    }

    /**
     * @param jiangmen
     */
    public void setJiangmen(Float jiangmen) {
        this.jiangmen = jiangmen;
    }

    /**
     * @return zhaoqing
     */
    public Float getZhaoqing() {
        return zhaoqing;
    }

    /**
     * @param zhaoqing
     */
    public void setZhaoqing(Float zhaoqing) {
        this.zhaoqing = zhaoqing;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
package com.company.project.model;

import javax.persistence.*;

public class Yuegangao {
    private String psr;

    @Column(name = "firstIndex")
    private String firstindex;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "secondIndex")
    private String secondindex;

    private String unit;

    private String standard;

    @Id
    @Column(name = "pkId")
    private Integer pkid;

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
     * @return pkId
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * @param pkid
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }
}
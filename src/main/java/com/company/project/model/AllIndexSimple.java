package com.company.project.model;

import javax.persistence.*;

@Table(name = "all_index_simple")
public class AllIndexSimple {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String psr;

    @Column(name = "indexType")
    private String indextype;

    @Column(name = "typeId")
    private String typeid;

    @Column(name = "indexName")
    private String indexname;

    @Column(name = "ecologicalFactor")
    private String ecologicalfactor;

    private String unit;

    private String standard;

    private String level;

    private String rules;

    private String citation;

    private String issueunit;

    private String issueyear;

    private String comment;

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
     * @return indexType
     */
    public String getIndextype() {
        return indextype;
    }

    /**
     * @param indextype
     */
    public void setIndextype(String indextype) {
        this.indextype = indextype;
    }

    /**
     * @return typeId
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
     * @return indexName
     */
    public String getIndexname() {
        return indexname;
    }

    /**
     * @param indexname
     */
    public void setIndexname(String indexname) {
        this.indexname = indexname;
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
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
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
     * @return issueunit
     */
    public String getIssueunit() {
        return issueunit;
    }

    /**
     * @param issueunit
     */
    public void setIssueunit(String issueunit) {
        this.issueunit = issueunit;
    }

    /**
     * @return issueyear
     */
    public String getIssueyear() {
        return issueyear;
    }

    /**
     * @param issueyear
     */
    public void setIssueyear(String issueyear) {
        this.issueyear = issueyear;
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
}
package pe.com.segrop.sgsapp.domain;
// Generated 27-may-2012 20:47:48 by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * SegDetCriteria generated by hbm2java
 */
public class SegDetCriteria implements java.io.Serializable {

    private SegDetCriteriaId id;
    private SegDetExport segDetExport;
    private String VColumn;
    private String VCondition;
    private String VValue;
    private String VPrefijo;
    private String VSufijo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;

    public SegDetCriteria() {
        super();
    }

    public SegDetCriteria(SegDetCriteriaId id, SegDetExport segDetExport) {
        this.id = id;
        this.segDetExport = segDetExport;
    }

    public SegDetCriteria(SegDetCriteriaId id, SegDetExport segDetExport, String VColumn, String VCondition, String VValue, String VPrefijo, String VSufijo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.id = id;
        this.segDetExport = segDetExport;
        this.VColumn = VColumn;
        this.VCondition = VCondition;
        this.VValue = VValue;
        this.VPrefijo = VPrefijo;
        this.VSufijo = VSufijo;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
    }

    public SegDetCriteriaId getId() {
        return this.id;
    }

    public void setId(SegDetCriteriaId id) {
        this.id = id;
    }

    public SegDetExport getSegDetExport() {
        return this.segDetExport;
    }

    public void setSegDetExport(SegDetExport segDetExport) {
        this.segDetExport = segDetExport;
    }

    public String getVColumn() {
        return this.VColumn;
    }

    public void setVColumn(String VColumn) {
        this.VColumn = VColumn;
    }

    public String getVCondition() {
        return VCondition;
    }

    public void setVCondition(String VCondition) {
        this.VCondition = VCondition;
    }

    public String getVValue() {
        return VValue;
    }

    public void setVValue(String VValue) {
        this.VValue = VValue;
    }

    public String getVPrefijo() {
        return VPrefijo;
    }

    public void setVPrefijo(String VPrefijo) {
        this.VPrefijo = VPrefijo;
    }

    public String getVSufijo() {
        return VSufijo;
    }

    public void setVSufijo(String VSufijo) {
        this.VSufijo = VSufijo;
    }

    public String getVUsuCreacion() {
        return this.VUsuCreacion;
    }

    public void setVUsuCreacion(String VUsuCreacion) {
        this.VUsuCreacion = VUsuCreacion;
    }

    public Date getDFecCreacion() {
        return this.DFecCreacion;
    }

    public void setDFecCreacion(Date DFecCreacion) {
        this.DFecCreacion = DFecCreacion;
    }

    public String getVIpCreacion() {
        return this.VIpCreacion;
    }

    public void setVIpCreacion(String VIpCreacion) {
        this.VIpCreacion = VIpCreacion;
    }

    public String getVUsuModificacion() {
        return this.VUsuModificacion;
    }

    public void setVUsuModificacion(String VUsuModificacion) {
        this.VUsuModificacion = VUsuModificacion;
    }

    public Date getDFecModificacion() {
        return this.DFecModificacion;
    }

    public void setDFecModificacion(Date DFecModificacion) {
        this.DFecModificacion = DFecModificacion;
    }

    public String getVIpModificacion() {
        return this.VIpModificacion;
    }

    public void setVIpModificacion(String VIpModificacion) {
        this.VIpModificacion = VIpModificacion;
    }
}
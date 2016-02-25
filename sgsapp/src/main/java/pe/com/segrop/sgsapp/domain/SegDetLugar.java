package pe.com.segrop.sgsapp.domain;
// Generated 21-feb-2012 0:26:46 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * SegDetLugar generated by hbm2java
 */
public class SegDetLugar implements java.io.Serializable {

    private SegDetLugarId id;
    private SegDetArea segDetArea;
    private BigDecimal NCodLugar;
    private BigDecimal NCodArea;
    private BigDecimal NCodLocal;
    private BigDecimal NCodEmpresa;
    private String VDescripcion;
    private BigDecimal NFlgActivo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;

    public SegDetLugar() {
        super();
    }

    public SegDetLugar(SegDetLugarId id, SegDetArea segDetArea) {
        this.id = id;
        this.segDetArea = segDetArea;
    }

    public SegDetLugar(SegDetLugarId id, SegDetArea segDetArea, BigDecimal NCodLugar, BigDecimal NCodArea, BigDecimal NCodLocal, BigDecimal NCodEmpresa, String VDescripcion, BigDecimal NFlgActivo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.id = id;
        this.segDetArea = segDetArea;
        this.NCodLugar = NCodLugar;
        this.NCodArea = NCodArea;
        this.NCodLocal = NCodLocal;
        this.NCodEmpresa = NCodEmpresa;
        this.VDescripcion = VDescripcion;
        this.NFlgActivo = NFlgActivo;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
    }

    public SegDetLugarId getId() {
        return this.id;
    }

    public void setId(SegDetLugarId id) {
        this.id = id;
    }

    public SegDetArea getSegDetArea() {
        return this.segDetArea;
    }

    public void setSegDetArea(SegDetArea segDetArea) {
        this.segDetArea = segDetArea;
    }

    public BigDecimal getNCodLugar() {
        return NCodLugar;
    }

    public void setNCodLugar(BigDecimal NCodLugar) {
        this.NCodLugar = NCodLugar;
    }

    public BigDecimal getNCodArea() {
        return NCodArea;
    }

    public void setNCodArea(BigDecimal NCodArea) {
        this.NCodArea = NCodArea;
    }

    public BigDecimal getNCodLocal() {
        return NCodLocal;
    }

    public void setNCodLocal(BigDecimal NCodLocal) {
        this.NCodLocal = NCodLocal;
    }

    public BigDecimal getNCodEmpresa() {
        return NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public String getVDescripcion() {
        return this.VDescripcion;
    }

    public void setVDescripcion(String VDescripcion) {
        this.VDescripcion = VDescripcion;
    }

    public BigDecimal getNFlgActivo() {
        return this.NFlgActivo;
    }

    public void setNFlgActivo(BigDecimal NFlgActivo) {
        this.NFlgActivo = NFlgActivo;
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

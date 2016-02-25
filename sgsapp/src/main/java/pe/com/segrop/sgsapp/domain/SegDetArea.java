package pe.com.segrop.sgsapp.domain;
// Generated 21-feb-2012 0:26:46 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SegDetArea generated by hbm2java
 */
public class SegDetArea implements java.io.Serializable {

    private SegDetAreaId id;
    private SegDetLocal segDetLocal;
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
    private Set<SegDetLugar> segDetLugars = new HashSet<SegDetLugar>(0);
    private Set<SegDetResponsable> segDetResponsables = new HashSet<SegDetResponsable>(0);

    public SegDetArea() {
        super();
    }

    public SegDetArea(SegDetAreaId id, SegDetLocal segDetLocal) {
        this.id = id;
        this.segDetLocal = segDetLocal;
    }

    public SegDetArea(SegDetAreaId id, SegDetLocal segDetLocal, BigDecimal NCodArea, BigDecimal NCodLocal, BigDecimal NCodEmpresa, String VDescripcion, BigDecimal NFlgActivo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, Set<SegDetLugar> segDetLugars, Set<SegDetResponsable> segDetResponsables) {
        this.id = id;
        this.segDetLocal = segDetLocal;
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
        this.segDetLugars = segDetLugars;
        this.segDetResponsables = segDetResponsables;
    }

    public SegDetAreaId getId() {
        return this.id;
    }

    public void setId(SegDetAreaId id) {
        this.id = id;
    }

    public SegDetLocal getSegDetLocal() {
        return this.segDetLocal;
    }

    public void setSegDetLocal(SegDetLocal segDetLocal) {
        this.segDetLocal = segDetLocal;
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

    public Set<SegDetLugar> getSegDetLugars() {
        return this.segDetLugars;
    }

    public void setSegDetLugars(Set<SegDetLugar> segDetLugars) {
        this.segDetLugars = segDetLugars;
    }

    public Set<SegDetResponsable> getSegDetResponsables() {
        return this.segDetResponsables;
    }

    public void setSegDetResponsables(Set<SegDetResponsable> segDetResponsables) {
        this.segDetResponsables = segDetResponsables;
    }
}

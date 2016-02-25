package pe.com.segrop.sgsapp.domain;
// Generated 15-jul-2012 21:05:20 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * SegDetClave generated by hbm2java
 */
public class SegDetClave implements java.io.Serializable {

    private BigDecimal NCodClave;
    private BigDecimal NCodUsuario;
    private BigDecimal NCodEmpresa;
    private SegCabUsuario segCabUsuario;
    private String VClave;
    private BigDecimal NFlgBloqueo;
    private Date DFecBloqueo;
    private String VIpBloqueo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private BigDecimal NFlgActivo;

    public SegDetClave() {
        super();
    }

    public SegDetClave(BigDecimal NCodClave, BigDecimal NCodUsuario, BigDecimal NCodEmpresa, SegCabUsuario segCabUsuario) {
        this.NCodClave = NCodClave;
        this.NCodUsuario = NCodUsuario;
        this.NCodEmpresa = NCodEmpresa;
        this.segCabUsuario = segCabUsuario;
    }

    public SegDetClave(BigDecimal NCodClave, BigDecimal NCodUsuario, BigDecimal NCodEmpresa, SegCabUsuario segCabUsuario, String VClave, BigDecimal NFlgBloqueo, Date DFecBloqueo, String VIpBloqueo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, BigDecimal NFlgActivo) {
        this.NCodClave = NCodClave;
        this.NCodUsuario = NCodUsuario;
        this.NCodEmpresa = NCodEmpresa;
        this.segCabUsuario = segCabUsuario;
        this.VClave = VClave;
        this.NFlgBloqueo = NFlgBloqueo;
        this.DFecBloqueo = DFecBloqueo;
        this.VIpBloqueo = VIpBloqueo;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.NFlgActivo = NFlgActivo;
    }

    public BigDecimal getNCodClave() {
        return this.NCodClave;
    }

    public void setNCodClave(BigDecimal NCodClave) {
        this.NCodClave = NCodClave;
    }

    /**
     * @return the NCodUsuario
     */
    public BigDecimal getNCodUsuario() {
        return NCodUsuario;
    }

    /**
     * @param NCodUsuario the NCodUsuario to set
     */
    public void setNCodUsuario(BigDecimal NCodUsuario) {
        this.NCodUsuario = NCodUsuario;
    }

    /**
     * @return the NCodEmpresa
     */
    public BigDecimal getNCodEmpresa() {
        return NCodEmpresa;
    }

    /**
     * @param NCodEmpresa the NCodEmpresa to set
     */
    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public SegCabUsuario getSegCabUsuario() {
        return this.segCabUsuario;
    }

    public void setSegCabUsuario(SegCabUsuario segCabUsuario) {
        this.segCabUsuario = segCabUsuario;
    }

    public String getVClave() {
        return this.VClave;
    }

    public void setVClave(String VClave) {
        this.VClave = VClave;
    }

    public BigDecimal getNFlgBloqueo() {
        return this.NFlgBloqueo;
    }

    public void setNFlgBloqueo(BigDecimal NFlgBloqueo) {
        this.NFlgBloqueo = NFlgBloqueo;
    }

    public Date getDFecBloqueo() {
        return this.DFecBloqueo;
    }

    public void setDFecBloqueo(Date DFecBloqueo) {
        this.DFecBloqueo = DFecBloqueo;
    }

    public String getVIpBloqueo() {
        return this.VIpBloqueo;
    }

    public void setVIpBloqueo(String VIpBloqueo) {
        this.VIpBloqueo = VIpBloqueo;
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

    public BigDecimal getNFlgActivo() {
        return this.NFlgActivo;
    }

    public void setNFlgActivo(BigDecimal NFlgActivo) {
        this.NFlgActivo = NFlgActivo;
    }
}
package pe.com.segrop.sgsapp.domain;
// Generated 16-feb-2012 2:25:41 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * SegDetCargo generated by hbm2java
 */
public class SegDetCargo implements java.io.Serializable {

    private BigDecimal NCodCargo;
    private BigDecimal NCodEmpresa;
    private String VDescripcion;
    private BigDecimal NFlgActivo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;

    public SegDetCargo() {
        super();
    }

    public SegDetCargo(BigDecimal NCodCargo) {
        this.NCodCargo = NCodCargo;
    }

    public SegDetCargo(BigDecimal NCodCargo, BigDecimal NCodEmpresa, String VDescripcion, BigDecimal NFlgActivo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.NCodCargo = NCodCargo;
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

    public BigDecimal getNCodCargo() {
        return this.NCodCargo;
    }

    public void setNCodCargo(BigDecimal NCodCargo) {
        this.NCodCargo = NCodCargo;
    }

    public BigDecimal getNCodEmpresa() {
        return this.NCodEmpresa;
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

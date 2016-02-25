package pe.com.segrop.sgsapp.domain;
// Generated 27-mar-2012 23:44:26 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SegCabResponsable generated by hbm2java
 */
public class SegCabResponsable implements java.io.Serializable {

    private BigDecimal NCodResponsable;
    private String VDescripcion;
    private String VNombres;
    private String VApellidos;
    private BigDecimal NFlgActivo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private Set<SegDetInsTelefonica> segDetInsTelefonicas = new HashSet<SegDetInsTelefonica>(0);

    public SegCabResponsable() {
        super();
    }

    public SegCabResponsable(BigDecimal NCodResponsable) {
        this.NCodResponsable = NCodResponsable;
    }

    public SegCabResponsable(BigDecimal NCodResponsable, String VDescripcion, String VNombres, String VApellidos, BigDecimal NFlgActivo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, Set<SegDetInsTelefonica> segDetInsTelefonicas) {
        this.NCodResponsable = NCodResponsable;
        this.VDescripcion = VDescripcion;
        this.VNombres = VNombres;
        this.VApellidos = VApellidos;
        this.NFlgActivo = NFlgActivo;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.segDetInsTelefonicas = segDetInsTelefonicas;
    }

    public BigDecimal getNCodResponsable() {
        return this.NCodResponsable;
    }

    public void setNCodResponsable(BigDecimal NCodResponsable) {
        this.NCodResponsable = NCodResponsable;
    }

    public String getVDescripcion() {
        return this.VDescripcion;
    }

    public void setVDescripcion(String VDescripcion) {
        this.VDescripcion = VDescripcion;
    }

    public String getVNombres() {
        return VNombres;
    }

    public void setVNombres(String VNombres) {
        this.VNombres = VNombres;
    }

    public String getVApellidos() {
        return VApellidos;
    }

    public void setVApellidos(String VApellidos) {
        this.VApellidos = VApellidos;
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

    public Set<SegDetInsTelefonica> getSegDetInsTelefonicas() {
        return this.segDetInsTelefonicas;
    }

    public void setSegDetInsTelefonicas(Set<SegDetInsTelefonica> segDetInsTelefonicas) {
        this.segDetInsTelefonicas = segDetInsTelefonicas;
    }
}

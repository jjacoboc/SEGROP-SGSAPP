package pe.com.segrop.sgsapp.domain;
// Generated 27-mar-2012 23:44:26 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SegCabLugar generated by hbm2java
 */
public class SegCabLugar implements java.io.Serializable {

    private BigDecimal NCodLugar;
    private String VDescripcion;
    private BigDecimal NFlgActivo;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private Set<SegDetInsTelefonica> segDetInsTelefonicas = new HashSet<SegDetInsTelefonica>(0);

    public SegCabLugar() {
        super();
    }

    public SegCabLugar(BigDecimal NCodLugar) {
        this.NCodLugar = NCodLugar;
    }

    public SegCabLugar(BigDecimal NCodLugar, String VDescripcion, BigDecimal NFlgActivo, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, Set<SegDetInsTelefonica> segDetInsTelefonicas) {
        this.NCodLugar = NCodLugar;
        this.VDescripcion = VDescripcion;
        this.NFlgActivo = NFlgActivo;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.segDetInsTelefonicas = segDetInsTelefonicas;
    }

    public BigDecimal getNCodLugar() {
        return this.NCodLugar;
    }

    public void setNCodLugar(BigDecimal NCodLugar) {
        this.NCodLugar = NCodLugar;
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

    public Set<SegDetInsTelefonica> getSegDetInsTelefonicas() {
        return this.segDetInsTelefonicas;
    }

    public void setSegDetInsTelefonicas(Set<SegDetInsTelefonica> segDetInsTelefonicas) {
        this.segDetInsTelefonicas = segDetInsTelefonicas;
    }
}

package pe.com.segrop.sgsapp.domain;
// Generated 27-may-2012 20:47:48 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * SegDetExportdetalle generated by hbm2java
 */
public class SegDetExportdetalle implements java.io.Serializable {

    private SegDetExportdetalleId id;
    private SegDetExport segDetExport;
    private BigDecimal NCodAtributo;
    private BigDecimal NOrden;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;

    public SegDetExportdetalle() {
        super();
    }

    public SegDetExportdetalle(SegDetExportdetalleId id, SegDetExport segDetExport) {
        this.id = id;
        this.segDetExport = segDetExport;
    }

    public SegDetExportdetalle(SegDetExportdetalleId id, SegDetExport segDetExport, BigDecimal NCodAtributo, BigDecimal NOrden, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.id = id;
        this.segDetExport = segDetExport;
        this.NCodAtributo = NCodAtributo;
        this.NOrden = NOrden;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
    }

    public SegDetExportdetalleId getId() {
        return this.id;
    }

    public void setId(SegDetExportdetalleId id) {
        this.id = id;
    }

    public SegDetExport getSegDetExport() {
        return this.segDetExport;
    }

    public void setSegDetExport(SegDetExport segDetExport) {
        this.segDetExport = segDetExport;
    }

    public BigDecimal getNCodAtributo() {
        return NCodAtributo;
    }

    public void setNCodAtributo(BigDecimal NCodAtributo) {
        this.NCodAtributo = NCodAtributo;
    }

    public BigDecimal getNOrden() {
        return NOrden;
    }

    public void setNOrden(BigDecimal NOrden) {
        this.NOrden = NOrden;
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

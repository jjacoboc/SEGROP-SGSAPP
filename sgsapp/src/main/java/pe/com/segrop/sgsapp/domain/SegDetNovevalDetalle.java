package pe.com.segrop.sgsapp.domain;
// Generated 08-abr-2012 18:19:08 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * SegDetNovevalDetalle generated by hbm2java
 */
public class SegDetNovevalDetalle implements java.io.Serializable {

    private SegDetNovevalDetalleId id;
    private SegDetNovEvaluacion segDetNovEvaluacion;
    private BigDecimal NCodDetalle;
    private BigDecimal NCodEvaluacion;
    private BigDecimal NCodNovedad;
    private BigDecimal NCodEmpresa;
    private String VDiagnostico;
    private Date DFechora;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private String VRecomendacion;

    public SegDetNovevalDetalle() {
        super();
    }

    public SegDetNovevalDetalle(SegDetNovevalDetalleId id, SegDetNovEvaluacion segDetNovEvaluacion) {
        this.id = id;
        this.segDetNovEvaluacion = segDetNovEvaluacion;
    }

    public SegDetNovevalDetalle(SegDetNovevalDetalleId id, SegDetNovEvaluacion segDetNovEvaluacion, String VDiagnostico, Date DFechora, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, String VRecomendacion) {
        this.id = id;
        this.segDetNovEvaluacion = segDetNovEvaluacion;
        this.VDiagnostico = VDiagnostico;
        this.DFechora = DFechora;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.VRecomendacion = VRecomendacion;
    }

    public SegDetNovevalDetalleId getId() {
        return this.id;
    }

    public void setId(SegDetNovevalDetalleId id) {
        this.id = id;
    }

    public SegDetNovEvaluacion getSegDetNovEvaluacion() {
        return this.segDetNovEvaluacion;
    }

    public void setSegDetNovEvaluacion(SegDetNovEvaluacion segDetNovEvaluacion) {
        this.segDetNovEvaluacion = segDetNovEvaluacion;
    }

    public BigDecimal getNCodDetalle() {
        return NCodDetalle;
    }

    public void setNCodDetalle(BigDecimal NCodDetalle) {
        this.NCodDetalle = NCodDetalle;
    }

    public BigDecimal getNCodEvaluacion() {
        return NCodEvaluacion;
    }

    public void setNCodEvaluacion(BigDecimal NCodEvaluacion) {
        this.NCodEvaluacion = NCodEvaluacion;
    }

    public BigDecimal getNCodNovedad() {
        return NCodNovedad;
    }

    public void setNCodNovedad(BigDecimal NCodNovedad) {
        this.NCodNovedad = NCodNovedad;
    }

    public BigDecimal getNCodEmpresa() {
        return NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public String getVDiagnostico() {
        return this.VDiagnostico;
    }

    public void setVDiagnostico(String VDiagnostico) {
        this.VDiagnostico = VDiagnostico;
    }

    public Date getDFechora() {
        return this.DFechora;
    }

    public void setDFechora(Date DFechora) {
        this.DFechora = DFechora;
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

    public String getVRecomendacion() {
        return this.VRecomendacion;
    }

    public void setVRecomendacion(String VRecomendacion) {
        this.VRecomendacion = VRecomendacion;
    }
}

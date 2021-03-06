package pe.com.segrop.sgsapp.domain;
// Generated 08-abr-2012 18:19:08 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * SegDetNovEvaluacion generated by hbm2java
 */
public class SegDetNovEvaluacion implements java.io.Serializable {

    private SegDetNovEvaluacionId id;
    private BigDecimal NCodEvaluacion;
    private BigDecimal NCodNovedad;
    private BigDecimal NCodEmpresa;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private BigDecimal NOcurrencia;
    private BigDecimal NImpacto;
    private BigDecimal NEstado;
    private BigDecimal NNivelOcurrencia;
    private BigDecimal NNivelImpacto;
    private List<SegDetNovevalDetalle> segDetNovevalDetalles = new ArrayList<SegDetNovevalDetalle>(0);

    public SegDetNovEvaluacion() {
        super();
    }

    public SegDetNovEvaluacion(SegDetNovEvaluacionId id, BigDecimal NCodEvaluacion, BigDecimal NCodNovedad, BigDecimal NCodEmpresa) {
        this.id = id;
        this.NCodEvaluacion = NCodEvaluacion;
        this.NCodNovedad = NCodNovedad;
        this.NCodEmpresa = NCodEmpresa;
    }

    public SegDetNovEvaluacion(SegDetNovEvaluacionId id, BigDecimal NCodEvaluacion, BigDecimal NCodNovedad, BigDecimal NCodEmpresa, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, BigDecimal NOcurrencia, BigDecimal NImpacto, BigDecimal NEstado, BigDecimal NNivelOcurrencia, BigDecimal NNivelImpacto, List<SegDetNovevalDetalle> segDetNovevalDetalles) {
        this.id = id;
        this.NCodEvaluacion = NCodEvaluacion;
        this.NCodNovedad = NCodNovedad;
        this.NCodEmpresa = NCodEmpresa;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.NOcurrencia = NOcurrencia;
        this.NImpacto = NImpacto;
        this.NEstado = NEstado;
        this.NNivelOcurrencia = NNivelOcurrencia;
        this.NNivelImpacto = NNivelImpacto;
        this.segDetNovevalDetalles = segDetNovevalDetalles;
    }

    public SegDetNovEvaluacionId getId() {
        return this.id;
    }

    public void setId(SegDetNovEvaluacionId id) {
        this.id = id;
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

    public BigDecimal getNOcurrencia() {
        return this.NOcurrencia;
    }

    public void setNOcurrencia(BigDecimal NOcurrencia) {
        this.NOcurrencia = NOcurrencia;
    }

    public BigDecimal getNImpacto() {
        return this.NImpacto;
    }

    public void setNImpacto(BigDecimal NImpacto) {
        this.NImpacto = NImpacto;
    }

    public BigDecimal getNEstado() {
        return NEstado;
    }

    public void setNEstado(BigDecimal NEstado) {
        this.NEstado = NEstado;
    }

    public BigDecimal getNNivelOcurrencia() {
        return NNivelOcurrencia;
    }

    public void setNNivelOcurrencia(BigDecimal NNivelOcurrencia) {
        this.NNivelOcurrencia = NNivelOcurrencia;
    }

    public BigDecimal getNNivelImpacto() {
        return NNivelImpacto;
    }

    public void setNNivelImpacto(BigDecimal NNivelImpacto) {
        this.NNivelImpacto = NNivelImpacto;
    }

    public List<SegDetNovevalDetalle> getSegDetNovevalDetalles() {
        return this.segDetNovevalDetalles;
    }

    public void setSegDetNovevalDetalles(List<SegDetNovevalDetalle> segDetNovevalDetalles) {
        this.segDetNovevalDetalles = segDetNovevalDetalles;
    }
}

package pe.com.segrop.sgsapp.domain;
// Generated 29-abr-2012 21:05:00 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * SegDetRiesgo generated by hbm2java
 */
public class SegDetRiesgo implements java.io.Serializable {

    private SegDetRiesgoId id;
    private BigDecimal NCodEmpresa;
    private BigDecimal NCodRiesgo;
    private BigDecimal NTipoRiesgo;
    private String VTipoRiesgo;
    private BigDecimal NLocal;
    private String VLocal;
    private BigDecimal NArea;
    private String VArea;
    private BigDecimal NLugar;
    private String VLugar;
    private BigDecimal NResponsable;
    private String VResponsable;
    private BigDecimal NCargo;
    private String VCargo;
    private String VDescBreve;
    private String VDescripcion;
    private Date DFecHora;
    private String VFecHora;
    private String VAccTomadas;
    private BigDecimal NSeguimiento;
    private BigDecimal NEstado;
    private String VEstado;
    private BigDecimal NOcurrencia;
    private BigDecimal NImpacto;
    private BigDecimal NNivelOcurrencia;
    private BigDecimal NNivelImpacto;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private Date DFecInicio;
    private Date DFecFin;
    private SegDetNovEvaluacion segDetNovEvaluacion;
    private List<SegDetAcciones> segDetAcciones = new ArrayList<SegDetAcciones>();
    private SegDetInspreEvaluacion segDetInspreEvaluacion;
    private List<SegDetInspreAcciones> segDetInspreAcciones = new ArrayList<SegDetInspreAcciones>();

    public SegDetRiesgo() {
        super();
    }

    public SegDetRiesgo(SegDetRiesgoId id,BigDecimal NCodEmpresa, BigDecimal NCodRiesgo, BigDecimal NTipoRiesgo) {
        this.id = id;
        this.NCodEmpresa = NCodEmpresa;
        this.NCodRiesgo = NCodRiesgo;
        this.NTipoRiesgo = NTipoRiesgo;
    }

    public SegDetRiesgo(SegDetRiesgoId id, BigDecimal NCodEmpresa, BigDecimal NCodRiesgo, BigDecimal NTipoRiesgo, BigDecimal NLocal, BigDecimal NArea, BigDecimal NLugar, BigDecimal NResponsable, BigDecimal NCargo, String VDescBreve, String VDescripcion, Date DFecHora, String VAccTomadas, BigDecimal NEstado, BigDecimal NOcurrencia, BigDecimal NImpacto, BigDecimal NNivelOcurrencia, BigDecimal NNivelImpacto, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.id = id;
        this.NCodEmpresa = NCodEmpresa;
        this.NCodRiesgo = NCodRiesgo;
        this.NTipoRiesgo = NTipoRiesgo;
        this.NLocal = NLocal;
        this.NArea = NArea;
        this.NLugar = NLugar;
        this.NResponsable = NResponsable;
        this.NCargo = NCargo;
        this.VDescBreve = VDescBreve;
        this.VDescripcion = VDescripcion;
        this.DFecHora = DFecHora;
        this.VAccTomadas = VAccTomadas;
        this.NEstado = NEstado;
        this.NOcurrencia = NOcurrencia;
        this.NImpacto = NImpacto;
        this.NNivelOcurrencia = NNivelOcurrencia;
        this.NNivelImpacto = NNivelImpacto;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
    }

    public SegDetRiesgoId getId() {
        return this.id;
    }

    public void setId(SegDetRiesgoId id) {
        this.id = id;
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

    /**
     * @return the NCodRiesgo
     */
    public BigDecimal getNCodRiesgo() {
        return NCodRiesgo;
    }

    /**
     * @param NCodRiesgo the NCodRiesgo to set
     */
    public void setNCodRiesgo(BigDecimal NCodRiesgo) {
        this.NCodRiesgo = NCodRiesgo;
    }

    /**
     * @return the NTipoRiesgo
     */
    public BigDecimal getNTipoRiesgo() {
        return NTipoRiesgo;
    }

    /**
     * @param NTipoRiesgo the NTipoRiesgo to set
     */
    public void setNTipoRiesgo(BigDecimal NTipoRiesgo) {
        this.NTipoRiesgo = NTipoRiesgo;
    }

    public BigDecimal getNLocal() {
        return this.NLocal;
    }

    public void setNLocal(BigDecimal NLocal) {
        this.NLocal = NLocal;
    }

    public BigDecimal getNArea() {
        return this.NArea;
    }

    public void setNArea(BigDecimal NArea) {
        this.NArea = NArea;
    }

    public BigDecimal getNLugar() {
        return this.NLugar;
    }

    public void setNLugar(BigDecimal NLugar) {
        this.NLugar = NLugar;
    }

    public BigDecimal getNResponsable() {
        return this.NResponsable;
    }

    public void setNResponsable(BigDecimal NResponsable) {
        this.NResponsable = NResponsable;
    }

    public BigDecimal getNCargo() {
        return this.NCargo;
    }

    public void setNCargo(BigDecimal NCargo) {
        this.NCargo = NCargo;
    }

    public String getVDescBreve() {
        return this.VDescBreve;
    }

    public void setVDescBreve(String VDescBreve) {
        this.VDescBreve = VDescBreve;
    }

    public String getVDescripcion() {
        return this.VDescripcion;
    }

    public void setVDescripcion(String VDescripcion) {
        this.VDescripcion = VDescripcion;
    }

    public Date getDFecHora() {
        return this.DFecHora;
    }

    public void setDFecHora(Date DFecHora) {
        this.DFecHora = DFecHora;
    }

    public String getVAccTomadas() {
        return this.VAccTomadas;
    }

    public void setVAccTomadas(String VAccTomadas) {
        this.VAccTomadas = VAccTomadas;
    }

    public BigDecimal getNSeguimiento() {
        return NSeguimiento;
    }

    public void setNSeguimiento(BigDecimal NSeguimiento) {
        this.NSeguimiento = NSeguimiento;
    }

    public BigDecimal getNEstado() {
        return this.NEstado;
    }

    public void setNEstado(BigDecimal NEstado) {
        this.NEstado = NEstado;
    }

    /**
     * @return the NOcurrencia
     */
    public BigDecimal getNOcurrencia() {
        return NOcurrencia;
    }

    /**
     * @param NOcurrencia the NOcurrencia to set
     */
    public void setNOcurrencia(BigDecimal NOcurrencia) {
        this.NOcurrencia = NOcurrencia;
    }

    /**
     * @return the NImpacto
     */
    public BigDecimal getNImpacto() {
        return NImpacto;
    }

    /**
     * @param NImpacto the NImpacto to set
     */
    public void setNImpacto(BigDecimal NImpacto) {
        this.NImpacto = NImpacto;
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

    /**
     * @return the DFecInicio
     */
    public Date getDFecInicio() {
        return DFecInicio;
    }

    /**
     * @param DFecInicio the DFecInicio to set
     */
    public void setDFecInicio(Date DFecInicio) {
        this.DFecInicio = DFecInicio;
    }

    /**
     * @return the DFecFin
     */
    public Date getDFecFin() {
        return DFecFin;
    }

    /**
     * @param DFecFin the DFecFin to set
     */
    public void setDFecFin(Date DFecFin) {
        this.DFecFin = DFecFin;
    }

    public String getVTipoRiesgo() {
        return VTipoRiesgo;
    }

    public void setVTipoRiesgo(String VTipoRiesgo) {
        this.VTipoRiesgo = VTipoRiesgo;
    }

    public String getVLocal() {
        return VLocal;
    }

    public void setVLocal(String VLocal) {
        this.VLocal = VLocal;
    }

    public String getVArea() {
        return VArea;
    }

    public void setVArea(String VArea) {
        this.VArea = VArea;
    }

    public String getVLugar() {
        return VLugar;
    }

    public void setVLugar(String VLugar) {
        this.VLugar = VLugar;
    }

    public String getVResponsable() {
        return VResponsable;
    }

    public void setVResponsable(String VResponsable) {
        this.VResponsable = VResponsable;
    }

    public String getVCargo() {
        return VCargo;
    }

    public void setVCargo(String VCargo) {
        this.VCargo = VCargo;
    }

    public String getVFecHora() {
        return VFecHora;
    }

    public void setVFecHora(String VFecHora) {
        this.VFecHora = VFecHora;
    }

    public String getVEstado() {
        return VEstado;
    }

    public void setVEstado(String VEstado) {
        this.VEstado = VEstado;
    }

    public SegDetNovEvaluacion getSegDetNovEvaluacion() {
        return segDetNovEvaluacion;
    }

    public void setSegDetNovEvaluacion(SegDetNovEvaluacion segDetNovEvaluacion) {
        this.segDetNovEvaluacion = segDetNovEvaluacion;
    }

    public List<SegDetAcciones> getSegDetAcciones() {
        return segDetAcciones;
    }

    public void setSegDetAcciones(List<SegDetAcciones> segDetAcciones) {
        this.segDetAcciones = segDetAcciones;
    }

    public SegDetInspreEvaluacion getSegDetInspreEvaluacion() {
        return segDetInspreEvaluacion;
    }

    public void setSegDetInspreEvaluacion(SegDetInspreEvaluacion segDetInspreEvaluacion) {
        this.segDetInspreEvaluacion = segDetInspreEvaluacion;
    }

    public List<SegDetInspreAcciones> getSegDetInspreAcciones() {
        return segDetInspreAcciones;
    }

    public void setSegDetInspreAcciones(List<SegDetInspreAcciones> segDetInspreAcciones) {
        this.segDetInspreAcciones = segDetInspreAcciones;
    }
}

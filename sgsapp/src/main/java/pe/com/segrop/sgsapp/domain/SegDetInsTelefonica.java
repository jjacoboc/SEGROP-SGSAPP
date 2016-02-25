package pe.com.segrop.sgsapp.domain;
// Generated 27-mar-2012 23:44:26 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * SegDetInsTelefonica generated by hbm2java
 */
public class SegDetInsTelefonica implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private BigDecimal NCodInstelefonica;
    private SegCabResponsable segCabResponsable;
    private SegCabCargo segCabCargo;
    private SegCabLugar segCabLugar;
    private BigDecimal NCodResponsable;
    private BigDecimal NCodCargo;
    private BigDecimal NCodLugar;
    private BigDecimal NSeguimiento;
    private BigDecimal NEstado;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private String VTelefono;
    private BigDecimal NCodEmpresa;
    private String VPregunta;
    private Date DFecInicio;
    private Date DFecFin;
    private List<SegDetPregunta> segDetPreguntas = new ArrayList<SegDetPregunta>(0);

    public SegDetInsTelefonica() {
        super();
    }

    public SegDetInsTelefonica(BigDecimal NCodInstelefonica) {
        this.NCodInstelefonica = NCodInstelefonica;
    }

    public SegDetInsTelefonica(BigDecimal NCodInstelefonica, SegCabResponsable segCabResponsable, SegCabCargo segCabCargo, SegCabLugar segCabLugar, BigDecimal NCodResponsable, BigDecimal NCodCargo, BigDecimal NCodLugar, BigDecimal NSeguimiento, BigDecimal NEstado, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, String VTelefono, BigDecimal NCodEmpresa, List<SegDetPregunta> segDetPreguntas) {
        this.NCodInstelefonica = NCodInstelefonica;
        this.segCabResponsable = segCabResponsable;
        this.segCabCargo = segCabCargo;
        this.segCabLugar = segCabLugar;
        this.NCodResponsable = NCodResponsable;
        this.NCodCargo = NCodCargo;
        this.NCodLugar = NCodLugar;
        this.NSeguimiento = NSeguimiento;
        this.NEstado = NEstado;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.VTelefono = VTelefono;
        this.NCodEmpresa = NCodEmpresa;
        this.segDetPreguntas = segDetPreguntas;
    }

    public BigDecimal getNCodInstelefonica() {
        return this.NCodInstelefonica;
    }

    public void setNCodInstelefonica(BigDecimal NCodInstelefonica) {
        this.NCodInstelefonica = NCodInstelefonica;
    }

    public SegCabResponsable getSegCabResponsable() {
        return this.segCabResponsable;
    }

    public void setSegCabResponsable(SegCabResponsable segCabResponsable) {
        this.segCabResponsable = segCabResponsable;
    }

    public SegCabCargo getSegCabCargo() {
        return this.segCabCargo;
    }

    public void setSegCabCargo(SegCabCargo segCabCargo) {
        this.segCabCargo = segCabCargo;
    }

    public SegCabLugar getSegCabLugar() {
        return this.segCabLugar;
    }

    public void setSegCabLugar(SegCabLugar segCabLugar) {
        this.segCabLugar = segCabLugar;
    }

    /**
     * @return the NCodResponsable
     */
    public BigDecimal getNCodResponsable() {
        return NCodResponsable;
    }

    /**
     * @param NCodResponsable the NCodResponsable to set
     */
    public void setNCodResponsable(BigDecimal NCodResponsable) {
        this.NCodResponsable = NCodResponsable;
    }

    /**
     * @return the NCodCargo
     */
    public BigDecimal getNCodCargo() {
        return NCodCargo;
    }

    /**
     * @param NCodCargo the NCodCargo to set
     */
    public void setNCodCargo(BigDecimal NCodCargo) {
        this.NCodCargo = NCodCargo;
    }

    /**
     * @return the NCodLugar
     */
    public BigDecimal getNCodLugar() {
        return NCodLugar;
    }

    /**
     * @param NCodLugar the NCodLugar to set
     */
    public void setNCodLugar(BigDecimal NCodLugar) {
        this.NCodLugar = NCodLugar;
    }

    public BigDecimal getNSeguimiento() {
        return this.NSeguimiento;
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

    public String getVTelefono() {
        return this.VTelefono;
    }

    public void setVTelefono(String VTelefono) {
        this.VTelefono = VTelefono;
    }

    public BigDecimal getNCodEmpresa() {
        return this.NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public String getVPregunta() {
        return VPregunta;
    }

    public void setVPregunta(String VPregunta) {
        this.VPregunta = VPregunta;
    }

    public Date getDFecInicio() {
        return DFecInicio;
    }

    public void setDFecInicio(Date DFecInicio) {
        this.DFecInicio = DFecInicio;
    }

    public Date getDFecFin() {
        return DFecFin;
    }

    public void setDFecFin(Date DFecFin) {
        this.DFecFin = DFecFin;
    }

    public List<SegDetPregunta> getSegDetPreguntas() {
        return this.segDetPreguntas;
    }

    public void setSegDetPreguntas(List<SegDetPregunta> segDetPreguntas) {
        this.segDetPreguntas = segDetPreguntas;
    }
}

package pe.com.segrop.sgsapp.domain;
// Generated 27-may-2012 20:47:48 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SegDetExport generated by hbm2java
 */
public class SegDetExport implements java.io.Serializable {

    private SegDetExportId id;
    private BigDecimal NCodEmpresa;
    private BigDecimal NCodExport;
    private BigDecimal NCodEntidad;
    private String VNombre;
    private String VDescripcion;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;
    private Set<SegDetExportdetalle> segDetExportdetalles = new HashSet<SegDetExportdetalle>(0);
    private Set<SegDetCriteria> segDetCriterias = new HashSet<SegDetCriteria>(0);

    public SegDetExport() {
        super();
    }

    public SegDetExport(SegDetExportId id, BigDecimal NCodEmpresa, BigDecimal NCodExport) {
        this.id = id;
        this.NCodEmpresa = NCodEmpresa;
        this.NCodExport = NCodExport;
    }

    public SegDetExport(SegDetExportId id, BigDecimal NCodEmpresa, BigDecimal NCodExport, BigDecimal NCodEntidad, String VNombre, String VDescripcion, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion, Set<SegDetExportdetalle> segDetExportdetalles, Set<SegDetCriteria> segDetCriterias) {
        this.id = id;
        this.NCodEmpresa = NCodEmpresa;
        this.NCodExport = NCodExport;
        this.NCodEntidad = NCodEntidad;
        this.VNombre = VNombre;
        this.VDescripcion = VDescripcion;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
        this.segDetExportdetalles = segDetExportdetalles;
        this.segDetCriterias = segDetCriterias;
    }

    public SegDetExportId getId() {
        return this.id;
    }

    public void setId(SegDetExportId id) {
        this.id = id;
    }

    public BigDecimal getNCodEmpresa() {
        return NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public BigDecimal getNCodExport() {
        return NCodExport;
    }

    public void setNCodExport(BigDecimal NCodExport) {
        this.NCodExport = NCodExport;
    }

    public BigDecimal getNCodEntidad() {
        return NCodEntidad;
    }

    public void setNCodEntidad(BigDecimal NCodEntidad) {
        this.NCodEntidad = NCodEntidad;
    }

    public String getVNombre() {
        return this.VNombre;
    }

    public void setVNombre(String VNombre) {
        this.VNombre = VNombre;
    }

    public String getVDescripcion() {
        return this.VDescripcion;
    }

    public void setVDescripcion(String VDescripcion) {
        this.VDescripcion = VDescripcion;
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

    public Set<SegDetExportdetalle> getSegDetExportdetalles() {
        return this.segDetExportdetalles;
    }

    public void setSegDetExportdetalles(Set<SegDetExportdetalle> segDetExportdetalles) {
        this.segDetExportdetalles = segDetExportdetalles;
    }

    public Set<SegDetCriteria> getSegDetCriterias() {
        return segDetCriterias;
    }

    public void setSegDetCriterias(Set<SegDetCriteria> segDetCriterias) {
        this.segDetCriterias = segDetCriterias;
    }
}

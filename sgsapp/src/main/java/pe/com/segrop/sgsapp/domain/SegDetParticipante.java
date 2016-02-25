package pe.com.segrop.sgsapp.domain;
// Generated 27-may-2012 20:47:48 by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * SegDetParticipante generated by hbm2java
 */
public class SegDetParticipante implements java.io.Serializable {

    private SegDetParticipanteId id;
    private SegDetCapacitacion segDetCapacitacion;
    private String VNombreCompleto;
    private String VNombres;
    private String VApellidos;
    private String VUsuCreacion;
    private Date DFecCreacion;
    private String VIpCreacion;
    private String VUsuModificacion;
    private Date DFecModificacion;
    private String VIpModificacion;

    public SegDetParticipante() {
        super();
    }

    public SegDetParticipante(SegDetParticipanteId id, SegDetCapacitacion segDetCapacitacion) {
        this.id = id;
        this.segDetCapacitacion = segDetCapacitacion;
    }

    public SegDetParticipante(SegDetParticipanteId id, SegDetCapacitacion segDetCapacitacion, String VNombreCompleto, String VNombres, String VApellidos, String VUsuCreacion, Date DFecCreacion, String VIpCreacion, String VUsuModificacion, Date DFecModificacion, String VIpModificacion) {
        this.id = id;
        this.segDetCapacitacion = segDetCapacitacion;
        this.VNombreCompleto = VNombreCompleto;
        this.VNombres = VNombres;
        this.VApellidos = VApellidos;
        this.VUsuCreacion = VUsuCreacion;
        this.DFecCreacion = DFecCreacion;
        this.VIpCreacion = VIpCreacion;
        this.VUsuModificacion = VUsuModificacion;
        this.DFecModificacion = DFecModificacion;
        this.VIpModificacion = VIpModificacion;
    }

    public SegDetParticipanteId getId() {
        return this.id;
    }

    public void setId(SegDetParticipanteId id) {
        this.id = id;
    }

    public SegDetCapacitacion getSegDetCapacitacion() {
        return this.segDetCapacitacion;
    }

    public void setSegDetCapacitacion(SegDetCapacitacion segDetCapacitacion) {
        this.segDetCapacitacion = segDetCapacitacion;
    }

    public String getVNombreCompleto() {
        return this.VNombreCompleto;
    }

    public void setVNombreCompleto(String VNombreCompleto) {
        this.VNombreCompleto = VNombreCompleto;
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

package pe.com.segrop.sgsapp.domain;
// Generated 27-mar-2012 23:44:26 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;

/**
 * SegDetRespuestaId generated by hbm2java
 */
public class SegDetRespuestaId implements java.io.Serializable {

    private BigDecimal NCodRespuesta;
    private BigDecimal NCodEmpresa;
    private BigDecimal NCodPregunta;
    private BigDecimal NCodInstelefonica;

    public SegDetRespuestaId() {
        super();
    }

    public SegDetRespuestaId(BigDecimal NCodRespuesta, BigDecimal NCodEmpresa, BigDecimal NCodPregunta, BigDecimal NCodInstelefonica) {
        this.NCodRespuesta = NCodRespuesta;
        this.NCodEmpresa = NCodEmpresa;
        this.NCodPregunta = NCodPregunta;
        this.NCodInstelefonica = NCodInstelefonica;
    }

    public BigDecimal getNCodRespuesta() {
        return this.NCodRespuesta;
    }

    public void setNCodRespuesta(BigDecimal NCodRespuesta) {
        this.NCodRespuesta = NCodRespuesta;
    }

    public BigDecimal getNCodEmpresa() {
        return this.NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public BigDecimal getNCodPregunta() {
        return this.NCodPregunta;
    }

    public void setNCodPregunta(BigDecimal NCodPregunta) {
        this.NCodPregunta = NCodPregunta;
    }

    public BigDecimal getNCodInstelefonica() {
        return this.NCodInstelefonica;
    }

    public void setNCodInstelefonica(BigDecimal NCodInstelefonica) {
        this.NCodInstelefonica = NCodInstelefonica;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SegDetRespuestaId)) {
            return false;
        }
        SegDetRespuestaId castOther = (SegDetRespuestaId) other;

        return ((this.getNCodRespuesta() == castOther.getNCodRespuesta()) || (this.getNCodRespuesta() != null && castOther.getNCodRespuesta() != null && this.getNCodRespuesta().equals(castOther.getNCodRespuesta())))
                && ((this.getNCodEmpresa() == castOther.getNCodEmpresa()) || (this.getNCodEmpresa() != null && castOther.getNCodEmpresa() != null && this.getNCodEmpresa().equals(castOther.getNCodEmpresa())))
                && ((this.getNCodPregunta() == castOther.getNCodPregunta()) || (this.getNCodPregunta() != null && castOther.getNCodPregunta() != null && this.getNCodPregunta().equals(castOther.getNCodPregunta())))
                && ((this.getNCodInstelefonica() == castOther.getNCodInstelefonica()) || (this.getNCodInstelefonica() != null && castOther.getNCodInstelefonica() != null && this.getNCodInstelefonica().equals(castOther.getNCodInstelefonica())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getNCodRespuesta() == null ? 0 : this.getNCodRespuesta().hashCode());
        result = 37 * result + (getNCodEmpresa() == null ? 0 : this.getNCodEmpresa().hashCode());
        result = 37 * result + (getNCodPregunta() == null ? 0 : this.getNCodPregunta().hashCode());
        result = 37 * result + (getNCodInstelefonica() == null ? 0 : this.getNCodInstelefonica().hashCode());
        return result;
    }
}

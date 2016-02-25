package pe.com.segrop.sgsapp.domain;
// Generated 16-mar-2012 2:45:34 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;

/**
 * SegRelPermisoId generated by hbm2java
 */
public class SegRelPermisoId implements java.io.Serializable {

    private BigDecimal NCodPerfil;
    private BigDecimal NCodObjeto;
    private BigDecimal NCodEmpresa;

    public SegRelPermisoId() {
        super();
    }

    public SegRelPermisoId(BigDecimal NCodPerfil, BigDecimal NCodObjeto, BigDecimal NCodEmpresa) {
        this.NCodPerfil = NCodPerfil;
        this.NCodObjeto = NCodObjeto;
        this.NCodEmpresa = NCodEmpresa;
    }

    public BigDecimal getNCodPerfil() {
        return this.NCodPerfil;
    }

    public void setNCodPerfil(BigDecimal NCodPerfil) {
        this.NCodPerfil = NCodPerfil;
    }

    public BigDecimal getNCodObjeto() {
        return this.NCodObjeto;
    }

    public void setNCodObjeto(BigDecimal NCodObjeto) {
        this.NCodObjeto = NCodObjeto;
    }

    public BigDecimal getNCodEmpresa() {
        return this.NCodEmpresa;
    }

    public void setNCodEmpresa(BigDecimal NCodEmpresa) {
        this.NCodEmpresa = NCodEmpresa;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SegRelPermisoId)) {
            return false;
        }
        SegRelPermisoId castOther = (SegRelPermisoId) other;

        return ((this.getNCodPerfil() == castOther.getNCodPerfil()) || (this.getNCodPerfil() != null && castOther.getNCodPerfil() != null && this.getNCodPerfil().equals(castOther.getNCodPerfil())))
                && ((this.getNCodObjeto() == castOther.getNCodObjeto()) || (this.getNCodObjeto() != null && castOther.getNCodObjeto() != null && this.getNCodObjeto().equals(castOther.getNCodObjeto())))
                && ((this.getNCodEmpresa() == castOther.getNCodEmpresa()) || (this.getNCodEmpresa() != null && castOther.getNCodEmpresa() != null && this.getNCodEmpresa().equals(castOther.getNCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getNCodPerfil() == null ? 0 : this.getNCodPerfil().hashCode());
        result = 37 * result + (getNCodObjeto() == null ? 0 : this.getNCodObjeto().hashCode());
        result = 37 * result + (getNCodEmpresa() == null ? 0 : this.getNCodEmpresa().hashCode());
        return result;
    }
}
package pe.com.segrop.sgsapp.domain;
// Generated 21-feb-2012 0:26:46 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;

/**
 * SegDetAreaId generated by hbm2java
 */
public class SegDetAreaId implements java.io.Serializable {

    private BigDecimal NCodArea;
    private BigDecimal NCodLocal;
    private BigDecimal NCodEmpresa;

    public SegDetAreaId() {
        super();
    }

    public SegDetAreaId(BigDecimal NCodArea, BigDecimal NCodLocal, BigDecimal NCodEmpresa) {
        this.NCodArea = NCodArea;
        this.NCodLocal = NCodLocal;
        this.NCodEmpresa = NCodEmpresa;
    }

    public BigDecimal getNCodArea() {
        return this.NCodArea;
    }

    public void setNCodArea(BigDecimal NCodArea) {
        this.NCodArea = NCodArea;
    }

    public BigDecimal getNCodLocal() {
        return this.NCodLocal;
    }

    public void setNCodLocal(BigDecimal NCodLocal) {
        this.NCodLocal = NCodLocal;
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
        if (!(other instanceof SegDetAreaId)) {
            return false;
        }
        SegDetAreaId castOther = (SegDetAreaId) other;

        return ((this.getNCodArea() == castOther.getNCodArea()) || (this.getNCodArea() != null && castOther.getNCodArea() != null && this.getNCodArea().equals(castOther.getNCodArea())))
                && ((this.getNCodLocal() == castOther.getNCodLocal()) || (this.getNCodLocal() != null && castOther.getNCodLocal() != null && this.getNCodLocal().equals(castOther.getNCodLocal())))
                && ((this.getNCodEmpresa() == castOther.getNCodEmpresa()) || (this.getNCodEmpresa() != null && castOther.getNCodEmpresa() != null && this.getNCodEmpresa().equals(castOther.getNCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getNCodArea() == null ? 0 : this.getNCodArea().hashCode());
        result = 37 * result + (getNCodLocal() == null ? 0 : this.getNCodLocal().hashCode());
        result = 37 * result + (getNCodEmpresa() == null ? 0 : this.getNCodEmpresa().hashCode());
        return result;
    }
}

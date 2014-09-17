/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PessoaRef.br;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="pessoa_ref")
public class PessoaRef implements Serializable{
 
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column 
    private String pessoareferencia;
    @Column 
    private String Apelido;
    @Column 
    private String Nome_mae;
    @Column 
    private String Nis_Ref;
    @Column 
    private String CPF;
    @Column 
    private String RG;
    @Column 
    private String orgao;
    @Column 
    private String UF;
    @Column 
    private String Data;
    // endereço
    @Column 
    private String Endereco;
    @Column 
    private String Bairro; 
    @Column 
    private String UF_endereco;
    @Column 
    private String CEP;
    @Column 
    private String Municipio;
    @Column 
    private String Complemento;
    @Column 
    private String Ponto_Ref;
    @Column 
    private String Telefone;
    @Column 
    private String LocDomicilio;
    @Column 
    private boolean EndAbrigo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPessoareferencia() {
        return pessoareferencia;
    }

    public void setPessoareferencia(String pessoareferencia) {
        this.pessoareferencia = pessoareferencia;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getNome_mae() {
        return Nome_mae;
    }

    public void setNome_mae(String Nome_mae) {
        this.Nome_mae = Nome_mae;
    }

    public String getNis_Ref() {
        return Nis_Ref;
    }

    public void setNis_Ref(String Nis_Ref) {
        this.Nis_Ref = Nis_Ref;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getUF_endereco() {
        return UF_endereco;
    }

    public void setUF_endereco(String UF_endereco) {
        this.UF_endereco = UF_endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getPonto_Ref() {
        return Ponto_Ref;
    }

    public void setPonto_Ref(String Ponto_Ref) {
        this.Ponto_Ref = Ponto_Ref;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getLocDomicilio() {
        return LocDomicilio;
    }

    public void setLocDomicilio(String LocDomicilio) {
        this.LocDomicilio = LocDomicilio;
    }

    public boolean isEndAbrigo() {
        return EndAbrigo;
    }

    public void setEndAbrigo(boolean EndAbrigo) {
        this.EndAbrigo = EndAbrigo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.pessoareferencia != null ? this.pessoareferencia.hashCode() : 0);
        hash = 29 * hash + (this.Apelido != null ? this.Apelido.hashCode() : 0);
        hash = 29 * hash + (this.Nome_mae != null ? this.Nome_mae.hashCode() : 0);
        hash = 29 * hash + (this.Nis_Ref != null ? this.Nis_Ref.hashCode() : 0);
        hash = 29 * hash + (this.CPF != null ? this.CPF.hashCode() : 0);
        hash = 29 * hash + (this.RG != null ? this.RG.hashCode() : 0);
        hash = 29 * hash + (this.orgao != null ? this.orgao.hashCode() : 0);
        hash = 29 * hash + (this.UF != null ? this.UF.hashCode() : 0);
        hash = 29 * hash + (this.Data != null ? this.Data.hashCode() : 0);
        hash = 29 * hash + (this.Endereco != null ? this.Endereco.hashCode() : 0);
        hash = 29 * hash + (this.Bairro != null ? this.Bairro.hashCode() : 0);
        hash = 29 * hash + (this.UF_endereco != null ? this.UF_endereco.hashCode() : 0);
        hash = 29 * hash + (this.CEP != null ? this.CEP.hashCode() : 0);
        hash = 29 * hash + (this.Municipio != null ? this.Municipio.hashCode() : 0);
        hash = 29 * hash + (this.Complemento != null ? this.Complemento.hashCode() : 0);
        hash = 29 * hash + (this.Ponto_Ref != null ? this.Ponto_Ref.hashCode() : 0);
        hash = 29 * hash + (this.Telefone != null ? this.Telefone.hashCode() : 0);
        hash = 29 * hash + (this.LocDomicilio != null ? this.LocDomicilio.hashCode() : 0);
        hash = 29 * hash + (this.EndAbrigo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaRef other = (PessoaRef) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.pessoareferencia == null) ? (other.pessoareferencia != null) : !this.pessoareferencia.equals(other.pessoareferencia)) {
            return false;
        }
        if ((this.Apelido == null) ? (other.Apelido != null) : !this.Apelido.equals(other.Apelido)) {
            return false;
        }
        if ((this.Nome_mae == null) ? (other.Nome_mae != null) : !this.Nome_mae.equals(other.Nome_mae)) {
            return false;
        }
        if ((this.Nis_Ref == null) ? (other.Nis_Ref != null) : !this.Nis_Ref.equals(other.Nis_Ref)) {
            return false;
        }
        if ((this.CPF == null) ? (other.CPF != null) : !this.CPF.equals(other.CPF)) {
            return false;
        }
        if ((this.RG == null) ? (other.RG != null) : !this.RG.equals(other.RG)) {
            return false;
        }
        if ((this.orgao == null) ? (other.orgao != null) : !this.orgao.equals(other.orgao)) {
            return false;
        }
        if ((this.UF == null) ? (other.UF != null) : !this.UF.equals(other.UF)) {
            return false;
        }
        if ((this.Data == null) ? (other.Data != null) : !this.Data.equals(other.Data)) {
            return false;
        }
        if ((this.Endereco == null) ? (other.Endereco != null) : !this.Endereco.equals(other.Endereco)) {
            return false;
        }
        if ((this.Bairro == null) ? (other.Bairro != null) : !this.Bairro.equals(other.Bairro)) {
            return false;
        }
        if ((this.UF_endereco == null) ? (other.UF_endereco != null) : !this.UF_endereco.equals(other.UF_endereco)) {
            return false;
        }
        if ((this.CEP == null) ? (other.CEP != null) : !this.CEP.equals(other.CEP)) {
            return false;
        }
        if ((this.Municipio == null) ? (other.Municipio != null) : !this.Municipio.equals(other.Municipio)) {
            return false;
        }
        if ((this.Complemento == null) ? (other.Complemento != null) : !this.Complemento.equals(other.Complemento)) {
            return false;
        }
        if ((this.Ponto_Ref == null) ? (other.Ponto_Ref != null) : !this.Ponto_Ref.equals(other.Ponto_Ref)) {
            return false;
        }
        if ((this.Telefone == null) ? (other.Telefone != null) : !this.Telefone.equals(other.Telefone)) {
            return false;
        }
        if ((this.LocDomicilio == null) ? (other.LocDomicilio != null) : !this.LocDomicilio.equals(other.LocDomicilio)) {
            return false;
        }
        if (this.EndAbrigo != other.EndAbrigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaRef{" + "id=" + id + ", pessoareferencia=" + pessoareferencia + ", Apelido=" + Apelido + ", Nome_mae=" + Nome_mae + ", Nis_Ref=" + Nis_Ref + ", CPF=" + CPF + ", RG=" + RG + ", orgao=" + orgao + ", UF=" + UF + ", Data=" + Data + ", Endereco=" + Endereco + ", Bairro=" + Bairro + ", UF_endereco=" + UF_endereco + ", CEP=" + CEP + ", Municipio=" + Municipio + ", Complemento=" + Complemento + ", Ponto_Ref=" + Ponto_Ref + ", Telefone=" + Telefone + ", LocDomicilio=" + LocDomicilio + ", EndAbrigo=" + EndAbrigo + '}';
    }

    


}

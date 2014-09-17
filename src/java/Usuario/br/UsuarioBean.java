/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.br;

import Util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sérgio
 */
@ManagedBean(name = "usuario")
@RequestScoped
public class UsuarioBean {

    private Usuario u;
    private UsuarioDAO dao;
    private String confirmaSenha;
    private String senha;
    private String usuario;
    private Session sessao;
    private Transaction transacao;
    

    // construtor para criar uma pessoa bean e a conexao com o dao.
    public UsuarioBean() {
        u = new Usuario();
        dao = new UsuarioDAO();

    }

    // validando o login pegando o valor digitado no campo e verificando se é igual ao que está no banco.
    public String validaLogin() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria cri = sessao.createCriteria(Usuario.class);
        cri.add(Restrictions.eq("usuario", getUsuario()));
        cri.add(Restrictions.eq("senha", getSenha()));
        List<Usuario> list = cri.list();

        if (list.size() > 0) {
            return "faces/Telaprincipal.xhtml";
        } else {
            return "Senhaincorreta_.xhtml";
        }

    }

    //metodo de salvar todos os dados com confirmação de senha.
    public String adicionarUsuario() {

        if (confirmaSenha.equals(u.getSenha())) {
            dao.adicionar(u);
        }

        return "index";
    }

    // gets e sets
    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenhas) {
        confirmaSenha = confirmaSenhas;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   

}

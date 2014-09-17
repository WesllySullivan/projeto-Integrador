/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PessoaRef.br;

import Util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sergio
 */
@ManagedBean(name = "pessoa_ref")
@RequestScoped
public class PessoaRefBean {

    private PessoaRef p;
    private PessoaRefDAO dao;
    private List<PessoaRef> list;
    private Session sessao;
    private Transaction transacao;

    // construtor para criar uma pessoa bean e a conexao com o dao.
    public PessoaRefBean() {
        p = new PessoaRef();
        dao = new PessoaRefDAO();

    }

    public String adcionarPessoaRef() {
     dao.adicionar(p);
     return "faces/Telaprincipal.xhtml";
        
    }
     
    public List listarPessoas(){
       sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria cri = sessao.createCriteria(PessoaRef.class);
        this.list = cri.list();
        return list;
    }

    
       
    //gets e sets
    public PessoaRef getP() {
        return p;
    }

    public void setP(PessoaRef p) {
        this.p = p;
    }

    public List<PessoaRef> getList() {
        return list;
    }

    public void setList(List<PessoaRef> list) {
        this.list = list;
    }

   

   

    
    
}

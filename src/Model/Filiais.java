/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "FILIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiais.findAll", query = "SELECT f FROM Filiais f"),
    @NamedQuery(name = "Filiais.findByCodempresa", query = "SELECT f FROM Filiais f WHERE f.codempresa = :codempresa"),
    @NamedQuery(name = "Filiais.findByNomeempresa", query = "SELECT f FROM Filiais f WHERE f.nomeempresa = :nomeempresa"),
    @NamedQuery(name = "Filiais.findByCgc", query = "SELECT f FROM Filiais f WHERE f.cgc = :cgc"),
    @NamedQuery(name = "Filiais.findByInscest", query = "SELECT f FROM Filiais f WHERE f.inscest = :inscest"),
    @NamedQuery(name = "Filiais.findByEndereco", query = "SELECT f FROM Filiais f WHERE f.endereco = :endereco"),
    @NamedQuery(name = "Filiais.findByBairro", query = "SELECT f FROM Filiais f WHERE f.bairro = :bairro"),
    @NamedQuery(name = "Filiais.findByCidade", query = "SELECT f FROM Filiais f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Filiais.findByEstado", query = "SELECT f FROM Filiais f WHERE f.estado = :estado"),
    @NamedQuery(name = "Filiais.findByCep", query = "SELECT f FROM Filiais f WHERE f.cep = :cep"),
    @NamedQuery(name = "Filiais.findByCodcidade", query = "SELECT f FROM Filiais f WHERE f.codcidade = :codcidade"),
    @NamedQuery(name = "Filiais.findByRazaosocial", query = "SELECT f FROM Filiais f WHERE f.razaosocial = :razaosocial"),
    @NamedQuery(name = "Filiais.findByTelefone", query = "SELECT f FROM Filiais f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Filiais.findByMascaractb", query = "SELECT f FROM Filiais f WHERE f.mascaractb = :mascaractb"),
    @NamedQuery(name = "Filiais.findByAbertoinicio", query = "SELECT f FROM Filiais f WHERE f.abertoinicio = :abertoinicio"),
    @NamedQuery(name = "Filiais.findByAbertofim", query = "SELECT f FROM Filiais f WHERE f.abertofim = :abertofim"),
    @NamedQuery(name = "Filiais.findByLancinicio", query = "SELECT f FROM Filiais f WHERE f.lancinicio = :lancinicio"),
    @NamedQuery(name = "Filiais.findByLancfim", query = "SELECT f FROM Filiais f WHERE f.lancfim = :lancfim"),
    @NamedQuery(name = "Filiais.findByNumeroap", query = "SELECT f FROM Filiais f WHERE f.numeroap = :numeroap"),
    @NamedQuery(name = "Filiais.findBySeriefiliais", query = "SELECT f FROM Filiais f WHERE f.seriefiliais = :seriefiliais"),
    @NamedQuery(name = "Filiais.findByAbertoinifisc", query = "SELECT f FROM Filiais f WHERE f.abertoinifisc = :abertoinifisc"),
    @NamedQuery(name = "Filiais.findByAbertofimfisc", query = "SELECT f FROM Filiais f WHERE f.abertofimfisc = :abertofimfisc"),
    @NamedQuery(name = "Filiais.findByEmail", query = "SELECT f FROM Filiais f WHERE f.email = :email"),
    @NamedQuery(name = "Filiais.findBySeriesintegra", query = "SELECT f FROM Filiais f WHERE f.seriesintegra = :seriesintegra"),
    @NamedQuery(name = "Filiais.findByUsaripi", query = "SELECT f FROM Filiais f WHERE f.usaripi = :usaripi"),
    @NamedQuery(name = "Filiais.findByEspecienf", query = "SELECT f FROM Filiais f WHERE f.especienf = :especienf"),
    @NamedQuery(name = "Filiais.findByPath", query = "SELECT f FROM Filiais f WHERE f.path = :path"),
    @NamedQuery(name = "Filiais.findBySeriesintegrad", query = "SELECT f FROM Filiais f WHERE f.seriesintegrad = :seriesintegrad"),
    @NamedQuery(name = "Filiais.findByRegistrojunta", query = "SELECT f FROM Filiais f WHERE f.registrojunta = :registrojunta"),
    @NamedQuery(name = "Filiais.findByOrdemlivroent", query = "SELECT f FROM Filiais f WHERE f.ordemlivroent = :ordemlivroent"),
    @NamedQuery(name = "Filiais.findByOrdemlivrosaida", query = "SELECT f FROM Filiais f WHERE f.ordemlivrosaida = :ordemlivrosaida"),
    @NamedQuery(name = "Filiais.findByOrdemlivroregicms", query = "SELECT f FROM Filiais f WHERE f.ordemlivroregicms = :ordemlivroregicms"),
    @NamedQuery(name = "Filiais.findByOrdemdiario", query = "SELECT f FROM Filiais f WHERE f.ordemdiario = :ordemdiario"),
    @NamedQuery(name = "Filiais.findByOrdemrazao", query = "SELECT f FROM Filiais f WHERE f.ordemrazao = :ordemrazao"),
    @NamedQuery(name = "Filiais.findByContador", query = "SELECT f FROM Filiais f WHERE f.contador = :contador"),
    @NamedQuery(name = "Filiais.findByCrc", query = "SELECT f FROM Filiais f WHERE f.crc = :crc"),
    @NamedQuery(name = "Filiais.findByInscmunicipal", query = "SELECT f FROM Filiais f WHERE f.inscmunicipal = :inscmunicipal"),
    @NamedQuery(name = "Filiais.findByOrdemlivroentserv", query = "SELECT f FROM Filiais f WHERE f.ordemlivroentserv = :ordemlivroentserv"),
    @NamedQuery(name = "Filiais.findByFilialativa", query = "SELECT f FROM Filiais f WHERE f.filialativa = :filialativa"),
    @NamedQuery(name = "Filiais.findByCodmunicipio", query = "SELECT f FROM Filiais f WHERE f.codmunicipio = :codmunicipio"),
    @NamedQuery(name = "Filiais.findByNire", query = "SELECT f FROM Filiais f WHERE f.nire = :nire"),
    @NamedQuery(name = "Filiais.findBySocioprincipal", query = "SELECT f FROM Filiais f WHERE f.socioprincipal = :socioprincipal"),
    @NamedQuery(name = "Filiais.findByCpfprincipal", query = "SELECT f FROM Filiais f WHERE f.cpfprincipal = :cpfprincipal"),
    @NamedQuery(name = "Filiais.findByNomecontadorprincipal", query = "SELECT f FROM Filiais f WHERE f.nomecontadorprincipal = :nomecontadorprincipal"),
    @NamedQuery(name = "Filiais.findByCrcprincipal", query = "SELECT f FROM Filiais f WHERE f.crcprincipal = :crcprincipal"),
    @NamedQuery(name = "Filiais.findByGeraarqecf", query = "SELECT f FROM Filiais f WHERE f.geraarqecf = :geraarqecf"),
    @NamedQuery(name = "Filiais.findByCaminhotxtecf", query = "SELECT f FROM Filiais f WHERE f.caminhotxtecf = :caminhotxtecf"),
    @NamedQuery(name = "Filiais.findByNumero", query = "SELECT f FROM Filiais f WHERE f.numero = :numero"),
    @NamedQuery(name = "Filiais.findByComplemento", query = "SELECT f FROM Filiais f WHERE f.complemento = :complemento"),
    @NamedQuery(name = "Filiais.findByCodcnae", query = "SELECT f FROM Filiais f WHERE f.codcnae = :codcnae"),
    @NamedQuery(name = "Filiais.findBySeriefiliaisservico", query = "SELECT f FROM Filiais f WHERE f.seriefiliaisservico = :seriefiliaisservico"),
    @NamedQuery(name = "Filiais.findByCodcaps", query = "SELECT f FROM Filiais f WHERE f.codcaps = :codcaps"),
    @NamedQuery(name = "Filiais.findByCfopnotaseried", query = "SELECT f FROM Filiais f WHERE f.cfopnotaseried = :cfopnotaseried"),
    @NamedQuery(name = "Filiais.findBySigla", query = "SELECT f FROM Filiais f WHERE f.sigla = :sigla"),
    @NamedQuery(name = "Filiais.findByFax", query = "SELECT f FROM Filiais f WHERE f.fax = :fax"),
    @NamedQuery(name = "Filiais.findByCpfcontador", query = "SELECT f FROM Filiais f WHERE f.cpfcontador = :cpfcontador"),
    @NamedQuery(name = "Filiais.findByCnpjcontador", query = "SELECT f FROM Filiais f WHERE f.cnpjcontador = :cnpjcontador"),
    @NamedQuery(name = "Filiais.findByCepcontador", query = "SELECT f FROM Filiais f WHERE f.cepcontador = :cepcontador"),
    @NamedQuery(name = "Filiais.findByEnderecocontador", query = "SELECT f FROM Filiais f WHERE f.enderecocontador = :enderecocontador"),
    @NamedQuery(name = "Filiais.findByNumendcontador", query = "SELECT f FROM Filiais f WHERE f.numendcontador = :numendcontador"),
    @NamedQuery(name = "Filiais.findByComplendcontador", query = "SELECT f FROM Filiais f WHERE f.complendcontador = :complendcontador"),
    @NamedQuery(name = "Filiais.findByBairrocontador", query = "SELECT f FROM Filiais f WHERE f.bairrocontador = :bairrocontador"),
    @NamedQuery(name = "Filiais.findByFonecontador", query = "SELECT f FROM Filiais f WHERE f.fonecontador = :fonecontador"),
    @NamedQuery(name = "Filiais.findByFaxcontador", query = "SELECT f FROM Filiais f WHERE f.faxcontador = :faxcontador"),
    @NamedQuery(name = "Filiais.findByEmailcontador", query = "SELECT f FROM Filiais f WHERE f.emailcontador = :emailcontador"),
    @NamedQuery(name = "Filiais.findByCodcidadecontador", query = "SELECT f FROM Filiais f WHERE f.codcidadecontador = :codcidadecontador"),
    @NamedQuery(name = "Filiais.findByCodFilialJava", query = "SELECT f FROM Filiais f WHERE f.codFilialJava = :codFilialJava"),
    @NamedQuery(name = "Filiais.findByContaredutesouraria", query = "SELECT f FROM Filiais f WHERE f.contaredutesouraria = :contaredutesouraria"),
    @NamedQuery(name = "Filiais.findByRegimetributario", query = "SELECT f FROM Filiais f WHERE f.regimetributario = :regimetributario"),
    @NamedQuery(name = "Filiais.findByFormaapuracaolpresumido", query = "SELECT f FROM Filiais f WHERE f.formaapuracaolpresumido = :formaapuracaolpresumido"),
    @NamedQuery(name = "Filiais.findByVersion", query = "SELECT f FROM Filiais f WHERE f.version = :version"),
    @NamedQuery(name = "Filiais.findByIdfilialjava", query = "SELECT f FROM Filiais f WHERE f.idfilialjava = :idfilialjava"),
    @NamedQuery(name = "Filiais.findByIndexigibilidadeiss", query = "SELECT f FROM Filiais f WHERE f.indexigibilidadeiss = :indexigibilidadeiss"),
    @NamedQuery(name = "Filiais.findByIndincentivofiscal", query = "SELECT f FROM Filiais f WHERE f.indincentivofiscal = :indincentivofiscal"),
    @NamedQuery(name = "Filiais.findBySequencialcrc", query = "SELECT f FROM Filiais f WHERE f.sequencialcrc = :sequencialcrc"),
    @NamedQuery(name = "Filiais.findByDatavalidadecrc", query = "SELECT f FROM Filiais f WHERE f.datavalidadecrc = :datavalidadecrc"),
    @NamedQuery(name = "Filiais.findByOrdemlmc", query = "SELECT f FROM Filiais f WHERE f.ordemlmc = :ordemlmc")})
public class Filiais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODEMPRESA")
    private String codempresa;
    @Column(name = "NOMEEMPRESA")
    private String nomeempresa;
    @Column(name = "CGC")
    private String cgc;
    @Column(name = "INSCEST")
    private String inscest;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "CODCIDADE")
    private String codcidade;
    @Column(name = "RAZAOSOCIAL")
    private String razaosocial;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "MASCARACTB")
    private String mascaractb;
    @Column(name = "ABERTOINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abertoinicio;
    @Column(name = "ABERTOFIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abertofim;
    @Column(name = "LANCINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lancinicio;
    @Column(name = "LANCFIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lancfim;
    @Column(name = "NUMEROAP")
    private String numeroap;
    @Lob
    @Column(name = "DEMONSTRARESUCXA")
    private String demonstraresucxa;
    @Column(name = "SERIEFILIAIS")
    private String seriefiliais;
    @Column(name = "ABERTOINIFISC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abertoinifisc;
    @Column(name = "ABERTOFIMFISC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abertofimfisc;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SERIESINTEGRA")
    private String seriesintegra;
    @Column(name = "USARIPI")
    private String usaripi;
    @Column(name = "ESPECIENF")
    private String especienf;
    @Column(name = "PATH")
    private String path;
    @Column(name = "SERIESINTEGRAD")
    private String seriesintegrad;
    @Column(name = "REGISTROJUNTA")
    private String registrojunta;
    @Column(name = "ORDEMLIVROENT")
    private Integer ordemlivroent;
    @Column(name = "ORDEMLIVROSAIDA")
    private Integer ordemlivrosaida;
    @Column(name = "ORDEMLIVROREGICMS")
    private Integer ordemlivroregicms;
    @Column(name = "ORDEMDIARIO")
    private Integer ordemdiario;
    @Column(name = "ORDEMRAZAO")
    private Integer ordemrazao;
    @Column(name = "CONTADOR")
    private String contador;
    @Column(name = "CRC")
    private String crc;
    @Column(name = "INSCMUNICIPAL")
    private String inscmunicipal;
    @Column(name = "ORDEMLIVROENTSERV")
    private Integer ordemlivroentserv;
    @Lob
    @Column(name = "OBSERVACAONF")
    private String observacaonf;
    @Lob
    @Column(name = "DADOSADICNF")
    private String dadosadicnf;
    @Column(name = "FILIALATIVA")
    private String filialativa;
    @Column(name = "CODMUNICIPIO")
    private String codmunicipio;
    @Column(name = "NIRE")
    private String nire;
    @Column(name = "SOCIOPRINCIPAL")
    private String socioprincipal;
    @Column(name = "CPFPRINCIPAL")
    private String cpfprincipal;
    @Column(name = "NOMECONTADORPRINCIPAL")
    private String nomecontadorprincipal;
    @Column(name = "CRCPRINCIPAL")
    private String crcprincipal;
    @Column(name = "GERAARQECF")
    private String geraarqecf;
    @Column(name = "CAMINHOTXTECF")
    private String caminhotxtecf;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "CODCNAE")
    private String codcnae;
    @Lob
    @Column(name = "LOGOFILIAL")
    private byte[] logofilial;
    @Column(name = "SERIEFILIAISSERVICO")
    private String seriefiliaisservico;
    @Column(name = "CODCAPS")
    private Integer codcaps;
    @Column(name = "CFOPNOTASERIED")
    private String cfopnotaseried;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "CPFCONTADOR")
    private String cpfcontador;
    @Column(name = "CNPJCONTADOR")
    private String cnpjcontador;
    @Column(name = "CEPCONTADOR")
    private String cepcontador;
    @Column(name = "ENDERECOCONTADOR")
    private String enderecocontador;
    @Column(name = "NUMENDCONTADOR")
    private String numendcontador;
    @Column(name = "COMPLENDCONTADOR")
    private String complendcontador;
    @Column(name = "BAIRROCONTADOR")
    private String bairrocontador;
    @Column(name = "FONECONTADOR")
    private String fonecontador;
    @Column(name = "FAXCONTADOR")
    private String faxcontador;
    @Column(name = "EMAILCONTADOR")
    private String emailcontador;
    @Column(name = "CODCIDADECONTADOR")
    private String codcidadecontador;
    @Lob
    @Column(name = "DEMONSTRARESU")
    private String demonstraresu;
    @Column(name = "COD_FILIAL_JAVA")
    private String codFilialJava;
    @Column(name = "CONTAREDUTESOURARIA")
    private Integer contaredutesouraria;
    @Column(name = "REGIMETRIBUTARIO")
    private String regimetributario;
    @Column(name = "FORMAAPURACAOLPRESUMIDO")
    private Integer formaapuracaolpresumido;
    @Column(name = "VERSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date version;
    @Column(name = "IDFILIALJAVA")
    private Integer idfilialjava;
    @Column(name = "INDEXIGIBILIDADEISS")
    private String indexigibilidadeiss;
    @Column(name = "INDINCENTIVOFISCAL")
    private String indincentivofiscal;
    @Column(name = "SEQUENCIALCRC")
    private String sequencialcrc;
    @Column(name = "DATAVALIDADECRC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datavalidadecrc;
    @Column(name = "ORDEMLMC")
    private Integer ordemlmc;

    public Filiais() {
    }

    public Filiais(String codempresa) {
        this.codempresa = codempresa;
    }

    public String getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(String codempresa) {
        this.codempresa = codempresa;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getInscest() {
        return inscest;
    }

    public void setInscest(String inscest) {
        this.inscest = inscest;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(String codcidade) {
        this.codcidade = codcidade;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMascaractb() {
        return mascaractb;
    }

    public void setMascaractb(String mascaractb) {
        this.mascaractb = mascaractb;
    }

    public Date getAbertoinicio() {
        return abertoinicio;
    }

    public void setAbertoinicio(Date abertoinicio) {
        this.abertoinicio = abertoinicio;
    }

    public Date getAbertofim() {
        return abertofim;
    }

    public void setAbertofim(Date abertofim) {
        this.abertofim = abertofim;
    }

    public Date getLancinicio() {
        return lancinicio;
    }

    public void setLancinicio(Date lancinicio) {
        this.lancinicio = lancinicio;
    }

    public Date getLancfim() {
        return lancfim;
    }

    public void setLancfim(Date lancfim) {
        this.lancfim = lancfim;
    }

    public String getNumeroap() {
        return numeroap;
    }

    public void setNumeroap(String numeroap) {
        this.numeroap = numeroap;
    }

    public String getDemonstraresucxa() {
        return demonstraresucxa;
    }

    public void setDemonstraresucxa(String demonstraresucxa) {
        this.demonstraresucxa = demonstraresucxa;
    }

    public String getSeriefiliais() {
        return seriefiliais;
    }

    public void setSeriefiliais(String seriefiliais) {
        this.seriefiliais = seriefiliais;
    }

    public Date getAbertoinifisc() {
        return abertoinifisc;
    }

    public void setAbertoinifisc(Date abertoinifisc) {
        this.abertoinifisc = abertoinifisc;
    }

    public Date getAbertofimfisc() {
        return abertofimfisc;
    }

    public void setAbertofimfisc(Date abertofimfisc) {
        this.abertofimfisc = abertofimfisc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeriesintegra() {
        return seriesintegra;
    }

    public void setSeriesintegra(String seriesintegra) {
        this.seriesintegra = seriesintegra;
    }

    public String getUsaripi() {
        return usaripi;
    }

    public void setUsaripi(String usaripi) {
        this.usaripi = usaripi;
    }

    public String getEspecienf() {
        return especienf;
    }

    public void setEspecienf(String especienf) {
        this.especienf = especienf;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSeriesintegrad() {
        return seriesintegrad;
    }

    public void setSeriesintegrad(String seriesintegrad) {
        this.seriesintegrad = seriesintegrad;
    }

    public String getRegistrojunta() {
        return registrojunta;
    }

    public void setRegistrojunta(String registrojunta) {
        this.registrojunta = registrojunta;
    }

    public Integer getOrdemlivroent() {
        return ordemlivroent;
    }

    public void setOrdemlivroent(Integer ordemlivroent) {
        this.ordemlivroent = ordemlivroent;
    }

    public Integer getOrdemlivrosaida() {
        return ordemlivrosaida;
    }

    public void setOrdemlivrosaida(Integer ordemlivrosaida) {
        this.ordemlivrosaida = ordemlivrosaida;
    }

    public Integer getOrdemlivroregicms() {
        return ordemlivroregicms;
    }

    public void setOrdemlivroregicms(Integer ordemlivroregicms) {
        this.ordemlivroregicms = ordemlivroregicms;
    }

    public Integer getOrdemdiario() {
        return ordemdiario;
    }

    public void setOrdemdiario(Integer ordemdiario) {
        this.ordemdiario = ordemdiario;
    }

    public Integer getOrdemrazao() {
        return ordemrazao;
    }

    public void setOrdemrazao(Integer ordemrazao) {
        this.ordemrazao = ordemrazao;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getInscmunicipal() {
        return inscmunicipal;
    }

    public void setInscmunicipal(String inscmunicipal) {
        this.inscmunicipal = inscmunicipal;
    }

    public Integer getOrdemlivroentserv() {
        return ordemlivroentserv;
    }

    public void setOrdemlivroentserv(Integer ordemlivroentserv) {
        this.ordemlivroentserv = ordemlivroentserv;
    }

    public String getObservacaonf() {
        return observacaonf;
    }

    public void setObservacaonf(String observacaonf) {
        this.observacaonf = observacaonf;
    }

    public String getDadosadicnf() {
        return dadosadicnf;
    }

    public void setDadosadicnf(String dadosadicnf) {
        this.dadosadicnf = dadosadicnf;
    }

    public String getFilialativa() {
        return filialativa;
    }

    public void setFilialativa(String filialativa) {
        this.filialativa = filialativa;
    }

    public String getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public String getSocioprincipal() {
        return socioprincipal;
    }

    public void setSocioprincipal(String socioprincipal) {
        this.socioprincipal = socioprincipal;
    }

    public String getCpfprincipal() {
        return cpfprincipal;
    }

    public void setCpfprincipal(String cpfprincipal) {
        this.cpfprincipal = cpfprincipal;
    }

    public String getNomecontadorprincipal() {
        return nomecontadorprincipal;
    }

    public void setNomecontadorprincipal(String nomecontadorprincipal) {
        this.nomecontadorprincipal = nomecontadorprincipal;
    }

    public String getCrcprincipal() {
        return crcprincipal;
    }

    public void setCrcprincipal(String crcprincipal) {
        this.crcprincipal = crcprincipal;
    }

    public String getGeraarqecf() {
        return geraarqecf;
    }

    public void setGeraarqecf(String geraarqecf) {
        this.geraarqecf = geraarqecf;
    }

    public String getCaminhotxtecf() {
        return caminhotxtecf;
    }

    public void setCaminhotxtecf(String caminhotxtecf) {
        this.caminhotxtecf = caminhotxtecf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCodcnae() {
        return codcnae;
    }

    public void setCodcnae(String codcnae) {
        this.codcnae = codcnae;
    }

    public byte[] getLogofilial() {
        return logofilial;
    }

    public void setLogofilial(byte[] logofilial) {
        this.logofilial = logofilial;
    }

    public String getSeriefiliaisservico() {
        return seriefiliaisservico;
    }

    public void setSeriefiliaisservico(String seriefiliaisservico) {
        this.seriefiliaisservico = seriefiliaisservico;
    }

    public Integer getCodcaps() {
        return codcaps;
    }

    public void setCodcaps(Integer codcaps) {
        this.codcaps = codcaps;
    }

    public String getCfopnotaseried() {
        return cfopnotaseried;
    }

    public void setCfopnotaseried(String cfopnotaseried) {
        this.cfopnotaseried = cfopnotaseried;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCpfcontador() {
        return cpfcontador;
    }

    public void setCpfcontador(String cpfcontador) {
        this.cpfcontador = cpfcontador;
    }

    public String getCnpjcontador() {
        return cnpjcontador;
    }

    public void setCnpjcontador(String cnpjcontador) {
        this.cnpjcontador = cnpjcontador;
    }

    public String getCepcontador() {
        return cepcontador;
    }

    public void setCepcontador(String cepcontador) {
        this.cepcontador = cepcontador;
    }

    public String getEnderecocontador() {
        return enderecocontador;
    }

    public void setEnderecocontador(String enderecocontador) {
        this.enderecocontador = enderecocontador;
    }

    public String getNumendcontador() {
        return numendcontador;
    }

    public void setNumendcontador(String numendcontador) {
        this.numendcontador = numendcontador;
    }

    public String getComplendcontador() {
        return complendcontador;
    }

    public void setComplendcontador(String complendcontador) {
        this.complendcontador = complendcontador;
    }

    public String getBairrocontador() {
        return bairrocontador;
    }

    public void setBairrocontador(String bairrocontador) {
        this.bairrocontador = bairrocontador;
    }

    public String getFonecontador() {
        return fonecontador;
    }

    public void setFonecontador(String fonecontador) {
        this.fonecontador = fonecontador;
    }

    public String getFaxcontador() {
        return faxcontador;
    }

    public void setFaxcontador(String faxcontador) {
        this.faxcontador = faxcontador;
    }

    public String getEmailcontador() {
        return emailcontador;
    }

    public void setEmailcontador(String emailcontador) {
        this.emailcontador = emailcontador;
    }

    public String getCodcidadecontador() {
        return codcidadecontador;
    }

    public void setCodcidadecontador(String codcidadecontador) {
        this.codcidadecontador = codcidadecontador;
    }

    public String getDemonstraresu() {
        return demonstraresu;
    }

    public void setDemonstraresu(String demonstraresu) {
        this.demonstraresu = demonstraresu;
    }

    public String getCodFilialJava() {
        return codFilialJava;
    }

    public void setCodFilialJava(String codFilialJava) {
        this.codFilialJava = codFilialJava;
    }

    public Integer getContaredutesouraria() {
        return contaredutesouraria;
    }

    public void setContaredutesouraria(Integer contaredutesouraria) {
        this.contaredutesouraria = contaredutesouraria;
    }

    public String getRegimetributario() {
        return regimetributario;
    }

    public void setRegimetributario(String regimetributario) {
        this.regimetributario = regimetributario;
    }

    public Integer getFormaapuracaolpresumido() {
        return formaapuracaolpresumido;
    }

    public void setFormaapuracaolpresumido(Integer formaapuracaolpresumido) {
        this.formaapuracaolpresumido = formaapuracaolpresumido;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public Integer getIdfilialjava() {
        return idfilialjava;
    }

    public void setIdfilialjava(Integer idfilialjava) {
        this.idfilialjava = idfilialjava;
    }

    public String getIndexigibilidadeiss() {
        return indexigibilidadeiss;
    }

    public void setIndexigibilidadeiss(String indexigibilidadeiss) {
        this.indexigibilidadeiss = indexigibilidadeiss;
    }

    public String getIndincentivofiscal() {
        return indincentivofiscal;
    }

    public void setIndincentivofiscal(String indincentivofiscal) {
        this.indincentivofiscal = indincentivofiscal;
    }

    public String getSequencialcrc() {
        return sequencialcrc;
    }

    public void setSequencialcrc(String sequencialcrc) {
        this.sequencialcrc = sequencialcrc;
    }

    public Date getDatavalidadecrc() {
        return datavalidadecrc;
    }

    public void setDatavalidadecrc(Date datavalidadecrc) {
        this.datavalidadecrc = datavalidadecrc;
    }

    public Integer getOrdemlmc() {
        return ordemlmc;
    }

    public void setOrdemlmc(Integer ordemlmc) {
        this.ordemlmc = ordemlmc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codempresa != null ? codempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiais)) {
            return false;
        }
        Filiais other = (Filiais) object;
        if ((this.codempresa == null && other.codempresa != null) || (this.codempresa != null && !this.codempresa.equals(other.codempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Filiais[ codempresa=" + codempresa + " ]";
    }
    
}

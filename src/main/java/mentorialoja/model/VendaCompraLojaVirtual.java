package mentorialoja.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "vd_cp_loja_virt")
@SequenceGenerator(name = "seq_vd_cp_loja_virt", sequenceName = "seq_vd_cp_loja_virt", allocationSize = 1, initialValue = 1)
public class VendaCompraLojaVirtual {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vd_cp_loja_virt")
	private Long id;
	
	
    @ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false,
	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;
	
    @ManyToOne
  	@JoinColumn(name = "endereco_entrega_id", nullable = false,
  	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_entrega_fk"))
  	private Endereco enderecoEntrega;
	
    @ManyToOne
  	@JoinColumn(name = "endereco_cobranca_id", nullable = false,
  	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_cobranca_fk"))
  	private Endereco enderecoCobranca;
	
	@OneToOne
  	@JoinColumn(name = "nota_fiscal_venda_id", nullable = false,
  	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_fk"))
    private NotaFiscalVenda NotaFiscalvenda;
	
	 @ManyToOne
	 @JoinColumn(name = "cupom_desc_id",
	 foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cupom_desc_fk"))
	 private CupDesc cupDesc;
	 
	 @Column(nullable = false)
     private BigDecimal valorFret;
	 
	 @Column(nullable = false)
	 private Integer diaEntrega;
	 
	 @Column(nullable = false)
	 private Date dataVenda;

	 @Temporal(TemporalType.DATE)
	 private Date dataEntrega;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(Endereco enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public NotaFiscalVenda getNotaFiscalvenda() {
		return NotaFiscalvenda;
	}

	public void setNotaFiscalvenda(NotaFiscalVenda notaFiscalvenda) {
		NotaFiscalvenda = notaFiscalvenda;
	}

	public CupDesc getCupDesc() {
		return cupDesc;
	}

	public void setCupDesc(CupDesc cupDesc) {
		this.cupDesc = cupDesc;
	}

	public BigDecimal getValorFret() {
		return valorFret;
	}

	public void setValorFret(BigDecimal valorFret) {
		this.valorFret = valorFret;
	}

	public Integer getDiaEntrega() {
		return diaEntrega;
	}

	public void setDiaEntrega(Integer diaEntrega) {
		this.diaEntrega = diaEntrega;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	 public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendaCompraLojaVirtual other = (VendaCompraLojaVirtual) obj;
		return Objects.equals(id, other.id);
	}
	 
	 
	 
	 
	 
	  
}

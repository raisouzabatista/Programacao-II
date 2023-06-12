package Entity;



public class Rastreio {
    
private String nome; 
private int quantidade; 
private Double preco; 
private String endereco; 
private int idpessoa; 
private int iditem;
private int idrastreio; 
private String nomeitem;





public String getNomeItem() {
    return nomeitem;
}
public void setNomeItem(String nomeItem) {
    this.nomeitem = nomeItem;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getQuantidade() {
    return quantidade;
}
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
public Double getPreco() {
    return preco;
}
public void setPreco(Double preco) {
    this.preco = preco;
}

public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public int getIdPessoa() {
    return idpessoa;
}
public void setIdPessoa(int idPessoa) {
    this.idpessoa = idPessoa;
}

public Double valorTotal(){
    Double total = this.quantidade * this.preco;
    return total;
}
public int getIdItem() {
    return iditem;
}
public void setIdItem(int idItem) {
    this.iditem = idItem;
}
public Rastreio(String nome, int quantidade, Double preco, String endereco, String nomeIt, int idPessoa, int iditem) {

    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  this.idpessoa = idPessoa; 
    this.endereco = endereco;
 this.iditem = iditem;
    this.nomeitem = nomeIt; 


} 

 
public Rastreio (){
    //só pra testes

} 
public int getIdRastreio() {
    return idrastreio;
}
public void setIdRastreio(int idRastreio) {
    this.idrastreio = idRastreio;
}



}

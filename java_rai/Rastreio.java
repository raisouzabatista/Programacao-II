public class Rastreio {
    
private String nome; 
private int quantidade; 
private Double preco; 
private String status; 
private String endereco; 
private int idPessoa; 
private int idItem;
private int idRastreio; 
private String nomeItem;





public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public String getNomeItem() {
    return nomeItem;
}
public void setNomeItem(String nomeItem) {
    this.nomeItem = nomeItem;
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
    return idPessoa;
}
public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
}

public Double valorTotal(){
    Double total = this.quantidade * this.preco;
    return total;
}
public int getIdItem() {
    return idItem;
}
public void setIdItem(int idItem) {
    this.idItem = idItem;
}
public Rastreio(String nome, int quantidade, Double preco, String endereco, String nomeIt, int idPessoa, int idItem, int idRastrear) {

    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
    this.status = "Pedido realizado";
    this.endereco = endereco;
    this.idPessoa = idPessoa;
    this.idItem = idItem;
    this.idRastreio = idRastrear; 
    this.nomeItem =nomeIt; 


} 

 
public Rastreio (){
    //só pra testes

} 
public int getIdRastreio() {
    return idRastreio;
}
public void setIdRastreio(int idRastreio) {
    this.idRastreio = idRastreio;
}



}

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static int IdArmazem = 0;
    public static int idProduto = 0;
    public static int idPessoa = 0;
    public static int idRastreio = 0; 
  
    public static ArrayList<Inventario> lista = new ArrayList<Inventario>();
    public static ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
    public static ArrayList<Rastreio> listaR = new ArrayList<Rastreio>(); 


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Inventario ajuda = new Inventario();
        Pessoa ajudaP = new Pessoa();
        Rastreio ajudaR = new Rastreio();
        

        int opcaoM = 0;
        do {

            System.out.println("1 - Armazém ");
            System.out.println("2 - Comprador ");
            opcaoM = ler.nextInt();
            switch (opcaoM) {
                case 1: // armazém
                    int opcaoA = 0;

                    System.out.println("1 - controle de inventário");
                    System.out.println("2 - pedidos");
                    System.out.println("3 - alertas de estoque ");
                    opcaoA = ler.nextInt();
                    switch (opcaoA) {
                        case 1:
                            // controle de invetário

                            int opcaoI = 0;
                            System.out.println("1 - entrar no estoque");
                            System.out.println("2 - adicionar item");
                            opcaoI = ler.nextInt();
                            switch (opcaoI) {
                                case 1:
                                    // entrar no estoque

                                    System.out.println("Lista de itens: ");
                                    for (Inventario ver : lista) {
                                        System.out.println(
                                                "Nome: " + ver.getItem() + "\nQuantidade: " + ver.getQuantidade()
                                                        + "\nPreço: " + ver.getPreco() + "\nId: " + ver.getId() + "\n");

                                    }
                                    break;
                                case 2:
                                    // adicionar item
                                    System.out.println("Digite o nome do item:");
                                    ler.nextLine();
                                    String nome = ler.nextLine();
                                    System.out.println("Digite a quantidade a ser adicionada:");
                                    int quant = ler.nextInt();
                                    System.out.println("Digite o preço de cada item: ");
                                    Double preco = ler.nextDouble();

                                    Inventario obj = new Inventario(nome, quant, preco, idProduto);
                                    lista.add(obj);
                                    idProduto++;
                                    System.out.println("Produto adicionado com sucesso\n");

                                    break;
                                default:
                                    System.out.println("Opção invalida\n");
                                    // caso clique no errado
                                    break;
                            }

                            break;
                        case 2:
                            // rastreamento de pedido


                            for (Rastreio ras : listaR) {
                                System.out.println("\nNome cliente: "+ras.getNome()+"\nEndereço: "+ ras.getEndereco()+"\nId pessoa: "+ras.getIdPessoa()+"\n///////////////\n"+"\nNome item: "+ras.getNomeItem()+"\nQuantidade de itens pedidos: "+ras.getQuantidade()+"\nValor total do pedido: "+ras.valorTotal()+"\nId item no armazém: "+ras.getIdItem()+"\n/////////////\n"+"\nStatus do pedido: "+ras.getStatus()+"\nId de rastreio:"+ras.getIdRastreio()+"\n");
                                
                            }
                            break;
                        case 3:
                            // alertas do estoque
                            for (Inventario inv : lista) {
                                if(inv.getQuantiadePrimaria()> 8*inv.getQuantidade()){
                                    System.out.println("Produto: "+inv.getItem()+" com baixo estoque"+"\n quantidade atual:"+ inv.getQuantidade()+"\nQuantidade quando foi adicionada: "+ inv.getQuantiadePrimaria()+"\n");
                                }
                            }
                       
                            break;
                        
                        default:
                            System.out.println("opção invalida\n");
                            // caso clique errado
                            break;
                    }

                    break;
                case 2:
                    // usuario comum
                    int opcaoU = 0;
                    System.out.println("1 - fazer pedido");
                    System.out.println("2 - rastrear pedido");
                    System.out.println("3 - se cadastrar");
                    System.out.println("4 - lista de pessoas");
                    opcaoU = ler.nextInt();
                    switch (opcaoU) {
                        case 1:
                            // fazer pedido
                            System.out.println("Digite o seu id de usuario");
                            int idu = ler.nextInt();

                            boolean testePessoa = ajudaP.verIdPessoa(listaP, idu);
                            if (testePessoa == true) {
                                 String nomeP = listaP.get(idu).getNome();
                                 String ende = listaP.get(idu).getEndereco();



                                System.out.println("Lista de itens: ");
                                for (Inventario inv : lista) {
                                    System.out.println("Nome: " + inv.getItem() + "\nQuantidade: " + inv.getQuantidade()
                                            + "\nPreço: " + inv.getPreco() + "\nId: " + inv.getId() + "\n");

                                }
                                System.out.println("Digite o id do item requerido: ");
                                int idp = ler.nextInt();
                                boolean teste = ajuda.verId(lista, idp);
                                if (teste == true) {

                                    Double precoI = lista.get(idp).getPreco();
                                    String nomeI = lista.get(idp).getItem();




                                    System.out.println("Digite a quantidade de itens");
                                    int quantp = ler.nextInt();
                                    int quantiNoId = lista.get(idp).getQuantidade();
                                    if (quantiNoId >= quantp) {
                                        int subtrair = (quantiNoId - quantp);
                                        lista.get(idp).setQuantidade(subtrair);

                                        System.out.println("pedido feito com sucesso\n");

                                        Rastreio objRastreio = new Rastreio(nomeP, quantiNoId, precoI, ende, nomeI, idu, idp, idRastreio );
                                        listaR.add(objRastreio);
                                        idRastreio++; 




                                    }

                                } else {
                                    System.out.println("Id não encontrado\n");
                                }
                            } else {
                                System.out.println("Id de usuário errado\n");
                            }

                            break;
                        case 2:
                            // rastrear pedido

                            break;
                        case 3:
                            // cadastrar pessoa
                            System.out.println("Digite seu nome: ");
                            ler.nextLine();
                            String nome = ler.nextLine();
                            System.out.println("Digite seu endereço: ");
                            String endere = ler.nextLine();

                            Pessoa objP = new Pessoa(nome, endere, idPessoa);
                            listaP.add(objP);
                            idPessoa++;
                            System.out.println("\n Pessoa adicionada com sucesso\n");

                            break;
                        case 4:
                            // lista de pessoas

                            for (Pessoa ver : listaP) {
                                System.out.println("\nNome: " + ver.getNome() + "\nEndereço: " + ver.getEndereco()
                                        + "\nId pessoa: " + ver.getId() + "\n");

                            }

                            break;
                        default:
                            // caso clique no errado
                            break;
                    }

                    break;
                default:
                    break;
            }

        } while (opcaoM < 4 && opcaoM > -1);

    }
}
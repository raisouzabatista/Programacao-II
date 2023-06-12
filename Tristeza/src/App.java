import DAO.Inventario2DAO;
import DAO.PessoaDAO;
import DAO.RastreioDAO;
import Entity.Inventario2;
import Entity.Pessoa;
import Entity.Rastreio;

// public class App {

//     public static void main(String[] args) throws Exception {

// Pessoa p = new Pessoa(); 
// p.setNome("Rai");
// p.setEndereco("Francisco");
// p.setId(1);
// new PessoaDAO().cadastrarPessoa(p);

// Inventario2 i = new Inventario2(); 
// i.setItem("lua");
// i.setPreco(24.0);
// i.setQuantidade(2); 
// i.setIdInven(2);

// new Inventario2DAO().cadastrarInventario(i);

// Rastreio r = new Rastreio(); 
// r.setEndereco("Francisco");
// r.setIdItem(1);
// r.setIdPessoa(1);
// r.setIdRastreio(1);
// r.setNome("Rai");
// r.setNomeItem("lua");
// r.setPreco(24.0);
// r.setQuantidade(1);

// new RastreioDAO().cadastrarRastreio(r);
//     }
// }
import java.util.Scanner;
import java.util.List;

public class App {




    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Inventario2 ajuda = new Inventario2();
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
                                    System.out.println("Lista de itens: ");
                                    List<Inventario2> inventarioL = new Inventario2DAO().listarInventario();
                                    for (Inventario2 inv : inventarioL) {
                                        System.out.println(
                                                "Nome: " + inv.getItem() +
                                                        "\nQuantidade: " + inv.getQuantidade() +
                                                        "\nPreço: " + inv.getPreco() +
                                                        "\nId: " + inv.getId() + "\n");
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

                                    Inventario2 obj = new Inventario2(nome, quant, preco);
                                    new Inventario2DAO().cadastrarInventario(obj);
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


  List <Rastreio> rastreiosL = new RastreioDAO().listarRastreio(); 
  for(Rastreio ras : rastreiosL){

System.out.println(
"Nome Comprador: "+ ras.getNome() +
"\nId Comprador: " +ras.getIdPessoa()+
"\nEndereço: " + ras.getEndereco()+
"\nItem: "+ras.getNomeItem()+
"\nQuantidade: "+ras.getQuantidade()+
"\nPreço: "+ ras.getPreco()+  
"\nId Item: " + ras.getIdItem()+ 
"\nId Rastreio: "+ ras.getIdRastreio()
);



  }
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

 
//Desculpa professor, mas não consegui fazer essa parte do código funcionar com o banco de dados, o senhor pode me ajudar? 
//passei a sexta toda tentando resolver, mas não consegui ;( 
//fora isso, eu consigo inserir dados no banco, listar 


                            // System.out.println("Digite o seu id de usuario");
                            // int idu = ler.nextInt();
                            // boolean testePessoa = pessoas.get(idu).verIdPessoa(pessoas, idu);
                            // if (testePessoa == true) {
                            //     String nomeP = pessoas.get(idu).getNome();
                            //     String ende = pessoas.get(idu).getEndereco();

                            //     System.out.println("Lista de itens: ");
                            //     for (Inventario2 inv : inventario) {
                            //         System.out.println("Nome: " + inv.getItem() + "\nQuantidade: " + inv.getQuantidade()
                            //                 + "\nPreço: " + inv.getPreco() + "\nId: " + inv.getId() + "\n");

                            //     }
                            //     System.out.println("Digite o id do item requerido: ");
                            //     int idp = ler.nextInt();
                            //     boolean teste = ajuda.verId(inventario, idp);
                            //     if (teste == true) {

                            //         Double precoI = inventario.get(idp).getPreco();
                            //         String nomeI = inventario.get(idp).getItem();

                            //         System.out.println("Digite a quantidade de itens");
                            //         int quantp = ler.nextInt();
                            //         int quantiNoId = inventario.get(idp).getQuantidade();
                            //         if (quantiNoId >= quantp) {
                            //             int subtrair = (quantiNoId - quantp);
                            //             inventario.get(idp).setQuantidade(subtrair);

                            //             System.out.println("pedido feito com sucesso\n");

                            //             Rastreio objRastreio = new Rastreio(nomeP, quantp, precoI, ende, nomeI, idu, idp);

                            //             new RastreioDAO().cadastrarRastreio(objRastreio);

                            //         }

                            //     } else {
                            //         System.out.println("Id não encontrado\n");
                            //     }
                            // } else {
                            //     System.out.println("Id de usuário errado\n");
                            // }

                            break;
                        case 2:
                            // rastrear pedido

                            break;
                        case 3:
                            // cadastrar pessoa
                            System.out.println("Digite seu nome: ");
                          
                            String nome = ler.next();
                            System.out.println("Digite seu endereço: ");
                            String endere = ler.next();

                            Pessoa objP = new Pessoa(nome, endere);

                            new PessoaDAO().cadastrarPessoa(objP);

                            System.out.println("\n Pessoa adicionada com sucesso\n");

                            break;
                        case 4:
                            // lista de pessoas

                            System.out.println("Lista de pessoas: ");
      List<Pessoa> pessoasL = new PessoaDAO().listarPessoas();

                                    for (Pessoa pes : pessoasL) {
                                        System.out.println(
                                                "Nome: " + pes.getNome() +
                                                        "\nEndereço: " + pes.getEndereco() +
                                                        "\nId: " + pes.getId());
                                                        
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
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		
		//instancando o cofrinho
		Cofrinho cofrinho = new Cofrinho();
	
		//declarando a variavel que vai receber a opção que o usuário digitar
		int opcao;
		
		//menu de opções
        
		System.out.println("Menu");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("0-Encerrar");
		opcao = teclado.nextInt();
		
		//declarando as variaveis
		int tipoMoeda = 0;
		//double valorMoedaRremovida, valorMoedaDremovida, valorMoedaEremovida ;
		Moeda moeda = null;
		//enquanto o usuario não quiser encerrar o programa o looping abaicxo ficará rodando
		while (opcao!=0) {
			switch(opcao) {
			case 1:
				while (tipoMoeda > 3 || tipoMoeda <=0) {
					System.out.println("Selecione a moeda a ser adicionada");
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					
					tipoMoeda = teclado.nextInt();
				}
				
				if(tipoMoeda <1 || tipoMoeda > 4) {
					System.out.println("Digite a moeda existente no menu..");
				}else {
					System.out.println("Digite o valor que você quer adicionar?");
					if (tipoMoeda == 1) {
						double valorMoedaR = teclado.nextDouble();
						moeda = new Real(valorMoedaR);
						
					}else if(tipoMoeda == 2) {
						double valorMoedaD = teclado.nextDouble();
						moeda = new Dolar(valorMoedaD);
						
					}else {
						double valorMoedaE = teclado.nextDouble();
						moeda = new Euro(valorMoedaE);
					}

				}
				
				cofrinho.adicionar(moeda);
				break;
			case 2:	
				while (tipoMoeda > 3 || tipoMoeda <=0) {
					System.out.println("Selecione a moeda a ser adicionada");
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					
					tipoMoeda = teclado.nextInt();
				}
			
				System.out.println("Digite o valor que você quer remover?");
				//verifica qual é o tipo da moeda a ser excluida
				if (tipoMoeda == 1) {
					double valorMoedaR = teclado.nextDouble();
					moeda = new Real(valorMoedaR);
					
				}else if(tipoMoeda == 2) {
					double valorMoedaD = teclado.nextDouble();
					moeda = new Dolar(valorMoedaD);
					
				}else {
					double valorMoedaE = teclado.nextDouble();
					moeda = new Euro(valorMoedaE);
				}
				
				cofrinho.remover(moeda);
				break;
				
			case 3:
				//lista todas as moedas presentes no cofrinho
				cofrinho.listagemMoeda();
				break;
			case 4:
				cofrinho.totalConvertido();
				break;
			default:
				//caso o usuario digite uma opção que não existe no menu
				System.out.println("Opção invalida!!");
			}
			System.out.println("Menu");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("4-Cacular tudo");
			System.out.println("0-Encerrar");
			opcao = teclado.nextInt();
	
			
		
		}
		//se o usuario optar por encerrar o programa ..
		if(opcao == 0) {
			System.out.println("PROGRAMA ENCERRADO..");
		}
    }
}

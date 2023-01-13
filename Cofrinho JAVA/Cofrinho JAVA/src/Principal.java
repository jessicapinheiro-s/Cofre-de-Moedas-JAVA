import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// instancando o cofrinho
		Cofrinho cofrinho = new Cofrinho();

		// declarando a variavel que vai receber a opção que o usuário digitar
		int opcao;

		// menu de opções

		System.out.println("Menu");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("0-Encerrar");
		opcao = teclado.nextInt();

		// declarando as variaveis
		int tipoMoeda = 0;
		double valorMoedaRremovida, valorMoedaDremovida, valorMoedaEremovida;
		Moeda moeda = null;
		// enquanto o usuario não quiser encerrar o programa o looping abaicxo ficará
		// rodando
		while (opcao != 0) {
			System.out.println("Menu");
			switch (opcao) {
				case 1:
					// while (tipoMoeda > 3 || tipoMoeda <=0) {
					System.out.println("Selecione a moeda a ser adicionada");
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");

					tipoMoeda = teclado.nextInt();
					if (tipoMoeda < 0 || tipoMoeda > 3) {
						System.out.println("Selecione uma opcao presente no menu");
						System.out.println("Selecione a moeda a ser adicionada");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");

						tipoMoeda = teclado.nextInt();
					} else {
						System.out.println("Digite o valor que você quer adicionar?");

						if (tipoMoeda == 1) {
							double valorMoedaR = teclado.nextDouble();
							moeda = new Real(valorMoedaR);

						} else if (tipoMoeda == 2) {
							double valorMoedaD = teclado.nextDouble();
							moeda = new Dolar(valorMoedaD);

						} else {
							double valorMoedaE = teclado.nextDouble();
							moeda = new Euro(valorMoedaE);
						}
					}
					// }

					cofrinho.adicionar(moeda);
					break;
				case 2:
					if (tipoMoeda < 0 || tipoMoeda > 3) {
						System.out.println("Selecione uma opcao presente no menu");
						System.out.println("Selecione a moeda a ser adicionada");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");

						tipoMoeda = teclado.nextInt();
					}else{
						System.out.println("Digite o valor que você quer remover?");
						// verifica qual é o tipo da moeda a ser excluida
						if (tipoMoeda == 1) {
							valorMoedaRremovida = teclado.nextDouble();
							moeda = new Real(valorMoedaRremovida);
							
						} else if (tipoMoeda == 2) {
							valorMoedaDremovida = teclado.nextDouble();
							moeda = new Dolar(valorMoedaDremovida);
	
						} else {
							valorMoedaEremovida = teclado.nextDouble();
							moeda = new Euro(valorMoedaEremovida);
						}
	
						cofrinho.remover(moeda);
						break;
					}

				case 3:
					// lista todas as moedas presentes no cofrinho
					cofrinho.listagemMoeda();
					break;
				case 4:
					cofrinho.totalConvertido();
					break;
				default:
					// caso o usuario digite uma opção que não existe no menu
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
		if (opcao == 0) {
			System.out.println("Programa encerrado..");
		}
	}
}

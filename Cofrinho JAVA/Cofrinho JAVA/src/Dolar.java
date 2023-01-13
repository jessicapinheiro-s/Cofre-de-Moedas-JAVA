public class Dolar extends Moeda{
    int valorMoeda= 5;
	
	public Dolar(double v) {
		super(v);
		
	}
	@Override
	void info() {
		System.out.println("Moeda de Dolar");
		System.out.println("Ov valor do Dolar é R$" + valorMoeda);
	}
	
	@Override
	double converter() {
		double total = valorMoeda * valor ;
		return total;
	}
	@Override
	public String toString() {
		return "Dolar [valor unitário da Moeda=" + valorMoeda + ", valor adicionado=" + valor + ", converter()=" + converter() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + valorMoeda;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		if (valorMoeda != other.valorMoeda)
			return false;
		return true;
	}
}

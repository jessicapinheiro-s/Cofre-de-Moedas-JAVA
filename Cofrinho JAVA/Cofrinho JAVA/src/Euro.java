public class Euro extends Moeda{
    int valorMoeda= 6;
	Euro(double v) {
		super(v);
		
	}
	@Override
	void info() {
		System.out.println("Moeda de Euro");
		System.out.println("Ov valor do Euro é R$" + valorMoeda);
	}
	@Override
	double converter() {
		double total = valorMoeda * valor ;
		return total;
	}
	@Override
	public String toString() {
		return "Euro [valor unitário da Moeda=" + valorMoeda + ", valor adicionado=" + valor + ", converter()=" + converter() + "]";
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
		Euro other = (Euro) obj;
		if (valorMoeda != other.valorMoeda)
			return false;
		return true;
	}
}

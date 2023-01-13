public class Real extends Moeda {
    int valorMoeda= 1;
	Real(double v) {
		super(v);
	}

	@Override
	void info() {
		System.out.println("Moeda de Real");
		System.out.println("Ov valor do Real é R$" + valorMoeda);
	}

	@Override
	double converter() {
		double total = valorMoeda * valor ;
		return total;
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
		Real other = (Real) obj;
		if (valorMoeda != other.valorMoeda)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Real [valor unitário da Moeda=" + valorMoeda + ", valor adicionado=" + valor + ", converter()=" + converter() + "]";
	}
}

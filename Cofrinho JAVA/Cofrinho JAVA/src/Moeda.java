public abstract class Moeda {
    double valor;
	
	public Moeda(double valor){
		super();
		this.valor = valor;
	}
	//funções abstratas
	abstract void info();
	
	abstract double converter();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Moeda [valor=" + valor + ", converter()=" + converter() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}

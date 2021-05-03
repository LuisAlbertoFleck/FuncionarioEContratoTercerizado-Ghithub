package entites;

public class Tercerizado extends Funcionarios{

		private Double Adicional;

		public Tercerizado() {
		super();
}
		public Tercerizado(String nome, Integer hora, Double valor, Double adicional) {
			super(nome, hora, valor);
			this.Adicional = adicional;
		}
		public Double getAdicional() {
			return Adicional;
		}
		public void setAdicional(Double adicional) {
			this.Adicional = adicional;
		}
		
		@Override
		public double valorPagamento() {
			return super.valorPagamento() * Adicional * 1.1 ;
		
		}
}

package Computador;

public class EquipamentoEletronico2 {

	private float tensao;
	private float consumo;
	
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		if(tensao > 1)
		this.tensao = tensao;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		if(consumo > 1)
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico2 [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
}
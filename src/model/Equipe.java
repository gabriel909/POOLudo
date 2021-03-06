package model;

import java.util.*;

public class Equipe {
	
	protected List<Pino> pinos;
	private Cor cor;
	public int qtdPinosCasaFinal = 0;
	protected int dado;
	protected Pino ultimoPinoMovimentado;
	
	public Equipe(Cor cor) {
		this.cor = cor;
		qtdPinosCasaFinal = 0;
		criaPinos(cor);
		
	}
	
	public void addPinoCasaFinal(int n) {
		qtdPinosCasaFinal += 1;
	}
	
	private void criaPinos(Cor cor) {
		pinos = new ArrayList<Pino>();
		for(int i = 0; i < 4; i++) {
			Pino pino = new Pino(cor);
			
			if(i == 0) {
				pino.casaAtual = pino.getNumeroCasaDeSaida();
				
			} else {
				pino.estaCasaInicial = true;
				
			}
			
			pinos.add(pino);
		}
	}
	
	public List<Pino> getPinos(){
		return pinos;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public int getDado() {
		return dado;
    }
    
    public void addPinoCasaFinal() {
		qtdPinosCasaFinal++;
	}
    
    public Pino getPinoCasaInicial() {
    	for(int i = 0; i < pinos.size(); i++) {
    		if(pinos.get(i).estaCasaInicial) {
    			return pinos.get(i);
    		}
    	}
    	
    	return null;
    }

}

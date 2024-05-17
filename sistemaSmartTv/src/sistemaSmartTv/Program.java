package sistemaSmartTv;

public class Program {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal atual : " + smartTv.canal);
		System.out.println("Volume atual : " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume atual : " + smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("Volume atual : " + smartTv.volume);
		
		smartTv.avancarCanal();
		System.out.println("Canal atual : " + smartTv.canal);
		smartTv.voltarCanal();
		System.out.println("Canal atual : " + smartTv.canal);
		
		
	}

}

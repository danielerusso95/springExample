import java.util.Random;
import java.util.Scanner;


public class World {
	Scanner key = new Scanner(System.in);
	
	public void initGame() {
		int choose = 0;
		Umano personaggio = null;
		do {
			System.out.println("scegli un personaggio");
			System.out.println("1.guerriero");
			System.out.println("2.mago");
			System.out.println("3.monaco");
			choose = key.nextInt();
		}while(choose<1 || choose>3);
			System.out.println("nome del personaggio");
			String nome = key.next();
			switch (choose) {
			case 1:
				personaggio= new Guerriero(nome);
				break;
			case 2:
				personaggio= new Mago(nome);
				break;
				case 3:
				personaggio= new Monaco(nome);
				break;
			}
		
		System.out.println(personaggio);
		
		System.out.println("digita un carattere per iniziare");
		key.nextInt();
	
		startGame(personaggio);

		
	}
	public void startGame(Umano personaggio) {
		boolean escape = false;
	
		Drago drago = new Drago();
		System.out.println(drago);
		int i = 0;
		
		while(personaggio.isAlive() && drago.isAlive()) {
			boolean attaccoGuerriero = true;
			
			long startGame = System.currentTimeMillis();
			String generateString = generateString(5+i);
			System.out.println("riscrivi questa stringa in 10 secondi " + generateString);
			String rispostaAttacco = key.next();
			long estimatedTimeGame = System.currentTimeMillis()-startGame;
			if(!rispostaAttacco.equals(generateString) || (estimatedTimeGame/1000)>10)
				attaccoGuerriero = false;
			
			if(attaccoGuerriero) {
				int dannoSubito;
				if(i>=3 && i%3==0 && personaggio.getStrokes()>0) {
					System.out.println("Hai usato la tua arma");
					dannoSubito = personaggio.attaccoArma();
				}
				else dannoSubito = personaggio.attacco();
				drago.setPuntiVita(dannoSubito);
				System.out.println(personaggio.getNome()+" infligge "+dannoSubito);
			}else {
				int dannoSubito = drago.attacco();
				System.out.println("Drago"+" infligge "+dannoSubito);
				if(personaggio.getPuntiVita()<dannoSubito) {
					System.out.println("vuoi tentare la fuga?");
					System.out.println("digita 1 per dire si, altro per dire no");
					int choose = key.nextInt();
					if(choose==1) {
						escape = personaggio.exit();
						System.out.println(escape?"fuga riuscita":"mi dispiace la battaglia continua");
					}
					
				}
				if(escape) {
					System.out.println("la battaglia è terminata con la tua fuga");
					break;
				}else personaggio.setPuntiVita(dannoSubito);
			}
			
			System.out.println("Vita drago "+ drago.getPuntiVita());
			System.out.println("Vita guerriero "+ personaggio.getPuntiVita());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			
		}
		System.out.println("GameOver");
		System.out.println(drago.isAlive() ? "You Lose" : "You Win");
		key.close();
		
	}

	
	public String generateString(int siz) {
		Random rand = new Random();
		String str = "abcdefghilmnopqrstuvz";
	
		String result="";
		for (int i = 0; i < siz; i++) {
			result+=str.charAt(rand.nextInt(str.length()));
		}
		System.out.println(result);
		return result;
	}
}

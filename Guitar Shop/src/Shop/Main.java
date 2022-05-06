package Shop;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<Guitar> guitar = new Vector<Guitar>();

	public Main() {
		MainMenu();
	}

	public static void main(String[] args) {
		new Main();
	}

	public void MainMenu() {
		int choose;
		do {
			System.out.println("Menu");
			System.out.println("1. Build Guitar");
			System.out.println("2. Display List of Guitar");
			System.out.println("3. Exit");
			System.out.println("Choose menu[1..3]: ");
			choose = sc.nextInt();
			sc.nextLine();
		} while (choose < 1 && choose > 3);
		switch (choose) {
		case 1:
			BuildGuitar();
			break;
		case 2:
			Displaying();
			break;
		case 3:
			break;
		default:
			MainMenu();
		}
	}

	public void BuildGuitar() {
		int bgt = 0;
		String type = "";
		String sndType = "";
		int tone = 0;
		int volume = 0;
		int sp = 0;
		do {
			System.out.println("1. Acoustic \n2. Electric \n3. Acoustic Electric \n");
			System.out.println("Input guitar type[1..3]: ");
			bgt = sc.nextInt();
			sc.nextLine();
		} while (bgt < 1 && bgt > 3);
		switch (bgt) {
		case 1:
			int acc1;
			type = "Acoustic";
			do {
				System.out.println("Input sound type");
				System.out.println("1. Warm");
				System.out.println("2. Bright");
				acc1 = sc.nextInt();
				sc.nextLine();
			} while (acc1 < 1 && acc1 > 2);
			if (acc1 == 1) {
				sndType = "Warm";
			} else {
				sndType = "Bright";
			}
			guitar.add(new Acoustic(type, sndType));
			System.out.println("");
			MainMenu();
		case 2:
			type = "Electric";
			do {
				System.out.println("Input switch position");
				sp = sc.nextInt();
				sc.nextLine();
			} while (sp < 1 && sp > 4);
			do {
				System.out.println("Input tone");
				tone = sc.nextInt();
				sc.nextLine();
			} while (tone < 1 && tone > 5);
			do {
				System.out.println("Input volume");
				volume = sc.nextInt();
				sc.nextLine();
			} while (volume < 1 && volume > 5);
			if (sp == 1) {
				sndType = "Funk";
			} else if (sp == 2) {
				sndType = "Jazz";
			} else if (sp == 3) {
				sndType = "Blues";
			} else {
				sndType = "Rock";
			}
			guitar.add(new Electric(type, sndType, tone, volume, sp));
			System.out.println("");
			MainMenu();
		case 3:
			type = "Acoustic Electric";
			sndType = "Crunch";
			guitar.add(new AcouElec(type, sndType));
			System.out.println("");
			MainMenu();
		default:
			BuildGuitar();
		}

	}

	public void Displaying() {
		if (!(guitar.isEmpty())) {
			System.out.println("[GuitarType] - [GuitarSoundType] - [Tone] - [Volume] - [SwitchPosition]");
			for (int i = 0; i < guitar.size(); i++) {
				guitar.get(i).DisplayList();
			}
			MainMenu();
		} else {
			System.out.println("Your List is Empty!!");
			MainMenu();
		}
	}

}

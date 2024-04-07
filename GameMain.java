
public class GameMain {
	public static void main(String[] args) {
		boolean done = false;
		while(!done) {
			String stage1 = "Not cleared";
			String stage2 = "Not cleared";
			String stage3 = "Not cleared";

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clearScreen();
			System.out.println("Welcome to Church! Where everyone is- kdwnf;wj2oe';ql;a'");
			System.out.println("Muahaha");
			System.out.println("       +\n"
					+ "       A_\n"
					+ "      /\\-\\\n"
					+ "     _||\"|_\n"
					+ "    ~^~^~^~^");

			boolean repeat = true;
			String userInput = "";
			System.out.println("To walk closer, press 1. To walk around the outside, press 2.");

			while(repeat) {
				userInput = TextIO.getlnString();
				if(userInput.equals("1") || userInput.equals("2")) {
					repeat = false;
				} else {
					repeat = true;
					System.out.println("Enter valid input.");
				}
			}
			repeat = true;

			if(userInput.equals("1")) {
				clearScreen();
				System.out.println("                                      .\n"
						+ "                                    .' '.\n"
						+ "                                  .'  |  `.\n"
						+ "                                .'    |    `.\n"
						+ "                              .`---.._|_..---'.\n"
						+ "                               ||    |=|    ||\n"
						+ "                               ||_.-'|=|`-._||\n"
						+ "                               ||`-._|=|_.-'||\n"
						+ "                          _____||    |=|    ||__\n"
						+ "            ____________.'     `-.   |=|  .'_.'\\/`.\n"
						+ "          .'       _  .' _______  `-.|_|.' .'\\.'`./`.\n"
						+ "        .'     _   _.'      _   _        .'\\.' `._`./`.\n"
						+ "      .' _       _.' __          __    .'\\.'  ___`._`./`.\n"
						+ "    .'        _ .'   _____           .'\\.'         `._`./`.\n"
						+ "  .'  _  _    .'       ______      .'\\.'  __         `._`./`.\n"
						+ ".'`--...__ _.'            ______ .'\\.'           __    `._`./`.\n"
						+ " `--...__ .'   ____            .'\\.'           _         `._`./`.\n"
						+ " |      .`--...__            .'\\.'     _               ____`._`./`.\n"
						+ " | /`-._ `--...__`--...___ .'\\.'              _______       _`._`./`.\n"
						+ " | | ) ( |       `--...____\\.'     _     _  .'      .`.        `._`./\n"
						+ " | |)   (| /`-._             |            .'      .'   `.     _ |\n"
						+ " | |(--| | | )( |  /`-._`--._|____       /      .'       `.     |\n"
						+ " | | ) `.| |(  )|  | )( |    | _      _ /      /   .---.  `\\    |\n"
						+ " | `--._ | |/  \\|  |(  )|`-  |         /`--.._/   /     \\  ' _  |\n"
						+ " | `-.   | |)-.(|  |/  \\|    |       __|      |_  |`-   |  |  _ |\n"
						+ " |    `-.| |) |(|  |)-.(|    |  ___  _ |  __  | __| \\`- |  |    |\n"
						+ " '-._    | `--._/  |) |(|    |      __ |      |   | |`- |  | _  |\n"
						+ "     `-._| `--.    `--._/    |  ___    | _    |   | |`- |  |   '|\n"
						+ "         |      `--._        |       _ |    ' |   |O|`- | _| _  |\n"
						+ "         '--._         `--._ |         | _    |_ \"| |`- |. |  __|\n"
						+ "              `--._          |       __|      |   | |`- |. | __ |\n"
						+ "                   `--._     |__       |   _  |\"  | |`- |  |___ |\n"
						+ "                        `--._|_________|_     | _ |  `- |_ |____|\n"
						+ "                                         '--._|___|     |__|\n");
				try {
					Thread.sleep(1000);
					System.out.println("Oh, nothing ever happens here.\n");
					Thread.sleep(1000);
					System.out.println("What do you mean?\n");
					Thread.sleep(1000);
					System.out.println("If you take this route it'll take forever.\n");
					Thread.sleep(1000);
					System.out.println("What the-\n");
					Thread.sleep(1000);
					System.out.println("Sorry honey! You're dead :(\n 	Try again.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				clearScreen();
				System.out.println("            ********\n"
						+ "        ****************\n"
						+ "      *******************\n"
						+ "      ********************\n"
						+ "       ********************\n"
						+ "          \\\\   //  ********\n"
						+ "           \\\\\\//  *******\n"
						+ "             \\\\\\////\n"
						+ "              |||//                       ,\n"
						+ "              |||||                    __/\n"
						+ "  ,,,,,,,,,,,//||||\\,,,,,,,,,,,,,,,,,,o==o\n"
						+ "  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
				System.out.println("What's that?\n");
				System.out.println("Options\n1) Omg a tree!\n2) Is that a person?");
				while(repeat) {
					userInput = TextIO.getlnString();
					if(userInput.equals("1") || userInput.equals("2")) {
						repeat = false;
					} else {
						repeat = true;
						System.out.println("Enter valid input.");
					}
				}
				repeat = true;
				if (userInput.equals("1")) {
					System.out.println("Let's go towards the tree--\nOh nevermind you died. Sorry!"); 
				} else {
					clearScreen();
					stage1 = "cleared";
					System.out.println("That's right... what's a person doing there? Wait a second...");
					System.out.println("                                                      |_  |\n"
							+ "                                                        | |\n"
							+ "__                      ____                            | |\n"
							+ "\\ ````''''----....____.'\\   ````''''--------------------| |--.               _____      .-.\n"
							+ " :.                      `-._                           | |   `''-----''''```     ``''|`: :|\n"
							+ "  '::.                       `'--.._____________________| |                           | : :|\n"
							+ "    '::..       ----....._______________________________| |                           | : :|\n"
							+ "      `'-::...__________________________________________| |   .-''-..-'`-..-'`-..-''-.cjr :|\n"
							+ "           ```'''---------------------------------------| |--'                         `'-'\n"
							+ "                                                        | |\n"
							+ "                                                       _| |\n"
							+ "                                                      |___|");
					System.out.println("There's been a sTaBbiNG!!! IT'S A DEAD PERSON!!!\n");
				}
			}

			if(stage1.equals("cleared")) {
				try {
					Thread.sleep(1000);
					System.out.println("Darn it, you survived the first stage.");
					Thread.sleep(1000);
					System.out.println("What's that? Oh damn nevermind, here are your options!\n");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("1) Scream\n2) Run Away\n3) Go inside to investigate \n4) Just... stand there??");
				while(repeat) {
					userInput = TextIO.getlnString();
					if(userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4")) {
						repeat = false;
					} else {
						repeat = true;
						System.out.println("Enter valid input.");
					}
				}
				repeat = true;

				if(userInput.equals("1") || userInput.equals("4")) {
					System.out.println("⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⢀⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠾⠃⠀⠀⠀\n"
							+ "⠀⠻⢿⣧⡀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠛⠁⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⢿⣿⣷⡄⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⣤⠀⠀⠀⠀⠀⠀⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠙⠻⣿⣦⠀⠙⠀⠀⢀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⡿⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠉⠻⣧⠀⠀⠀⠈⢧⢢⠀⠀⢸⡇⠀⠀⠀⣀⣼⠃⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡶⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠈⠊⢷⣄⣸⣿⣀⣠⣾⣿⣇⣀⣼⠋⠀⠀⠀⠀⠀⢀⣠⠔⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣷⣤⡀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢀⣴⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⣠⣷⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⢤⣤⣀⠀⠀⣰⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀\n"
							+ "⠀⠀⠀⠀⠀⠀⠉⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣶⣆⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠈⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⣴⣶⣾⡿⠿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣄⡀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠈⠛⠛⠉⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠉⠉⠛⠻⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡿⠟⠉⠁⠈⠙⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⣠⣤⣄⠀⠀⠀⠀⠀⢸⣿⠿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠈⠻⣦⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⢿⣿⡟⠀⠀⠀⠀⠀⠸⠏⢰⡟⠀⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠁⠀⠀⢸⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
					System.out.println("HAHAHA, you died :)");
				} else if(userInput.equals("2")) {
					clearScreen();
					System.out.println("Smart! But I can't let that happen :)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(" _____________________________________________\n"
							+ "|.'',                                     ,''.|\n"
							+ "|.'.'',                                 ,''.'.|\n"
							+ "|.'.'.'',                             ,''.'.'.|\n"
							+ "|.'.'.'.'',                         ,''.'.'.'.|\n"
							+ "|.'.'.'.'.|                         |.'.'.'.'.|\n"
							+ "|.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n"
							+ "|,',',',',|---|',|'|???????|'|,'|---|,',',',',|\n"
							+ "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n"
							+ "|.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|\n"
							+ "|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n"
							+ "|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n"
							+ "|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n"
							+ "|.','          /%%%%%%%%%%%%%%%\\          ','.|\n"
							+ "|;____________/%%%%%Spicer%%%%%%\\____________;|");
					System.out.println("What will you do now?");
					System.out.println("1) Keep running\n2) Look around");
					while(repeat) {
						userInput = TextIO.getlnString();
						if(userInput.equals("1") || userInput.equals("2")) {
							repeat = false;
						} else {
							repeat = true;
							System.out.println("Enter valid input.");
						}
					}
					repeat = true;
					
					if(userInput.equals("1")) {
						System.out.println("UGH fine. Stay smart.");
						stage2 = "cleared"; 
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						clearScreen();
						System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⠣⡑⡕⡱⡸⡀⡢⡂⢨⠀⡌⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⡕⢅⠕⢘⢜⠰⣱⢱⢱⢕⢵⠰⡱⡱⢘⡄⡎⠌⡀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠱⡸⡸⡨⢸⢸⢈⢮⡪⣣⣣⡣⡇⣫⡺⡸⡜⡎⡢⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⢱⢱⠵⢹⢸⢼⡐⡵⣝⢮⢖⢯⡪⡲⡝⠕⣝⢮⢪⢀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⢀⠂⡮⠁⠐⠀⡀⡀⠑⢝⢮⣳⣫⢳⡙⠐⠀⡠⡀⠀⠑⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⢠⠣⠐⠀ ⭕ ￼ ⠀⠀⢪⢺⣪⢣⠀⡀ ⭕     .⠈⡈⠀⡀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠐⡝⣕⢄⡀⠑⢙⠉⠁⡠⡣⢯⡪⣇⢇⢀⠀⠡⠁⠁⡠⡢⠡⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⢑⢕⢧⣣⢐⡄⣄⡍⡎⡮⣳⢽⡸⡸⡊⣧⣢⠀⣕⠜⡌⠌⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠌⡪⡪⠳⣝⢞⡆⡇⡣⡯⣞⢜⡜⡄⡧⡗⡇⠣⡃⡂⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠨⢊⢜⢜⣝⣪⢪⠌⢩⢪⢃⢱⣱⢹⢪⢪⠊⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠡⡑⠜⢎⢗⢕⢘⢜⢜⢜⠜⠕⠡⠡⡈⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⡢⢀⠈⠨⣂⡐⢅⢕⢐⠁⠡⠡⢁⠀⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⠢⠀⡀⡐⡍⢪⢘⠀⠀⠡⡑⡀⠀⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⢂⠀⠌⠘⢜⠘⠀⢌⠰⡈⠀⠀⠀⠀⠀⠀⠀⠀ \n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢑⢸⢌⢖⢠⢀⠪⡂");
						try {
							Thread.sleep(1000);
							System.out.println("HAHAHA");
							Thread.sleep(1000);
							System.out.println("Didn't you know you were still being chased?");
							Thread.sleep(1000);
							System.out.println("Oh wait- That's another version of events- AGH");
							Thread.sleep(1000);
							System.out.println("Stupid players. Restarting so much. I can't remember what's supposed to happen!");
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				} else {
					clearScreen();
					System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⠣⡑⡕⡱⡸⡀⡢⡂⢨⠀⡌⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⡕⢅⠕⢘⢜⠰⣱⢱⢱⢕⢵⠰⡱⡱⢘⡄⡎⠌⡀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠱⡸⡸⡨⢸⢸⢈⢮⡪⣣⣣⡣⡇⣫⡺⡸⡜⡎⡢⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⢱⢱⠵⢹⢸⢼⡐⡵⣝⢮⢖⢯⡪⡲⡝⠕⣝⢮⢪⢀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⢀⠂⡮⠁⠐⠀⡀⡀⠑⢝⢮⣳⣫⢳⡙⠐⠀⡠⡀⠀⠑⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⢠⠣⠐⠀ ⭕ ￼ ⠀⠀⢪⢺⣪⢣⠀⡀ ⭕     .⠈⡈⠀⡀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠐⡝⣕⢄⡀⠑⢙⠉⠁⡠⡣⢯⡪⣇⢇⢀⠀⠡⠁⠁⡠⡢⠡⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⢑⢕⢧⣣⢐⡄⣄⡍⡎⡮⣳⢽⡸⡸⡊⣧⣢⠀⣕⠜⡌⠌⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠌⡪⡪⠳⣝⢞⡆⡇⡣⡯⣞⢜⡜⡄⡧⡗⡇⠣⡃⡂⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠨⢊⢜⢜⣝⣪⢪⠌⢩⢪⢃⢱⣱⢹⢪⢪⠊⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠡⡑⠜⢎⢗⢕⢘⢜⢜⢜⠜⠕⠡⠡⡈⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⡢⢀⠈⠨⣂⡐⢅⢕⢐⠁⠡⠡⢁⠀⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⠢⠀⡀⡐⡍⢪⢘⠀⠀⠡⡑⡀⠀⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⢂⠀⠌⠘⢜⠘⠀⢌⠰⡈⠀⠀⠀⠀⠀⠀⠀⠀ \n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢑⢸⢌⢖⢠⢀⠪⡂");

					try {
						Thread.sleep(1000);
						System.out.println("OH MY GOD-");
						Thread.sleep(1000);
						System.out.println("Quick! Make a decision!");
						System.out.println("1) run\n2)Just-");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					long startTime = System.currentTimeMillis();
					while(repeat) {
						userInput = TextIO.getlnString();
						if(userInput.equals("1") || userInput.equals("2")) {
							repeat = false;
						} else {
							repeat = true;
							System.out.println("Enter valid input.");
						}
					}
					repeat = true;
					long endTime = System.currentTimeMillis();
					if(userInput.equals("2")) {
						try {
							System.out.println("...");
							Thread.sleep(1000);
							System.out.println("...Really? That's the best you can do?");
							Thread.sleep(1000);
							System.out.println("That's boring...");
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if(userInput.equals("1") && endTime - startTime > 2000) {
						try {
							System.out.println("Waaaaaaaaay too slow. Better luck next time!");
							Thread.sleep(1000);
							System.out.println("(This part is timed. If you take too long to choose an option you die.)");
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						try {
							System.out.println("Decent reaction speed!");
							Thread.sleep(1000);
							System.out.println("Well, now you're running away...");
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						stage2 = "cleared";
					}
				}
			}
			if(stage2.equals("cleared")) {
				clearScreen();
				System.out.println("                         vv\n"
						+ "                     vvv^^^^vvvvv\n"
						+ "                 vvvvvvvvv^^vvvvvv^^vvvvv\n"
						+ "        vvvvvvvvvvv^^^^^^^^^^^^^vvvvv^^^vvvvv\n"
						+ "    vvvvvvv^^^^^^^^^vvv^^^^^^^vvvvvvvvvvv^^^vvv\n"
						+ "  vvvv^^^^^^vvvvv^^^^^^^vv^^^^^^^vvvv^^^vvvvvv\n"
						+ " vv^^^^^^^^vvv^^^^^vv^^^^vvvvvvvvvvvv^^^^^^vv^\n"
						+ " vvv^^^^^vvvv^^^^^^vvvvv^^vvvvvvvvv^^^^^^vvvvv^\n"
						+ "  vvvvvvvvvv^^^v^^^vvvvvv^^vvvvvvvvvv^^^vvvvvvvvv\n"
						+ "   ^vv^^^vvvvvvv^^vvvvv^^^^^^^^vvvvvvvvv^^^^^^vvvvvv\n"
						+ "     ^vvvvvvvvv^^^^vvvvvv^^^^^^vvvvvvvv^^^vvvvvvvvvv^v\n"
						+ "        ^^^^^^vvvv^^vvvvv^vvvv^^^v^^^^^^vvvvvv^^^^vvvvv\n"
						+ " vvvv^^vvv^^^vvvvvvvvvv^vvvvv^vvvvvv^^^vvvvvvv^^vvvvv^\n"
						+ "vvv^vvvvv^^vvvvvvv^^vvvvvvv^^vvvvv^v##vvv^vvvv^^vvvvv^v\n"
						+ " ^vvvvvv^^vvvvvvvv^vv^vvv^^^^^^_____##^^^vvvvvvvv^^^^\n"
						+ "    ^^vvvvvvv^^vvvvvvvvvv^^^^/\\@@@@@@\\#vvvv^^^\n"
						+ "         ^^vvvvvv^^^^^^vvvvv/__\\@@@@@@\\^vvvv^v\n"
						+ "             ;^^vvvvvvvvvvv/____\\@@@@@@\\vvvvvvv\n"
						+ "             ;      \\_  ^\\|[  -:] ||--| | _/^^\n"
						+ "             ;        \\   |[   :] ||_/| |/\n"
						+ "             ;         \\\\ ||___:]______/\n"
						+ "             ;          \\   ;=; /\n"
						+ "             ;           |  ;=;|\n"
						+ "             ;          ()  ;=;|\n"
						+ "            (()          || ;=;|\n"
						+ "                        / / \\;=;\\");
				try {
					System.out.println("Drat, stage 2 cleared...\n");
					Thread.sleep(1000);
					System.out.println("1)What do you mean...?\n2)Just tell me what I see.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while(repeat) {
					userInput = TextIO.getlnString();
					if(userInput.equals("1") || userInput.equals("2")) {
						repeat = false;
					} else {
						repeat = true;
						System.out.println("Enter valid input.");
					}
				}
				repeat = true;
				
				if(userInput.equals("1")) {
					try {
						System.out.println("Ugh. Stupid players. Restarting the game again and again. Just die already.\n");
						Thread.sleep(1000);
						System.out.println("...Excuse me?? I'm just playing a game here!\n");
						Thread.sleep(1000);
						System.out.println("DAMN YOU. I DON'T WANT-");
						Thread.sleep(700);
						System.out.println("                         vv\n"
								+ "                     vvv^^^^vvvvv\n"
								+ "                 vvvvvvvvv^^vvvvvv^^vvvvv\n"
								+ "        vvvvvvvvvvv^^^^^^^^^^^^^vvvvv^^^vvvvv\n"
								+ "    vvvvvvv^^^^^^^^^vvv^^^^^^^vvvvvvvvvvv^^^vvv\n"
								+ "  		lskdhfna,		^^^^^^vv^^^^^^^vvvv^^^vvvvvv\n"
								+ " vv^^^^^^^^vvv^^^^^vv^^^^vvvvvvvvvvvv^^^^^^vv^\n"
								+ " vvHNKLJDShjbmngldhs;lbjmn,vvvvvvv^^^^^^vvvvv^\n"
								+ "  vvvvvvKJLGQHFEJIOHLJO:VJDHLKNA^^vvvvvvvvvv^^^vvvvvvvvv\n"
								+ "   ^vv^^^vvvvvvv^^vvvvv^^^^^^^^vvvvvvvvv^^^^^^vvvvvv\n"
								+ "     ^vvvvvvvvv^^^ASPOHKJBNKLJvvvvvvv^^^vvvvvvvvvv^v\n"
								+ "        ^^^^^^vvvv^^vvvvv^vvvv^^^v^^^^^^vvvvvv^^^^vvvvv\n"
								+ " vvvv^^vvv^^^vvvvvLADKFJBNKLJHIJBKLNKJOPUYGFWVBuoihjbeln;ds\n"
								+ "vvv^vvvvv^^iehafknKJBN:Jknljk'piuyguvsdbNGFhvjbknj;oi[uv^^vvvvv^v\n"
								+ " ^vvvvvv^^vvvvvvvv^vv^vvv^^^^^^_____##^^^vvvvvvvv^^^^\n"
								+ "    ^^ohdasfknJOPIHO				vvv^^^^/\\@@@@@@\\#vvvv^^^\n"
								+ "         vvv/__\\@@@@@@\\^vvvv^v\n"
								+ "             ;^^vvvvvvvvvvv/_					\n"
								+ "             ;      \\_  ^\\|[  -:] ||--| | _/^^\n"
								+ "             ;        \\   |[   :] ||_/| |/\n"
								+ "             ;         \\OIJBhslopucjm./\n"
								+ "             ;          \\   ;=; /\n"
								+ "             ;     			"
								+ "             ;          ()  ;=;|\n"
								+ "            (()          || ;=;|\n"
								+ "                        / / \\;=;\\");
						Thread.sleep(700);
						clearScreen();
						System.out.println("                         vv\n"
								+ "                     vvv^^^^vvvvv\n"
								+ "                 vvvvvvvvv^^vvvvvv^^vvvvv\n"
								+ "        vvvvvvvvvvv^^^^^^^^^^^^^vvvvv^^^vvvvv\n"
								+ "    vvvvvvv^^^^^^^^^vvv^^^^^^^vv&9068)(^*&%09765n"
								+ "  		lskdhfna,		^^^^^^vv^^^^^^^vvvv^^^vvvvvv\n"
								+ " vv^^^^^^^^vvv^^)(*T&RYUT*(&)*^&%Rn"
								+ " vvHNKLJDShjbmngldhs;lbjmn,vvvvvvv^^^^^^vvvvv^\n"
								+ "   ^vv^^^vvvv&%^576879676^*&(*_)^^^^^vvvvvv\n"
								+ "     ^vvvvvvvvv^^^ASPOHKJBNKLJvvvvvvv^^^vvvvvvvvvv^v\n"
								+ "        ^^OPIHLKEANF<j;hipodsafknm;[kp)_(&)*^&Tv^^^^vvvvv\n"
								+ " vvvv^^vvv^^^vvvvvLADKFJBNKLJHIJBKLNKJOPUYGFWVBuoihjbeln;ds\n"
								+ "vvv^vvvvv^^iehafknKJBN:Jknljk'piuyguvsdbNGFhvjbknj;oi[uv^^vvvvv^v\n"
								+ "         vvv/__\\@@@@@@\\^vvvv^v\n"
								+ "             ;^^vvvvvvvvvvv/_					\n"
								+ "             ;      \\_  ^\\|[  -:] ||--| | _/^^\n"
								+ "             ;        \\   |[   :] ||_/| |/\n"
								+ "             ;         \\OIJBhslopucjm./\n"
								+ "             ;          \\   ;=; /\n"
								+ "             ;     			"
								+ "             ;          ()  ;=;|\n"
								+ "            (()          || ;=;|\n");
						Thread.sleep(700);
						clearScreen();
						System.out.println("                         vv\n"
								+ "                     vvv^^^^vvvvv\n"
								+ "                 vvvvvvvvv^^vvvvvv^^vvvvv\n"
								+ "        vvvvvvvvv09783e)*&()^*T^vvvvv\n"
								+ "    vvvvvvv^^^^^^^^^vvv^^^^^^^vv&9068)(^*&%09765n"
								+ "  		lskdhfna,		^^^^^^vv^^^^^^^vvvv^^^vvvvvv\n"
								+ " vvHNKLJDShjbmngldhs;lbjmn,vvvvvvv^^^^^^vvvvv^\n"
								+ "  vvvvvvKJLGQHFEJIOHLJO:VJDHLKNA^^v)_(&)*^&%$^#%&$^*%&(^*)&(_*)n"
								+ "   ^vv^^^vvvv&%^576879676^*&(*_)^^^^^vvvvvv\n"
								+ "     ^vvvvvvvvv^^^ASPOHKJBNKLJvvvvvvv^^^vvvvvvvvvv^v\n"
								+ "        ^^OPIHLKEANF<j;hipodsafknm;[kp)_(&)*^&Tv^^^^vvvvv\n"
								+ " vvvv^30297LADKFJBNKLJHIJBKLNKJOPUYGFWVBuoihjbeln;ds\n"
								+ "         vvv/__\\@@@@@@\\^vvvv^v\n"
								+ "             ;^^vvvvvvvvvvv/_					\n"
								+ "             ;      \\_  ^\\|[  -:] ||--| | _/^^\n"
								+ "             ;        \\   |[   :] ||_/| |/\n"
								+ "             ;         \\OIJBhslopucjm./\n"
								+ "             ;          \\   ;=; /\n");
						Thread.sleep(700);
						clearScreen();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						System.out.println("Fine. You see a tree. A treehouse.\n");
						Thread.sleep(2000);
						System.out.println("...Ok, are YOU okay?\n");
						Thread.sleep(2000);
						System.out.println("Nah. Y'know what? Skip stage 2.\n");
						Thread.sleep(2000);
						System.out.println("What?!\n");
						Thread.sleep(2000);
						System.out.println("I'm tired.\n");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("             .,-:;//;:=,\n"
							+ "         . :H@@@MM@M#H/.,+%;,\n"
							+ "      ,/X+ +M@@M@MM%=,-%HMMM@X/,\n"
							+ "     -+@MM; $M@@MH+-,;XMMMM@MMMM@+-\n"
							+ "    ;@M@@M- XM@X;. -+XXXXXHHH@M@M#@/.\n"
							+ "  ,%MM@@MH ,@%=            .---=-=:=,.\n"
							+ "  -@#@@@MX .,              -%HX$$%%%+;\n"
							+ " =-./@M@M$                  .;@MMMM@MM:\n"
							+ " X@/ -$MM/                    .+MM@@@M$\n"
							+ ",@M@H: :@:                    . -X#@@@@-\n"
							+ ",@@@MMX, .                    /H- ;@M@M=\n"
							+ ".H@@@@M@+,                    %MM+..%#$.\n"
							+ " /MMMM@MMH/.                  XM@MH; -;\n"
							+ "  /%+%$XHH@$=              , .H@@@@MX,\n"
							+ "   .=--------.           -%H.,@@@@@MX,\n"
							+ "   .%MM@@@HHHXX$$$%+- .:$MMX -M@@MM%.\n"
							+ "     =XMMM@MM@MM#H;,-+HMM@M+ /MMMX=\n"
							+ "       =%@M@M#@$-.=$@MM@@@M; %M%=\n"
							+ "         ,:+$+-,/H#MMMMMMM@- -,\n"
							+ "               =++%%%%+/:-.");
					try {
						Thread.sleep(2400);
						clearScreen();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					stage3 = "cleared";
				}
			} 
			if(stage3.equals("cleared")) {
				//Player has to stab themselves to complete loop. Narrator continues to suffer
				System.out.println("Welcome. Would you end my suffering? Take this knife.\n");
				System.out.println("1)Stab yourself\n2)Stab the Narrator\n3)Stab?? Why are we stabbing??");
				while(repeat) {
					userInput = TextIO.getlnString();
					if(userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {
						repeat = false;
					} else {
						repeat = true;
						System.out.println("Enter valid input.");
					}
				}
				repeat = true;
				if(userInput.equals("1")) {
					System.out.println("Ah, the self-sacrificing type.");
					try {
						Thread.sleep(2400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("You are the dead body beside the tree then, completing the loop");
					System.out.println("by lengthening the Narrator's suffering and madness.");
				} else if(userInput.equals("2")) {
					System.out.println("The surviving type!");
					try {
						Thread.sleep(2400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("The Narrator is the dead body beside the tree then, completing");
					System.out.println("the loop by replacing the original narrator in his madness.");
				} else {
					System.out.println("Indecisive...");
					try {
						Thread.sleep(2400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("The Narrator kills you in their madness.");
				}
				done = true;
			}
		} // end while loop
	}

	private static void clearScreen() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}

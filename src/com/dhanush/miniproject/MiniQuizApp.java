package com.dhanush.miniproject;

import java.util.Scanner;

class Quiz {
	QuizDemo qd = new QuizDemo();
	Scanner sc = new Scanner(System.in);
	String[] options;
	int point = 0;
	static int lifeline = 2;
	static int fifty = 1;
	static int audince = 1;
	static int swap = 1;
	boolean op1, op2, op3, op4, op5, op6, op7, op8, op9, op10;

	public void sq1() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ1)Which programming language is known as the \"mother of all languages\"?\r\n"
				+ "1) C\r\n" + "2) Java\r\n" + "3) Assembly\r\n" + "4) Fortran");
	}

	public void sq2() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ2)What does HTML stand for?\r\n" + "1) Hyper Text Markup Language\r\n"
				+ "2) High Text Markup Language\r\n" + "3) Hyperlinks Text Making Language\r\n"
				+ "4) Hyper Text Machine Language");
	}

	public void sq3() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ3)Which of these is used to style a web page?\r\n" + "1) JavaScript\r\n" + "2) CSS\r\n"
				+ "3) HTML\r\n" + "4) Python");
	}

	public void sq4() {
		System.out.println("You Swapped the Question!");
		System.out.println(
				"SQ4)What does the '==' operator do in most programming languages?\r\n" + "1) Assignment operator\r\n"
						+ "2) Comparison operator\r\n" + "3) Logical operator\r\n" + "4) Mathematical operator");
	}

	public void sq5() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ5)Which of these is a valid Python data type?\r\n" + "1) String\r\n" + "2) List\r\n"
				+ "3) Integer\r\n" + "4) All of the above");
	}

	public void sq6() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ6)In which language would you typically write an Android app?\r\n" + "1) Java\r\n"
				+ "2) Python\r\n" + "3) Ruby\r\n" + "4) Swift");
	}

	public void sq7() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ7)Which of these is NOT a loop in programming?\r\n" + "1) for loop\r\n"
				+ "2) while loop\r\n" + "3) do-while loop\r\n" + "4) If loop");
	}

	public void sq8() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ8)What is the main purpose of a function in programming?\r\n" + "1) To store data\r\n"
				+ "2) To perform a specific task\r\n" + "3) To create variables\r\n" + "4) To execute the program");
	}

	public void sq9() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ9)What is the main purpose of a function in programming?\r\n" + "1) To store data\r\n"
				+ "2) To perform a specific task\r\n" + "3) To create variables\r\n" + "4) To execute the program");
	}

	public void sq10() {
		System.out.println("You Swapped the Question!");
		System.out.println("SQ2)Which of these is a correct way to create a new object in Java?\r\n"
				+ "1) Object obj = new Object();\r\n" + "2) Object obj = new();\r\n" + "3) Object obj = Object();\r\n"
				+ "4) new Object obj = new();");
	}

	public void q1() {
		System.out.println("Q1)Who is the AP CM");
	}

	public void o1() {
		options = new String[] { "1)JAGAN", "2)CHANDRABABUNAIDU", "3)YSR", "4)Dhanush", "5)LifeLine", "6)Quit",
				"7)Swap" };
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			op1 = true;
			point++;
		} else if (option == 7) {
			sq1();
			swap--;
			System.out.println("Enter the Option");
			int sOption = sc.nextInt();
			if (sOption == 4) {
				System.out.println("Congragulations you got one point");
				point++;
				op1 = true;
			} else {
				System.out.println("Sorry Wrong Answer");
				System.out.println("Questions Completed");
				System.out.println("TOTAL POINTS YOU SCORED");
				System.out.println("-----" + point + "-----");
				System.out.println("--THANK YOU--");
				qd.printCertificate("Dhanush", "19/12/2024");
				op1 = false;
			}
		} else if (option == 5) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->JAGAN", "2->CHANDHRABABUNAIDU" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op1 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op1 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)JAGAN->20%", "2)CHANDRABABUNAIDU->60%", "3)YSR->10%",
							"4)Dhanush->10%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op1 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op1 = false;
					}
				}

			}
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op1 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op1 = false;
		}
	}

	public void q2() {
		System.out.println("Q2)Who is Captain of India");
	}

	public void o2() {

		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)VIRAT", "2)DHONI", "3)ROHIT", "4)Dhanush", "5)LifeLine", "6)Quit",
						"7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)VIRAT", "2)DHONI", "3)ROHIT", "4)Dhanush", "5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)VIRAT", "2)DHONI", "3)ROHIT", "4)Dhanush", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)VIRAT", "2)DHONI", "3)ROHIT", "4)Dhanush", "5)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();

		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op2 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq2();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 1) {
					System.out.println("Congragulations you got one point");
					point++;
					op2 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op2 = false;

				}
			}

		} else if (option == 5) {
			if (audince > 0 && lifeline > 0 && fifty > 0) {
				options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();

				if (option1 == 1) {
					if (fifty > 0 && lifeline > 0) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->VIRAT", "2->ROHITH" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op2 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op2 = false;
						}
					}

				} else {
					if (audince > 0 && lifeline > 0) {
						System.out.println("AUDIENCE POLL!!");
						System.out.println("Choose the Option now");
						audince--;
						lifeline--;
						options = new String[] { "1)VIRAT->20%", "2)ROHITH->60%", "3)DHONI->10%", "4)Dhanush->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option3 = sc.nextInt();
						if (option3 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op2 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op2 = false;
						}
					}

				}

			} else if (audince > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)AUDIENCE_POLL" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						audince--;
						lifeline--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1)VIRAT->10%", "2)DHONI->10%", "3)ROHITH->70%", "4)Dhanush->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 3) {
							System.out.println("Congragulation you got one point");
							point++;
							op2 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op2 = false;
						}
					}
				}
			} else if (fifty > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)50/50" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->ROHITH", "2->VIRAT" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op2 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op2 = false;
						}
					}
				}

			}
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op2 = false;
		} else {
			System.out.println("you choosed invalid option");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op2 = false;
		}
	}

	public void q3() {
		System.out.println("Q3)Who Invented Java");
	}

	public void o3() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)JamesGoosling", "2)GuidoVanRusooom", "3)Denis", "4)MSD", "5)LifeLine",
						"6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)JamesGoosling", "2)GuidoVanRusoom", "3)Denis", "4)MSD", "5)LifeLine",
						"6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)JamesGoosling", "2)GuidoVanRusooom", "3)Denis", "4)MSD", "6)Quit",
						"7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)GamesGoosling", "2)GuidoVanRusoom", "3)Denis", "4)MSD", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			point++;
			op3 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq3();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 2) {
					System.out.println("Congragulations you got one point");
					point++;
					op3 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op3 = false;
				}
			}
		} else if (option == 5) {
			if (audince > 0 && lifeline > 0 && fifty > 0) {
				options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();

				if (option1 == 1) {
					if (fifty > 0 && lifeline > 0) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->JamesGoosling", "2->Denis" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op3 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op3 = false;
						}
					}

				} else {
					if (audince > 0 && lifeline > 0) {
						System.out.println("AUDIENCE POLL!!");
						System.out.println("Choose the Option now");
						audince--;
						lifeline--;
						options = new String[] { "1)JamesGoosling->60%", "2)GuidoVanRusoom->20%", "3)Denis->10%",
								"4)MSD->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option3 = sc.nextInt();
						if (option3 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op3 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op3 = false;
						}
					}

				}

			} else if (audince > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)AUDIENCE_POLL" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						audince--;
						lifeline--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1)JamesGoosling->60%", "2)GuidoVanRusoom->20%", "3)Denis->10%",
								"4)MSD->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op3 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op3 = false;
						}
					}
				}
			} else if (fifty > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)50/50" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->JamesGoosling", "2->Denis" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op3 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op3 = false;
						}
					}
				}

			}
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op3 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op3 = false;
		}
	}

	public void q4() {
		System.out.println("Q4)Today is what day");
	}

	public void o4() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)Monday", "2)Tuesday", "3)Sunday", "4)Saturday", "5)LifeLine", "6)Quit",
						"7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Monday", "2)Tuesday", "3)Sunday", "4)Saturday", "5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)Monday", "2)Tuesday", "3)Sunday", "4)Saturday", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Monday", "2)Tuesday", "3)Sunday", "4)Saturday", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op4 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq4();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 2) {
					System.out.println("Congragulations you got one point");
					point++;
					op4 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op4 = false;
				}
			}

		} else if (option == 5) {
			if (audince > 0 && lifeline > 0 && fifty > 0) {
				options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();

				if (option1 == 1) {
					if (fifty > 0 && lifeline > 0) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->Sunday", "2->Monday" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op4 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op4 = false;
						}
					}

				} else {
					if (audince > 0 && lifeline > 0) {
						System.out.println("AUDIENCE POLL!!");
						System.out.println("Choose the Option now");
						audince--;
						lifeline--;
						options = new String[] { "1)Monday->20%", "2)Sunday->60%", "3)Tuesday->10%", "4)Friday->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option3 = sc.nextInt();
						if (option3 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op4 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op4 = false;
						}
					}

				}

			} else if (audince > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)AUDIENCE_POLL" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						audince--;
						lifeline--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1)Monday->20%", "2)Sunday->60%", "3)Tuesday->10%", "4)Friday->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op4 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op4 = false;
						}
					}
				}
			} else if (fifty > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)50/50" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->Sunday", "2->Monday" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 1) {
							System.out.println("Congragulation you got one point");
							point++;
							op4 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op4 = false;
						}
					}
				}

			}
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op4 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op4 = false;
		}
	}

	public void q5() {
		System.out.println("Q5)What is Captial of India");
	}

	public void o5() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {

			if (swap > 0) {
				options = new String[] { "1)Jammu&Khashmir", "2)NewDelhi", "3)AndhraPradesh", "4)TamilNadu",
						"5)LifeLine", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Jammu&Khashmir", "2)NewDelhi", "3)AndhraPradesh", "4)TamilNadu",
						"5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)Jammu&Khashmir", "2)NewDelhi", "3)AndhraPradesh", "4)TamilNadu", "6)Quit",
						"7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Jammu&Khashmir", "2)NewDelhi", "3)AndhraPradesh", "4)TamilNadu", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			point++;
			op5 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq5();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 4) {
					System.out.println("Congragulations you got one point");
					point++;
					op5 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op5 = false;
				}
			}
		} else if (option == 5) {
			if (audince > 0 && lifeline > 0 && fifty > 0) {
				options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();

				if (option1 == 1) {
					if (fifty > 0 && lifeline > 0) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->Jammu&Khashmir", "2->NewDelhi" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op5 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op5 = false;
						}
					}

				} else {
					if (audince > 0 && lifeline > 0) {
						System.out.println("AUDIENCE POLL!!");
						System.out.println("Choose the Option now");
						audince--;
						lifeline--;
						options = new String[] { "1)Jammu&Khashmir->10%", "2)NewDelhi->70%", "3)AndhraPradesh->10%",
								"4)TamilNadu->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option3 = sc.nextInt();
						if (option3 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op5 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op5 = false;
						}
					}

				}

			} else if (audince > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)AUDIENCE_POLL" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						audince--;
						lifeline--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1)Jammu&Khashmir->10%", "2)NewDelhi->70%", "3)AndhraPradesh->10%",
								"4)TamilNadu->10%" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op5 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op5 = false;
						}
					}
				}
			} else if (fifty > 0 && lifeline > 0) {
				if (option == 5) {
					options = new String[] { "1)50/50" };
					System.out.println("LIFELINE Options are->");
					System.out.println("Choose the option now");
					for (String s : options) {
						System.out.println(s);
					}
					int option1 = sc.nextInt();
					if (option1 == 1) {
						System.out.println(
								"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
						lifeline--;
						fifty--;
						System.out.println("ALL THE BEST!!");
						options = new String[] { "1->Jammu&Khashmir", "2->NewDelhi" };
						for (String s : options) {
							System.out.println(s);
						}
						int option2 = sc.nextInt();
						if (option2 == 2) {
							System.out.println("Congragulation you got one point");
							point++;
							op5 = true;
						} else {
							System.out.println("You Choosed InValid Option");
							System.out.println("Questions Completed");
							System.out.println("TOTAL POINTS YOU SCORED");
							System.out.println("-----" + point + "-----");
							System.out.println("--THANK YOU--");
							qd.printCertificate("Dhanush", "19/12/2024");
							op5 = false;
						}
					}
				}
			}
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op5 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op5 = false;
		}
	}

	public void q6() {
		System.out.println("Q6)Which is the MarkUpLanguage?");
	}

	public void o6() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)HTML", "2)CSS", "3)JS", "4)JAVA", "5)LifeLine", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)HTML", "2)CSS", "3)JS", "4)JAVA", "5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)HTML", "2)CSS", "3)JS", "4)JAVA", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)HTML", "2)CSS", "3)JS", "4)JAVA", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			point++;
			op6 = true;
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op6 = false;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq6();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 1) {
					System.out.println("Congragulations you got one point");
					point++;
					op6 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op6 = false;
				}
			}
		} else if (audince > 0 && lifeline > 0 && fifty > 0) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->HTML", "2->CSS" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op6 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op6 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)HTML->80%", "2)CSS->10%", "3)JS->10%", "4)JAVA->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op6 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op6 = false;
					}
				}

			}

		} else if (audince > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					audince--;
					lifeline--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1)HTML->80%", "2)CSS->10%", "3)JS->10%", "4)JAVA->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op6 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op6 = false;
					}
				}
			}
		} else if (fifty > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)50/50" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->HTML", "2->JAVA" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op6 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op6 = false;
					}
				}
			}

		}

		else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op6 = false;
		}
	}

	public void q7() {
		System.out.println("Q7)Which is not a KeyWord in java?");
	}

	public void o7() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)try", "2)static", "3)ArrayList", "4)do", "5)LifeLine", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)try", "2)static", "3)ArrayList", "4)do", "5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)try", "2)static", "3)ArrayList", "4)do", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)try", "2)static", "3)ArrayList", "4)do", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op7 = true;
		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op7 = false;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq7();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 4) {
					System.out.println("Congragulations you got one point");
					point++;
					op7 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op7 = false;
				}
			}
		} else if (audince > 0 && lifeline > 0 && fifty > 0) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->ArrayList", "2->try" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op7 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op7 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)try->5%", "2)ArrayList->90%", "3)do->5%", "4)static->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op7 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op7 = false;
					}
				}

			}

		} else if (audince > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					audince--;
					lifeline--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1)try->5%", "2)ArrayList->90%", "3)do->5%", "4)static->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op7 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op7 = false;
					}
				}
			}
		} else if (fifty > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)50/50" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->try", "2->ArrayList" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op7 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op7 = false;
					}
				}
			}

		}

		else {
			System.out.println("Sorry Worng Answer!");
			op7 = true;
		}
	}

	public void q8() {
		System.out.println("Q8)What is the OutPut for the below code");
	}

	public void o8() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				System.out.println();
				System.out.println("byte a=10");
				System.out.println("byte a=20");
				System.out.println("byte c=a+b");
				System.out.println("System.out.println(c)");
				System.out.println();
				options = new String[] { "1)30", "2)-30", "3)RunTimeError", "4)CompileTimeError", "5)LifeLine",
						"6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				System.out.println();
				System.out.println("byte a=10");
				System.out.println("byte a=20");
				System.out.println("byte c=a+b");
				System.out.println("System.out.println(c)");
				System.out.println();
				options = new String[] { "1)30", "2)-30", "3)RunTimeError", "4)CompileTimeError", "5)LifeLine",
						"6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				System.out.println();
				System.out.println("byte a=10");
				System.out.println("byte a=20");
				System.out.println("byte c=a+b");
				System.out.println("System.out.println(c)");
				System.out.println();
				options = new String[] { "1)30", "2)-30", "3)RunTimeError", "4)CompileTimeError", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				System.out.println();
				System.out.println("byte a=10");
				System.out.println("byte a=20");
				System.out.println("byte c=a+b");
				System.out.println("System.out.println(c)");
				System.out.println();
				options = new String[] { "1)30", "2)-30", "3)RunTimeError", "4)CompileTimeError", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op8 = true;
		} else if (option == 6) {

			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op8 = false;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq8();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 2) {
					System.out.println("Congragulations you got one point");
					point++;
					op8 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op8 = false;
				}
			}
		} else if (audince > 0 && lifeline > 0 && fifty > 0) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->RunTimeError", "2->30" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op8 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op8 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)-30->5%", "2)RunTimeError->90%", "3)CompileTimeError->5%", "4)30->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op8 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op8 = false;
					}
				}

			}

		} else if (audince > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					audince--;
					lifeline--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1)-30->5%", "2)RunTimeError->90%", "3)CompileTimeError->5%", "4)30->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op8 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op8 = false;
					}
				}
			}
		} else if (fifty > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)50/50" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->30", "2->RunTimeError" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op8 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op8 = false;
					}
				}
			}

		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op8 = false;
		}
	}

	public void q9() {
		System.out.println("Q9)Who won the IPL Trophy in 2016");
	}

	public void o9() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)CSK", "2)SRH", "3)RCB", "4)KKR", "5)LifeLine", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)CSK", "2)SRH", "3)RCB", "4)KKR", "5)LifeLine", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		} else {
			if (swap > 0) {
				options = new String[] { "1)CSK", "2)SRH", "3)RCB", "4)KKR", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)CSK", "2)SRH", "3)RCB", "4)KKR", "6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			point++;
			op9 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq9();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 2) {
					System.out.println("Congragulations you got one point");
					point++;
					op9 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op8 = false;
				}
			}
		} else if (audince > 0 && lifeline > 0 && fifty > 0) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->SRH", "2->RCB" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op9 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op9 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)KKR->5%", "2)SRH->90%", "3)RCB->5%", "4)CSK->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op9 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op9 = false;
					}
				}

			}

		} else if (audince > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					audince--;
					lifeline--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1)KKR->5%", "2)SRH->90%", "3)RCB->5%", "4)CSK->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op9 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op9 = false;
					}
				}
			}
		} else if (fifty > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)50/50" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->kKR", "2->SRH" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op9 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op9 = false;
					}
				}
			}

		} else if (option == 6) {
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op9 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op9 = false;
		}
	}

	public void q10() {
		System.out.println("Q10)Who is the markedInterface in JAVA");
	}

	public void o10() {
		if (lifeline > 0 || fifty > 0 || audince > 0) {
			if (swap > 0) {
				options = new String[] { "1)Serilaizable", "2)Runnable", "3)Comparable", "4)Set", "5)LifeLine",
						"6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Serilaizable", "2)Runnable", "3)Comparable", "4)Set", "5)LifeLine",
						"6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}

		} else {
			if (swap > 0) {
				options = new String[] { "1)Serilaizable", "2)Runnable", "3)Comparable", "4)Set", "6)Quit", "7)Swap" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			} else {
				options = new String[] { "1)Serilaizable", "2)Runnable", "3)Comparable", "4)Set", "5)LifeLine",
						"6)Quit" };
				System.out.println("Options Are->");
				for (String s : options) {
					System.out.println(s);
				}
			}
		}
	}

	public void dispO10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			point++;
			op10 = true;
		} else if (option == 7) {
			if (swap > 0) {
				swap--;
				sq10();
				System.out.println("Enter the Option");
				int sOption = sc.nextInt();
				if (sOption == 1) {
					System.out.println("Congragulations you got one point");
					point++;
					op10 = true;
				}

				else {
					System.out.println("You Choosed InValid Option");
					System.out.println("Questions Completed");
					System.out.println("TOTAL POINTS YOU SCORED");
					System.out.println("-----" + point + "-----");
					System.out.println("--THANK YOU--");
					qd.printCertificate("Dhanush", "19/12/2024");
					op10 = false;
				}
			}
		} else if (audince > 0 && lifeline > 0 && fifty > 0) {
			options = new String[] { "1)50/50", "2)AUDIENCE_POLL" };
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for (String s : options) {
				System.out.println(s);
			}
			int option1 = sc.nextInt();

			if (option1 == 1) {
				if (fifty > 0 && lifeline > 0) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->Serilaizable", "2->Runnable" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 1) {
						System.out.println("Congragulation you got one point");
						point++;
						op10 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op10 = false;
					}
				}

			} else {
				if (audince > 0 && lifeline > 0) {
					System.out.println("AUDIENCE POLL!!");
					System.out.println("Choose the Option now");
					audince--;
					lifeline--;
					options = new String[] { "1)KKR->5%", "2)SRH->90%", "3)RCB->5%", "4)CSK->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option3 = sc.nextInt();
					if (option3 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op10 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op10 = false;
					}
				}

			}

		} else if (audince > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)AUDIENCE_POLL" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					audince--;
					lifeline--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1)KKR->5%", "2)SRH->90%", "3)RCB->5%", "4)CSK->0%" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op10 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op10 = false;
					}
				}
			}
		} else if (fifty > 0 && lifeline > 0) {
			if (option == 5) {
				options = new String[] { "1)50/50" };
				System.out.println("LIFELINE Options are->");
				System.out.println("Choose the option now");
				for (String s : options) {
					System.out.println(s);
				}
				int option1 = sc.nextInt();
				if (option1 == 1) {
					System.out.println(
							"You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
					lifeline--;
					fifty--;
					System.out.println("ALL THE BEST!!");
					options = new String[] { "1->kKR", "2->SRH" };
					for (String s : options) {
						System.out.println(s);
					}
					int option2 = sc.nextInt();
					if (option2 == 2) {
						System.out.println("Congragulation you got one point");
						point++;
						op10 = true;
					} else {
						System.out.println("You Choosed InValid Option");
						System.out.println("Questions Completed");
						System.out.println("TOTAL POINTS YOU SCORED");
						System.out.println("-----" + point + "-----");
						System.out.println("--THANK YOU--");
						qd.printCertificate("Dhanush", "19/12/2024");
						op10 = false;
					}
				}
			}

		} else if (option == 6) {

			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op10 = false;
		} else {
			System.out.println("You Choosed InValid Option");
			System.out.println("Questions Completed");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----" + point + "-----");
			System.out.println("--THANK YOU--");
			qd.printCertificate("Dhanush", "19/12/2024");
			op10 = false;
		}
	}

	public void user() {
		System.out.println("---------QUIZE---------");
		System.out.println("Enter the USER details!!");
		System.out.println("NAME              ->");
		System.out.println("AGE               ->");
		System.out.println("GENDER(M/F/Others)->");
		String name = new Scanner(System.in).nextLine();
		int age = new Scanner(System.in).nextInt();
		String gen = new Scanner(System.in).nextLine();
		if (age >= 18 && (gen.equalsIgnoreCase("M") || gen.equalsIgnoreCase("male"))) {

			System.out.println("\tThank You! Your information has been successfully sumbitted.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("About Quiz Challenge:\n");
			System.out.println("  -->This quiz is designated to challenge and entertain you.");
			System.out.println("  -->This quiz have 10 General Knowledge Questions.");
			System.out.println("  -->Each question have contains 7 options.");
			System.out.println("  -->Each correct answer has  allocated one mark.");
			System.out.println("  -->The correct answer is within the  first four options listed.");
			System.out.println("  -->Then fifth option is Lifeline in which again it has two options.");
			System.out.println("\t  -->1.50/50");
			System.out.println("\t  -->2.Audience pool");
			System.out.println("  -->Please note that each of the lifeline option should be used by only one time.");
			System.out.println("  -->Finally sixth option is Quit option ");
			System.out.println("  -->7th Option is Swap is you want to change the question u can------->");
			System.out.println(
					"NOTE-->If you choose an option that is not listed in the question,\nyou will automatically proceed to the next question and receive zero marks for the current question.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("WELCOME Mr." + name + " now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST Mr." + name);
		} else if ((age >= 18 && gen.equalsIgnoreCase("F") || gen.equalsIgnoreCase("male"))) {
			System.out.println("\tThank You! Your information has been successfully sumbitted.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("About Quiz Challenge:\n");
			System.out.println("  -->This quiz is designated to challenge and entertain you.");
			System.out.println("  -->This quiz have 10 General Knowledge Questions.");
			System.out.println("  -->Each question have contains six options.");
			System.out.println("  -->Each correct answer has  allocated one mark.");
			System.out.println("  -->The correct answer is within the  first four options listed.");
			System.out.println("  -->Then fifth option is Lifeline in which again it has two options.");
			System.out.println("\t  -->1.50/50");
			System.out.println("\t  -->2.Audience pool");
			System.out.println("  -->Please note that each of the lifeline option should be used by only one time.");
			System.out.println("  -->Finally sixth option is Quit option");
			System.out.println("  -->7th Option is Swap is you want to change the question u can------->");
			System.out.println(
					"NOTE-->If you choose an option that is not listed in the question,\nyou will automatically proceed to the next question and receive zero marks for the current question.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("WELCOME Mrs." + name + " now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST Mrs." + name);
		} else {
			System.out.println("\tThank You! Your information has been successfully sumbitted.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("About Quiz Challenge:\n");
			System.out.println("  -->This quiz is designated to challenge and entertain you.");
			System.out.println("  -->This quiz have 10 General Knowledge Questions.");
			System.out.println("  -->Each question have contains six options.");
			System.out.println("  -->Each correct answer has  allocated one mark.");
			System.out.println("  -->The correct answer is within the  first four options listed.");
			System.out.println("  -->Then fifth option is Lifeline in which again it has two options.");
			System.out.println("\t  -->1.50/50");
			System.out.println("\t  -->2.Audience pool");
			System.out.println("  -->Please note that each of the lifeline option should be used by only one time.");
			System.out.println("  -->Finally sixth option is Quit option");
			System.out.println("  -->7th Option is Swap is you want to change the question u can------->");
			System.out.println(
					"NOTE-->If you choose an option that is not listed in the question,\nyou will automatically proceed to the next question and receive zero marks for the current question.");
			System.out.println("<-------------------------------------------------------------------->");
			System.out.println("WELCOME " + name + " now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST " + name);
		}

	}

}

class QuizDemo {
	public static void printCertificate(String recipientName, String certificateDate) {
		String border = "*".repeat(125);
		System.out.println(border);

		// Calculate the center position dynamically for each line
		int totalWidth = 125;

		// Print the title of the certificate (Centered)
		String title = "Certificate of Completion";
		System.out.printf("%s%n", centerText(title, totalWidth));

		// Print the body of the certificate (Centered)
		System.out.println();
		System.out.printf("%s%n", centerText("This is to certify that", totalWidth));
		System.out.printf("%s%n", centerText(recipientName, totalWidth));
		System.out.printf("%s%n", centerText("has successfully completed the quiz.", totalWidth));

		// Print the date (Centered)
		System.out.printf("%s%n", centerText("Date: " + certificateDate, totalWidth));

		// Leave some space
		System.out.println();

		// Print a closing line (signature or instructor name)
		System.out.printf("%s%n", centerText("Instructor: Akash Patil!", totalWidth));

		// Print the border again to close the certificate
		System.out.println(border);
	}

	/**
	 * Centers the text within the given total width.
	 * 
	 * @param text  The text to center
	 * @param width The total width of the space to fill
	 * @return The centered text as a String
	 */
	public static String centerText(String text, int width) {
		int padding = (width - text.length()) / 2;
		return " ".repeat(padding) + text + " ".repeat(padding);
	}

	public void init() {

		Quiz q = new Quiz();
		q.q1();
		q.o1();
		q.dispO1();

		if (q.op1) {
			q.q2();
			q.o2();
			q.dispO2();

			if (q.op2) {
				q.q3();
				q.o3();
				q.dispO3();

				if (q.op3) {
					q.q4();
					q.o4();
					q.dispO4();

					if (q.op4) {
						q.q5();
						q.o5();
						q.dispO5();

						if (q.op5) {
							q.q6();
							q.o6();
							q.dispO6();

							if (q.op6) {
								q.q7();
								q.o7();
								q.dispO7();

								if (q.op7) {
									q.q8();
									q.o8();
									q.dispO8();
								}

								if (q.op8) {
									q.q9();
									q.o9();
									q.dispO9();
								}

								if (q.op9) {
									q.q10();
									q.o10();
									q.dispO10();
								}
								System.out.println("Questions Completed");
								System.out.println("TOTAL POINTS YOU SCORED");
								System.out.println("-----" + q.point + "-----");
								System.out.println("--THANK YOU--");
								printCertificate("Dhanush", "20/12/2024");
							}
						}
					}
				}
			}
		}
	}
}

public class MiniQuizApp {
	public static void main(String[] args) {
		QuizDemo qd = null;
		Quiz q = null;
		try {
			q = new Quiz();
			q.user();
			qd = new QuizDemo();
			qd.init();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("INVALID!! The REASON " + e);
			System.out.println("Re-Attend the QUIZ OnceAgain");
			try {
				q.user();
				qd.init();
			} catch (Throwable e1) {
				System.out.println("INVALID!! The REASON " + e);
				System.out.println("Re-Attend the QUIZ OnceAgain");
				try {
					q.user();
					qd.init();
				} catch (Throwable e2) {
					System.out.println("INVALID!! The REASON " + e);
					System.out.println("YOU ARE CROSSED THE LIMITS");
					System.out.println("YOU ARE BLOCKED");
				}
			}
		}
	}
}

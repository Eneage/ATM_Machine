public class ATM {
	private static int Uname;
	private static int pwd;
	private static int money = 0;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		// Вводим номер карты
		
		
		while(true){
			show();
			int index = sc.nextInt();
			if(index == 1){				//авторизоваться 
				login(sc);
				break;
			}
			else{
				caozuo2(index);
			}
		}
		
		while(true){
			int index = sc.nextInt();
			if(index == 1){			//Снять
				Withdrawal(sc);
				int index1 = sc.nextInt();
				if(index1==1 || index1==2){
					caozuo1(index1);
				}
				else{
					caozuo2(index1);
					Withdrawal(sc);
				}
			}
			
			if(index == 2){			// Проверяем баланс
				select(money);
				int index1 = sc.nextInt();
				if(index1==1 || index1==2){
					caozuo1(index1);
				}
				else{
					caozuo2(index1);
					select(money);
				}
			}
			if(index == 3){			// Положить деньги
				fund(sc);
				int index1 = sc.nextInt();
				if(index1==1 || index1==2){
					caozuo1(index1);
				}
				else{
					caozuo2(index1);
					fund(sc);
				}
			}
			if(index == 4){			// выходим из программы
				exit();
			}
		}
		
	}
	
	public static void caozuo1(int index1){
		if(index1 == 1){		// Вход в главное меню
			menu();
		}
		else if(index1 == 2){		// выходим из программы
			exit();
		}
	}
	public static void caozuo2(int index1){
		
		System.out.println("Ошибка, повторите ввод!");
		System.out.println("Напоминание: введите цифру 1 или 2!");
	}
	// показать страницу входа
	public static void show(){
		System.out.println("---------------------");
		System.out.println("| Добро пожаловать |");
		System.out.println("| 1. Войти |");
		System.out.println("| Добро пожаловать |");
		System.out.println("---------------------");
		System.out.println("Пожалуйста, номер карты:");
	}
	//авторизоваться
	public static void login(Scanner sc){
		for(int i = 0; i < 3; i++){
			System.out.println("Пожалуйста, введите имя пользователя:");
			int Uname1 = sc.nextInt();
			if(Uname1 == pwd){
				System.out.println("Пожалуйста введите ваш пароль:");
				int pwd1 = sc.nextInt();
				if(pwd1 == pwd){
					System.out.println("Успешно");
					menu();
					break;
				}
				else{
					System.out.println("Введенный вами пароль неверен, пожалуйста, войдите снова");
				}
			}
			else{
				System.out.println("Введенная вами учетная запись не существует, пожалуйста, войдите снова");
			}
		}
		
	}
	// Меню
	public static void menu(){			// Главная страница после входа в систему
		System.out.println("----------------------");
		System.out.println("| Добро пожаловать |");
		System.out.println("| 1. Снять деньги |");
		System.out.println("| 2. Проверить баланс |");
		System.out.println("| 3. Положить деньги |");
		System.out.println("| 4. Выход |");
		System.out.println("| Добро пожаловать |");
		System.out.println("----------------------");
		System.out.println("Пожалуйста, номер карты:");
	}
	
	public static int Withdrawal(Scanner sc){			//Снять
		
		System.out.println("Пожалуйста, введите сумму вывода:");
		int money1 = sc.nextInt();
		if(money1 > money){
			System.out.println("---------------------------");
			System.out.println("| Добро пожаловать |");
			System.out.println("|                         |");
			System.out.println("|                         |");
			System.out.println("| Извините, на вашем балансе недостаточно средств|");
			System.out.println("| Транзакция не удалась |");
			System.out.println("|                         |");
			System.out.println("|                         |");
			System.out.println("| 1. Вернуться в главное меню |");
			System.out.println("| 2. Выйти из программы |");
			System.out.println("| Добро пожаловать |");
			System.out.println("---------------------------");
			System.out.println("Пожалуйста, введите номер карты:");
		}
		else{
			money -= money1;
			System.out.println("---------------------------");
			System.out.println("| Добро пожаловать |");
			System.out.println("|                         |");
			System.out.println("|                         |");
			System.out.println("| Успешно |");
			System.out.println("|                         |");
			System.out.println("|                         |");
			System.out.println("| 1. Вернуться в главное меню |");
			System.out.println("| 2. Выйти из программы |");
			System.out.println("| Добро пожаловать |");
			System.out.println("---------------------------");
			System.out.println("Пожалуйста, введите номер карты:");
		}
		return money;
		
	}
	
	public static void select(int money){				// Баланс
		System.out.println("---------------------------");
		System.out.println("| Добро пожаловать |");
		System.out.println("|                         |");
		System.out.println("|                         |");
		System.out.println("| Ваш текущий баланс"+money+"руб. |");
		System.out.println("|                         |");
		System.out.println("|                         |");
		System.out.println("| 1. Вернуться в главное меню |");
		System.out.println("| 2. Выйти из программы |");
		System.out.println("| Добро пожаловать |");
		System.out.println("---------------------------");
		System.out.println("Пожалуйста, введите номер карты:");
	}
	
	public static int fund(Scanner sc){				// Положить деньги
		System.out.println("Пожалуйста, введите сумму:");
		int money1 = sc.nextInt();
		money += money1;
		System.out.println("---------------------------");
		System.out.println("| Добро пожаловать |");
		System.out.println("|                         |");
		System.out.println("|                         |");
		System.out.println("| Успешно |");
		System.out.println("|                         |");
		System.out.println("|                         |");
		System.out.println("| 1. Вернуться в главное меню |");
		System.out.println("| 2. Выйти из программы |");
		System.out.println("| Добро пожаловать |");
		System.out.println("---------------------------");
		System.out.println("Пожалуйста, введите номер карты:");
		return money;
	}
	
	public static void exit(){				// выходим из программы
		System.out.println("-----------------------");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("| До новых встреч |");
		System.out.println("|                     |");
		System.out.println("|                     |");
		System.out.println("-----------------------");
	}
	
}







class Con1 {

	public static void main(String[] args) {
	
		int data = 500;

		if (data<500) {
		switch (data) {
		
			case 100:
				System.out.println("1 Hundred");
			case 200:
				System.out.println("2 Hundred");
			case 300:
				System.out.println("3 Hundred");
			case 400:
				System.out.println("4 Hundred");

		}
		}
		else {
			if (data>500) {
			
				switch (data) {
				
					case 600:
						System.out.println("6 Hundred");
					case 700:
						System.out.println("7 Humdred");
					case 800:
						System.out.println("8 Humdred");
					case 900:
						System.out.println("9 Hundred");
					case 1000:
						System.out.println("Thousand");

				}
			}else {
			
				System.out.println("Coder");
			}
		
		}
	}
}

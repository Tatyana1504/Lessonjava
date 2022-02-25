class HomeWorkApp {
   public static void main(String[] args) {
      printThreeWords();
	  checkSumSign();
	  printCoior();
	  compareNumbers();
	  
   }
   public static void printThreeWords() {
      System.out.println("Orange");
      System.out.println("Banana");
      System.out.println("Apple");
   }
       
    public static void checkSumSign() {
		int a = 5, b = 6, c = 0;
		c = a + b;
		if (c >= 0) {
			System.out.println("Summa + ");
	    } else {
            System.out.println("Summa - ");
        }
    }
	
    public static void printCoior() {
        int value = 1000;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("Green");
        }
	}
	
	public static void compareNumbers() {
	    int a = 7, b = 10;
		if (a >= b) {
		    System.out.println("a>=b");
		} else {
			System.out.println("a<b");
		}
	}
}
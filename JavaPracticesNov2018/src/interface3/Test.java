package interface3;
interface Num {
    int getSum(int x);
  }

  interface Num2 extends Num {
	public int x = 5;
    void getLong();
  }

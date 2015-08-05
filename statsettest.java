public class statsettest {
	public static void main(String [] args) {
		statset k = new statset();

		k.pushStat(2);
		k.pushStat(4);
		k.pushStat(6);
		k.pushStat(8);
		k.pushStat(10);
		System.out.println(k.getBound());
		System.out.println(k.getMean());
		System.out.println(k.getVari());
		System.out.println(k.getStdDev());
	}
}

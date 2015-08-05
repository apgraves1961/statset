public class statset {
	double sum, sumsq, mean, vari, stddev;
	int bound;

	public statset() {
		sum = 0.0;
		sumsq = 0.0;
		mean = 0.0;
		vari = 0.0;
		stddev = 0.0;
		bound = 0;
	}

	public double getSum() {
		return sum;
	}

	public double getSumsq() {
		return sumsq;
	}

	public double getMean() {
		return mean;
	}

	public double getVari() {
		return vari;
	}

	public double getStdDev() {
		return stddev;
	}

	public int getBound() {
		return bound;
	}

	public void pushStat(double stat) {
		bound++;
		sum += stat;
		sumsq += stat * stat;
		mean = sum / bound;
		vari = (sumsq / bound) - (mean * mean);
		stddev = Math.sqrt(vari);
	}
}

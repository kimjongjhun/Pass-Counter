import java.text.DecimalFormat;

public class Variables {

	private int homePass;
	private int homeMiss;
	private int homeTotal;
	double homeCompletion;
	String hc;
	
	private int awayPass;
	private int awayMiss;
	private int awayTotal;
	double awayCompletion;
	String ac;
	
	DecimalFormat df = new DecimalFormat("#");	
	
	void update() {
		//calculate();
		System.out.println(homePass + " " + homeMiss + " " + homeTotal + " " + homeCompletion + " " 
							+ awayPass + " " + awayMiss + " " + awayTotal + " " + awayCompletion);
	}

	void homeSuccess() {
		++homeTotal;
		homePass++;
	}
	
	int getHomePass() {
		return homePass;
	}

	void homeMiss() {
		homeMiss++;
		homeTotal++;
	}
	
	int getHomeMiss() {
		return homeMiss;
	}
	
	int getHomeTotal() {
		return homeTotal;
	}
	
	String getHomeCompletion() {
		calculateHome();
		return hc;
	}
	
	void awaySuccess() {
		++awayTotal;
		awayPass++;
	}
	
	int getAwayPass() {
		return awayPass;
	}
	
	void awayMiss() {
		awayMiss++;
		awayTotal++;
	}
	
	int getAwayMiss() {
		return awayMiss;
	}
	
	int getAwayTotal() {
		return awayTotal;
	}
	
	String getAwayCompletion() {
		calculateAway();
		return ac;
	}
	
	void calculateHome() {
		homeCompletion = (double)homePass/homeTotal*100;
		hc = df.format(homeCompletion);		
		update();
	}
	
	void calculateAway() {
		awayCompletion = (double)awayPass/awayTotal*100;
		ac = df.format(awayCompletion);
		update();
	}
	
}

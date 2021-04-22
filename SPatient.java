package application;

public class SPatient {
	
	private String fullname;
	private int score;
	
	public SPatient(String fullname,int score) {
		this.fullname = fullname;
		this.score = score;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//component 1 score
	public int component1Score(int increment6) {
		return increment6;
	}
	
	//component 2 score
	public int component2Score(int increment2,int increment5a) {
		int ans2 = 0;
		if(increment2>=0 && increment2<=15){
			ans2 = 0;
		}
		else if(increment2>=16 && increment2<=30){
			ans2 = 1;
		}
		else if(increment2>=31 && increment2<=45) {
			ans2 = 2;
		}
		else {
			ans2 = 3;
		}
		
		int score2 = ans2 + increment5a;
		int fscore=0;
		if (score2==0) {
			fscore =0;
		}
		else if(score2==1 || score2 == 2) {
			fscore = 1;
		}
		else if(score2 == 3 || score2 == 4) {
			fscore = 2;
		}
		else {
			fscore = 3;
		}
		
		return fscore;
	}
	
	//component 3 score
	public int component3Score(int increment4) {
		int point=0;
		if(increment4>=8){
			point = 0;
		}
		else if(increment4==6 || increment4==7){
			point = 1;
		}
		else if(increment4==5 || increment4==4) {
			point = 2;
		}
		else {
			point = 3;
		}
		return point;
	}
	
	//component 4 score
	public int component4Score(int increment4) {
		double efficiency = increment4/(increment4+1)*100;
		int point=0;
		if(efficiency>=85) {
			point=0;	
		}
		else if(efficiency>=75 && efficiency<85) {
			point=1;	
		}
		else if(efficiency>=65 && efficiency<75) {
			point=2;	
		}
		else {
			point=3;
		}
		return point;
	}
	
	//component 5 score
	public int component5Score(int a5b,int a5c,int a5d,int a5e,int a5f,int a5g, int a5h, int a5i, int a5j) {
		int sum = a5b+a5c+a5d+a5e+a5f+a5g+a5h+a5i+a5j;
		int point = 0;
		
		if(sum==0) {
			point=0;	
		}
		else if(sum>=1 && sum<=9) {
			point=1;	
		}
		else if(sum>=10 && sum<=18) {
			point=2;	
		}
		else {
			point=3;
		}
		return point;
	}
	
	//component 6 score
	public int component6Score(int increment7) {
		return increment7;
	}
	
	//component 7 score
	public int component7Score(int increment8,int increment9) {
		int sum = increment8+increment9;
		int point = 0;
		
		if(sum==0) {
			point=0;	
		}
		else if(sum==2 || sum==1) {
			point=1;	
		}
		else if(sum==3 || sum==4) {
			point=2;	
		}
		else {
			point=3;
		}
		return point;
	}
}
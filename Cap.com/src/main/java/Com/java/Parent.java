package Com.java;

public class Parent {
    String behavior;
    String similarity;
    int phno;
	public Parent(String behavior,String similarity,int phno) {
		super();
		this.behavior= behavior;
		this. similarity=  similarity;
		this.phno=phno;
	}
	public String getBehavior() {
		return behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	public String getSimilarity() {
		return similarity;
	}
	public void setSimilarity(String similarity) {
		this.similarity = similarity;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Parent [behavior=" + behavior + ", similarity=" + similarity + ", phno=" + phno + "]";
	}
}


    


    

 

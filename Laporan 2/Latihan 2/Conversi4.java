public class Conversi4{
	public static void main(String[]args){
	int ageYears= Integer.parseInt("100");
	double ageDays= Double.parseDouble("2.72");
	long ageSeconds= ageYears*365*240*60*60;
	System.out.println("You are "+ageDays+" days old.");
	System.out.println("You are "+ageSeconds+" seconds old.");
	}
}

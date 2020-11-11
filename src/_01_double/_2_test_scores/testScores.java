package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = JOptionPane.showInputDialog("What did score you get on your test? (Do not include the % sign)");
		double testScore = Double.parseDouble(test);
		if(testScore < 60) {
			JOptionPane.showMessageDialog(null, "You got an F. Next time you should study for the test!");
		} else if(testScore < 62) {
			JOptionPane.showMessageDialog(null, "You got a D-. Did you study?");
		} else if(testScore < 68) {
			JOptionPane.showMessageDialog(null, "You got a D. Did you study?");
		} else if(testScore < 70) {
			JOptionPane.showMessageDialog(null, "You got a D+. Did you study?");
		} else if(testScore < 72) {
			JOptionPane.showMessageDialog(null, "You got a C-. You might want to study a little harder next time.");
		} else if(testScore < 78) {
			JOptionPane.showMessageDialog(null, "You got a C. You might want to study a little harder next time.");
		} else if(testScore < 80) {
			JOptionPane.showMessageDialog(null, "You got a C+. You might want to study a little harder next time.");
		} else if(testScore < 82) {
			JOptionPane.showMessageDialog(null, "You got a B-. That is decent, although there is quite a bit of room to improve. ");
		} else if(testScore < 88) {
			JOptionPane.showMessageDialog(null, "You got a B. That is decent, although there is room to improve.");
		} else if(testScore < 90) {
			JOptionPane.showMessageDialog(null, "You got a B+. That is decent, although there is room to improve.");
		} else if(testScore < 92) {
			JOptionPane.showMessageDialog(null, "You got an A-. Wow, nice work!");
		} else if(testScore < 98) {
			JOptionPane.showMessageDialog(null, "You got an A. Wow, it seems you studied really hard!");
		} else {
			JOptionPane.showMessageDialog(null, "You got a A+. Wow! Your hard work has payed off! Keep it up!");
		}
		
	}

}

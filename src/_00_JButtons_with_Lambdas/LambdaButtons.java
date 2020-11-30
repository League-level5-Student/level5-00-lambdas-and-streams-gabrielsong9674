package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		addNumbers.addActionListener((e)->{
			String input1 = JOptionPane.showInputDialog(null, "Enter a number");
			String input2 = JOptionPane.showInputDialog(null, "Enter a number"); 
			int num1 = Integer.parseInt(input1); int num2 = Integer.parseInt(input2); 
			JOptionPane.showMessageDialog(null, num1+num2);
		});
		randNumber.addActionListener((e)->{
			Random rand = new Random();
			int randNum = rand.nextInt();
			JOptionPane.showMessageDialog(null, "Here's a random number: " + randNum);
		});
		tellAJoke.addActionListener((e)->{
			String joke = "Why do programmers like dark mode?";
			String answer = "Because the light attracts bugs";
			String userAnswer = JOptionPane.showInputDialog(null, joke);
			if(answer.equals(userAnswer)) {
				JOptionPane.showMessageDialog(null, "Right!");
			}
			else {
				JOptionPane.showMessageDialog(null, answer);
			}
		});
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}

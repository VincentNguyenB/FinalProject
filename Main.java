package final_project_text_based_rpg;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	
	/*----FOR STARTING SCREEN ONLY-----*/
	JFrame window;
	Container container;
	JPanel TitlePanel, StartButtonPanel, ContinueButtonPanel, ExitButtonPanel;
	JLabel GameTitle;
	Font GameTitleFont;
	Font ButtonFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton StartButton, ContinueButton, ExitButton;
	
	/*----FOR PLAYER CREATION SCREEN-----*/
	JPanel NameQuestionPanel, BackButtonPanel, NameInputPanel, DifficultyPanel;
	JPanel DifficultyEasyPanel, DifficultyMediumPanel, DifficultyHardPanel;
	JLabel NameQuestion, DifficultyLabel;
	JButton PlayerCreationBackButton, EnterNameInput, DifficultyEasy, DifficultyMedium, DifficultyHard;
	JTextField PlayerNameInput;
	String PlayerName;
	
	/*CHOOSE CLASS FOR HERO*/
	JPanel ClassPanel, WarriorClassPanel, MageClassPanel, ArcherClassPanel;
	JLabel CharacterClassLabel;
	JButton WarriorClassButton, MageClassButton, ArcherClassButton;

	/*Handlers & Actions*/
	StartingScreenHandler SCHandler = new StartingScreenHandler();
	PlayerCreationScreenBackHandler PCSBHandler = new PlayerCreationScreenBackHandler();
	NameInputHandler NameHandler = new NameInputHandler();
	EasyButtonHandler EasyHandler = new EasyButtonHandler();
	MediumButtonHandler MediumHandler = new MediumButtonHandler();
	HardButtonHandler HardHandler = new HardButtonHandler();
	
	/*Variables*/
	final int WindowHorizontalLength = 800;
	final int WindowVerticalLength = 600;
	
	/*Passing Objects*/
	Player player = new Player("a", 1);
	
	public static void main(String[] args) {
		new Main();
	}
		
	public Main() {
		//Font stuffs
		try {
			GameTitleFont = Font.createFont(Font.TRUETYPE_FONT, new File("DeterminationMonoWebRegular-Z5oq.ttf")).deriveFont(120f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DeterminationMonoWebRegular-Z5oq.ttf")));
		}
		catch(IOException | FontFormatException e) {
		}
		
		
		//Create the main game window & its features
		window = new JFrame();
		window.setSize(WindowHorizontalLength, WindowVerticalLength);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setTitle("Project Text-Based RPG");
		window.setResizable(false);
		container = window.getContentPane();
		window.setLocationRelativeTo(null);
		
		
		//Panels & Labels
		TitlePanel = new JPanel();
		TitlePanel.setBounds(100, 50, 600, 150);
		TitlePanel.setBackground(Color.black);
		
		GameTitle = new JLabel("EPIC RPG");
		GameTitle.setForeground(Color.white);
		GameTitle.setFont(GameTitleFont);
		
		//Start Button
		StartButtonPanel = new JPanel();
		StartButtonPanel.setBounds(300, 250, 200, 50);
		StartButtonPanel.setBackground(Color.gray);
		
		StartButton = new JButton("Start");
		StartButton.setBackground(Color.gray);
		StartButton.setForeground(Color.white);
		StartButton.setFont(ButtonFont);
		StartButton.addActionListener(SCHandler);
		
		//Continue Button
		ContinueButtonPanel = new JPanel();
		ContinueButtonPanel.setBounds(300, 350, 200, 50);
		ContinueButtonPanel.setBackground(Color.gray);
		
		ContinueButton = new JButton("Continue");
		ContinueButton.setBackground(Color.gray);
		ContinueButton.setForeground(Color.white);
		ContinueButton.setFont(ButtonFont);
		
		//Exit Button
		ExitButtonPanel = new JPanel();
		ExitButtonPanel.setBounds(300, 450, 200, 50);
		ExitButtonPanel.setBackground(Color.gray);
		
		ExitButton = new JButton("Exit");
		ExitButton.setBackground(Color.gray);
		ExitButton.setForeground(Color.white);
		ExitButton.setFont(ButtonFont);
		ExitButton.addActionListener((event) -> System.exit(0));
		
		//FRAME ESTABLISHERS
		TitlePanel.add(GameTitle);	
		StartButtonPanel.add(StartButton);
		ContinueButtonPanel.add(ContinueButton);
		ExitButtonPanel.add(ExitButton);
		
		container.add(TitlePanel);
		container.add(StartButtonPanel);
		container.add(ContinueButtonPanel);
		container.add(ExitButtonPanel);
		
		window.setVisible(true);
	}
	
	public void PlayerCreationScreen() {
		//----SET FRAME
		TitlePanel.setVisible(false);
		StartButtonPanel.setVisible(false);
		ContinueButtonPanel.setVisible(false);
		ExitButtonPanel.setVisible(false);
		
		//----PANEL FOR THE QUESTION PROMPT
		NameQuestionPanel = new JPanel();
		NameQuestionPanel.setBounds(100, 50, 600, 150);
		NameQuestionPanel.setBackground(Color.DARK_GRAY);
		
		//----LABEL TO BE INCLUDED WITH THE QUESTION PROMPT
		NameQuestion = new JLabel("What would be your hero name?");
		NameQuestion.setForeground(Color.white);
		NameQuestion.setFont(ButtonFont);
		
		//----TEXT FIELD TO TAKE PLAYER INPUT FOR NAME
		NameInputPanel = new JPanel();
		NameInputPanel.setBounds(125, 100, 550, 75);
		NameInputPanel.setLayout(new GridLayout(1,2));
		
		PlayerNameInput = new JTextField();
		NameInputPanel.add(PlayerNameInput);
		
		EnterNameInput = new JButton("Enter");
		EnterNameInput.addActionListener(NameHandler);
		NameInputPanel.add(EnterNameInput); 	
		
		//----BACK BUTTON PANEL
		BackButtonPanel = new JPanel();
		BackButtonPanel.setBounds(50, 500, 100, 35);
		BackButtonPanel.setBackground(Color.GRAY);
		
		//----BACK BUTTON
		PlayerCreationBackButton = new JButton("<<< Go Back");
		PlayerCreationBackButton.setBackground(Color.gray);
		PlayerCreationBackButton.setForeground(Color.white);
		PlayerCreationBackButton.addActionListener(PCSBHandler);
		
		//----BUTTONS TO SET DIFFICULTIES ALONG WITH THEIR PANELS & LABELS
		DifficultyPanel = new JPanel();
		DifficultyPanel.setBounds(200, 250, 400, 50);
		DifficultyPanel.setBackground(Color.gray);
		
		DifficultyLabel = new JLabel("Choose Difficulty");
		DifficultyLabel.setForeground(Color.white);
		DifficultyLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		
		DifficultyEasyPanel = new JPanel();
		DifficultyEasyPanel.setBounds(300, 325, 200, 50);
		DifficultyEasyPanel.setBackground(Color.gray);
				
		DifficultyEasy = new JButton("Easy");
		DifficultyEasy.addActionListener(EasyHandler);
		
		DifficultyMediumPanel = new JPanel();
		DifficultyMediumPanel.setBounds(300, 400, 200, 50);
		DifficultyMediumPanel.setBackground(Color.gray);
		
		DifficultyMedium = new JButton("Medium");
		DifficultyMedium.addActionListener(MediumHandler);
		
		DifficultyHardPanel = new JPanel();
		DifficultyHardPanel.setBounds(300, 475, 200, 50);
		DifficultyHardPanel.setBackground(Color.gray);
		
		DifficultyHard = new JButton("Hard");
		DifficultyHard.addActionListener(HardHandler);
		
		//----FRAME ESTABLISHERS
		NameQuestionPanel.add(NameQuestion);
		BackButtonPanel.add(PlayerCreationBackButton);
		DifficultyPanel.add(DifficultyLabel);
		DifficultyEasyPanel.add(DifficultyEasy);
		DifficultyMediumPanel.add(DifficultyMedium);
		DifficultyHardPanel.add(DifficultyHard);
		
		container.add(NameQuestionPanel);
		container.add(NameInputPanel);
		container.add(BackButtonPanel);
		container.add(DifficultyPanel);
		container.add(DifficultyEasyPanel);
		container.add(DifficultyMediumPanel);
		container.add(DifficultyHardPanel);
	}
	
	public void ChooseClassScreen() {
		NameQuestionPanel.setVisible(false);
		PlayerNameInput.setVisible(false);
		BackButtonPanel.setVisible(false);
		NameInputPanel.setVisible(false);
		DifficultyPanel.setVisible(false);
		DifficultyEasyPanel.setVisible(false);
		DifficultyMediumPanel.setVisible(false);
		DifficultyHardPanel.setVisible(false);
		
		ClassPanel = new JPanel();
		ClassPanel.setBounds(100, 50, 600, 100);
		
		//------FRAME ESTABLISHERS
	}
	
	/*ActionListener Functions*/
	public class StartingScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			PlayerCreationScreen();
		}
	}
	
	public class PlayerCreationScreenBackHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			NameQuestionPanel.setVisible(false);
			PlayerNameInput.setVisible(false);
			BackButtonPanel.setVisible(false);
			NameInputPanel.setVisible(false);
			DifficultyPanel.setVisible(false);
			DifficultyEasyPanel.setVisible(false);
			DifficultyMediumPanel.setVisible(false);
			DifficultyHardPanel.setVisible(false);
			
			TitlePanel.setVisible(true);
			StartButtonPanel.setVisible(true);
			ContinueButtonPanel.setVisible(true);
			ExitButtonPanel.setVisible(true);
		}
	}
	
	public class NameInputHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			PlayerName = PlayerNameInput.getText();
			setName(PlayerName);
		}
	}
	
	public class EasyButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			player = new Player(PlayerName, 1);
			ChooseClassScreen();
		}
	}
	
	public class MediumButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			player = new Player(PlayerName, 2);
			ChooseClassScreen();
		}
	}
	
	public class HardButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			player = new Player(PlayerName, 3);
			ChooseClassScreen();
		}
	}
}

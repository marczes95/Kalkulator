import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;                                   
import java.awt.event.ActionEvent;                        
import java.awt.event.ActionListener;						 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window extends JFrame implements ActionListener
{
	private JButton [] bNum; 
	private JButton bAdd, bSub, bMul, bDiv, bEq, bPoint, bC, bSqrt, bPow, bPer;
	private JTextField tScreen;
	private JMenuBar menuBar;
	private JMenu menuHelp, menuTools, menuFile;
	private JMenuItem mSave, mSaveAs, mExit, mStandard, mProgramist;
	private double a, b, tmp, Equation;
	private int i;
	private Object func, poi;
	int sHeight;
	int sWidth;
	
	public Window()
	{	
		getSizeScreen();
		setWindow();
		
		menuBar = new JMenuBar();
		menuFile = new JMenu("Plik");
		menuTools = new JMenu("Narzędzia");
		menuHelp = new JMenu("Pomoc");
		bNum = new JButton[10];
		
		setJMenuBar(menuBar);
		menuBar.add(menuFile);
		menuBar.add(menuTools);
		menuBar.add(menuHelp);
		
		mSave = new JMenuItem("Zapisz");
		mSaveAs = new JMenuItem("Zapisz Jako");
		mExit = new JMenuItem("Wyjście");
		
		mStandard = new JMenuItem("Kalkulator Standardowy");
		mProgramist = new JMenuItem("Kalkulator Programistyczny");
		
		menuFile.add(mSave);
		menuFile.add(mSaveAs);
		menuFile.add(mExit);
		
		menuTools.add(mStandard);
		menuTools.add(mProgramist);
		
		for(int i = 0; i<10; i++)
		{
			bNum [i] = new JButton(String.valueOf(i));
			add(bNum[i]);
			bNum[i].addActionListener(this);
			bNum[i].setForeground(new Color(230,230,230));
			bNum[i].setBackground(new Color(40,40,40));
		}
		
		bAdd = new JButton("\u002b");
		bSub = new JButton("\u2212");
		bMul = new JButton("\u00d7");
		bDiv = new JButton("\u00f7");
		bEq = new JButton("=");
		bPoint = new JButton(",");
		bC = new JButton("C");
		bSqrt = new JButton("\u221a");
		bPow = new JButton("x\u00b2");
		bPer = new JButton("\u0025");
		
		tScreen = new JTextField();
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		tScreen.setBounds(10,10,265,50);
		tScreen.setFont(font1);
		tScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tScreen);
		
		bNum[0].setBounds(10,180,45,45);
		bNum[1].setBounds(65,180,45,45);
		bNum[2].setBounds(120,180,45,45);
		bNum[3].setBounds(10,125,45,45);
		bNum[4].setBounds(65,125,45,45);
		bNum[5].setBounds(120,125,45,45);         
		bNum[6].setBounds(10,70,45,45);
		bNum[7].setBounds(65,70,45,45);
		bNum[8].setBounds(120,70,45,45);
		bNum[9].setBounds(65,235,45,45);
		
		bAdd.setBounds(175,180,45,45);
		bSub.setBounds(175,125,45,45);
		bMul.setBounds(175,70,45,45);
		bDiv.setBounds(175,235,45,45);
		bEq.setBounds(230,235,45,45);
		bPoint.setBounds(10,235,45,45);
		bC.setBounds(120,235,45,45);
		bSqrt.setBounds(230,70,45,45);
		bPow.setBounds(230,125,45,45);
		bPer.setBounds(230,180,45,45);
		
		bAdd.setForeground(new Color(230,230,230));
		bSub.setForeground(new Color(230,230,230));
		bMul.setForeground(new Color(230,230,230));
		bDiv.setForeground(new Color(230,230,230));
		bEq.setForeground(new Color(230,230,230));
		bPoint.setForeground(new Color(230,230,230));
		bC.setForeground(new Color(230,230,230));
		bSqrt.setForeground(new Color(230,230,230));
		bPow.setForeground(new Color(230,230,230));
		bPer.setForeground(new Color(230,230,230));
		
		bAdd.setBackground(new Color(40,40,40));
		bSub.setBackground(new Color(40,40,40));
		bMul.setBackground(new Color(40,40,40));
		bDiv.setBackground(new Color(40,40,40));
		bEq.setBackground(new Color(40,200,40));
		bPoint.setBackground(new Color(40,40,40));
		bC.setBackground(new Color(200,40,40));
		bSqrt.setBackground(new Color(40,40,40));
		bPow.setBackground(new Color(40,40,40));
		bPer.setBackground(new Color(40,40,40));
		
		add(bMul);
		add(bDiv);
		add(bAdd);
		add(bSub);
		add(bEq);
		add(bPoint);
		add(bC);
		add(bSqrt);
		add(bPow);
		add(bPer);
		
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bPoint.addActionListener(this);
		bEq.addActionListener(this);
		tScreen.addActionListener(this);
		bC.addActionListener(this);
		bSqrt.addActionListener(this);
		bPow.addActionListener(this);
		bPer.addActionListener(this);
	}
	
	public static void main(String[] args)
	{
		Window kalk = new Window();
		kalk.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if(source == bNum[1])
		{
			a = 1;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[2])
		{
			a = 2;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[3])
		{
			a = 3;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[4])
		{
			a = 4;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[5])
		{
			a = 5;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[6])
		{
			a = 6;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[7])
		{
			a = 7;

			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[8])
		{
			a = 8;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[9])
		{
			a = 9;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bNum[0])
		{	
			a = 0;
			tScreen.setText(String.valueOf(setNumber(source,a)));
		}
		else if(source == bAdd || source == bSub || source == bMul || source == bDiv) calcASMD(source);
		else if(source == bEq) calcEquation();
		else if(source == bC) setClearScreen();
		else if(source == bSqrt)
		{
			i = 0;
			tmp = b;
			b = Equation = Math.sqrt(b);
			tScreen.setText(String.valueOf(Equation));
		}
		else if(source == bPow)
		{
			i = 0;
			tmp = b;
			b = Equation = Math.pow(b, 2);
			tScreen.setText(String.valueOf(Equation));
		}
		else if(source == bPer)
		{
			i = 0;
			tmp = b;
			b = Equation = b/100;
			tScreen.setText(String.valueOf(Equation));
		}
		else if(source == bPoint)
		{
			poi = source;
		}
	}
	
	public void getSizeScreen()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		sHeight = screenSize.height;
		sWidth = screenSize.width;
	}
	
	public void setWindow()
	{
		setTitle("Kalkulator");
		//setSize(305,335);
		setResizable(false);
		setLayout(null);
		//setLocationByPlatform(true);
		setBounds((sWidth/2)-290/2,(sHeight/2)-355/2,290,355);
	}
	
	public void calcASMD(Object source)
	{
		tmp = b;
		b = 0;
		i = 0;
		tScreen.setText("");
		func = source;
		poi = 0;
	}
	
	public void calcEquation()
	{
		if(func == bAdd){
			Equation = tmp + b;
		}
		else if(func == bSub){
			Equation = tmp - b;
		}
		else if(func == bMul){
			Equation = tmp * b;
		}
		else if(func == bDiv){
			Equation = tmp / b;
		}
		tScreen.setText(String.valueOf(Equation));
	}
	
	public void setClearScreen()
	{
		tmp = 0;
		b = 0;
		Equation = 0;
		poi = 0;
		i=0;
		tScreen.setText("");
	}
	
	public double setNumber(Object source, double a2)
	{
		if(poi == bPoint)
		{	
			i++;
			b = b + a2/(Math.pow(10, i));
		}
		else if(b != 0)
		{
			b = b * 10 + a2;
		}
		else
		{
			b = a2;
		}
		
		return b;
	}
}
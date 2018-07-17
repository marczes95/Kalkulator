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
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bEq, bPoint, bC, bSqrt, bPow, bPer;
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
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
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
		
		b1.setBounds(10,180,45,45);
		b2.setBounds(65,180,45,45);
		b3.setBounds(120,180,45,45);
		b4.setBounds(10,125,45,45);
		b5.setBounds(65,125,45,45);
		b6.setBounds(120,125,45,45);         
		b7.setBounds(10,70,45,45);
		b8.setBounds(65,70,45,45);
		b9.setBounds(120,70,45,45);
		b0.setBounds(65,235,45,45);
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
		
		b1.setForeground(new Color(230,230,230));
		b2.setForeground(new Color(230,230,230));
		b3.setForeground(new Color(230,230,230));
		b4.setForeground(new Color(230,230,230));
		b5.setForeground(new Color(230,230,230));
		b6.setForeground(new Color(230,230,230));
		b7.setForeground(new Color(230,230,230));
		b8.setForeground(new Color(230,230,230));
		b9.setForeground(new Color(230,230,230));
		b0.setForeground(new Color(230,230,230));
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
		
		b1.setBackground(new Color(40,40,40));
		b2.setBackground(new Color(40,40,40));
		b3.setBackground(new Color(40,40,40));
		b4.setBackground(new Color(40,40,40));
		b5.setBackground(new Color(40,40,40));
		b6.setBackground(new Color(40,40,40));
		b7.setBackground(new Color(40,40,40));
		b8.setBackground(new Color(40,40,40));
		b9.setBackground(new Color(40,40,40));
		b0.setBackground(new Color(40,40,40));
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
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
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
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
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
		
		if(source == b1)
		{
			a = 1;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b2)
		{
			a = 2;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b3)
		{
			a = 3;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b4)
		{
			a = 4;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b5)
		{
			a = 5;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b6)
		{
			a = 6;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b7)
		{
			a = 7;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b8)
		{
			a = 8;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b9)
		{
			a = 9;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == b0)
		{	
			a = 0;
			if(poi == bPoint)
			{	
				i++;
				b = b + a/(Math.pow(10, i));
			}
			else if(b != 0)
			{
				b = b * 10 + a;
			}
			else
			{
				b = a;
			}
			tScreen.setText(String.valueOf(b));
		}
		else if(source == bAdd)
		{	
			calcASMD(source);
		}
		else if(source == bSub)
		{	
			calcASMD(source);
		}
		else if(source == bMul)
		{	
			calcASMD(source);
		}
		else if(source == bDiv)
		{	
			calcASMD(source);
		}
		else if(source == bEq)
		{	
			calcEquation();
		}
		else if(source == bC)
		{
			setClearScreen();
		}
		else if(source == bSqrt)
		{
			i = 0;
			tmp = b;
			Equation = Math.sqrt(b);
			b = Equation;
			tScreen.setText(String.valueOf(Equation));
		}
		else if(source == bPow)
		{
			i = 0;
			tmp = b;
			Equation = Math.pow(b, 2);
			b = Equation;
			tScreen.setText(String.valueOf(Equation));
		}
		else if(source == bPer)
		{
			i = 0;
			tmp = b;
			Equation = b/100;
			b = Equation;
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
}
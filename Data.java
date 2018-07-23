import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Data 
{
	@SuppressWarnings("unused")
	private JButton bAdd, bSub, bMul, bDiv, bEq, bPoint, bC, bSqrt, bPow, bPer;
	@SuppressWarnings("unused")
	private JMenuBar menuBar;
	@SuppressWarnings("unused")
	private JMenu menuHelp, menuTools, menuFile;
	@SuppressWarnings("unused")
	private JMenuItem mSave, mSaveAs, mExit, mStandard, mProgramist;
	private JTextField tScreen;  //dodać metody typu get
	@SuppressWarnings("unused")
	private double a, b, tmp, Equation;
	@SuppressWarnings("unused")
	private int i;
	@SuppressWarnings("unused")
	private Object func, poi;
	int sHeight;
	int sWidth;

	public void calcASMD(Object source)
	{
		tmp = b;
		b = 0;
		i = 0;
		tScreen.setText("");
		func = source;
		poi = 0;
	}
	
	public void getSizeScreen()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		sHeight = screenSize.height;
		sWidth = screenSize.width;
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

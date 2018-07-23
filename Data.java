import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Data 
{
	private JButton bAdd, bSub, bMul, bDiv, bPoint;
	private JTextField tScreen;  //dodać metody typu get
	private double b, tmp, Equation;
	private int i;
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
	
	public int getsHeight()
	{
		return sHeight;
	}
	
	public int getsWidth()
	{
		return sWidth;
	}
	
	public Object getFunc()
	{
		return func;
	}
	
	public void setPoi(Object source)
	{
		poi = source;
	}
}

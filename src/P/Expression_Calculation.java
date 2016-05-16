package P;

import java.util.Stack;

public class Expression_Calculation {

public static String from10toX(int x,int y)
{
String s="";
while(x>0)
{
int a = (x%y);
if(a<=9)
s =(char)('0'+a)+s;
else
s =(char)('a'+(a-10))+s;
x/=y;
}
return s;
}

public static int fromXto10(String x ,int y)
{
	int yo = 1;
	int sum = 0;
	for(int i=x.length()-1;i>=0;i--)
	{
		if(x.charAt(i)>='0'&&x.charAt(i)<='9')
		sum+=yo*(x.charAt(i)-'0');
		else
		sum+=yo*((x.charAt(i)-'A')+10);
		yo*=y;
	}
	return sum;
}
public static String sxs(String x,int y)
{
	for(int i=0;i<x.length();i++)
	{
		String o ="";
		int j;
		for(j=i;j<x.length();j++)
			if((x.charAt(j)>='0'&&x.charAt(j)<='9')||(x.charAt(j)>='A'&&x.charAt(j)<='F'))
				break;
		for(;j<x.length();j++)
			if((x.charAt(j)>='0'&&x.charAt(j)<='9')||(x.charAt(j)>='A'&&x.charAt(j)<='F'))
				o+=x.charAt(j);
			else
				{
				i=j;
				break;
				}
		String a = ""+fromXto10(o, y);
		x=x.replaceFirst(o,a );
		i+=a.length();
	}
	return x;
}

protected static String evaluateExpression(String exp)
{
	Stack<Comparable> st = new Stack<Comparable>();
	String tottal = "";
	double cal = 0;
	st.push('(');
	st.push(' ');
	try
	{
	for(int i=0;i<exp.length();i++)
	{
	if(exp.charAt(i)==')') 
	{
	String s = ")";
	while(!st.peek().equals('('))
	{	
		s = st.pop() + s;
	}
	//System.out.println("error:"+s);
	s = st.pop() + s;
	//System.out.println("error:"+s);
	if(st.peek().equals('t')) 			//sqrt()
	{
		st.pop();
		if(st.peek().equals('r'))
		{
			while(!st.peek().equals('s')) 
				st.pop();
			st.pop();
			st.push(Math.sqrt(evaluateExp(s)));	
		}
		else if(st.peek().equals('o'))
		{
			while(!st.peek().equals('r')) 
				st.pop();
			st.pop();
			String ss="";
			while(!st.empty())
			{
				ss+=st.pop();
			}
			String k="";
			for(int is=ss.length()-1;is>=0;is--)
			{
				k+=ss.charAt(is);
			}
			double x=evaluateExp(k);
			st.push(Math.pow(evaluateExp(s), 1/x));
		}
	}
	else if(st.peek().equals('s')) 	  //cos()
	{
		while(!st.peek().equals('c')) 
			st.pop();
		st.pop();
		if(evaluateExp(s)==180)
			st.push(-1);
		else if(evaluateExp(s)==90||evaluateExp(s)==270)
			st.push(0);
		else if(evaluateExp(s)==0||evaluateExp(s)==360)
			st.push(1);
		else if(evaluateExp(s)==60)
			st.push(0.5);
		else
		   st.push(Math.cos(Math.toRadians(evaluateExp(s))));	
	}
	else if(st.peek().equals('n')) 	  
	{
		st.pop();
		if(st.peek().equals('i')) //sin()
		{
			while(!st.peek().equals('s')) 
				st.pop();
			st.pop();
			if(evaluateExp(s)==180||evaluateExp(s)==360||evaluateExp(s)==0)
				st.push(0);
			else if(evaluateExp(s)==90)
				st.push(1);
			else if(evaluateExp(s)==270)
				st.push(-1);
			else if(evaluateExp(s)==30)
				st.push(0.5);
			else
			 st.push(Math.sin(Math.toRadians(evaluateExp(s))));
		}
		else if(st.peek().equals('a')) //tan()
		{
			while(!st.peek().equals('t')) 
				st.pop();
			st.pop();
			st.push(Math.tan(Math.toRadians(evaluateExp(s))));
		}
	}
	else if(st.peek().equals('3')) 	  //CR3()
	{
		st.pop();
		if(st.peek().equals('R'))
		{
			while(!st.peek().equals('C')) 
				st.pop();
			st.pop();
			st.push(Math.cbrt(evaluateExp(s)));
		}					
	}
	else if(st.peek().equals('h')) 	  
	{
		st.pop();
		if(st.peek().equals('s'))    //cosh
		{
			while(!st.peek().equals('c')) 
				st.pop();
			st.pop();
			st.push(Math.cosh(Math.toRadians(evaluateExp(s))));
		}
		else if(st.peek().equals('n')) //sinh
		{
			st.pop();
			if(st.peek().equals('i')) //sin()
			{
				while(!st.peek().equals('s')) 
					st.pop();
				st.pop();
				st.push(Math.sinh(Math.toRadians(evaluateExp(s))));
			}
			else if(st.peek().equals('a')) //tan()
			{
				while(!st.peek().equals('t')) 
					st.pop();
				st.pop();
				st.push(Math.tanh(Math.toRadians(evaluateExp(s))));
			}
		}
	}
	else if(st.peek().equals('g'))    //log() or lg()
	{
		st.pop();
		if(st.peek().equals('o'))    // log()
		{
			st.pop();st.pop();
			st.push(Math.log10(evaluateExp(s)));	
		}
		else    					//lg()
		{
			st.pop();
			st.push(Math.log10(evaluateExp(s))/Math.log10(2));
		}
	}
	else if(exp.charAt(i+1)=='^')    // ()^2
	{
		if(exp.charAt(i+2)=='2')
		{
			st.push(Math.pow(evaluateExp(s),2));
			i+=2;
		}
		else if(exp.charAt(i+2)=='3')    // ()^3
		{
			st.push(Math.pow(evaluateExp(s),3));
			i+=2;
		}
		else if(exp.charAt(i-2)=='8')  // e^x
		{
			int a = Integer.parseInt(String.valueOf(exp.charAt(i+2)));
			st.push(Math.pow(2.718,a));
			i+=2;
		}
		else                           //()^x
		{
			int a = Integer.parseInt(String.valueOf(exp.charAt(i+2)));
			st.push(Math.pow(evaluateExp(s),a));
			i+=2;
		}
	}
	else if(exp.charAt(i+1)=='!')    // ()!
	{
		int a=(int)evaluateExp(s);
		if(evaluateExp(s)==a)
			st.push(fact(a));
		i+=2;
	}
	else
		st.push(evaluateExp(s)); //( + * - / )
	}
	else
	st.push(exp.charAt(i));
	}
	String s = " ) ";
	while(!st.isEmpty())
	s = st.pop() + s;
	//System.out.println(s);
	 cal = evaluateExp(s);
	}
	catch(Exception e)
	{
	tottal = " Error ";return tottal;
	}
	if(new Double(cal).isInfinite())
	{tottal =" Infinity ";return tottal;}
	else
	{
			return tottal=""+cal;
	}
}
private static double evaluateExp(String exp)
{
System.out.println(exp);
boolean contain_operand = true;
exp = exp.replace("(  - ", "( 0 - ");

exp = exp.replace("(", "");
exp = exp.replace(")", "");
while(contain_operand)
{
char last;
double op1=0,op2=0;

exp = exp.replaceAll("  ", " ");
contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
exp.contains(" * ") || exp.contains(" / ")|| exp.contains(" % ") ;
if(contain_operand)
{
String[] op = exp.split(" ");
//handle the first operation
op1 = new Double(op[1]);
last = op[2].charAt(0);
op2 = new Double(op[3]);
//handle and calculate the next operation
for(int i = 4;i<op.length;i++)
{
	if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
	{
	switch(last)
		{
			case'+':op1 += op2; break;
			case'-':op1 -= op2; break;
			case'*':op1 *= op2; break;
			case'/':op1 /= op2; break;
			case'%':op1 %= op2; break;
		}
		op2 = new Double(op[i+1]);
		last = op[i].charAt(0);
	}
	else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/'|| op[i].charAt(0)=='%')
	{
		if(op[i].charAt(0) == '*')
			op2 *= new Double(op[i+1]);
		else if(op[i].charAt(0) == '/')
			op2 /= new Double(op[i+1]);
		else
			op2 %= new Double(op[i+1]);
	}
}		    	
//calculate the last operation in priority
switch(last)
{
case'+':op1 += op2; break;
case'-':op1 -= op2; break;
case'*':op1 *= op2; break;
case'/':op1 /= op2; break;
case'%':op1 %= op2; break;
}		    	
exp = ""+op1;	
}
}
return new Double(exp);
}
private static int fact(int x)
{
int result=1;
for(int i=x;i>0;i--)
{
result*=i;
}
return result;
}
}

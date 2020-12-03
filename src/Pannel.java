
public class Pannel {
	final char position[][]=new char[3][3];
	static char turn='X';
	private int count=0;
	Pannel()
	{
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
			position[i][j]='_';
	}
	String setchar(int i,int j)
	{
		position[i][j]= turn;
		if(check(turn))return "win";
		else if (++count==9) return "tie";
		if(turn=='X')turn='O';
		else turn='X';
		return "notwin";
	}
	boolean check(char c)
	{

	            if (c==position[0][0] && position[0][0]==position[0][1] && position[0][1]==position[0][2]) return true;
	            else if (c==position[1][0] &&position[1][0]==position[1][1]&&position[1][1]==position[1][2]) return true;
	            else if (c==position[2][0] &&position[2][0]==position[2][1]&&position[2][1]==position[2][2]) return true;
	            else if (c==position[0][0] &&position[0][0]==position[1][0]&&position[1][0]==position[2][0]) return true;
	            else if (c==position[0][1] &&position[0][1]==position[1][1]&&position[1][1]==position[2][1]) return true;
	            else if (c==position[0][2] &&position[0][2]==position[1][2]&&position[1][2]==position[2][2]) return true;
	            else if (c==position[0][0] &&position[0][0]==position[1][1]&&position[1][1]==position[2][2]) return true;
	            else if (c==position[0][2] &&position[0][2]==position[1][1]&&position[1][1]==position[2][0]) return true;
	            else return false;

	}
	void reset()
	{
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
			position[i][j]='_';
		count=0;
		turn='X';
	}


}

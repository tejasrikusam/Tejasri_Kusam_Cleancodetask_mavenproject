package task.housecost;

public class Housecost {
	float housecost(int choice,float area)
	{
		if (choice==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(choice+3)*area;
		}
	
	}

}

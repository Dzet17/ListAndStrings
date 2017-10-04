package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController 
{
private List<Donut> donutList;
private PopupDisplay display;

public ToolController()
{
	donutList = new ArrayList<Donut>();
	display= new PopupDisplay();
}
	
	public void start() 
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
	}
	private void showTheList()
	{
		for(int index = 0; index < donutList.size(); index += 1)
		{
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut sugarCoated = new Donut("sugar coated");
		Donut chocolate = new Donut("chocolate");
		Donut maple = new Donut("maple");
		Donut appleFritter = new Donut ("apple fritter");
		
		donutList.add(chocolate);
		donutList.add(sugarCoated);
		donutList.add(maple);
		donutList.add(appleFritter);
		donutList.add(jellyFilled);
		
	}
}

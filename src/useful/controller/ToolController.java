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
}
	
	public void start() 
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}

}

package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController 
{
private List<Donut> donutList;
private PopupDisplay display;

public ListController()
{
	donutList = new ArrayList<Donut>();
	display= new PopupDisplay();
	
}
	
	public void start() 
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
//		showTheList
		changeTheList();
	}
	
	private void showTheList()
	{
		String favorite = "apple fritter";
		
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for(int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!!!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length();currentLetterIndex +=1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex +1));
			}
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
	
	private void changeTheList()
	{
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
		
	}

	private void backwardsLoopDemo()
	{
		for (int index = donutList.size(); index >= 0; index -= 1)
		{
			display.displayText(donutList.get(index).getFlavor());
		}
	}
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>)donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}

public class DrawToImage extends Code
{
	public DrawToImage(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}	
	
	public void Runcommand(String[] array) 
	{
		canvas.drawto(Integer.parseInt(array[1]), Integer.parseInt(array[2]));
	}
}

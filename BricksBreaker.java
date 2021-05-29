import javax.swing.JFrame;

public class BricksBreaker 
{
	public static void main(String... bb) 
    {
		JFrame obj=new JFrame();
		GamePlay gameon = new GamePlay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameon);
                obj.setVisible(true);

        
	}
}


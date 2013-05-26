import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class tic_tac_toe 
{
  

	int NextPlayer=1;
	int Reply;
	int Reply1;
	
	int[] Player1=new int[10]; //default value of array is zero
	int[] Player2=new int[10];
	
	
	public void reset(	JButton btnNewButton,JButton button_1,JButton button_2,JButton button_3,
						JButton button_4,JButton button_5,JButton button_6,JButton button_7,JButton button)
	{
		int i;
		for(i=0;i<10;i++)
		{
			Player1[i]=0;
			Player2[i]=0;
		}
		
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(Color.WHITE);
		
		
		button.setEnabled(true);
		button.setBackground(Color.white);
		
		button_1.setEnabled(true);
		button_1.setBackground(Color.WHITE);
		
		button_2.setBackground(Color.WHITE);
		button_2.setEnabled(true);
		
		button_3.setBackground(Color.WHITE);
		button_3.setEnabled(true);
		
		button_4.setBackground(Color.WHITE);
		button_4.setEnabled(true);
		
		button_5.setBackground(Color.WHITE);
		button_5.setEnabled(true);
		
		button_6.setBackground(Color.WHITE);
		button_6.setEnabled(true);
		
		button_7.setBackground(Color.WHITE);
		button_7.setEnabled(true);
	}
	
	public void win_lose_conditions()
	{
		if( 	(Player1[0]==1 && Player1[4]==1 && Player1[8]==1) || //Diagonal wining conditions
				(Player1[6]==1 && Player1[4]==1 && Player1[2]==1) ||
				
				(Player1[0]==1 && Player1[1]==1 && Player1[2]==1) ||  //row wining conditions
				(Player1[3]==1 && Player1[4]==1 && Player1[5]==1) ||
				(Player1[6]==1 && Player1[7]==1 && Player1[8]==1) ||
				
				(Player1[0]==1 && Player1[3]==1 && Player1[6]==1) || //row column conditions
				(Player1[1]==1 && Player1[4]==1 && Player1[7]==1) ||
				(Player1[2]==1 && Player1[5]==1 && Player1[8]==1))
					{
						Reply1 = JOptionPane.showConfirmDialog(null, "Player 1 win", "Do you want to Continue", JOptionPane.YES_NO_OPTION);
						if(Reply1==JOptionPane.NO_OPTION)
						    System.exit(0);	
						
						
			
					}
				    
			else if((Player2[0]==1 && Player2[4]==1 && Player2[8]==1) || 
					(Player2[6]==1 && Player2[4]==1 && Player2[2]==1) ||
					
					(Player2[0]==1 && Player2[1]==1 && Player2[2]==1) ||
					(Player2[3]==1 && Player2[4]==1 && Player2[5]==1) ||
					(Player2[6]==1 && Player2[7]==1 && Player2[8]==1) ||
					
					(Player2[0]==1 && Player2[3]==1 && Player2[6]==1) ||
					(Player2[1]==1 && Player2[7]==1 && Player2[4]==1) ||
					(Player2[2]==1 && Player2[5]==1 && Player2[8]==1))
						{
							Reply = JOptionPane.showConfirmDialog(null, "Player2 win", "Do you want to Continue", JOptionPane.YES_NO_OPTION);
						    if(Reply==JOptionPane.NO_OPTION)
						    	System.exit(0);	
						    //if(Reply==JOptionPane.YES_OPTION)
						    	
						    
						}

		
		
	}
	
	public void player_selection(JButton btnNewButton)
	{
		
		//click event handler
		if(NextPlayer==1)
		{
			btnNewButton.setBackground(Color.BLUE);
			btnNewButton.setEnabled(false);
			NextPlayer=2;
			
		}
		else if (NextPlayer==2)
		{
			btnNewButton.setBackground(Color.green);
			btnNewButton.setEnabled(false);
			NextPlayer=1;
		}
		
		
	}
	private JFrame frame;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tic_tac_toe window = new tic_tac_toe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public tic_tac_toe() 
	{
		initialize();
	}

	
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 418, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(NextPlayer==1)
					Player1[0]=1;
				else 
					Player2[0]=1;
				
				player_selection(btnNewButton);
				
				win_lose_conditions();

			}
		});
		btnNewButton.setBounds(10, 11, 122, 76);
		frame.getContentPane().add(btnNewButton);
		
		final JButton button = new JButton("");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(NextPlayer==1)
					Player1[1]=1;
				else 
					Player2[1]=1;
				
				player_selection(button);
				
				win_lose_conditions();
				
				
			}
		});
		button.setBounds(142, 11, 122, 76);
		frame.getContentPane().add(button);
		
		final JButton button_1 = new JButton("");
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(NextPlayer==1)
					Player1[2]=1;
				else 
					Player2[2]=1;
				
				player_selection(button_1);
				win_lose_conditions();
			}
		});
		button_1.setBounds(274, 11, 122, 76);
		frame.getContentPane().add(button_1);
		
		final JButton button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(NextPlayer==1)
					Player1[3]=1;
				else 
					Player2[3]=1;
				
				player_selection(button_2);
				win_lose_conditions();
			}
		});
		button_2.setBounds(10, 98, 122, 76);
		frame.getContentPane().add(button_2);
		
		final JButton button_3 = new JButton("");
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(NextPlayer==1)
					Player1[4]=1;
				else 
					Player2[4]=1;
				
				player_selection(button_3);
				win_lose_conditions();
			
				
			
			}
		});
		button_3.setBounds(142, 98, 122, 76);
		frame.getContentPane().add(button_3);
		
		final JButton button_4 = new JButton("");
		button_4.setBackground(Color.WHITE);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(NextPlayer==1)
					Player1[5]=1;
				else 
					Player2[5]=1;
				
				player_selection(button_4);
				
				win_lose_conditions();

				
				
				
			}
		});
		button_4.setBounds(274, 98, 122, 76);
		frame.getContentPane().add(button_4);
		
		final JButton button_5 = new JButton("");
		button_5.setBackground(Color.WHITE);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(NextPlayer==1)
					Player1[6]=1;
				else 
					Player2[6]=1;
				
				player_selection(button_5);
				win_lose_conditions();
				
				
				
				
			}
		});
		button_5.setBounds(10, 185, 122, 76);
		frame.getContentPane().add(button_5);
		
		final JButton button_6 = new JButton("");
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				if(NextPlayer==1)
					Player1[7]=1;
				else 
					Player2[7]=1;
				
				player_selection(button_6);
				win_lose_conditions();
				
			}
		});
		button_6.setBounds(142, 185, 122, 76);
		frame.getContentPane().add(button_6);
		
		final JButton button_7 = new JButton("");
		button_7.setBackground(Color.WHITE);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(NextPlayer==1)
					Player1[8]=1;
				else 
					Player2[8]=1;
				
				player_selection(button_7);
				win_lose_conditions();
			
				
			}
				
				
		});
		
		button_7.setBounds(274, 185, 122, 76);
		frame.getContentPane().add(button_7);
	
		JButton btnPlayAgain = new JButton("Play Again..");
		btnPlayAgain.setBackground(Color.WHITE);
		btnPlayAgain.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				NextPlayer=1;
				reset(	btnNewButton,button_1,button_2,
						button_3,button_4,button_5,button_6,
						button_7,button);
			}
		});
		btnPlayAgain.setBounds(142, 269, 122, 23);
		frame.getContentPane().add(btnPlayAgain);
	}
}

package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JTextField statsField;
	private JLabel pokeLabel;
	private JButton updateButton;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		statsField = new JTextField();
		pokeLabel = new JLabel();
		updateButton = new JButton("Update");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.RED);
		this.add(statsField);
		this.add(pokeLabel);
		this.add(updateButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
	
}

package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhanceField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	private JComboBox pokedexDropdown;
	private JButton updateButton;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		nameField = new JTextField("[Insert Text]");
		evolveField = new JTextField("false");
		attackField = new JTextField("[Insert Text]");
		enhanceField = new JTextField("0");
		healthField = new JTextField("0");
		
		numberLabel = new JLabel("Pokemon #:");
		nameLabel = new JLabel("[Insert Text]");
		evolveLabel = new JLabel("Can evolve?");
		attackLabel = new JLabel("Attack level:");
		enhanceLabel = new JLabel("Enhancement level:");
		healthLabel = new JLabel("Health:");
		imageLabel = new JLabel("[Insert Pokemon Here]");
		
		pokedexDropdown = new JComboBox();
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
		
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhanceField);
		this.add(healthField);
		this.add(numberField);
		
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		this.add(imageLabel);
		
		this.add(updateButton);
		this.add(pokedexDropdown);
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

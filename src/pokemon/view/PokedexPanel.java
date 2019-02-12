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
		this.appLayout = new SpringLayout();
		
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
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
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
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, enhanceField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 347, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 60, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 66, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 345, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -379, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 72, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 348, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -379, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 72, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 343, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -379, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 72, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 300, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -379, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 412, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 376, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -379, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 72, SpringLayout.SOUTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 5, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 61, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, updateButton, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, updateButton, -27, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -154, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, imageLabel);
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

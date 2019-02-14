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
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokemonNinetailes.png"));
		
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
		imageLabel = new JLabel("[Insert Pokemon Here]", pokemonIcon, JLabel.CENTER);
		
		pokedexDropdown = new JComboBox<String>();
		updateButton = new JButton("Update");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhanceField.getText()) && appController.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			// Add code here
			
			appController.updatePokemon(index, data);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "Ninetailes";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch(NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
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
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, numberField, -194, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -126, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -172, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -126, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhanceField, -194, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -194, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 65, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 445, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 448, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 443, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 417, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 400, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 476, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -279, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 281, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 95, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, updateButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, updateButton, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, enhanceField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 66, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 72, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 72, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 72, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 72, SpringLayout.SOUTH, enhanceLabel);
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

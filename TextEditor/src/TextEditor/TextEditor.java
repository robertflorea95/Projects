package TextEditor;

import javax.swing.JApplet;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class TextEditor extends JFrame {
	
	//Base variable
	
	private JTextArea area =new JTextArea(20,120);
	
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	
	private String currentFile = "untitled";
	
	private boolean changed = false;
	
	public TextEditor() {
		
		area.setFont(new Font("monospaced", Font.PLAIN,12));
		
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(scroll,BorderLayout.CENTER);
		
		JMenuBar JMB = new JMenuBar();
		
		setJMenuBar(JMB);
		
		JMenu file = new JMenu("File");
		
		JMenu edit = new JMenu("Edit");
		
		JMB.add(file);
		JMB.add(edit);
		
	}

}

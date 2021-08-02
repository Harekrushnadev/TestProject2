package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
	// Add JFrame Class for a frame
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton botton1 = new JButton();
	JButton botton2 = new JButton();
	JButton botton3 = new JButton();
	JButton botton4 = new JButton();
	JButton botton5 = new JButton();
	JButton botton6 = new JButton();
	JButton botton7 = new JButton();
	JButton botton8 = new JButton();
	JButton botton9 = new JButton();
	JButton botton0 = new JButton();
	
	JButton bottonadd = new JButton();
	JButton bottonsub = new JButton();
	JButton bottonmul = new JButton();
	JButton bottondiv = new JButton();
	JButton bottonclear = new JButton();
	JButton bottondot = new JButton();
	JButton bottonequal = new JButton();
	
	double number1,number2,result;
	int addc = 0, mulc = 0, div = 0, sub = 0;
	
	public Calculator() {
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Welcome To Nanda's Calculator");
		
		//frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border boder = BorderFactory.createLineBorder(Color.BLUE,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		botton1.setPreferredSize(new Dimension(100,40));
		botton1.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton2.setPreferredSize(new Dimension(100,40));
		botton2.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\2.jpg"));
		
		botton3.setPreferredSize(new Dimension(100,40));
		botton3.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\3.jpg"));
		
		botton3.setPreferredSize(new Dimension(100,40));
		botton3.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton4.setPreferredSize(new Dimension(100,40));
		botton4.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton5.setPreferredSize(new Dimension(100,40));
		botton5.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton6.setPreferredSize(new Dimension(100,40));
		botton6.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton7.setPreferredSize(new Dimension(100,40));
		botton7.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton8.setPreferredSize(new Dimension(100,40));
		botton8.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton9.setPreferredSize(new Dimension(100,40));
		botton9.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		botton0.setPreferredSize(new Dimension(100,40));
		botton0.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\1.jpg"));
		
		bottondot.setPreferredSize(new Dimension(100,40));
		bottondot.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottonsub.setPreferredSize(new Dimension(100,40));
		bottonsub.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottonmul.setPreferredSize(new Dimension(100,40));
		bottonmul.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottondiv.setPreferredSize(new Dimension(100,40));
		bottondiv.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottonadd.setPreferredSize(new Dimension(100,40));
		bottonadd.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottonequal.setPreferredSize(new Dimension(100,40));
		bottonequal.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		bottonclear.setPreferredSize(new Dimension(100,40));
		bottonclear.setIcon(new ImageIcon("C:\\Users\\HAREKRUSHNA NANDA\\Desktop\\calculator kye image\\bottondot.jpg"));
		
		panel.add(botton1);
		panel.add(botton2);
		panel.add(botton3);
		panel.add(botton4);
		panel.add(botton5);
		panel.add(botton6);
		panel.add(botton7);
		panel.add(botton8);
		panel.add(botton9);
		panel.add(botton0);
		panel.add(bottondot);
		panel.add(bottonsub);
		panel.add(bottonmul);
		panel.add(bottondiv);
		panel.add(bottonadd);
		panel.add(bottonequal);
		panel.add(bottonclear);
		
		botton1.addActionListener((ActionListener) this);
		botton2.addActionListener((ActionListener) this);
		botton3.addActionListener((ActionListener) this);
		botton4.addActionListener((ActionListener) this);
		botton5.addActionListener((ActionListener) this);
		botton6.addActionListener((ActionListener) this);
		botton7.addActionListener((ActionListener) this);
		botton8.addActionListener((ActionListener) this);
		botton9.addActionListener((ActionListener) this);
		botton0.addActionListener((ActionListener) this);
		bottondot.addActionListener((ActionListener) this);
		bottonsub.addActionListener((ActionListener) this);
		bottonmul.addActionListener((ActionListener) this);
		bottondiv.addActionListener((ActionListener) this);
		bottonadd.addActionListener((ActionListener) this);
		bottonclear.addActionListener((ActionListener) this);
		bottonequal.addActionListener((ActionListener) this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == bottonclear) {
			number1 = 0.0;
			number2 = 0.0;
			textarea.setText("");
		}
	}
	
}

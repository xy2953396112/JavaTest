package xzh_8_15_Chat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame{
   
	private JLabel jLabel1;
	
	private JLabel jLabel2;
	
	private JLabel jLabel3;
	
	private JButton jButton;
	
	private JPanel jPanel1;
	
    private JPanel jPanel2;
    
    private JScrollPane jScollPane;
    
    private JTextArea jTextarea;
    
    private JTextField jTextField;
    
    public Server(String name){
    	
    	super(name);
    	
    	this.initComponents();
    }
    
    public void initComponents(){
    	
    	jPanel1 = new JPanel();
    	jPanel2 = new JPanel();
    	
    	jLabel1 = new JLabel();
    	jLabel2 = new JLabel();
    	jLabel3 = new JLabel();
    	
    	jTextarea = new JTextArea();
    	jTextField = new JTextField();
    	jScollPane = new JScrollPane();
    	jButton = new JButton();
    	
    	jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
    	jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));
    	
    	jLabel1.setText("服务器状态");
    	jLabel2.setText("停止");
    	jLabel3.setForeground(new Color(204,5,50));
    	jLabel3.setText("端口");
    	
    	 jButton.setText("启动服务器");
    	 
    	 this.jTextarea.setEditable(false);
    	 this.jTextarea.setForeground(new java.awt.Color(245,0,0));
    	 
    	 jPanel1.add(jLabel1);
    	 jPanel1.add(jLabel2);
    	 jPanel1.add(jLabel3);
    	 jPanel1.add(jTextField);
    	 jPanel1.add(jButton);
    	 
    	 jTextarea.setColumns(30);
    	 jTextarea.setForeground(new java.awt.Color(0,51,204));
    	 jTextarea.setRows(20);
    	 
    	 jScollPane.setViewportView(jTextarea);
    	 
    	 jPanel2.add(jScollPane);
    	 
    	 this.getContentPane().add(jPanel1,BorderLayout.NORTH);
    	 this.getContentPane().add(jPanel2,BorderLayout.SOUTH);
         
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 this.setResizable(false);
    	 this.pack();
    	 this.setVisible(true);
    	 
    }
    
    private void execute(){
    	
    	String str = 
    }
    
    public static void main(String[] args) {
		
    	new Server("服务器");
    	
    	
	}
}

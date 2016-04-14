import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class CompundingMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private static JTextField jTextField0;
	private static JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JComboBox jComboBox0;
	//boolean simple_interext=false;
	//boolean compunding=false;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JButton jButton0;
	public CompundingMain() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(35, 10, 10), new Leading(60, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(35, 12, 12), new Leading(100, 21, 10, 10)));
		add(getJLabel2(), new Constraints(new Leading(35, 12, 12), new Leading(140, 10, 10)));
		add(getJLabel3(), new Constraints(new Leading(35, 12, 12), new Leading(180, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(120, 110, 10, 10), new Leading(60, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(120, 110, 12, 12), new Leading(100, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(120, 110, 12, 12), new Leading(140, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(120, 110, 12, 12), new Leading(180, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(35, 12, 12), new Leading(230, 10, 10)));
		add(getJLabel6(), new Constraints(new Leading(135, 10, 10), new Leading(230, 10, 10)));
		add(getJLabel7(), new Constraints(new Leading(275, 10, 10), new Leading(259, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(270, 12, 12), new Leading(120, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(270, 12, 12), new Leading(170, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(35, 12, 12), new Leading(12, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(260, 12, 12), new Leading(12, 12, 12)));
		setSize(365, 275);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("计算");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("清除");
		}
		return jButton0;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("@237-glp_moliny");
			jLabel7.setFont(new Font("", 1, 10));
			jLabel7.setForeground(Color.lightGray);
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("请输入数据");
			jLabel6.setFont(new Font("楷体", 1, 20));
			jLabel6.setForeground(Color.red);
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("楷体", Font.BOLD, 20));
			jLabel5.setText("复利计算器1.0");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("计算结果：");
			jLabel4.setFont(new Font("楷体",1,20));
		}
		return jLabel4;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "求最终金额", "求存款年份", "求存款利息", "求存款本金", "求等额投资", "求贷款还钱","看投资记录" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jComboBox0MouseMouseClicked(event);
				}
			});
		}
		return jComboBox0;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("复利次数：");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("存款年份：");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("存款利息：");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("存款本金：");
		}
		return jLabel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CompundingMain frame = new CompundingMain();
				frame.setDefaultCloseOperation(CompundingMain.EXIT_ON_CLOSE);
				frame.setTitle("Moliny");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	
	Calculate cal;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private void jButton1MouseMouseClicked(MouseEvent event) {
		
			DecimalFormat df = new DecimalFormat( "0.0000");
			double P = Double.valueOf(jTextField0.getText());
			double i = Double.valueOf(jTextField1.getText());
			int n = Integer.valueOf(jTextField2.getText());
			int k = Integer.valueOf(jTextField3.getText());
			double F=1.0000;
			F=P*(Math.pow(i/k+1,k*n));
			//F = cal.compunding(P, i, n, k);
			jLabel6.setText(String.valueOf(df.format(F)));
//		} else if (str == "存款年份") {
//			DecimalFormat df = new DecimalFormat( "0.0000");
//			jLabel1.setText("最终金额");
//			jLabel2.setText("存款利息");
//			double P = Double.valueOf(jTextField0.getText());
//			double F = Double.valueOf(jTextField1.getText());
//			double i = Double.valueOf(jTextField2.getText());
//			int k = Integer.valueOf(jTextField3.getText());
//			double n;
//			n=Math.log(F/P)/(Math.log(i/k+1)/k);
//			//F = cal.compunding(P, i, n, k);
//			jLabel6.setText(String.valueOf(df.format(n)));
//		} else if (str == "存款利息") {
//			// compunding = false;
//			jLabel6.setText("20541");
//		} else if (str == "存款本金") {
//			// compunding = false;
//			jLabel6.setText("20541");
//		} else if (str == "等额投资") {
//			// compunding = false;
//			jLabel6.setText("20541");
//		} else if (str == "贷款还钱") {
//			// compunding = false;
//			jLabel6.setText("20541");
//		}
	}

	private void jComboBox0MouseMouseClicked(MouseEvent event) {
		Object str;
		str=jComboBox0.getSelectedItem();
		if (str == "求最终金额") {
			jLabel1.setText("存款利息");
			jLabel2.setText("存款年份");
		}else if (str == "求存款年份") {
			jLabel1.setText("最终金额");
			jLabel2.setText("存款利息");
		}
		}
}

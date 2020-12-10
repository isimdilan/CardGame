package ProLabProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.ImageView;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class JFrameOyun extends JFrame {
	private JPanel contentPane;
	private JButton basla;
	public JTextField oyuncuadgiris;
	public Bilgisayar bilgisayaroyuncubilgileri;
	public Kullanici kullanici;
	public Test test;
	public OyuncuSinifi oyuncusinifi;
	public DstSinifi dstk;
	private JTextField txtSkorlar;
	private JTextField oyuncu;
	public int oyuncuskor=0,bilgisayarskor=0;
	private JTextField txtOyunc;
	private JTextField txtBilgisayar;
	private JButton Oyuncukartbutton1;
	public int sayac=0;
	public int durumyaz=0;
	public String a="dst";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameOyun frame = new JFrameOyun();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}

	
public JFrameOyun()  throws IOException  {

	ArrayList<DstSinifi> karakterlerdst=new ArrayList<>();
	ArrayList<BsSinifi> karakterlerbs=new ArrayList<>();
	ArrayList<DstSinifi> karakterlerdstb=new ArrayList<>();
	ArrayList<BsSinifi> karakterlerbsb=new ArrayList<>();
	DstSinifi Willow=new DstSinifi("Willow","Dst");
	DstSinifi Wolfgang=new DstSinifi("Wolfgang","Dst");
	DstSinifi Winona=new DstSinifi("Winona","Dst");
	DstSinifi Woodie=new DstSinifi("Woodie","Dst");
	DstSinifi Warly=new DstSinifi("Warly","Dst");
	DstSinifi Wendy=new DstSinifi("Wendy","Dst");
	DstSinifi Webber=new DstSinifi("Webber","Dst");
	DstSinifi Wickerbottom=new DstSinifi("Wickerbottom","Dst");
	Willow.setCan(150);Willow.setAkilsagligi(120); Willow.setAclik(150); Willow.setResimdst("img/Willow.png");
	Wolfgang.setCan(200);Wolfgang.setAkilsagligi(200);Wolfgang.setAclik(200);Wolfgang.setResimdst("img/Wolfgang.png");
	Winona.setCan(150);Winona.setAkilsagligi(200);Winona.setAclik(150);Winona.setResimdst("img/Winona.png");
	Woodie.setCan(150);Woodie.setAkilsagligi(200);Woodie.setAclik(150);Woodie.setResimdst("img/Woodie.png");
	Warly.setCan(150);Warly.setAkilsagligi(200);Warly.setAclik(250);Warly.setResimdst("img/Warly.png");
	Wendy.setCan(150);Wendy.setAkilsagligi(200);Wendy.setAclik(150);Wendy.setResimdst("img/Wendy.png");
	Webber.setCan(175);Webber.setAkilsagligi(100);Webber.setAclik(175);Webber.setResimdst("img/Webber.png");
	Wickerbottom.setCan(150);Wickerbottom.setAkilsagligi(250);Wickerbottom.setAclik(150);Wickerbottom.setResimdst("img/Wickerbottom.png");
	karakterlerdst.add(Willow);karakterlerdst.add(Wolfgang);karakterlerdst.add(Winona);karakterlerdst.add(Woodie);
	karakterlerdst.add(Warly);karakterlerdst.add(Wendy);karakterlerdst.add(Webber);karakterlerdst.add(Wickerbottom);
	BsSinifi Frank=new BsSinifi("Frank","Bs");
	BsSinifi Leon=new BsSinifi("Leon","Bs");
	BsSinifi Gene=new BsSinifi("Gene","Bs");
	BsSinifi Sprout=new BsSinifi("Sprout","Bs");
	BsSinifi Spike=new BsSinifi("Spike","Bs");
	BsSinifi Poco=new BsSinifi("Poco","Bs");
	BsSinifi Colt=new BsSinifi("Colt","Bs");
	BsSinifi Mortis=new BsSinifi("Mortis","Bs");
	
	Frank.setCan(6100);Frank.setGuc(1200);Frank.setYildizpuan(17);Frank.setResimbs("img/Frank.png");
	Leon.setCan(3200);Leon.setGuc(440);Leon.setYildizpuan(22);Leon.setResimbs("img/Leon.png");
	Gene.setCan(3600);Gene.setGuc(1000);Gene.setYildizpuan(30);Gene.setResimbs("img/Gene.png");
	Sprout.setCan(3000);Sprout.setGuc(1000);Sprout.setYildizpuan(34);Sprout.setResimbs("img/Sprout.png");
	Spike.setCan(2400);Spike.setGuc(480);Spike.setYildizpuan(40);Spike.setResimbs("img/Spike.png");
	Poco.setCan(3800);Poco.setGuc(660);Poco.setYildizpuan(11);Poco.setResimbs("img/POCO.png");
	Colt.setCan(2800);Colt.setGuc(300);Colt.setYildizpuan(3);Colt.setResimbs("img/Colt.png");
	Mortis.setCan(3800);Mortis.setGuc(900);Mortis.setYildizpuan(19);Mortis.setResimbs("img/Mortis.png");
	karakterlerbs.add(Frank);karakterlerbs.add(Leon);karakterlerbs.add(Gene);karakterlerbs.add(Sprout);karakterlerbs.add(Spike);
	karakterlerbs.add(Poco);karakterlerbs.add(Colt);karakterlerbs.add(Mortis);
	karakterlerbsb.add(Frank);karakterlerbsb.add(Leon);karakterlerbsb.add(Gene);karakterlerbsb.add(Sprout);karakterlerbsb.add(Spike);
	karakterlerbsb.add(Poco);karakterlerbsb.add(Colt);karakterlerbsb.add(Mortis);
	
		bilgisayaroyuncubilgileri = new Bilgisayar();
		oyuncusinifi=new OyuncuSinifi();
		kullanici=new Kullanici();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1476, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
			
		  JPanel panel = new JPanel();
		  panel.setBackground(new Color(0, 0, 0));
		  panel.setBounds(10, 656, 310, 62);
		  contentPane.add(panel);
		  panel.setLayout(null);
		//Kartları Karıştır
		  kullanici.kartsecDst(karakterlerdst);
		  kullanici.kartsecBs(karakterlerbs);
		 //Kart karıstır resimleri ekle
		  
		  JLabel ozellikyaz = new JLabel("");
		  ozellikyaz.setVerticalAlignment(SwingConstants.BOTTOM);
		  ozellikyaz.setHorizontalAlignment(SwingConstants.CENTER);
		  ozellikyaz.setFont(new Font("Tekton Pro Cond", Font.BOLD, 18));
		  ozellikyaz.setForeground(Color.LIGHT_GRAY);
		  //ozellikyaz.setVisible(false);
		  ozellikyaz.setBounds(652, 173, 81, 28);
		  contentPane.add(ozellikyaz);
		  
		  JLabel puanlarayni = new JLabel("");
		  puanlarayni.setHorizontalAlignment(SwingConstants.LEFT);
		  puanlarayni.setForeground(Color.LIGHT_GRAY);
		  puanlarayni.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 16));
		  puanlarayni.setBounds(548, 430, 301, 26);
		  contentPane.add(puanlarayni);
		  
		  basla = new JButton("BA\u015ELA");
		  basla.setForeground(new Color(255, 255, 255));
		  basla.setBackground(new Color(0, 0, 0));
		  
		  basla.setBounds(179, 11, 131, 51);
		  panel.add(basla);
		  
		  oyuncuadgiris = new JTextField();
		  oyuncuadgiris.setBounds(10, 34, 160, 28);
		  panel.add(oyuncuadgiris);
		  oyuncuadgiris.setColumns(10);
		  
		  JTextPane txtpnOyuncuAdGiriniz = new JTextPane();
		  txtpnOyuncuAdGiriniz.setEnabled(false);
		  txtpnOyuncuAdGiriniz.setEditable(false);
		  txtpnOyuncuAdGiriniz.setText("Oyuncu Ad\u0131 Giriniz");
		  txtpnOyuncuAdGiriniz.setForeground(new Color(255, 255, 255));
		  txtpnOyuncuAdGiriniz.setBackground(new Color(0, 0, 0));
		  txtpnOyuncuAdGiriniz.setBounds(10, 3, 111, 20);
		  panel.add(txtpnOyuncuAdGiriniz);
		  JTextPane txtpnOyuncu = new JTextPane();
		  txtpnOyuncu.setEnabled(false);
		  txtpnOyuncu.setEditable(false);
		  txtpnOyuncu.setBackground(new Color(0, 0, 0));
		  txtpnOyuncu.setForeground(new Color(255, 255, 255));
		  txtpnOyuncu.setBounds(1178, 710, 145, 29);
		  contentPane.add(txtpnOyuncu);
		 
		  JPanel bilgisayar_panel = new JPanel();
		  bilgisayar_panel.setBounds(43, 42, 351, 227);
		  bilgisayar_panel.setOpaque(true);
		  bilgisayar_panel.setBackground(new Color(0,0,0,0));
		  bilgisayar_panel.setVisible(false);
		  contentPane.add(bilgisayar_panel);
		  bilgisayar_panel.setLayout(null);
		  
		  JButton btnNewButton = new JButton("New button");
		  btnNewButton.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\kullan4.png"));
		  btnNewButton.setBounds(10, 11, 145, 207);
		  bilgisayar_panel.add(btnNewButton);
		  
		  JButton btnNewButton_1 = new JButton("New button");
		  btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\bs.png"));
		  btnNewButton_1.setBounds(196, 11, 145, 207);
		  bilgisayar_panel.add(btnNewButton_1);
		  
			  
		
		  JButton buttonbilgisayar = new JButton();
		  buttonbilgisayar.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\kullan4.png"));
		  buttonbilgisayar.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  	}
		  });
		  
		  buttonbilgisayar.setBounds(712, 212, 145, 207);
		  contentPane.add(buttonbilgisayar);
	
		  
		  JPanel panel_1 = new JPanel();
		  panel_1.setBounds(968, 11, 364, 329);
		  panel_1.setOpaque(true);
		  panel_1.setBackground(new Color(0,0,0,0));
		  contentPane.add(panel_1);
		  panel_1.setVisible(false);
		  
		  JPanel panel_3 = new JPanel();
		  panel_3.setBounds(968, 351, 364, 337);
		  panel_3.setOpaque(true);
		  panel_3.setBackground(new Color(0,0,0,0));
		  panel_1.setLayout(null);
		  panel_3.setVisible(false);
		  contentPane.add(panel_3);
		  
		 
		  
		  JButton buttonoyuncu = new JButton("New button");
		  buttonoyuncu.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\bs.png"));
		  buttonoyuncu.setBounds(538, 212, 145, 207);
		  contentPane.add(buttonoyuncu);
		  
		  JButton buttonkartkoykullanici = new JButton("");
		  buttonkartkoykullanici.setBackground(Color.BLACK);
		  buttonkartkoykullanici.setBorder(new LineBorder(new Color(100,180, 150), 2, true));
		  buttonkartkoykullanici.setVisible(false);
		 
		  buttonkartkoykullanici.setBounds(712, 212, 145, 207);
		  contentPane.add(buttonkartkoykullanici);
		  
		  JButton buttonbilgisayarat = new JButton("");
		  buttonbilgisayarat.setBackground(Color.BLACK);
		  buttonbilgisayarat.setBounds(540, 210, 145, 207);
		  buttonbilgisayarat.setBorder(new LineBorder(new Color(100,180, 150), 2, true));
		  buttonbilgisayarat.setVisible(false);
		  contentPane.add(buttonbilgisayarat);
		  
		  JPanel panel_2 = new JPanel();
		  panel_2.setVisible(false);
		  panel_2.setOpaque(true);
		  panel_2.setBackground(new Color(0,0,0,0));
		  panel_2.setBorder(new LineBorder(new Color(250,250, 0), 5, true));
		  panel_2.setBounds(21, 407, 431, 173);
		  contentPane.add(panel_2);
		  panel_2.setLayout(null);
		  JLabel durum = new JLabel();
		  durum.setFont(new Font("Tekton Pro Cond", Font.BOLD, 20));
		  durum.setBounds(196, 74, 205, 51);
		 panel_2.add(durum);
		   txtSkorlar = new JTextField();
			  txtSkorlar.setColumns(10);
			  txtSkorlar.setHorizontalAlignment(SwingConstants.CENTER);
			  txtSkorlar.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 50));
			  txtSkorlar.setBackground(new Color(0,0,0,0));
			  txtSkorlar.setEnabled(false);
			  txtSkorlar.setEditable(false);
			  txtSkorlar.setText("SKORLAR");
			  txtSkorlar.setBorder(null);
			  txtSkorlar.setBounds(123, 11, 189, 66);
			  panel_2.add(txtSkorlar);
			  
			  txtOyunc = new JTextField();
			  txtOyunc.setHorizontalAlignment(SwingConstants.CENTER);
			  txtOyunc.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 25));
			  txtOyunc.setEnabled(false);
			  txtOyunc.setEditable(false);
			  txtOyunc.setText("Oyuncu ");
			  txtOyunc.setBackground(new Color(0,0,0,0));
			  txtOyunc.setBorder(null);
			  txtOyunc.setBounds(10, 62, 103, 36);
			  panel_2.add(txtOyunc);
			  txtOyunc.setColumns(10);
			  
			  txtBilgisayar = new JTextField();
			  txtBilgisayar.setText("Bilgisayar");
			  txtBilgisayar.setHorizontalAlignment(SwingConstants.CENTER);
			  txtBilgisayar.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 25));
			  txtBilgisayar.setEnabled(false);
			  txtBilgisayar.setEditable(false);
			  txtBilgisayar.setColumns(10);
			  txtBilgisayar.setBorder(null);
			  txtBilgisayar.setBackground(new Color(0, 0, 0, 0));
			  txtBilgisayar.setBounds(10, 106, 103, 36);
			  panel_2.add(txtBilgisayar);
			  
			  JLabel skoryazoyuncu = new JLabel("0");
			  skoryazoyuncu.setEnabled(false);
			  skoryazoyuncu.setIcon(null);
			  skoryazoyuncu.setForeground(Color.GRAY);
			  skoryazoyuncu.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 25));
			  skoryazoyuncu.setBackground(new Color(0,0,0,0));
			  skoryazoyuncu.setToolTipText("");
			  skoryazoyuncu.setBounds(133, 62, 26, 36);
			  panel_2.add(skoryazoyuncu);
			  
			  JLabel skoryazobilgisayar = new JLabel("0");
			  skoryazobilgisayar.setEnabled(false);
			  skoryazobilgisayar.setToolTipText("");
			  skoryazobilgisayar.setIcon(null);
			  skoryazobilgisayar.setForeground(Color.GRAY);
			  skoryazobilgisayar.setBackground(new Color(0,0,0,0));
			  skoryazobilgisayar.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 25));
			  skoryazobilgisayar.setBounds(133, 106, 53, 36);
			  panel_2.add(skoryazobilgisayar);
			  panel_1.setLayout(null);
			//Butonlar
			  Oyuncukartbutton1 = new JButton();
			  Oyuncukartbutton1.addPropertyChangeListener(new PropertyChangeListener() {
			  	public void propertyChange(PropertyChangeEvent evt) {
			  	}
			  });
			  Oyuncukartbutton1.setBounds(10, 15, 135, 141);
			  panel_1.add(Oyuncukartbutton1);
			  
			  JButton Oyuncukartbutton2 = new JButton();
			  Oyuncukartbutton2.setBounds(210, 15, 135, 141);
			  panel_1.add(Oyuncukartbutton2);
			  JButton Oyuncukartbutton3 = new JButton();
			  Oyuncukartbutton3.setBounds(210, 180, 135, 141);
			  panel_1.add(Oyuncukartbutton3);
			  JButton Oyuncukartbutton4 = new JButton();
			  Oyuncukartbutton4.setBounds(10, 180, 135, 141);
			  panel_1.add(Oyuncukartbutton4);
			  panel_3.setLayout(null);
			  JButton Oyuncukartbutton5 = new JButton();
			  Oyuncukartbutton5.setBounds(10, 5, 135, 141);
			  panel_3.add(Oyuncukartbutton5);
			  JButton Oyuncukartbutton6 = new JButton("");
			  Oyuncukartbutton6.setBounds(212, 5, 135, 141);
			  panel_3.add(Oyuncukartbutton6);
			  JButton Oyuncukartbutton7 = new JButton("");
			  Oyuncukartbutton7.setBounds(10, 185, 135, 141);
			  panel_3.add(Oyuncukartbutton7);
			  JButton Oyuncukartbutton8 = new JButton();
			  Oyuncukartbutton8.setBounds(212, 185, 135, 141);
			  panel_3.add(Oyuncukartbutton8);
		
			
		Oyuncukartbutton1.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(0).getResimdst()));
		Oyuncukartbutton1.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			  if(a=="dst") {
				
			  buttonkartkoykullanici.setVisible(true);
			  buttonbilgisayarat.setVisible(true);
			  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(0).getResimdst()));
			  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(1).getResimdst()));
				 if(sayac==0) {
					  if(karakterlerdst.get(0).getAclik()==karakterlerdst.get(1).getAclik()) {
						  ozellikyaz.setText("Açlık");
						  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
						  buttonkartkoykullanici.setIcon(null);
					      buttonbilgisayarat.setIcon(null);
					      sayac++;
					      Oyuncukartbutton1.setEnabled(true);
					  }
					  else if (karakterlerdst.get(0).getAclik()>karakterlerdst.get(1).getAclik()) {a="bs";durumyaz++;
						  puanlarayni.setText("");
					  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
					  ozellikyaz.setText("Açlik");
					  Oyuncukartbutton1.setEnabled(false);}
					  
					  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="bs";durumyaz++;
					  puanlarayni.setText("");
					  ozellikyaz.setText("Açlik");
					  Oyuncukartbutton1.setEnabled(false); }
					  
				  }
				 else if(sayac!=0) {
					 a="bs";durumyaz++;
					  buttonkartkoykullanici.setVisible(true);
					  sayac=0;
					  Oyuncukartbutton1.setEnabled(false);
					  ozellikyaz.setText("Akıl Sağlığı");
					  puanlarayni.setText("Puan Durumu Değiştirildi");
					  buttonbilgisayarat.setVisible(true);
					  if(karakterlerdst.get(0).getAkilsagligi()>karakterlerdst.get(1).getAkilsagligi()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
						else if(karakterlerdst.get(0).getAkilsagligi()<karakterlerdst.get(1).getAkilsagligi()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
						else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
					  }
				 if(durumyaz==8) {
					 if(bilgisayarskor>oyuncuskor) {
						 durum.setText("BİLGİSAYAR KAZANDI... :(");
					  }else if(oyuncuskor>bilgisayarskor) {
						 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
					  else if(oyuncuskor==bilgisayarskor) {
						  durum.setText("BERABERE");
						  }}
					 
		   }}}); 
		  Oyuncukartbutton2.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(2).getResimdst()));
		  Oyuncukartbutton2.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="dst") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(2).getResimdst()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(3).getResimdst()));
					 if(sayac==0) {
						  if(karakterlerdst.get(2).getCan()==karakterlerdst.get(3).getCan()) {
							  ozellikyaz.setText("Can");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton2.setEnabled(true);
						  }
						  else if (karakterlerdst.get(2).getAclik()>karakterlerdst.get(3).getAclik()) {a="bs";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton2.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="bs";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton2.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
						 a="bs";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton2.setEnabled(false);
						  ozellikyaz.setText("Açlık");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerdst.get(2).getAclik()>karakterlerdst.get(3).getAclik()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerdst.get(2).getAkilsagligi()<karakterlerdst.get(3).getAkilsagligi()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
		 
		  		 
					}
		  		
		  	}
		  	
		  	
		  });
		  
		  
		  
		  Oyuncukartbutton3.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(4).getResimdst()));
		  Oyuncukartbutton3.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="dst") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(4).getResimdst()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(5).getResimdst()));
					 if(sayac==0) {
						  if(karakterlerdst.get(4).getAkilsagligi()==karakterlerdst.get(5).getAkilsagligi()) {
							  ozellikyaz.setText("Akıl Sağlığı");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton3.setEnabled(true);
						  }
						  else if (karakterlerdst.get(4).getAkilsagligi()>karakterlerdst.get(5).getAkilsagligi()) {	a="bs";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Akıl Sağlığı");
						  Oyuncukartbutton3.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);	a="bs";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Akıl Sağlığı");
						  Oyuncukartbutton3.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
							a="bs";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton3.setEnabled(false);
						  ozellikyaz.setText("Can");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerdst.get(4).getCan()>karakterlerdst.get(5).getCan()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerdst.get(4).getCan()<karakterlerdst.get(5).getCan()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  } if(durumyaz==8) {
							 if(bilgisayarskor>oyuncuskor) {
								 durum.setText("BİLGİSAYAR KAZANDI... :(");
							  }else if(oyuncuskor>bilgisayarskor) {
								 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
							  else if(oyuncuskor==bilgisayarskor) {
								  durum.setText("BERABERE");
								  }}}
		  	
		  	}
		  });
	     
		  
		  
		  
		  Oyuncukartbutton4.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(6).getResimdst()));
	      Oyuncukartbutton4.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="dst") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(6).getResimdst()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerdst.get(7).getResimdst()));
					 if(sayac==0) {
						  if(karakterlerdst.get(6).getCan()==karakterlerdst.get(7).getCan()) {
							  ozellikyaz.setText("Can");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton4.setEnabled(true);
						  }
						  else if (karakterlerdst.get(6).getAclik()>karakterlerdst.get(7).getAclik()) {	a="bs";durumyaz++;
						puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton4.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);	a="bs";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton4.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
							a="bs";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton4.setEnabled(false);
						  ozellikyaz.setText("Akıl Sağlığı");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerdst.get(6).getAkilsagligi()>karakterlerdst.get(7).getAkilsagligi()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerdst.get(6).getAkilsagligi()<karakterlerdst.get(7).getAkilsagligi()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
			}
		  	}
		  });
	      
		  
		 
		  
		  Oyuncukartbutton5.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(0).getResimbs()));
		  Oyuncukartbutton5.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="bs") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(0).getResimbs()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(1).getResimbs()));
					 if(sayac==0) {
						  if(karakterlerbs.get(0).getCan()==karakterlerbs.get(1).getCan()) {
							  ozellikyaz.setText("Can");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton5.setEnabled(true);
						  }
						  else if (karakterlerbs.get(0).getCan()>karakterlerbs.get(1).getCan()) {a="dst";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton5.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="dst";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton5.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
						 a="dst";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton5.setEnabled(false);
						  ozellikyaz.setText("Güç");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerbs.get(0).getGuc()>karakterlerbs.get(1).getGuc()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerbs.get(0).getGuc()<karakterlerbs.get(1).getGuc()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
				 
		  	}
		  	}
		  });
		  
		  
		  Oyuncukartbutton6.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(2).getResimbs()));
		  Oyuncukartbutton6.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="bs") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(2).getResimbs()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(3).getResimbs()));
					 if(sayac==0) {
						  if(karakterlerbs.get(2).getYildizpuan()==karakterlerbs.get(3).getYildizpuan()) {
							  ozellikyaz.setText("Yıldız Puanı");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton6.setEnabled(true);
						  }
						  else if (karakterlerbs.get(2).getYildizpuan()>karakterlerbs.get(3).getYildizpuan()) {a="dst";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Yıldız Puanı");
						  Oyuncukartbutton6.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="dst";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Yıldız Puanı");
						  Oyuncukartbutton6.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
						 a="dst";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton6.setEnabled(false);
						  ozellikyaz.setText("Güç");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerbs.get(2).getGuc()>karakterlerbs.get(3).getGuc()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerbs.get(2).getGuc()<karakterlerbs.get(3).getGuc()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
				  
		  	}
		  	}
		  });
		  
		  Oyuncukartbutton7.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(4).getResimbs()));
		  Oyuncukartbutton7.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="bs") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(4).getResimbs()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(5).getResimbs()));
					 if(sayac==0) {
						  if(karakterlerbs.get(4).getGuc()==karakterlerbs.get(5).getGuc()) {
							  ozellikyaz.setText("Güç");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton7.setEnabled(true);
						  }
						  else if (karakterlerbs.get(4).getGuc()>karakterlerbs.get(5).getGuc()) {a="dst";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("GÜç");
						  Oyuncukartbutton7.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="dst";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Güç");
						  Oyuncukartbutton7.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
						 a="dst";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton7.setEnabled(false);
						  ozellikyaz.setText("Can");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerbs.get(4).getCan()>karakterlerbs.get(5).getCan()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerbs.get(4).getCan()<karakterlerbs.get(5).getCan()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
				  
		  	}
		  	}
		  });
		  
		  
		  
		  
		  Oyuncukartbutton8.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(6).getResimbs()));
		  Oyuncukartbutton8.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(a=="bs") {
		  		buttonkartkoykullanici.setVisible(true);
				  buttonbilgisayarat.setVisible(true);
				  buttonkartkoykullanici.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(6).getResimbs()));
				  buttonbilgisayarat.setIcon(new javax.swing.ImageIcon(karakterlerbs.get(7).getResimbs()));
					 if(sayac==0) {
						 
						  if(karakterlerbs.get(6).getCan()==karakterlerbs.get(7).getCan()) {
							  ozellikyaz.setText("Can");
							  puanlarayni.setText("Puanlar aynı lutfen kartınızı tekrar atınız");
							  buttonkartkoykullanici.setIcon(null);
						      buttonbilgisayarat.setIcon(null);
						      sayac++;
						      Oyuncukartbutton8.setEnabled(true);
						  }
						  else if (karakterlerbs.get(6).getCan()>karakterlerbs.get(7).getCan()) {a="dst";durumyaz++;
							  puanlarayni.setText("");
						  oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton8.setEnabled(false);}
						  
						  else {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);a="dst";durumyaz++;
						  puanlarayni.setText("");
						  ozellikyaz.setText("Can");
						  Oyuncukartbutton8.setEnabled(false); }
						  
					  }
					 else if(sayac!=0) {
						 a="dst";durumyaz++;
						  buttonkartkoykullanici.setVisible(true);
						  sayac=0;
						  Oyuncukartbutton8.setEnabled(false);
						  ozellikyaz.setText("Güç");
						  puanlarayni.setText("Puan Durumu Değiştirildi");
						  buttonbilgisayarat.setVisible(true);
						  if(karakterlerbs.get(6).getGuc()>karakterlerbs.get(7).getGuc()) {oyuncuskor+=10; skoryazoyuncu.setText(""+oyuncuskor);}
							else if(karakterlerbs.get(6).getGuc()<karakterlerbs.get(7).getGuc()) {bilgisayarskor+=10; skoryazobilgisayar.setText(""+bilgisayarskor);}
							else {oyuncuskor+=5; bilgisayarskor+=5; skoryazoyuncu.setText(""+oyuncuskor); skoryazobilgisayar.setText(""+bilgisayarskor); }
						  
					  }
					 if(durumyaz==8) {
						 if(bilgisayarskor>oyuncuskor) {
							 durum.setText("BİLGİSAYAR KAZANDI... :(");
						  }else if(oyuncuskor>bilgisayarskor) {
							 skoryazobilgisayar.setVisible(false);durum.setText("KAZANDINIZZ.."); }
						  else if(oyuncuskor==bilgisayarskor) {
							  durum.setText("BERABERE");
							  }}
					
				  
		  	}
		  	}
		  });
		 
		  
		  
		  
		  
		  
		 
		 
		  
		  
		  
			 
		  
		  JTextPane bilgisayartext = new JTextPane();
		  bilgisayartext.setBackground(Color.BLACK);
		  bilgisayartext.setForeground(Color.WHITE);
		  bilgisayartext.setEnabled(false);
		  bilgisayartext.setEditable(false);
		  
		  bilgisayartext.setBounds(10, 11, 126, 20);
		  contentPane.add(bilgisayartext);
		   
		  basla.addActionListener(new ActionListener() {
		  		public void actionPerformed(ActionEvent e) {
		  		panel_2.setVisible(true);
		  		String oyuncuadi=oyuncuadgiris.getText();
		  		txtpnOyuncu.setText("Oyuncu: " + oyuncuadi);
		  		
		  		
		  		bilgisayartext.setText("Oyuncu: " + bilgisayaroyuncubilgileri.getOyuncuAdi()); 
		  		buttonoyuncu.setVisible(false);
		  		buttonbilgisayar.setVisible(false);
		  		panel.setVisible(false);
		  		bilgisayar_panel.setVisible(true);
		  		panel_1.setVisible(true);
		  		panel_3.setVisible(true);
		  		
		  		
		  	
				 
		  	}
		  });
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  JLabel background = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\arkaplan.jpg"));
			 background.setBounds(0, -19, 1405, 765);
			  getContentPane().add(background);
			  contentPane.setLayout(null);
		  background.setLayout(new FlowLayout());
		  
		 
		  
		  
		  
		 
		  
		  
		  
		 
		  
		  
		 
		  
		 
		  
		  
		  
		 
		  
		  
		  
		  
		  
	}
}

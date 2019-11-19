import java.awt.*;
import java.awt.event.*;

 class Restaraunt extends Frame implements ActionListener{
  Choice Snacks,M_course,Dessert;
  Label s,mc,d,bs,mb,db,tb,l1,l2,l3,menu,yo,plates,dishes;
  Button b;
  TextField t1,t2,t3;
  Restaraunt(){
    super("Restaraunt App");
    Snacks = new Choice();
    Snacks.add("--select--");
    Snacks.add("Manchurian");
    Snacks.add("Allu Tikki");
    Snacks.add("Spring Rolls");
    Snacks.add("Momos");
    M_course = new Choice();
    M_course.add("--select--");
    M_course.add("Shahi Paneer");
    M_course.add("Mix. Veg");
    M_course.add("Dal");
    M_course.add("Mushroom");

  Dessert = new Choice();
  Dessert.add("--select--");
  Dessert.add("Rasgullas");
  Dessert.add("Gulab Jamun");
  Dessert.add("Ice Cream");
  Dessert.add("Jalebi");
  t1 = new TextField(10);
  t2= new TextField(10);
  t3 = new TextField(10);
  s = new Label("Snacks");
  mc = new Label("M_course");
  d = new Label("Dessert");
  dishes = new Label("Dishes");
  plates = new Label("Plates");
  bs = new Label("");
  mb = new Label("");
  db = new Label("");
  tb = new Label("");
  menu = new Label("Menu");
  yo = new Label("");
  b = new Button("order");
  b.addActionListener(this);
      menu.setBounds(175,30,100,40);
      s.setBounds(50,100,100,30);
      mc.setBounds(50,150,100,30);
      d.setBounds(50,200,100,30);
      dishes.setBounds(205,75,50,20);
      plates.setBounds(310,75,50,20);
      Snacks.setBounds(170,100,120,30);
      M_course.setBounds(170,150,120,30);
      Dessert.setBounds(170,200,120,30);
      t1.setBounds(310,100,30,30);
        t2.setBounds(310,150,30,30);
          t3.setBounds(310,200,30,30);
          b.setBounds(130,250,70,30);
          yo.setBounds(130,300,100,30);
          bs.setBounds(50,350,400,30);
          mb.setBounds(50,400,400,30);
          db.setBounds(50,450,400,30);
          tb.setBounds(50,500,400,30);
          add(menu);
          add(s);add(Snacks);add(t1);
          add(mc);add(M_course);add(t2);
          add(d);add(Dessert);add(t3);
          add(b);

            add(dishes);add(plates);
            add(yo);
          add(bs);
          add(mb);
          add(db);
          add(tb);



          setVisible(true);
          setSize(600,600);
          setLayout(null);
}
public void actionPerformed(ActionEvent e){
  System.out.println("hello i am inside actionPerformed");
  int[] SA = {0,100,120,150,50};
  int[] MA = {0,150,120,100,160};
  int[] DA = {0,60,80,100,70};
  int si = Snacks.getSelectedIndex();
  String Si = Snacks.getSelectedItem();
  int sq = Integer.parseInt(t1.getText());
  int mi = M_course.getSelectedIndex();
  String Mi = M_course.getSelectedItem();
  int mq = Integer.parseInt(t2.getText());
  int di = Dessert.getSelectedIndex();
  String Di = Dessert.getSelectedItem();
  int dq = Integer.parseInt(t3.getText());

  if (e.getSource() == b) {
    int s = sq * SA[si];
    int m = mq * MA[mi];
    int d = dq * DA[di];
    int t = s+m+d;
    yo.setText("Your Bill");
    bs.setText("Snacks :"+Si+"  "+sq+" * "+String.valueOf(SA[si])+" = "+String.valueOf(s));
    // +Si+"  "+sq+" * "+String.valueOf(SA[si])+" = "+String.valueOf(s));
    mb.setText("M_course :"+Mi+"  "+mq+" * "+String.valueOf(MA[mi])+" = "+String.valueOf(m));
     // "+Mi+"  "+mq+" * "+String.valueOf(MA[mi])+" = "+String.valueOf(m));
    db.setText("Dessert :"+Di+"  "+dq+" * "+String.valueOf(DA[di])+" = "+String.valueOf(d)+"Total :"+" = "+String.valueOf(t));
    // +Di+"  "+dq+" * "+String.valueOf(DA[di])+" = "+String.valueOf(d));
    // tb.setText("Total :"+" = "+String.valueOf(s));
    // +" = "+String.valueOf(s));
  }
}
  }
  public class Rest{
    public static void main(String[] args){
      Restaraunt r = new Restaraunt();
    }
  }

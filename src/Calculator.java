import java.awt.event.*;
import javax.swing.*;
import java.awt.*; 

class Calculator implements ActionListener { 
    static TextField t; 
    String s0, s1, s2;
   
    Calculator() 
    { 
        s0 = s1 = s2 = ""; 
    } 
  
    public static void main(String args[]) 
    { 
         
        Frame f = new Frame("calculator"); 
        
        Calculator c = new Calculator(); 
  
        t = new TextField(16); 
        t.setEditable(false); 
   
        Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
  
       
        b0 = new Button("0"); 
        b1 = new Button("1"); 
        b2 = new Button("2"); 
        b3 = new Button("3"); 
        b4 = new Button("4"); 
        b5 = new Button("5"); 
        b6 = new Button("6"); 
        b7 = new Button("7"); 
        b8 = new Button("8"); 
        b9 = new Button("9"); 
        beq1=new Button("="); 
        ba = new Button("+"); 
        bs = new Button("-"); 
        bd = new Button("/"); 
        bm = new Button("*"); 
        beq = new Button("C"); 
        be = new Button("."); 
 
        Panel p = new Panel(); 
  
        bm.addActionListener(c); 
        bd.addActionListener(c); 
        bs.addActionListener(c); 
        ba.addActionListener(c); 
        b9.addActionListener(c); 
        b8.addActionListener(c); 
        b7.addActionListener(c); 
        b6.addActionListener(c); 
        b5.addActionListener(c); 
        b4.addActionListener(c); 
        b3.addActionListener(c); 
        b2.addActionListener(c); 
        b1.addActionListener(c); 
        b0.addActionListener(c); 
        be.addActionListener(c); 
        beq.addActionListener(c); 
        beq1.addActionListener(c); 
  
        p.add(t); 
        p.add(ba); 
        p.add(b1); 
        p.add(b2); 
        p.add(b3); 
        p.add(bs); 
        p.add(b4); 
        p.add(b5); 
        p.add(b6); 
        p.add(bm); 
        p.add(b7); 
        p.add(b8); 
        p.add(b9); 
        p.add(bd); 
        p.add(be); 
        p.add(b0); 
        p.add(beq); 
        p.add(beq1); 
        p.setBackground(Color.blue); 
        f.add(p); 
        f.setSize(200, 220); 
        f.show(); 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        
        if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
        { 
            if (!s1.equals("")) 
                {
                    s2 = s2 + s; 
                }
                else
                {
                s0 = s0 + s; 
                }
          
            t.setText(s0 + s1 + s2); 
        }
        else if (s.charAt(0) == 'C')
        { 
            s0 = s1 = s2 = ""; 
            t.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') 
        { 
            double te; 
            if (s1.equals("+")) 
            {  
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));             
            }
            else if (s1.equals("-")) 
            {
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            } 
            else if (s1.equals("/")) 
            {
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            } 
            else
            {
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            } 
            t.setText(s0 + s1 + s2 + "=" + te); 
            s0 = Double.toString(te); 
            s1 = s2 = ""; 
        } 
        else { 
          
            if (s1.equals("") || s2.equals("")) 
            {
                s1 = s;
            } 
            
            else
            { 
                double te; 
  
                
                if (s1.equals("+")) 
                {
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                } 
                else if (s1.equals("-")) 
                {
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                } 
                else if (s1.equals("/")) 
                {
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                } 
                else
                {
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                } 
                s0 = Double.toString(te); 
                s1 = s; 
                s2 = ""; 
            }
             t.setText(s0 + s1 + s2); 
        } 
    } 
} 

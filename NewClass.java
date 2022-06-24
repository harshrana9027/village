/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class NewClass 
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("village application");
        JLabel l=new JLabel("choose your country : ");
        JCheckBox box=new JCheckBox("INDIA");
        JCheckBox box1=new JCheckBox("USA");
        
        box.setBounds(100,100,150,50);
        box1.setBounds(100,140,150,50);
        l.setBounds(100,40,150,70);
    
        
        f.add(box);
        f.add(box1);
        f.add(l);
        
        box.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new JFrame();
                JPanel p=new JPanel();
                JButton b=new JButton("SUBMIT");
                JLabel l=new JLabel("choose your state : ");
                
                String state[]={"U.P","H.P","M.P","PUNJAB","HARYANA"};
                JComboBox box=new JComboBox(state);
                
                box.setForeground(Color.blue);
                
                l.setBounds(100,10,140,100);
                p.setBounds(40,80,300,200);
                p.setBackground(Color.gray); 
                box.setBounds(120,120,100,50);
                b.setBounds(120,400,100,30);
                f.add(l);
                
                
                b.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Object selected = box.getSelectedItem();
                        if(selected.toString().equals("U.P"))
                        {
                            JFrame f=new JFrame();
                            JPanel p=new JPanel();
                            JButton b=new JButton("SUBMIT");
                            JLabel l=new JLabel("choose your district : ");
                            
                            String district[]={"AGRA","SAHARANPUR","PRYAGRAJ","BARELIY","AMETHI"};
                            JComboBox box=new JComboBox(district);
                            
                            box.setForeground(Color.blue);
                            
                            l.setBounds(100,10,140,100);
                             p.setBounds(40,80,300,200);
                             p.setBackground(Color.gray); 
                             box.setBounds(120,120,170,50);
                             b.setBounds(120,400,100,30);
                             
                             f.add(l);
                             
                               b.addActionListener(new ActionListener()
                               {
                                public void actionPerformed(ActionEvent e)
                                {
                                   Object selected = box.getSelectedItem();
                                  if(selected.toString().equals("SAHARANPUR"))
                                  {
                                   JFrame f=new JFrame();
                                    JPanel p=new JPanel();
                                    JButton b=new JButton("SUBMIT");
                                    JLabel l=new JLabel("choose your thesil : ");
                                    
                                    String thesil[]={"NAKUR","DEOBAND","BEHAT","RAMPUR"};
                                    JComboBox box=new JComboBox(thesil);
                                    
                                    box.setForeground(Color.blue);

                                    
                                    l.setBounds(100,10,140,100);
                                    p.setBounds(40,80,300,200);
                                    p.setBackground(Color.gray); 
                                    box.setBounds(120,120,170,50);
                                    b.setBounds(120,400,100,30);
                                    
                                    b.addActionListener(new ActionListener()
                                    {
                                     public void actionPerformed(ActionEvent e)
                                     {
                                      Object selected = box.getSelectedItem();
                                      if(selected.toString().equals("BEHAT"))
                                      {
                                       JFrame f=new JFrame();
                                       JPanel p=new JPanel();
                                      JButton b=new JButton("SUBMIT");
                                      JLabel l=new JLabel("choose your village name  : ");
                            
                                      String village[]={"KALSIYA","BARAULI","SADHOULI","PUWARNKA"};
                                     JComboBox box=new JComboBox(village);
                            
                                     box.setForeground(Color.blue);
                            
                                      l.setBounds(100,10,200,100);
                                      p.setBounds(40,80,300,200);
                                      p.setBackground(Color.gray); 
                                       box.setBounds(120,120,170,50);
                                      b.setBounds(120,400,100,30);
                                      
                                       
                                    b.addActionListener(new ActionListener()
                                    {
                                     public void actionPerformed(ActionEvent e)
                                     {
                                      Object selected = box.getSelectedItem();
                                      if(selected.toString().equals("BARAULI"))
                                      {
                                       JFrame f=new JFrame();
                                       //JPanel p=new JPanel();
                                      //JButton b=new JButton("SUBMIT");
                                      JLabel l=new JLabel("  WELCOME TO VILLAGE HARSH   : ");
                            
                                      //String village[]={"KALSIYA","BARAULI","SADHOULI","PUWARNKA"};
                                     //JComboBox box=new JComboBox(village);
                            
                                     //box.setForeground(Color.blue);
                            
                                      l.setBounds(100,10,400,100);
                                     // p.setBounds(40,80,300,200);
                                      //p.setBackground(Color.gray); 
                                       //box.setBounds(120,120,170,50);
                                     // b.setBounds(120,400,100,30);
                                      
                                      f.add(l);
                                      f.setSize(400,800);
                                      f.setLayout(null);
                                      f.setVisible(true);
                                      
                                      }
                                     }
                                    });
                                      
                                      
                                      p.add(box);
                               //p.add(b);
                                      f.add(p);f.add(box);f.add(b);f.add(l);
                
                                    f.setSize(400,800);
                                    f.setLayout(null);
                                    f.setVisible(true);
                                      
                                      }
                                     }
                                    });
                             
                                    
                                    p.add(box);
                               //p.add(b);
                                   f.add(p);f.add(box);f.add(b);f.add(l);
                
                                    f.setSize(400,800);
                                    f.setLayout(null);
                                    f.setVisible(true);
                                    
                                    
                                    
                                    
                                  }
                                }
                               });
                             
                              p.add(box);
                               //p.add(b);
                             f.add(p);f.add(box);f.add(b);
                
                              f.setSize(400,800);
                                f.setLayout(null);
                               f.setVisible(true);
                            
                            
                            
                            
                        }
                    }
                    
                });
                
                p.add(box);
                //p.add(b);
                f.add(p);f.add(box);f.add(b);
                
                f.setSize(400,800);
                f.setLayout(null);
                f.setVisible(true);
            }
            
        });
        
        f.setSize(400,800);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}

package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula1{

    public static void main(String[] args) {
        
        ArrayList<Integer> praticando = new ArrayList<>();
        while(praticando.size() < 5){
            String addOn = JOptionPane.showInputDialog("Digite um inteiro");
            try{
                praticando.add(Integer.parseInt(addOn));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(praticando.toString());
        }
    
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

      Mapel mapel = new Kimia();
      mapel.play();
      System.out.println();
      mapel = new Matematika();
      mapel.play();		
   }
}

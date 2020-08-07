/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class Matematika extends Mapel {
    @Override
   void endPlay() {
      System.out.println("Mata Pelajaran Matematika Telah Selesai !");
   }

   @Override
   void initialize() {
      System.out.println("Mata Pelaajran Matematika akan Segera Dimulai !");
   }

   @Override
   void startPlay() {
      System.out.println("Mata Pelajaran Matematika Sudah Dimulai !");
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Opangs
 */
public class Kimia extends Mapel{
    @Override
   void endPlay() {
      System.out.println("Mata Pelajaran Kimia Telah Selesai !");
   }

   @Override
   void initialize() {
      System.out.println("Mata Pelaajran Kimia akan Segera Dimulai !");
   }

   @Override
   void startPlay() {
      System.out.println("Mata Pelajaran Kimia Sudah Dimulai !");
   }
}

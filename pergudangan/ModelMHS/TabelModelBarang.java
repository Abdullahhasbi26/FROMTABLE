/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ModelMHS;


import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEXIS
 */
public class TabelModelBarang extends AbstractTableModel {

    List<Barang> listBrg;
    
    public TabelModelBarang(List<Barang> listBrg) {
        this.listBrg = listBrg;
    }
    
    
    @Override
    public int getRowCount() {
       return listBrg.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      return switch (columnIndex) {
          case 0 -> listBrg.get(rowIndex).getKode();
          case 1 -> listBrg.get(rowIndex).getNama();
          case 2 -> listBrg.get(rowIndex).getJumlah();
          case 3 -> listBrg.get(rowIndex).getHarga();
          case 4 -> listBrg.get(rowIndex).getMerek();
          default -> null;
      };
    }
    
    
     @Override
    public String getColumnName(int columnIndex) {
      return switch (columnIndex) {
          case 0 -> "Kode Barang";
          case 1 -> "Nama Barang";
          case 2 -> "Jumlah";
          case 3 -> "Harga";
          case 4 -> "Merek";
          default -> null;
      };
    }
    
}

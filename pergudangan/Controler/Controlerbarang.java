/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controler;

import com.mycompany.DAO.Daobarang;
import com.mycompany.ModelMHS.Barang;
import com.mycompany.ModelMHS.TabelModelBarang;
import com.mycompany.View.Form;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXIS
 */
public class Controlerbarang {
    Form frame;
    List<Barang> listBrg;
    Daobarang daoBrg = new Daobarang();
    Barang brg = new Barang();
    private List<Barang> lisBrg;
    
    public Controlerbarang(Form frame) {
        this.frame = frame;
        listBrg = daoBrg.getData();
    }
    
    public void tampil_tabel() {
        TabelModelBarang tabelBrg = new TabelModelBarang(lisBrg);
    }
    
    public void tambahData() {
        if (frame.getTxtKode().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kode barang belum di isi");
        } else {
            brg.setKode(frame.getTxtKode().getText());
            brg.setNama(frame.getTxtNama().getText());
            brg.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            brg.setMerek(frame.getTxtMerek().getText());
            daoBrg.tambah(brg);
            JOptionPane.showMessageDialog(frame, "berhasil menambahkan data baru");
        }
    }
    
    public void ubahData() {
         if (frame.getTxtKode().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kode barang belum di isi");
    }else {
            brg.setKode(frame.getTxtKode().getText());
            brg.setNama(frame.getTxtNama().getText());
            brg.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            brg.setMerek(frame.getTxtMerek().getText());
            daoBrg.ubah(brg);
            JOptionPane.showMessageDialog(frame, "berhasil mengubah");
        }
    }
    
    public void hapusData() {
        brg.setKode(frame.getTxtKode().getText());
        daoBrg.hapus(brg);
         JOptionPane.showMessageDialog(frame, "berhasil menghapus");
    }
    
    public void bersih() {
        frame.setTxtKode("");
        frame.setTxtNama("");
        frame.setTxtJumlah(0);
        frame.setTxtHarga(0);
        frame.setTxtMerek("");
    }
    
    public void keluar() {
        frame.dispose();
    }
}

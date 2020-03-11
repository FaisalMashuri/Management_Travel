/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.view.Form_pegawai;
import java.sql.SQLException;
/**
 *
 * @author FAISAL
 */
public interface controller_pegawai {
    public abstract void simpan(Form_pegawai pgw)throws SQLException;
    public abstract void Ubah(Form_pegawai pgw) throws SQLException;
    public abstract void Hapus(Form_pegawai pgw) throws SQLException;
    public abstract void Tampil(Form_pegawai pgw) throws SQLException;
    public abstract void Baru(Form_pegawai pgw) throws SQLException;
    public abstract void klikTable(Form_pegawai pgw) throws SQLException;
}

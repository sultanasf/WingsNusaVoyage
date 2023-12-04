/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import models.interfaces.Transaksi;

/**
 *
 * @author Sultan Firdaus
 */
public class Tabungan implements Transaksi {

    private int saldo;

    public Tabungan() {
        this.saldo = 0;
    }

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean tarik(int nominal) {
        if (nominal > this.saldo) {
            return false;
        }
        this.saldo -= nominal;
        return true;
    }

    @Override
    public void setor(int nominal) {
        this.saldo += nominal;
    }
}

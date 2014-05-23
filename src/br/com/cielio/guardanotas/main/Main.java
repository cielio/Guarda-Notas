/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cielio.guardanotas.main;

import br.com.cielio.guardanotas.controle.ControladorNota;
import br.com.cielio.guardanotas.modelo.Nota;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kohoutek
 */
public class Main {
    
    public static void main(String[] args) {
        
        ControladorNota controladorNota = new ControladorNota();

        Date date = new Date();
        date.getTime();
        //controladorNota.adicionar("Aula pascal", "Ja é melhor",
         //    date);
        
        List <Nota> notas = controladorNota.listar();
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        for (Nota nota : notas) {
            System.out.println("titulo "+nota.getTitulo()+"\nConteudo\n"+nota.getConteudo()+"Data "
                    +simpleDateFormat.format(nota.getData().getTime()));
        }
    }
}

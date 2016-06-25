/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;

import com.negocio.Cliente;
import com.negocio.DetalleFactura;
import com.negocio.Factura;
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Edwin Benalcazar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Cliente cli = new Cliente();
        cli.setNombre("Edwin Benalcazar");
        cli.setDireccion("La Florida");
        cli.setTelefono("3303362");
        cli.setIndentificacion("1722553102");
        List<Factura> listafac = new ArrayList<Factura>();
        for(int i = 1; i<=2; i++)
        {
            Factura fac = new Factura();
            fac.setNumero(i);
            fac.setFecha(sdf.parse("12/12/2016"));
            List<DetalleFactura> listadet = new ArrayList<DetalleFactura>();
            
            
            for(int j = 1; i<=3; i++)
            {
                DetalleFactura detfac = new DetalleFactura();
                detfac.setCantidad(10);
                detfac.setDescripcion("asdasdasd");
                detfac.setValor(20.50);

                listadet.add(detfac);
            }
            fac.setLista_detalles_facturas(listadet);
            
            
            
            listafac.add(fac);
            
        }
        cli.setLista_facturas(listafac);
        for(Factura f:listafac){
            for(Iterator<DetalleFactura> it = f.getLista_detalles_facturas().iterator(); it.hasNext();){
            DetalleFactura df = it.next();
            System.out.println(cli+f.toString()+df.toString());
            
        }
        }

     }
    
}

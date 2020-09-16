/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author PC
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.CreateSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
    
}

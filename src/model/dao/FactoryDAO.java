package model.dao;

import db.DB;
import model.impl.SellerDaoJDBC;

public class FactoryDAO {

    public static SellerDAO createSellerDAO(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}

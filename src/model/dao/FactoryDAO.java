package model.dao;

import model.impl.SellerDaoJDBC;

public class FactoryDAO {

    public static SellerDAO createSellerDAO(){
        return new SellerDaoJDBC();
    }
}

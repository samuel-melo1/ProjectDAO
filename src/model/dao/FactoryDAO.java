package model.dao;

import db.DB;
import model.impl.DepartmentDaoJDBC;
import model.impl.SellerDaoJDBC;

public class FactoryDAO {

    public static SellerDAO createSellerDAO(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}

package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    @Override
    public void save(Customer customer){
        System.out.println("Saved to database for Nero company :" + customer.firstName);
    }

}

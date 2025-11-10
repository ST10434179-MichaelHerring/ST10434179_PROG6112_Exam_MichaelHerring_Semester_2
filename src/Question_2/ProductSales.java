package Question_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author micha
 */
public class ProductSales implements IProductSales{

    @Override
    public int[][] GetProductSales() {
    int sales[][] = { {300, 150, 700},
                    {250, 200, 600}
    };

    return sales;
    }

    @Override
    public int GetTotalSales() {
        
    int total = 0;
        
        for (int sales : ProductSales){
            total += sales;
        }
        
        return total;
    }

    @Override
    public int GetSalesOverLimit() {
    
    }

    @Override
    public int GetSalesUnderLimit() {
    
    }

    @Override
    public int GetProductsProcessed() {
    
    }

    @Override
    public double GetAverageSales() {
    
    }
    
}

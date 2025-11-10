package Question_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author micha
 */
public class ProductSales implements IProductSales {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        
        //sales takes on the value of every entry in array and adds it to total
        for (int sales : productSales){
            total =+ sales;
        }
                
        return total;
                
    }

    @Override
    public double AverageSales(int[][] productSales) {
       int total = 0;
       double average;
       int count = 0;
        
        //sales takes on the value of every entry in array and adds it to total
        for (int sales : productSales){
            total =+ sales;
            count = count + 1;
        }
                
        average = total / count;
        
        return average;
        
        
    }

    @Override
    public int MaxSale(int[][] productSales) {
        
        int max = 0;
        
        //bubble sort
        for (int i = 0 ; i < productSales.length; i++){
            
            if (productSales[i] < max){
                
                max = productSales[i];
            }
        }
        
        return max;
           
    }

    @Override
    public int MinSale(int[][] productSales) {
        
        int mix = 0;
        
        //bubble sort
        for (int i = 0 ; i < productSales.length; i++){
            
            if (productSales[i] > mix){
                
                mix = productSales[i];
            }
        }
        
        return mix;
   
    }
    
}

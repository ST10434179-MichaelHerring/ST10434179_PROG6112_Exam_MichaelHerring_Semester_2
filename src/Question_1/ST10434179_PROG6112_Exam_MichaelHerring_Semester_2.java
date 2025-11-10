/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question_1;

/**
 *
 * @author micha
 */
public class ST10434179_PROG6112_Exam_MichaelHerring_Semester_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] year = {"Year 1","Year 2"};
        
        int[][] sales = {
                         {300, 150, 700},
                           {250, 200, 600}
        };
             
        
        ProductSales logic = new ProductSales(); //instantiation
        
        //i need to parse the array properly still, will coem back later
        
        //output
        System.out.println("PRODUCT DALES REPORT - 2025");
        System.out.println("-----------------------------------------------");
        System.out.println("Total sales: " + logic.TotalSales(sales));
        System.out.println("Average sales: " + logic.AverageSales(sales));
        System.out.println("Maximun sale: " + logic.MaxSale(sales));
        System.out.println("Minimum sale: " + logic.MinSale(sales));
        System.out.println("-----------------------------------------------");
        
        
        
        
                
        }
        
        
    }
    
}

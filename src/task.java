/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
/**
 *
 * @author Ramakrishna
 */

/*
             “ABCD” => “BCD”
             “AACD” => “CD” 
             “BACD” => “BCD”
             “BBAA” => “BBAA”       
             “AABAA” => “BAA”

*/


public class task {

   
    

    



    /**
     *
     * @param str
     * @return
     */
    public String t(String str)
             {
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
               }

    
    }
    




                                     
                                          

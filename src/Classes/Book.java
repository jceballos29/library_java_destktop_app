/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Administration.Administration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jcebalus
 */
public class Book {
    
    private final Administration admin = new Administration();
    
    private int id;
    private final String type;
    private String state = "on library";
    private final String name;
    private final String editorial;
    private final int author_id;
    private final int year_publication;
    private LocalDate returns_date = null;
    private int days_late = 0;
    private int loan_partner_id = 0;
    
    public Book(String name, String type, String editorial, int author_id, int year_publication) {
        this.name = name;
        this.type = type;
        this.editorial = editorial;
        this.author_id = author_id;
        this.year_publication = year_publication;

    }
    
    public void lendBook(int loan_partner_id){ 
        if("on library".equals(this.state)){
            this.state = "on loan";
            this.loan_partner_id = loan_partner_id;
            this.returns_date = LocalDate.now().plusDays(30);
        }
    }
    
    public void validateLoanStatus(){
        if("on loan".equals(this.state)){
            int diff = (int) returns_date.until(LocalDate.now(), ChronoUnit.DAYS);
            if(diff > 0){
                this.state = "on belated";
                this.days_late = diff;
            }
        }
    }
    
    public void returnBook(){
        this.state = "on library";
        this.loan_partner_id = 0;   
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id);
        sb.append("\nType: ").append(type);
        sb.append("\nName: ").append(name);
        sb.append("\nAuthor Id: ").append(author_id);
        sb.append("\nEditorial: ").append(editorial);
        sb.append("\nYear of Publicatio: ").append(year_publication);
        sb.append("\nState: ").append(state);
        if("on loan".equals(state)){
            sb.append("\nReturns date=").append(returns_date);
            sb.append("\nLoan Partner id: ").append(loan_partner_id);
        }
        if("on belated".equals(state)){
            sb.append("Days Late: ").append(days_late);
        }
        
        return sb.toString();
    }

   
}

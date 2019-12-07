package example.Homework;

public class Book {

    private String bookname;
    private String booktype;
    private double price;

    public String getBookname(){

       return this.bookname=bookname;
    }
    public void setbookname(String ChildrenBook){

        this.booktype=booktype;
    }
    public String getbooktype() {
       return  this.booktype = booktype;
    }
      public void setBooktype(String Comics){
          this.booktype=booktype;
      }
      public void setPrice(double price){

        if (price >0){
            this.price=price;
        }else{
            System.out.println("Invalid price");
        }
          }
       public double getPrice() {
           return this.price;
    }

        public void sell(int qty) {
             System.out.println("Total: $" + (qty * price));
    }
}



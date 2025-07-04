
public class Main {
    public static void main(String[] args) {
        Products p1=new Biscuits();
        Products p2=new TV();
        Products p3=new Cheese();
        Products p4=new Mobile();
        Customare cast=new Customare();
Cart c = new Cart();
c.add(p2,2);
c.add(p4,1);
CheckOut check =new CheckOut(cast,c);
check.theCheckOut();

    }
}
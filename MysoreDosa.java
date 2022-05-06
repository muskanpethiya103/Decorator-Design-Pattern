public class MysoreDosa extends DosaDecorator
{
 
 public MysoreDosa( Dosa dosa )
 {
 super(dosa);
 }
 
 public String makeDosa()
 {
 return dosa.makeDosa() + addMysoreMasala();
 
 }
 
 private String addMysoreMasala()
 {
 return ",Mysore Masala added";
 }
}
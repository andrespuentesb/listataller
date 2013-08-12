package co.edu.um;

/**
 * Created with IntelliJ IDEA.
 * User: USUARIO
 * Date: 11/08/13
 * Time: 05:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Caja <T> {
    private T dato;
    public Caja () { super();}
    public T quita() {return dato;}
    public void pon(T d){dato=d;
   }
    public static <U>void ponEnCaja(U u,Caja<U>caja){
        caja.pon(u);
    }
}

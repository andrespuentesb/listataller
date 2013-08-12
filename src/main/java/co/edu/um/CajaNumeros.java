package co.edu.um;

/**
 * Created with IntelliJ IDEA.
 * User: USUARIO
 * Date: 11/08/13
 * Time: 05:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CajaNumeros<T extends Number> {
    private T dato;
    public T quita(){return dato;}
    public void pon (T dato){this.dato=dato;}
}

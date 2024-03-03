package snabbköp.händelser.övrigt;
/**
 * @author Botan Güzel, Sergij Wennströmm, Ludvig Lidén
* @version -
* @Date: 24/02/23
 * Representerar en kund i snabbköpssimuleringen. Varje kund har ett unikt ID som 
 * tilldelas när kunden ankommer till snabbköpet.
 */

public class KundFabrik {
    private int senasteKundID = -1;

    public Kund skapaNyKund() {
        senasteKundID++;
        return new Kund(senasteKundID);
    }
}

package hit;
/******************************
 * Name: Nadav Elgrabli
 * ID: 316082791
 *****************************/

/**
 * @author Nadav Elgrabli
 * Hit notifier interface that notifes the listeners.
 */
public interface HitNotifier {

    /**
     * Add hl as a listener to hit events.
     * @param hl listener
     */
    void addHitListener(HitListener hl);

    /**
     * Remove hl from the list of listeners to hit events.
     * @param hl listener.
     */
    void removeHitListener(HitListener hl);
}
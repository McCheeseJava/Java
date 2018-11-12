package exception2;
/*
 * HaroonsDamnException.java
 *
 * Created on January 27, 2004, 11:42 PM
 */

/**
 *
 * @author  Administrator
 */
public class HaroonsDamnException extends Exception {
    
    /**
     * Creates a new instance of <code>HaroonsDamnException</code> without detail message.
     */
    public HaroonsDamnException() {
    }
    
    
    /**
     * Constructs an instance of <code>HaroonsDamnException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public HaroonsDamnException(String msg) {
        super(msg);
    }
}

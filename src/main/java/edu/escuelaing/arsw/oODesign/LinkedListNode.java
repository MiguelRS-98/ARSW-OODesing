package edu.escuelaing.arsw.oODesign;

/**
 * This is the class that creates the nodes.
 * @author Miguel Ángel Rodríguez Siachoque
 */
public class LinkedListNode<T>
{
    private final T value;
    private LinkedListNode<T> next;
    
     /**
     * This is the main method where the value of the node and its successor node are managed.
     * @param t Node value.
     */
    public LinkedListNode(T t)
    {
        value = t;
        next = null;
    }
    
    /**
     * This method is to get the value of the node.
     * @return Node value.
     */
    public T getValue()
    {
        return value;
    }
    
    /**
     * This method assigns the next node.
     * @param n Current node to know the next node.
     */
    public void linkNext (LinkedListNode<T> n)
    {
        next = n;
    }
    
    /**
     * This method returns the following node.
     * @return The next node.
     */
    public LinkedListNode<T> getNextNode () 
    {
        return next;
    }
}

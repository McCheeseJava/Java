
package collections;
public interface CollectionInterface<T>
{
  public boolean add(T element);
  // Attempts to add element to this collection.
  // Returns true if successful, false otherwise.

  public T get(T target);
  // Returns an element e from this collection such that e.equals(target).
  // If no such element exists, returns null.

  public boolean contains(T target);
  // Returns true if this collection contains an element e such that
  // e.equals(target); otherwise returns false.

  public boolean remove (T target);
  // Removes an element e from this collection such that e.equals(target)
  // and returns true. If no such element exists, returns false.

  public boolean isFull();
  // Returns true if this collection is full; otherwise, returns false.

  public boolean isEmpty();
  // Returns true if this collection is empty; otherwise, returns false.


  public int size();
  // Returns the number of elements in this collection.
}
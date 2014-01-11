/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.filters;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Przemo
 */
public abstract class Filter<T> {
  public abstract boolean passes(T object);
  public Iterator<T> filter(Iterator<T> iterator) {
    return new Filter.FilterIterator(iterator);
  }
  public Iterable<T> filter(final Iterable<T> iterable) {
    return new Iterable<T>() {
      @Override
      public Iterator<T> iterator() {
        return filter(iterable.iterator());
      }
    };
  }
  private class FilterIterator implements Iterator<T> {
    private Iterator<T> iterator;
    private T next;
    private FilterIterator(Iterator<T> iterator) {
      this.iterator = iterator;
      toNext();
    }
    public boolean hasNext() {
      return next != null;
    }
    public T next() {
      if (next == null)
        throw new NoSuchElementException();
      T returnValue = next;
      toNext();
      return returnValue;
    }
    public void remove() {
      throw new UnsupportedOperationException();
    }
    private void toNext() {
      next = null;
      while (iterator.hasNext()) {
        T item = iterator.next();
        if (item != null && passes(item)) {
          next = item;
          break;
        }
      }
    }
  }
}

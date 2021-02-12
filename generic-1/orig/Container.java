public class Container<E> {

   private final E e;

   public Container(E e) {
     this.e = e;
   }

   public E get() {
     return e;
   }

}

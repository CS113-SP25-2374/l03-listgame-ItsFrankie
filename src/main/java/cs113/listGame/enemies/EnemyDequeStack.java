package cs113.listGame.enemies;

import cs113.listGame.behaviors.Behavior;
import cs113.listGame.behaviors.MoveToPoint;
import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;

import java.util.*;

public class EnemyDequeStack extends EnemyObject {
    public EnemyDequeStack(ImageView imageView) { super(imageView); }
    Deque<Behavior> behaviors = new Deque<Behavior>() {
        @Override
        public void addFirst(Behavior behavior) {

        }

        @Override
        public void addLast(Behavior behavior) {

        }

        @Override
        public boolean offerFirst(Behavior behavior) {
            return false;
        }

        @Override
        public boolean offerLast(Behavior behavior) {
            return false;
        }

        @Override
        public Behavior removeFirst() {
            return null;
        }

        @Override
        public Behavior removeLast() {
            return null;
        }

        @Override
        public Behavior pollFirst() {
            return null;
        }

        @Override
        public Behavior pollLast() {
            return null;
        }

        @Override
        public Behavior getFirst() {
            return null;
        }

        @Override
        public Behavior getLast() {
            return null;
        }

        @Override
        public Behavior peekFirst() {
            return null;
        }

        @Override
        public Behavior peekLast() {
            return null;
        }

        @Override
        public boolean removeFirstOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean removeLastOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean add(Behavior behavior) {
            return false;
        }

        @Override
        public boolean offer(Behavior behavior) {
            return false;
        }

        @Override
        public Behavior remove() {
            return null;
        }

        @Override
        public Behavior poll() {
            return null;
        }

        @Override
        public Behavior element() {
            return null;
        }

        @Override
        public Behavior peek() {
            return null;
        }

        @Override
        public boolean addAll(Collection<? extends Behavior> c) {
            return false;
        }

        @Override
        public void push(Behavior behavior) {

        }

        @Override
        public Behavior pop() {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Iterator<Behavior> iterator() {
            return null;
        }

        @Override
        public Iterator<Behavior> descendingIterator() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    @Override
    public void seedBehaviors() 
    {
        behaviors.add(new MoveToPoint(this, 3000, this.getWorldCenter()));

        Point2D destination1 = new Point2D(this.getWorldCenter().getX(), this.getWorldCenter().getY()-400);
        behaviors.add(new MoveToPoint(this, 4000, destination1));
    }

    @Override
    public Behavior getNextBehavior() 
    {
        return behaviors.pollLast();
    }
}

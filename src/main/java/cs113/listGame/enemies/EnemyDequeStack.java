package cs113.listGame.enemies;

import cs113.listGame.behaviors.Behavior;
import javafx.scene.image.ImageView;

import java.util.ArrayDeque;
import java.util.Deque;

public class EnemyDequeStack extends EnemyObject {
    public EnemyDequeStack(ImageView imageView) { super(imageView); }

    @Override
    public void seedBehaviors() 
    {
        behaviors.add(new MoveToPoint(this, 3000, this.getWorldCenter()));

        Point2D destination1 = new Point2D(this.getWorldCenter.getX(), this.getWorldCenter.getY()-400);
        behaviors.add(new MoveToPoint(this, 4000, destination1));
    }

    @Override
    public Behavior getNextBehavior() 
    {
        return behaviors.pollLast();
    }
}

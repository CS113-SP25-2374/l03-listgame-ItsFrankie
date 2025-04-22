package cs113.listGame.enemies;

import cs113.listGame.behaviors.Behavior;
import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;

public class EnemyLinkedList extends EnemyObject {
    public EnemyLinkedList(ImageView imageView) { super(imageView); }

    @Override
    public void seedBehaviors() 
    {
        Point2D destination1 = new Point2D(this.getWorldCenter().getX-200, this.getWorldCenter().getY());
        behaviors.addLast(new MoveToPoint(this, 2000, destination1));
        destination1 = new Point2D(this.getWorldCenter().getX()-200, this.getWorldCenter().getY()-200);
        behaviors.addLast(new MoveToPoint(this, 2000, destination1));
        destination1 = new Point2D(this.getWorldCenter().getX(), this.getWorldCenter().getY()-200);
        behaviors.addLast(new MoveToPoint(this, 2000, destination1));
        destination1 = new Point2D(this.getWorldCenter().getX(), this.getWorldCenter().getY());
        behaviors.addLast(new MoveToPoint(this, 2000, destination1));
    }

    @Override
    public Behavior getNextBehavior() 
    {
        if (behaviors.isEmpty()) 
            return null;
        return behaviors.pop;
    }
}

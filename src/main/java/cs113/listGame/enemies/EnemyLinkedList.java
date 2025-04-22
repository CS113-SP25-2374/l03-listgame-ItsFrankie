package cs113.listGame.enemies;

import cs113.listGame.behaviors.Behavior;
import cs113.listGame.behaviors.MoveToPoint;
import cs113.listGame.gamecore.GameObject;
import cs113.listGame.gamecore.PlayerObject;
import cs113.listGame.enemies.EnemyObject;
import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;

import java.util.LinkedList;

public class EnemyLinkedList extends EnemyObject {
    public EnemyLinkedList(ImageView imageView) { super(imageView); }
    LinkedList<Behavior> behaviors = new LinkedList<>();

    @Override
    public void seedBehaviors() 
    {
        Point2D destination1 = new Point2D(this.getWorldCenter().getX()-200, this.getWorldCenter().getY());
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
        return behaviors.pop();
    }
}

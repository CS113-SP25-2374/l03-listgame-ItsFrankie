package cs113.listGame.enemies;

import cs113.listGame.behaviors.Behavior;
import cs113.listGame.gamecore.GameObject;
import cs113.listGame.resources.ResourceObject;
import javafx.scene.image.ImageView;
import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.Random;

public class EnemyArrayList extends EnemyObject 
{
    ArrayList<Behavior> behaviors = new ArrayList<>();
    Random random = new Random();

    public EnemyArrayList(ImageView imageView) { super(imageView); }

    @Override
    public void seedBehaviors() 
    {
        Point2D destination1 = new Point2D(random.nextDouble(500), random.nextDouble(400));

        behaviors.add(new MoveToPoint(this, 3000, destination1));
        behaviors.add(new Waiting(this, 2000));
        behaviors.add(new Waiting(this, 2000));
        behaviors.add(new FollowObject(this, 3000, GameController.getPlayer().getPlayer()));
        behaviors.add(new MoveToPoint(this, 3000, this.getWorldCenter()));
    }

    @Override
    public Behavior getNextBehavior() 
    {
        if (behaviors.isEmpty())
            return null;
        int index = random.nextInt(behaviors.size());
        Behavior behavior1 =  behaviors.get(index);
        behaviors.remove(behavior1);
        return behavior1;
    }
}
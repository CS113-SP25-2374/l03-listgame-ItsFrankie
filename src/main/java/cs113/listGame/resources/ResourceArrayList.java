package cs113.listGame.resources;

import java.util.ArrayList;
import java.util.Iterator;

import cs113.listGame.gamecore.GameObject;

public class ResourceArrayList implements ResourceList 
{
    ArrayList<ResourceObject> resources = new ArrayList<>();

    public ResourceArrayList() {}

    @Override
    public void add(ResourceObject resource0) 
    { 
        if (!resources.contains(resource0))
            resources.add(resource0);


        /* 
        if (index0 < 0 || index0 >= array1.length)
        { //if index0 is out of bounds
            throw new IndexOutOfBoundsException();
        }
        if(array1[array1.length-1] != null)
        {   //if last index is NOT null
            resize();
        }
        else if (index0 == array1.length - 1)
        {   //if last index is empty and index0 is the last element in array1
            array1[array1.length - 1] = resource;
        }
        for(int i = size()-1; i>=index; i--)
        {
            array1[i] = array[i-1];
        }

        for (int i = index0; i < array1.length; i++)
        {   //start at index0 and push occupying element forward
            E element1 = array1[i+1]; //store element one spot ahead as element1
            array1[i+1] = array1[i]; //move element in current spot forward by one
            array1[i] = element0; //store former occupying element as element0
            element0 = element1; //they are now the same (?)
        } */
    } //end of add(resource) method

    @Override
    public void remove(ResourceObject resource0) 
    {
        resources.remove(resource0);
    }

    @Override
    public void truncate(ResourceObject resource0) 
    {
        boolean found = false;
        Iterator<ResourceObject> iterator0 = resources.iterator();
        while (iterator0.next)
        {
            if (iterator0.next().equals(resource0))
            {
                found = true;
            }
            if (found)
            {
                iterator0.remove();
            }
        }
    }

    @Override
    public void follow(GameObject leader) 
    {
        Iterator<ResourceObject> iterator0 = resources.iterator0();
        while(iterator0.hasNext())
        {
            ResourceObject resource = iterator0.next();
            resource.moveTowards(leader);
            leader = resource;
        }
    }
}

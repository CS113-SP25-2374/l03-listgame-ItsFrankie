package cs113.listGame.resources;

import cs113.listGame.gamecore.GameObject;

public class ResourceArrayList implements ResourceList 
{
    @Override
    public void add(ResourceObject resource) 
    {
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
        {   /*//start at index0 and push occupying element forward
            E element1 = array1[i+1]; //store element one spot ahead as element1
            array1[i+1] = array1[i]; //move element in current spot forward by one
            array1[i] = element0; //store former occupying element as element0
            element0 = element1; //they are now the same (?)*/
        }
    } //end of add(resource) method

    @Override
    public void remove(ResourceObject resource) 
    {

    }

    @Override
    public void truncate(ResourceObject resource) 
    {

    }

    @Override
    public void follow(GameObject leader) {

    }
}

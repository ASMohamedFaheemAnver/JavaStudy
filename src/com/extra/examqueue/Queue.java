package com.extra.examqueue;

class PriorityElement{
    private int priority;
    private String data;
    PriorityElement(int aPriority, String aData){
        priority = aPriority;
        data = aData;
    }
    public int getPriority(){
        return priority;
    }
    public String getData(){
        return data;
    }
}

class Queue {
    public PriorityElement[] objects;
    public boolean isFull = false;
    public int count = 0;
    private int maxSizeOfQueue;

    public Queue(int maxSizeOfQueue){
        this.maxSizeOfQueue = maxSizeOfQueue;
        this.objects = new PriorityElement[maxSizeOfQueue];
    }

    public void insert(PriorityElement newObject){
        if(count==0){
            objects[0] = newObject;
            count++;
        }else if(!isFull){
            boolean isAdded = false;
            for (int i = 0; i<count; i++){
                if(objects[i].getPriority()<newObject.getPriority()){
                    for (int j = count; j>i; j--){
                        objects[j] = objects[j-1];
                    }
                    objects[i] = newObject;
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded){
                objects[count] = newObject;
            }
            count++;
            if (count==maxSizeOfQueue){
                isFull = true;
            }
        }
    }

    public static void main(String[] args){
        PriorityElement one = new PriorityElement(1, "1");
        PriorityElement two = new PriorityElement(2, "2");
        PriorityElement three = new PriorityElement(0, "3");
        Queue queue = new Queue(5);
        queue.insert(one);
        queue.insert(two);
        queue.insert(three);
        queue.insert(one);
        queue.insert(two);
        queue.insert(three);
        queue.insert(one);
        queue.insert(two);
        queue.insert(three);
        System.out.printf("Testring");
    }
}

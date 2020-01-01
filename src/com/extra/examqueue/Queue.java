package com.extra.examqueue;

import java.io.*;

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
                if(objects[i].getPriority()>newObject.getPriority()){
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

    public PriorityElement remove(){
        PriorityElement front = null;
        if (!isEmpty()){
            front = objects[0];
            for (int i = 0; i<count-1; i++){
                objects[i] = objects[i+1];
            }
            objects[--count] = null;
        }
        return front;
    }

    public boolean isEmpty(){
        return count!=0 ? false : true;
    }

    public boolean isFull(){
        return isFull;
    }
}

class PriorityQueue extends Queue{
    public PriorityQueue(int maxSizeOfQueue) {
        super(maxSizeOfQueue);
    }

    public void insert(int priority, String data){
        PriorityElement newObject = new PriorityElement(priority, data);
        insert(newObject);
    }
}

class WeatherReporter{
    String[] readWeather() throws IOException {
        FileReader inputFile = new FileReader("/home/ubunturifa/Desktop/GitHub/JavaStudy/src/com/extra/examqueue/weather.txt");
        Reader reader = new BufferedReader(inputFile);

        /*StreamTokenizer tokens = new StreamTokenizer(reader);
        String data = "";
        int chunk;
        while ((chunk=tokens.nextToken())!=StreamTokenizer.TT_EOF){
            switch (chunk){
                case StreamTokenizer.TT_NUMBER:
                    data += tokens.nval;
                    break;
                case  StreamTokenizer.TT_WORD:
                    data += tokens.toString();
            }
        }*/

        int chunk;
        int count = 0;
        String[] data = new String[10];
        for (int i = 0; i<data.length; i++){
            data[i] = "";
        }
        while ((chunk=reader.read())!=-1){
            if (chunk!=10){
                data[count] += (char)chunk;
            }else {
                count++;
            }
        }

        return data;
    }
}

class Implementer{
    public static void main(String[] args) throws IOException {
        WeatherReporter weatherReporter = new WeatherReporter();
        String[] data = weatherReporter.readWeather();
        PriorityQueue priorityQueue = new PriorityQueue(data.length);

        for (String oneData: data){
            String[] weatherData = oneData.split(" ");
            priorityQueue.insert(Integer.parseInt(weatherData[2]), weatherData[0] + " " + weatherData[1]);
        }
        
        PriorityElement least = priorityQueue.remove();
        System.out.printf("Lowest temperature is in %s %d", least.getData(), least.getPriority());
    }
}
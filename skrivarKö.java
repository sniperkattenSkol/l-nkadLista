// Nils E Lindfors TE15 
// 2017-03-27
// 08:54
public class skrivarKö {
    //Links to the first class
    länkList i = new länkList();

    //Adds it last
    public void enqueue(String köST){
        i.addlast(köST);
    }
    //Checks if empty
    public boolean isEmpty(){
        return (isEmpty() == true);
    }
    //Removes the first one it the q and returns it
    public String dequeue(){
        String temp = i.nodeToString(i.first);
        i.removeFirst();
        return temp;
    }

    //Gets size of the list
    public int size(){
        return i.getSize();
    }


}

// Nils E Lindfors TE15
// 2017-03-20
// 08:53

public class länkList {
    //DEF first and last node.
    node first;
    node last;

   //Size int
    public int size = 0;

    //INZ node class
    private class node {
        public String nodeString1;
        node next;

    }
    //Removes First, if empty do not remove and put first and last to null
    public void removeFirst() {
        if (isEmpty()) {
            first = null;
            last = null;
        } else {
            size--;
            first = first.next;
        }
    }

    //Removes Last, if empty first and last = null
    public void removeLast() {
        if (isEmpty()) {
            first = null;
            last = null;
        }else{
            size--;
            node tempNode = new node();
            tempNode = first;
            while (tempNode.next != last) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            //låt den peka till null istället för last
        }
    }
    //Adds first, can handle empty list
    public void addfirst(String sTn) {
        node tempNode = new node();
        tempNode.nodeString1 = sTn;
        size++;
        if (isEmpty()) {
            tempNode.next = null;
            first = tempNode;
            last = tempNode;
        } else {
            tempNode.next = first;
            first = tempNode;
        }

    }
    //Checks if empty
    public boolean isEmpty() {
        return (first == null);
    }

    //Adds the node Last
    public void addlast(String sTn) {
        node tempNode = new node();
        tempNode.nodeString1 = sTn;
        tempNode.next = null;
        size++;
        if (isEmpty()) {
            first = tempNode;
            last = tempNode;
        } else {
            last.next = tempNode;
            last = tempNode;
        }
    }
    //Onödig
    //Skriver ut hela listan
    public String printString() {
        String outpt = "";
        node currentNode = first;
        while (currentNode != null) {
            outpt += currentNode.nodeString1 + "-> ";
            currentNode = currentNode.next;
        }
        return outpt;
    }
    //Takes a node and makes it a String
    public String nodeToString(node zxy){
        return zxy.nodeString1;
    }
    //Gets size
    public int getSize() {
        if (size < 0)
        {
            //Om size är mindre än noll så sätter getSize size till 0
            //Och berättar det genom att skriva ut i terminalen
            size = 0;
            System.out.println("Något blev fel, Size var negativ");
            return size;
        } else {
        return size;
        }
    }
}
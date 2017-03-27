// Nils E Lindfors TE15
// 2017-03-20
// 10:25
public class tstpgrm {
    //Shorthand for println, makes my life easier
    public static void print(String emil){
        System.out.println(emil);
    }

    public static void main(String[] args) {

        skrivarKö köö = new skrivarKö();

        köö.enqueue("damn1");
        köö.enqueue("damn2");
        köö.enqueue("damn3");
        print("How many remaining in printer Queue: " + Integer.toString(köö.size()) + "\n");

        //dequeues & prints. Prints out the size after the dequeue
        for (int i = köö.size(); i > 0; i--){
           print( "Skrivs ut:    " + köö.dequeue());
           print("How many Left: " + Integer.toString(köö.size()));
        }



        }
    }



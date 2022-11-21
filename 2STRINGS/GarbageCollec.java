package JavaAssessments.Strings;


public class GarbageCollec {

    //garbage collection is cleaning up the unreferenced objects

    //finalize method will run prior to garbage collector(gc()), it will load all the unreferenced or null object and clearns it.
    //overriding the finalize method
    @SuppressWarnings("removal")
    @Override
    public void finalize(){
        System.out.println("Garbage is collected");
    }

    public static void main(String[] args) {

        //creating an object and making it null to perform garbage collection
          GarbageCollec s1 = new GarbageCollec();
          s1 = null;

          //the garbage collector(gc()) will clean up the above null object. Prior to it our overridden finalize method will run.
          System.gc();
    }


}

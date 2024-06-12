// This is the abstract class for use by Clients
abstract class Plant {
    private String id;
    Plant(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    abstract public void report();
    abstract public boolean install(Plant p);
}

// This is the leaf node of the plant hierarchy tree
class LeafPlant extends Plant {
    LeafPlant(String id) {
        super(id);
    }
    public void report() {
        System.out.println("Reporting status of "+getId());
    }
    public boolean install(Plant p) {
        System.out.println("Leaf should never call install()");
        return false;
    }
}
// This is a Plant node consisting of several sub plant nodes
class CompositePlant extends Plant {
    private int spcount;
    private Plant [] splist;
    private int spptr;
    CompositePlant(String id, int spcount) {
        super(id);
        this.spcount = spcount;
        splist = new Plant[spcount];
        spptr = 0; }
    public boolean install(Plant subplant) {
        if(spptr<spcount) {
            splist[spptr++] = subplant;
            return true;
        }
        else
            return false;
    }
    public void report() {
        for(int i=0; i<spptr; i++)
            splist[i].report();
        System.out.println("Reporting status of "+getId());
    }
}



    public class Pair {
	private long id;
	private int numberOfBits;
	private int n;
	public Pair(long id,int n) {
	    this.id = id;
	    this.n = n;
	    numberOfBits = 0;
	    long mask = 1;
	    for(int i=0;i < n;i++) {
		if ((id & mask) != 0) {
		    numberOfBits++;
		}
		mask = mask * 2;
	    }
	}

	public int getNumberOfBits() {
	    return numberOfBits;
	}

	public String toString() {
	    String result = "The min dominating set encoded by : "+id+" contains the nodes: ";
	    long mask = 1;
	    for(int i=0;i < n;i++) {
		if ((id & mask) != 0) {
		    result = result + " "+i;
		}
		mask = mask * 2;
	    }
	    return result;
	    //	    return id+" contains "+numberOfBits+" bits.";
	}
    }

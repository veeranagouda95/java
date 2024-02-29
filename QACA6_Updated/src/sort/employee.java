package sort;

public   class employee implements Comparable{
	int eid;
	String name;
	public employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + "]";
	}
	public int CompareTo(Object o)
	{
		employee e=(employee)o;	
		if(this.eid>e.eid)
			return 1;
		else if(this.eid>e.eid)
			return -1;
		else
			return 0;
	}

}

package object;
//to override to-string method to provide states and behavoirs rather than provideing address of the objects
public class SA {
int acno;
String name;
double bal;
SA(){
}
SA (int acno,String name,double bal){
	this.acno=acno;
	this.name=name;
	this .bal=bal;
	
}
@Override
public String toString() {
	System.out.println("account number:"+acno);
	System.out.println("account Holder's name:"+name);
	System.out.println("account balance:"+bal);
	return "";
}

}
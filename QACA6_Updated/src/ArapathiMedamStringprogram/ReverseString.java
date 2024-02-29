package ArapathiMedamStringprogram;

public class ReverseString {

	public static void main(String[] args) {
		String name="veerana";           //ch.length=6
		char[]ch=name.toCharArray();
		int i=0;                       //start the first index value intilize that value
		int j=ch.length-1;             // i need reverse the string pointing to the last index  of the array
		while(i<j)                      //0<6 true ,i=1,j=5 ,1>5 true i=2,j=4
		{
			char temp=ch[i];           //swapping techinqe
			ch[i]=ch[j];
			ch[j]=temp;
			i++;          //incremented intial index value
			j--;          //decremented   last index value
		}
			String rev="";   //if the reverse String if have store one container
			for (int k = 0; k < ch.length; k++) 
			{
				rev=rev+ch[k];
			}
			System.out.println(rev);			
		}
	}

                  //  OR
//main method
//String s="veerana";
//char[]ch=s.tochararry();
//string rev="";
//for(i=ch.length-1;i>=0;i--){
//rev=rev+ch[i];
//}
//syso(rev);

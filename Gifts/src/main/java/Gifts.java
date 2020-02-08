import java.util.*;
public class Gifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter no of chocklates present in the gift ");
			Scanner sc=new Scanner(System.in);
			int no_chocs=sc.nextInt();
			Chocklates[] c=new Chocklates[no_chocs];
			double tot_wt=0.0;
			for(int i=0;i<no_chocs;i++)
			{
				System.out.println("Enter the Name of the chocklate:");
				String choc_name=sc.next()+sc.nextLine();
				System.out.println("Enter the Price of the chocklate:");
				double choc_price=sc.nextDouble();
				System.out.println("Enter the net weight(in gms) of the chocklate:");
				double choc_wt=sc.nextDouble();
				tot_wt+=choc_wt;
				c[i]=new Chocklates(choc_name,choc_price,choc_wt);
			}
			System.out.println("Enter no of Sweets present in the gift ");
			int no_swts=sc.nextInt();
			int cnt_of_swts=0;
			Sweets[] s=new Sweets[no_swts];
			for(int i=0;i<no_swts;i++)
			{
				System.out.println("Enter the Name of the Sweet:");
				String swt_name=sc.next()+sc.nextLine();
				System.out.println("Enter the Price of the Sweet:");
				double swt_price=sc.nextDouble();
				System.out.println("Enter the net weight(in gms) of the Sweet:");
				double swt_wt=sc.nextDouble();
			     tot_wt+=swt_wt;
			     if(swt_wt>0 && swt_wt<=120)
			    	 cnt_of_swts++;
				s[i]=new Sweets(swt_name,swt_price,swt_wt);
			
			}
			System.out.println("The total weight of the Items:"+tot_wt);
			//Sorting the chocklates
			for(int i=0;i<no_chocs-1;i++)
			{
				for(int j=0;j< no_chocs-i-1;j++)
				{
					if(c[j].getItmWt()>c[j+1].getItmWt())
					{
						Chocklates tmp;
						tmp=c[j+1];
						c[j+1]=c[j];
						c[j]=tmp;
					}
				}
			}
			System.out.println("Chocklates after sorting them by weights:");
			for(int i=0;i<no_chocs;i++)
			{
				System.out.println(c[i].getItmName()+"\t"+c[i].getItmPrice()+"\t"+c[i].getItmWt());
			}
			
			System.out.println("The no of sweets present in the predetermined range of 1-120 gms are :"+cnt_of_swts);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

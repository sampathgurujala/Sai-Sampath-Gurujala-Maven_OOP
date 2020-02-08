
public class Chocklates implements Item {
  public String itm_name;
  public double itm_wt;
  public double itm_price;
  Chocklates(String itm_name,double itm_price,double itm_wt )
  {
	  this.itm_name=itm_name;
	  this.itm_price=itm_price;
	  this.itm_wt=itm_wt;
  }
     
    public String getItmName()
	{
		return this.itm_name;
	}
    public double getItmWt()
	{
		return this.itm_wt;
	}
	public double getItmPrice()
	{
		return this.itm_wt;
	}

}

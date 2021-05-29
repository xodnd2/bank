package bank.vo;

public class Account {
	private String id;
	private String pwd;
	private int money;
	public Account(String tId, String tPwd)
	{
		this.id = tId;
		this.pwd = tPwd;
		this.money = 0;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String tPwd)
	{
		this.pwd = tPwd;
	}
	public int getMoney()
	{
		return money;
	}
	public void setMoney(int tMoney)
	{
		this.money = tMoney;
	}
}

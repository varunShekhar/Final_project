
public class Criminal {
	String name,blood_grp,current_location,health_condition,work_assigned,outsiders_meeting;
	int age;
	char gender;
	Criminal()
	{
		name="";
		blood_grp="";
		current_location="";
		health_condition="";
		work_assigned="";
		outsiders_meeting="";
		age=0;
		gender=' ';
	}
	public Criminal data()
	{
		return (new Criminal());
	}
	public void setData(String name,String blood_grp,String current_location,String health_condition,String work_assigned,String outsiders_meeting,int age,char gender)
	{
		name=this.name;
		blood_grp=this.blood_grp;
		current_location=this.current_location;
		health_condition=this.health_condition;
		work_assigned=this.work_assigned;
		outsiders_meeting=this.outsiders_meeting;
		age=this.age;
		gender=this.gender;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package odev2;



public class Course {
	int			id;
	int 		studentId;
	int 		educatorId;
	String		title;
	String 		subTitle;
	String 		image;
	int 		progressPercentage;
	String 		startTime;
	
	public Course(int id,int studentId,int educatorId,String title,String subTitle,String image,int progressPercentage,String startTime) {
		//Constructor
		this.id					=	id;
		this.studentId			=	studentId;
		this.educatorId			=	educatorId;
		this.title				=	title;
		this.subTitle			=	subTitle;
		this.image				=	image;
		this.progressPercentage	=	progressPercentage;
		this.startTime			=	startTime;
		
				
	}	
}

///Svitlana Manyk
///Midterm assignment 


package midtermExam;

public class mainClass {

	public static void main(String[] args){
		double[][] studentScores ={{90,85,75,85,95},
				                   {85,60,65,95,65},
				                   {75,70,80,85,90},
				                   {95,70,75,80,100},
				                   {75,45,80,60,70}};
		
		
		String[] studentNames = {"Jakob Baloski",
				                 "Lucinda Pavlov",
				                 "Daniele Hanston",
				                 "Yusef Goldstein",
				                 "Leona Rhee"};
		
		double [] studentScr = new double [5]; //Convert 2D array into 1D array by rows
		int studentNumber = 0;                 
		
		while (studentNumber<studentNames.length)
		{
			int r=0;

			for (int i=studentNumber; i<studentScores[i].length && r<studentScores[i].length; )
			{
				for (int j = 0; j<studentScores[i].length; j++)
				{
					studentScr[r]=studentScores[i][j];
					r++;
				}
					
			}
			
			System.out.println(studentNames[studentNumber]);                                                                    // Print Student Name
			
			double maxScore = highestScore(studentScr);      
			System.out.println("Highest Score = "+ maxScore);                                                                   // Print Highest Score
			
			double minScore = lowestScore(studentScr);
			System.out.println("Lowest Score = "+ minScore);                                                                    // Print Lowest Score
			
			double meanScore = averageScore(studentScr);
			char grade = gradeScore(meanScore);
			System.out.println("Mean = "+ meanScore + " Grade: "+ grade);                                                       // Print Mean Score and Grade
			
			System.out.println("Mean (lowest dropped) = "+((meanScore*studentScr.length)-minScore)/(studentScr.length-1));      //Print Mean (lowest dropped)
			
			System.out.println("_________________________________________________________");
			
			studentNumber++;    
		}
		
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("   ");
		System.out.println("   ");
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		double [] assignments = new double [5]; //Convert 2D array into 1D array by columns
		int assignmentNumber = 0;                 
		
		while (assignmentNumber<studentNames.length)
		{
			int c=0;

			for (int j=assignmentNumber; j<studentScores[j].length && c<studentScores[j].length; )
			{
				for (int i = 0; i<assignments.length; i++)
				{
					assignments[c]=studentScores[i][j];
					c++;
				}
					
			}
			
			System.out.println("Assignment " + (assignmentNumber+1));
			
			double assignmMaxScore = highestScore(assignments);      
			System.out.println("Highest Score = "+ assignmMaxScore);                                                                            // Print Highest Score
			
			double assignmMinScore = lowestScore(assignments);
			System.out.println("Lowest Score = "+ assignmMinScore);                                                                             // Print Lowest Score
			
			double assignmMeanScore = averageScore(assignments);
			char assignmGrade = gradeScore(assignmMeanScore);
			System.out.println("Mean = "+ assignmMeanScore + " Grade: "+ assignmGrade);                                                         // Print Mean Score and Grade
			
            System.out.println("Mean (lowest dropped) = "+((assignmMeanScore*assignments.length)-assignmMinScore)/(assignments.length-1));      //Print Mean (lowest dropped)
			
			System.out.println("_________________________________________________________");
			
			assignmentNumber++;
		}
		
}
	
	    public static double highestScore (double[] scoreArray){
	    
		    double max = scoreArray[0];
		    
		    for (double value: scoreArray)
		    {
		    	if (value > max)
		    		max = value;
		    }
		    return max;	
	    }
		
	    public static double lowestScore (double[] scoreArray){
		    
		    double min = scoreArray[0];
		    
		    for (double value: scoreArray)
		    {
		    	if (value < min)
		    		min = value;
		    }
		    return min;	
	    }
	    
	    public static double averageScore (double[] scoreArray){
	    	
	    	double sum=0;
	    	double mean=0;
	    	for (double value: scoreArray)
	    	{
	    		sum+=value;
	    	}
	    	mean= sum/scoreArray.length;
	    	return mean;
	    }
		
	    public static char gradeScore (double averScore){
	    	
	    	char grade = '0';
	    	if (averScore<65)
	    		grade = 'F';
	    	if (averScore>=65 && averScore<70)
	    		grade = 'D';
	    	if (averScore>=70 && averScore<80)
	    		grade = 'C';
	    	if (averScore>=80 && averScore<90)
	    		grade = 'B';
	    	if (averScore>=90)
	    		grade = 'A';
	    	
	    	return grade;
	    }
}

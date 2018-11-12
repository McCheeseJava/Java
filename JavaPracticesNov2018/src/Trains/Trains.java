//Author : Sree Lakshmi
//Date: 07/08/2002

import java.lang.*;
import java.text.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


public class Trains {

   int iCities, iRoutes, iTrips, iObjects, iRecursion, iDistance,iFinalDistance,iNum;  
   Object[] arrRoutes;   
   Vector v ;   
   int iStops = 0;
   StringBuffer sRoutes;
   boolean bFoundDest = false;
    
   //FUNCTION TO READ THE INPUT DATA 
   
   public void inputRoutes(String sFileName){

    	try {

	            String sFile = System.getProperty("user.dir");
		         sFile = sFile + "\\"+sFileName;
		         BufferedReader rBuffer = new BufferedReader(new FileReader(sFile));
				   String s = rBuffer.readLine();
				   StringTokenizer sInput = new StringTokenizer(s, ",");  
					String sCities = sInput.nextToken();
			      String sRoutes = sInput.nextToken(); 
   	         iCities = Integer.parseInt(sCities);     
   	         iRoutes = Integer.parseInt(sRoutes);
					arrRoutes = (Object[])Array.newInstance(Route.class, iRoutes);
					int i = 0;
					doloop:
					do {
		          
	  			        while(sInput.hasMoreTokens())  {

				          i++;

							 //Take the first iRoutes in case more data is inputted than required 
							 if(i > iRoutes) {
							   System.out.println("More number of routes inputted.  Taking the first " +iRoutes);
							   break doloop;
							 }

   				       String sRoute = sInput.nextToken();   
	  			          Route newRoute = new Route(sRoute.trim());
							 
							 //Validate the Route and populate the array
	  			         if (newRoute.isValidRoute())
	  			         Array.set(arrRoutes,i-1,newRoute);
	  			         else {
					        System.out.println(" Invalid input ");
	  			           System.exit(0);
					      }
				     
			          }//End of while 
				      s =  rBuffer.readLine();
				      if(s!= null)
				      sInput = new StringTokenizer(s, ",");

				   }while (s != null);//End of do

					if( i< iRoutes){
					   System.out.println("Lesser no.of routes inputted. Please enter the correct number of routes ");
						System.exit(0);
					}
			  

			}//End of try
			catch (FileNotFoundException e) {
			
			     System.out.println("File "+sFileName+" not found in the current directory");
				  System.out.println("Make sure the input file is in your current working directory");  
			     System.exit(0);
			}
			catch (Exception e) {
			
			     System.out.println("Input valid input for routes");
			     System.exit(0);
			  
			}

		
	}
	
	//GETS THE ROUTE BETWEEN TWO CITIES
	
	public Route getRouteBetween(char cStart, char cDest) {
	 
	  cStart = Character.toLowerCase(cStart);
	  cDest =  Character.toLowerCase(cDest);
	   
	  for (int i=0; i < iRoutes; i++) {
	  
	     Route rRoute = (Route)Array.get(arrRoutes,i);
		 
		 if( (cStart == rRoute.getStartCity()) && (cDest == rRoute.getDestCity()) )
		 return rRoute;
		 
	  }//End of for
	  
	  return null;
	
	
	}//End of getRouteBetween
	
	//CALCULATES THE LENGTH OF A GIVEN PATH
	
   public int calcDist( String s)  {
  
      char cStart, cDest;
	  int iDist = 0;
	  for (int i=0; i<(s.length())-2; i=i+2)
	  {
	     cStart = s.charAt(i);
		 cDest = s.charAt(i+2);
		 
		 //Get the route between the cities
		 
		 Route rRoute = getRouteBetween(cStart,cDest);
		 
		 //Add the Length to the previous distance
		 
		 if(rRoute != null)
		 {
		    iDist = iDist+rRoute.getDistance();
		 }
		 else
		 return -1;
	  
	  }
	  
	  return iDist;
	  
	  
   }//End of calcDist
   
   //DISPLAYS THE LENGTH OF A GIVEN PATH
  
   public String displayDistance(String sInput) {
   
             int iTotalDistance = 0;
             String sResult = new String();
             iTotalDistance = calcDist(sInput);
			 
   			 if(iTotalDistance > 0)
   			 sResult = sResult + iTotalDistance ;
   			 else
			 sResult = "NO SUCH ROUTE";
			 
			 return sResult;
   
   }
   
   
   //GETS ALL THE ROUTES WITH A GIVEN START CITY
   
   public Object[] getRoutesWithStart(char cStart, Object[] array) {
   
			Object[] arrStart = null;
     try {
	 
	        Vector vStart = new Vector();
			 
			for (int i=0; i < iRoutes; i++) {
		    
				  	     Route rRoute = (Route)Array.get(arrRoutes,i);	
						 
						 if(rRoute.getStartCity() == cStart) {	
						 					   						  
						   vStart.addElement(rRoute);
						   
						 }  
   				  		 
	        }//End of for
			
		    arrStart = (Object[])Array.newInstance(Route.class,vStart.size());
		 
		    vStart.copyInto(arrStart);		  
		 
	 }//End of try
	 catch (Exception e) {}
	     
	   
		 	  
		 	 
	  return arrStart;
   
   }//end of getRoutesWithStart
   
   //TO FIND THE ROUTES THAT SATISFY A GIVEN TERMINATION CONDITION   
     
   public int findRoutes(char cS,char cD,int iMax, char cTermOn,char cExMax) {
      
       try { 		      
                  sRoutes = new StringBuffer();
				  v = new Vector();
				  iNum = 0;
				  iTrips = 0;
				  
				  if(cTermOn == 'S')
				  this.iStops = iMax;  
				  
                  char cStart = Character.toLowerCase(cS);
         	      char cDest = Character.toLowerCase(cD);
				  cTermOn = Character.toUpperCase(cTermOn);
				  cExMax = Character.toUpperCase(cExMax);
         	  
         	      //Get the routes with the start city
         	 	  
         	      Object[] arrStart = getRoutesWithStart(cStart,arrRoutes);
				  
				  //Analyse the root nodes
         	 
         	      for (int i=0; i< Array.getLength(arrStart); i++) {
         	     
      		         
         	          Route rSRoute = (Route)Array.get(arrStart,i);
					  iRecursion = 0;
      			  
				      //Delete the start city of the previous node
				  
         			  if(sRoutes.length() > 0)
         			  sRoutes.delete(0,(sRoutes.length()));
					  
					  
					  //Append the start city of the current node
					  
         			  sRoutes.append(cStart);
					  
					  
					  //  If termination condition involves length of the route 
					  //  increment the distance by the length of the current route 
					  
					  if (cTermOn != 'S')					  
   				      iDistance = rSRoute.getDistance();
					  
   				      bFoundDest = false;
					  
					  //Analyse the children of each node recursively
					  
         			  analyseChildren(rSRoute,cDest,iMax,cTermOn);
      	         
      	     }//End of for 
      	  
      	  }//End of try
      	  
      	  catch (Exception e) {} 
		  
		  switch(cTermOn) {
		  	  
		  	    case 'S' : {
				
		  		   if ( cExMax == 'M' ) 
				   return iTrips;
				   else
		  	       return iNum;
		  		
		  		}
						  		
		  		default:
		  		return iFinalDistance;
				
		  	  
		 }//End of switch
		 
      }//End of findRoutes
     
	 //FUNCTION CALLED RECURSIVELY TO ANALYSE THE CHILDREN OF THE CURRENT NODE
      
      public void analyseChildren(Route rSRoute, char cDest,int iMax,char cTermOn) {
	  
	  int iDistSub =0;
	  iRecursion++;
	  	  
	  if( cTermOn == 'L')
	  iFinalDistance = iMax;
	  
       try {
	  	  
	           char cStart = rSRoute.getDestCity();
			   
			     //If a destination was found in the previous iteration
				 //remove the appended destination from the path
				 
			     if (bFoundDest) {
				 
			   		if(sRoutes.length() > 0)
			        sRoutes.delete((sRoutes.length())-1,(sRoutes.length())); 
			   				  
			     }//End of bFoundDest	
				 
				 //Add the start city of the current node to the path
				 sRoutes.append(cStart);
			      
				 //Get all the children of this node 
				 //(routes that start with a given city)
				 
	  		     Object[] arrDestinations = getRoutesWithStart(cStart,arrRoutes);
				 
	  		   //ANALYSE ALL THE CHILDREN OF THE CURRENT NODE
			   
	  		   forloop:
	  		
	     		for ( int n=0 ; n< Array.getLength(arrDestinations); n++) {
	     		 
	     		   Route rSRoute1 = (Route)Array.get(arrDestinations,n);
				   
				   /* Switch to the required termination condition cTermOn
				   
				     S: With a given no.of stops
					 L: With a given length
					 N: Termination Condition not applicable
					 
					 Variable cExMax indicates the type for the Stops condition
					 
					 E: Indicates with exactly those no.of stops
					 M: Indicates with a Max. No. of given stops */
					 
					 
				   
				   
				   switch (cTermOn) {
				   
				   //TO FIND THE ROUTES WITH LENGTH LESSER THAN A GIVEN VALUE
				   
				   case 'L' : {
				   
				   
				      if(n != 0)
				      iDistSub = ((Route)Array.get(arrDestinations, n-1)).getDistance();
				   
				  
				      iDistance = iDistance-iDistSub+rSRoute1.getDistance();
	     		      bFoundDest =false;
					  
					  // If the calculated distance is less than the given distance				   
				      if( (iDistance < iFinalDistance) || (iFinalDistance==0) )  {
			   			   
			      	   //If a destination is found
	     			   if(rSRoute1.getDestCity() == cDest) {
	     			    
						  //increment the counter and append destination to the path						  
	     		          iTrips++;						  
	     			      sRoutes.append(cDest); 
	  					  bFoundDest = true;	     				 
	  					  System.out.println(sRoutes);
						  
	     		       }		   
	  			       
	  			       if(iDistance < iMax)
	  				   analyseChildren(rSRoute1,cDest,iMax,cTermOn);
	  					
	  				   
						
	  		      }	//End of validation for iDistance
			      else 
				  break forloop;
				  
				  
				  }//End of case L
				  break;
				  
				  //TO FIND THE ROUTES WITH A GIVEN NO.OF STOPS IN BETWEEN
				 
				  case 'S' : {
				  
				    
					    bFoundDest =false;
								   
					    if(rSRoute1.getDestCity() == cDest) {
						
						   // Increment the counter and append the destination 
						   // to the current path
					       iTrips++;
					  
					       sRoutes.append(cDest);
					       
						   //Increment the counter that holds the given routes 
						   //with exactly a given no.of stops in between
						   
					       if(sRoutes.length() == iStops+1)
					          iNum++;
								 
					       bFoundDest = true;
					   				      
				      }
					      
					 if(iRecursion < iStops-1)
					 analyseChildren(rSRoute1,cDest,iMax-1,cTermOn);
					 else 
					 break forloop;
						  
				  }//End of case S
				  break;
				  
				  //TO FIND THE SHORTEST ROUTE 
				  
				  default : {
				  
				  
				       if(n != 0)
					   //get the distance of the previous child to be subtracted
				  	   iDistSub = ((Route)Array.get(arrDestinations, n-1)).getDistance();
					   
				  	    //If a destination is found in the previous iteration
						//remove the appended destination from the current path
					
				  	    if (bFoundDest) {
				  				
				  	      if(sRoutes.length() > 0)
				          sRoutes.delete((sRoutes.length())-1,(sRoutes.length())); 
				  		  
				  	     }//End of bFoundDest	
						 
						 //Subtract the distance of the previous child
						 //Append the distance of the current child
				  				
				  	     iDistance = iDistance-iDistSub+rSRoute1.getDistance();
						 
						 //If the calculated distance is less than the 
						 //length of the previous path
				  			   
				  	     if( (iDistance < iFinalDistance) || (iFinalDistance==0) ) {
				  			    
				            if(rSRoute1.getDestCity() == cDest) { 
				        		
							   //If a destination is found increment the counter
							   //and append the destination.  Make the distance of 
							   //this path the final distance
								
				               iTrips++;  
				               sRoutes.append(cDest);
				               bFoundDest = true;
				  	           iFinalDistance = iDistance;
				  					
				        	}//End of nested if
				  			else {
				  				
				  			   bFoundDest = false;
				  			
				  			     if( (iDistance < iFinalDistance) || (iFinalDistance == 0) ) {
				  				   
				  			       if(sRoutes.length() > 4) {
				  			     
				  			          String s1 = rSRoute1.getRoute().substring(0,2);
				  			          String s2 = sRoutes.substring( sRoutes.length()-3 ,sRoutes.length()-1 );
				  					  
				  					  if( !(s1.equals(s2)) )
				  				      analyseChildren(rSRoute1,cDest,iMax,cTermOn);
				  					  
				  				   }//End of the if (validation for sRoutes.length()	)
				  				   else
				  				   analyseChildren(rSRoute1,cDest,0,cTermOn);
				  					
				  					
				  				 }//End of if  (validation for iDistance)
								 
								 //If distance is greater than the length of the 
								 //previous path quit traversing that node
								 
				  				 else
				  				 break forloop;
				  				   
				     					    
				     		}  //End of nested else			   
				        							 
				     }//end of outer if
						  
				  }//End of default
				  
			  }//End of switch	  
				  
			
			}//end of for n
			
			 iRecursion--;
			 
			  //MOVE TO THE NEXT LEVEL IN THE TREE
			
			 //If a destination is found remove  the destination
			 //and the startcity of the last node in the previous level
			 //from the path
			 
			 if (bFoundDest) {
				  		
				 sRoutes.delete((sRoutes.length())-2, sRoutes.length());
				 iDistance = iDistance -rSRoute.getDistance();
				 bFoundDest = false;
			  } 
			  
			  // Otherwise remove the start city of the last node in the 
			  //previous level from the path
			  
			  else	{
			 
				 sRoutes.delete((sRoutes.length())-1, sRoutes.length());
				 iDistance = iDistance -rSRoute.getDistance();
			  } 
			
			
			
	  		
	  }//End of try
	  catch(Exception e) {}
	  
}//End of analyseChildren
public static void main ( String[] args ) {
   
   try {
	         if( Array.getLength(args) == 0)
				{
				   System.out.println("Please provide the name of the input file as an argument");
				   System.out.println("Syntax: java LinearEquations \"yourinputdatafile.extension\" ");
					System.exit(0);
				}
            Trains trains = new Trains();
			   trains.inputRoutes(args[0]);

				/* Variables to indicate the  termination condition 
				   
				     S: With a given no.of stops
					  L: With a given length
					  N: Termination Condition not applicable
					 
					 Variables to indicate the type for the Stops condition
					 
					 E: Indicates with exactly those no.of stops
					 M: Indicates with a Max. No. of given stops 
					 N: Not Applicable */
					 
				System.out.println("Output1#   "+trains.displayDistance("A-B-C") );
			   System.out.println("Output2#   "+trains.displayDistance("A-D") );
			   System.out.println("Output3#   "+trains.displayDistance("A-D-C") );
			   System.out.println("Output4#   "+trains.displayDistance("A-E-B-C-D") );
			   System.out.println("Output5#   "+trains.displayDistance("A-E-D") );
			   System.out.println("Output6#   "+trains.findRoutes('C','C',3,'S','M'));
			   System.out.println("Output7#   "+trains.findRoutes('A','C',4,'S','E'));
			   System.out.println("Output8# "+ trains.findRoutes('A','C',0,'N','N') );
			   System.out.println("Output9# "+ trains.findRoutes('B','B',0,'N','N') );
			   System.out.println("Output10# ");
			   trains.findRoutes('C','C',30,'L','N');
			 
			 
   }//End of try
   catch (Exception e) {}      	  
	        
}//End of main
   
class Route {
   	  
   	     String sRoute;
   	     char cStart, cDest;
   	     int iDist;
   		 
   		 public Route (String sRoute) {
		 
   		 this.sRoute = sRoute;
		 
   		 }//End of the constructor Route
		 
		 public char getStartCity() {
		   
		      return Character.toLowerCase(cStart);
	     }
		 public char getDestCity() {
		 
		      return Character.toLowerCase(cDest);
		 }	  
		 
		 public int getDistance() {
		   
		      return iDist;
		  
		 }
   		 
   		 public String getRoute()  {
   		   
   		   return sRoute;
   		 
   		 }//end of getRoute
		 
		 
   		 public boolean isEqualTo( Route rRoute) {
   		 
   		     String sCurRoute = rRoute.getRoute().substring(0,2);
			 
   		     if(  ( sRoute.substring(0,2) ).compareTo(sCurRoute)== 0 )
   		     return true;
   		     
   			 return false;
   		 
   		 }
   		 
   	     //PERFORMS VALIDATION OF A GIVEN ROUTE	
		 
   		 public boolean isValidRoute() {
   		
   		   String sRoute = this.getRoute();
		   
   		       try {
   		   	        
   		   	       cStart  = sRoute.charAt(0);
   		   	       cDest  = sRoute.charAt(1);
   		   	       iDist = Integer.parseInt(sRoute.substring(2));
   		   	   }
   		   	   catch (Exception e) {
   		   		 
   		   		 for (int i=0; i<sRoute.length();i++) {	
   		   		      
   		   			    if( sRoute.charAt(i) == 32 )
   		   				{
   		   			      System.out.println("Route String cannot contain embedded blanks");
   		   				  return false;;
   		   				}
   		   	     }
   		   		 System.out.println("Enter a valid alphanumeric string for the route");
   		   	     return false;
   		   		  
   		      }//End of catch
   		   		 
   		      for (int i=0; i<Array.getLength(arrRoutes); i++) {
   		        
   		   	      if (Array.get(arrRoutes,i) != null) {
   		   	       
   		   	         Route rCurRoute = (Route)Array.get(arrRoutes,i);
   				     if( this.isEqualTo(rCurRoute) ) {
   		   		     
   		              System.out.println("Route " + rCurRoute.getRoute() +" cannot appear more than once");
   		   		      return false;
					  
   		   		    }  
   		   	      }
   		   	      else
   		   	      break;
   		   	   
   		      }//End of for
   		   	 
   		      if(  ( cStart < 97 || cStart >109 ) || ( cDest < 97 || cDest >109 )  ){ 
			    
			         if ( (cStart < 65 || cStart > 77) ||(cDest < 65 || cDest > 77) ){
				         System.out.println("City Name must be a letter among the first M letters of the alphabet");
   		            return false;
				      }
				
   		      }
   		      if (cStart - cDest == 0 ){
   		         System.out.println("Starting and Ending cities for a given route cannot be the same");
   		   	     return false;
   		      }
   		      if( iDist > 10 ){
   		          System.out.println(" Distance cannot be more than 10");
   		   	    return false;   
   		      } 	   
   		          return true;
   		   		 
   		 }//End of isValidRoute()  
   	  }//End of class Route 
}//End of class Trains

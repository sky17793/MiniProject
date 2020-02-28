Documentation:
Filename and  there role in assignment as follows-

->default package
•	class SlotStatus.java-  It is used for servlet implementation class used to check availability of parking slot

•	class AddCarByAdmin.java - It is Servlet implementation class used for add customer into specific slot by the admin.

•	class ShowDetailsOfCar.java - It is Servlet implementation class used for get a car and slot details from SQL  database.

•	class DataForReleaseCar.java - It is Servlet implementation class , used for creating  HTML form to send id and date to database to delete the selected car  from database.

•	class GenerateTicket.java -  It is Servlet implementation class , it passes the data from database to servlet. 

•	class GenerateTicket.java -  It is Servlet implementation class , it passes the ticket data from database to servelet. 

•	class GetRelease.java-It is Servlet implementation class ,used to release the car from slot.

•	class SearchByCar.java - It is Servlet implementation class, for searching the car details by the color.

•	class SearchBySlot.java It is Servlet implementation class, for searching the car details by the slot.

•	class SlotStatus.java - it is Servlet implementation class, to show the status of slot.

->package com.AddCar 
•	class AddCarEntry.java - It class has carEntry method. insert the car detail into database.
•	class DeleteCar.java- This class has exitEntry method. It will send the exit date to database and slot is free for next car

->package com.available

•	StatusOfSlotJDBC.java - This class has getticket method .   It will show slot status.


->package com.carinfo
•	class Carinformation - This class is pojo class. 


->package com.CarParking
•	class DisplayAllTheCar.java - It has displayData method for implement jdbc code .


->package com.getticket
•	class getTicketJDBC.java -It has getTicket method used for the get the ticket to customer on that slot which slot is avialable for parking.

->package com.search
•	class SerchByColor.java - It  displaydata method in which get color variable from servlet and send it to database then it will return the  colored car which we selected.

•	class SerchBySlot.java - It has display data method  in which we  get slot variable from servlet based on that return data to slotdata table from database.


# A2_Peddineni_Anwesh_002775775
Assignment_2


Hospital Application

- This hospital Application consists of 9 JFrames, here are their list and their functionality:

1) MainJFrame.java :
Contains a control panel on the left which contains 6 buttons (System Admin, Community Admin, Hospital Admin, Doctor) buttons on clicking will take to the Login page. Person button opens the PersonJframe and Patient button opens PatientJFrame.


2) LoginJframe.java :
Contains two text fields for Username and Password and two buttons for login and back. The username and passwords of System Admin, Community Admin, Hospital Admin and Doctor have been hard coded inside the source code of login button in such a way that depending on the Username password given the login button click will take to the respective admin panel when the admins can perform different actions.


3) SystemAdminJframe.java :
Once logged in as system admin and goes to SystemAdminJFrame, the system admin will be able to create City, Community, Hospital and save up on clicking the add button. The system admin will also have access to personJFrame up on clicking "Person Panel" button and will have access to SystemSearchJFrame up on clicking the "patient panel" button and will have access to HospitalAdminJFrame up on clicking the "HospitalAdmin Panel".


4) HospitalAdminJFrame :
Once logged in as Hospital admin and goes to HospitalAdminJFrame, the Hospital Admin will be able to add Doctor to an existing Hospitals list in the combobox by selecting a particular hospital. Doctor will be added to hospital up on clicking save button. 


5) DoctorJFrame :
DoctorJFrame consists of a table which shows which patientID has selected which hospital and which doctor. Doctor will be able to give Patient ID and search for patient and fill in encounter number and add 4 Vital Signs and save the data to encounter history in the form of an Arraylist inside the VitalSignHistory class created in the model folder.


6) CommunityAdminJFrame :
Community Admin will be shown list of persons profiles created in a table and will be able to search person details using patient ID upon clicking the search button. Upon clicking search the respective person details fields will be populated and Community admin will be able to change the details and update the profile upon clicking the update button.


7) PatientJFrame :
PatientJframe is for the patient to just View his profile details and his encounter history  and vital signs. There will be no update and delete possible.


8) PersonJFrame :
PersonJframe is where a person will be able to create his profile importantly the patientID and select city, Community and Hospital from the comboboxes which will be populated with the data added by SystemAdmin. And finally look for doctors in a hospital and select a doctor. Upon clicking the create button all this data will be stored in an array list inside the PersonHistory class created inside the model folder.


9) SystemSearchJFrame :
SystemSearchJframe can only be accessed by system admin, this page contains all the person details and his encounter history and vital signs of respective encounter of respective patient. The system admin will be able to search, update and delete the person details and his vital signs.





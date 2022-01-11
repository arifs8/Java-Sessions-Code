package brushupCode;

public class FortisTest {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		fs.cardioServices();
		fs.neuroServcies();
		fs.physioServices();
		fs.pediatricServices();
		fs.gynicServices();
		fs.radioServices();
		fs.medicalInsurace();
		fs.OPTClinics();
		fs.pandemic();
		fs.vaccination();
		fs.nursing();
		
		//top casting
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServcies();
		
				
		
		//down casting possible --we cannot create object for interface

		USMedical.medicine();
		System.out.println(USMedical.minFees);
		

	}

}

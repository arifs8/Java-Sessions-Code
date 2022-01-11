package brushupCode;

public class FortisHospital extends WHO implements USMedical,UKMedical,IndianMedical {

	@Override
	public void cardioServices() {
		System.out.println("FS.....CardioServices");
		
	}

	@Override
	public void neuroServcies() {
		System.out.println("FS.....NeuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FS.....PhysioServices");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("FS.....PediatricServices");
		
	}

	@Override
	public void gynicServices() {
		System.out.println("FS.....GynicServices");
		
	}

	@Override
	public void radioServices() {
		System.out.println("FS.....RadioServices");
		
	}
	
	//fortis 
	public void medicalInsurace() {
		System.out.println("FS.....MedicalInsurance");
	}
	
	public void OPTClinics() {
		System.out.println("FS.....OPTClinics");
	}
	
	@Override
	public void vaccination() {
		System.out.println("FS------Vaccination");
	}

}

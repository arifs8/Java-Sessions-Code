package brushupCode;

public class CompanyTest {

	public static void main(String[] args) {
		
//		Company cmp = new Company("abc","logo",100,"new contract",10000);
		Company cmp = new Company();
		cmp.setName("abc");
		cmp.setLogo("logo");
		cmp.setTotalEmployee(100);
		cmp.setInformation("new contarct");
		cmp.setTenderamount(10000);
		cmp.setInformation("new contarct1");
		
		System.out.println(cmp.getName());
		System.out.println(cmp.getLogo());;
		System.out.println(cmp.getTotalEmployee());
		System.out.println(cmp.getTenderamount());
		System.out.println(cmp.getInformation());
	}

}

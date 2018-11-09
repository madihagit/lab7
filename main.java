


public class DBMain {
	
		public static void main(String[] args) throws SQLException {
			Scanner input = new Scanner(System.in);
			boolean loopcounter =true;
			
			Person person_record = new Person();
			DBHandler h1 = new DBHandler();
			while(loopcounter) {
				System.out.println("1. Add a record"
						+ "\n2. Delete record\n"
						+ "3. update records"
						+ "4. get all records"
						+ "\n5. EXIT");
				
				System.out.print("Enter from above numbers choice: ");
				int temp = input.nextInt();
				
				switch(temp) {
				case 1:
					System.out.print("Enter id: ");
					int id = input.nextInt();
					
					System.out.print("Enter Name: ");
					String name = input.next();
					System.out.print("Enter fatherName: ");
					String fatherName = input.next();
					
					System.out.print("Enter organization ");
					String org = input.next();
					System.out.print("Enter mobile ");
					String mob = input.next();
					
				
					
					
					
					person_record.setid(id);
					person_record.setname(name);
					person_record.setfatherName(fatherName);
					person_record.setOrganization(org);
					person_record.setmobile(mob);
					h1.save(person_record);
					break;
				case 2:
					h1.delete();
					break;
				case 3:
					h1.update();
					break;
				case 4:
					h1.get();
					break;
				case 5:
					loopcounter = false;
					break;
				default:
					System.out.println("Out of scope number..");
				}
			}
		
		}

}

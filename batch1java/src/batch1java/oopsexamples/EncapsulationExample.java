package batch1java.oopsexamples;




public class EncapsulationExample {
	
//Definition:  Encapsulation is process of hidding the implementation details to users. is called encapsulation (OR) encapsulation is to make sure that "sensitive" data is hidden from users.
                                                         //or
//Definition: To achieve encapsulation in Java, declare the class variables/attributes/fields as private and provide public setter and getter methods to modify and view the variables/attributes' values.

	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.getEmpAge();
		employee.getEmpId();
		employee.getEmpName();
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
	}
}

class Employee {
	
	   private int empId;
	   private String empName;
	   private int empAge;

	   public int getEmpId()
	   {
	       return 1234;
	   }

	   public void setEmpId(int empId)
	   {
	       this.empId = empId;
	   }

	   public String getEmpName()
	   {
	       return "java";
	   }

	   public void setEmpName(String empName)
	   {
	       this.empName = empName;
	   }

	   public int getEmpAge()
	   {
	       return 27;
	   }

	   public void setEmpAge(int empAge)
	   {
	       this.empAge = empAge;
	   }
	}

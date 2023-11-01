package accessModifier;
/*public: The public access modifier allows unrestricted access to a class, method, or variable. 
 * It can be accessed from any other class.

protected: The protected access modifier allows access within the same package and from subclasses, 
even if they are in a different package.

default (no modifier): If no access modifier is specified, the default access level is applied. 
It allows access only within the same package.

private: The private access modifier restricts access to only the same class. It is the most 
restrictive access level.
 * 
 */
public class AM1_public {

	public static void main(String[] args) {
		Student s= new Student();
System.out.println(s.rollno);
	}

}

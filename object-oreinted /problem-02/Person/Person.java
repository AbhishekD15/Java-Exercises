
public class Person {
	
		
		public String givenName;
		public String lastname;
		public int age;
		public String gender;
		public String citizenship;
		
		/**
		 * Constructor without parameters
		 * 
		 */
		public Person() {
			givenName = " ";
			lastname = " ";
			age = 0;
			gender = " ";
			citizenship = " ";
			
		}

		/**
		 * @param givenName
		 * @param lastname
		 */
		public Person(String givenName, String lastname ) {
			this.givenName = givenName;
			this.lastname = lastname;
			
			
		}
		

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the gender
		 */
		public String getGender() {
			return gender;
		}

		/**
		 * @param gender the gender to set
		 */
		public void setGender(String gender) {
			this.gender = gender;
		}

		/**
		 * @return the citizenship
		 */
		public String getCitizenship() {
			return citizenship;
		}

		/**
		 * @param citizenship the citizenship to set
		 */
		public void setCitizenship(String citizenship) {
			this.citizenship = citizenship;
		}

}

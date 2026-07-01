// STUDENT NAME: Rafael Castro
// DATE: 

public class JulianDayNumber 
{

    public static int calculateJDN(int month, int day, int year) 
	{
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + 12 * a - 3;

        return day
                + (153 * m + 2) / 5
                + 365 * y
                + y / 4
                - y / 100
                + y / 400
                - 32045;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        int jdn = calculateJDN(month, day, year);

        System.out.println("Julian Day Number: " + jdn);

        input.close();
    }
}
		/***** DECLARATION SECTION *****/

		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/

		
		/***** OUTPUT SECTION *****/
  }
}

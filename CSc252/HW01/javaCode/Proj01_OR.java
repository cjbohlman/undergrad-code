/* Simulates a physical OR gate.
 *
 * Author: Chris Bohlman
 */

public class Proj01_OR
{
	public void execute()
	{
		if (a || b) {
			out = true;
		}
		else {
			out = false;
		}
	}



	// ------ DON'T CHANGE ANYTHING BELOW THIS LINE ------

	public boolean a,b;   // inputs
	public boolean out;   // output

	public Proj01_OR()
	{
		/* nothing is needed here */
	}
}


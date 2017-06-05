import java.util.List;

/**
	* The class {@code MathematicalOperationsAPI} contains methods for performing basic
	* numeric operations such as the add, average, squareroot and trigonometric functions.
	* @author Sarwan Karim - 14SW25
	*/
class MathematicalOperationsAPI{
	
	/**
     * Don't let anyone instantiate this class.
     */
    private Math() {}
	
	
	
    /**
	 * Method adds all values in list.
     * Returns the value of a {@code double}
     *   Special cases:
     * <ul><li>If the argument is NaN or less than zero, then the result
     * is NaN.
     */
	public static double add(List<double> nums){
		double sum = 0;
		for(double d : nums){
			sum+=d;
		}
		return sum;
	}
	
	/**
	 * Method adds all values in list and divide it by total to get Average.
     * Returns the value of a {@code double}
     */
	public static double average(List<double> nums){
		double sum = 0;
		double total = nums.size();
		for(double d : nums){
			sum+=d;
		}
		return sum/total;
	}
	
	/**
	 * Method calculate Square Root of any Number.
     * Returns the value of a {@code double}
     */
	public static double sqrt(double num){
		return Math.pow(num,0.5);
	}
}
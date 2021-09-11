/**
 * 
 */
package io.dataproject.coronavirustracker.models;

/**
 * @author Devyansh Ojha
 *
 */
public class LocationStats {

	private String state;
	private String country;
	private String latestTotalCases;
	private int diffFromPrevDay;

	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}

	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLatestTotalCases() {
		return latestTotalCases;
	}

	public void setLatestTotalCases(String latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}

}

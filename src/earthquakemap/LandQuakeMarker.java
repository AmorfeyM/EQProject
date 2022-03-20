package earthquakemap;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

// Implements a visual marker for land earthquakes on an earthquake map

public class LandQuakeMarker extends EarthquakeMarker implements Comparable<EarthquakeMarker> {
	
	
	public LandQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = true;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.ellipse(x, y, 2*radius, 2*radius);
		
	}
	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}
	@Override
	public int compareTo(EarthquakeMarker o) {
		// TODO Auto-generated method stub
		if (o.getMagnitude() < this.getMagnitude())
	        return -1;
	    else if (this.getMagnitude() < o.getMagnitude())
	        return 1;
	    else
	        return 0;
	}
		
}
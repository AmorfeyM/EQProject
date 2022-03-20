package earthquakemap;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

// Implements a visual marker for ocean earthquakes on an earthquake map

public class OceanQuakeMarker extends EarthquakeMarker implements Comparable<EarthquakeMarker> {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
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

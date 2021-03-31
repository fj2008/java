package chapter7;

public class TourGuide {
	private Providable tour;
	
	public TourGuide(String location) {
		if(location.equals("korea")) {
			tour = new KoreaTour();
		}else if (location.equals("japan")) {
			tour = new JapenTour();
			
		}
	}
		
	public void doLeisureSports() {
			tour.leisureSports();
			
		}
		
	public void doSightseeing() {
			tour.sightsseing();
			
		}
	public void eatFood() {
			tour.food();
		}
}


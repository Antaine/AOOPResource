package ie.gmit.sw.builder;

import java.util.ServiceLoader;
import ie.gmit.character.*;
import ie.gmit.sw.hamming.*;
public class CharacterDirector implements FuzzyMeasurable, NormalizedMeasurable
{
private Measurable measurable;
//Compose
public CharacterDirector() {
	loadSPI();
	}
public CharacterDirector(Measurable  m) {
	//Dependency injection
	this.measurable = m;
	}
private void loadSPI() {//Dependency injection
	ServiceLoader<Measurable> services = ServiceLoader.load(Measurable.class);
	Measurable m = services.iterator().next();
	if (m != null) this.measurable = m;
	}

@Override
public float getDistance(CharSequence s, CharSequence t) throws Exception 
{
	return measurable.getDistance(s, t);//Delegate}
}
@Override
public float compare(CharSequence s, CharSequence t) throws Exception {
	// TODO Auto-generated method stub
	return FuzzyMeasurable.super.compare(s, t);
}
}
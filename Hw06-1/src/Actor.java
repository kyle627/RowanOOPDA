import java.util.*;

public interface Actor {
	void act(List<Actor> newActors);
	boolean isActive(); 
}

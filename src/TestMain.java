import java.awt.event.KeyEvent;

import com.github.massiv_diversions.engine.*;

public class TestMain {

	public static void main(String[] args) {
		ControlData cd = new ControlData(KeyEvent.VK_UP, KeyEvent.VK_DOWN);
		EngineDetails ed = new EngineDetails(640, 480, 25, "test");
		StateManager sm = new StateManager(ed, new TestState0(ed));
		Engine2D engine = new Engine2D(cd, ed, sm);
		engine.start();
	}

}
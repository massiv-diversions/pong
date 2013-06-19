import java.awt.event.KeyEvent;

import com.github.massiv_diversions.engine.*;

public class TestMain {

	public static void main(String[] args) {
		ControlData cd = new ControlData(KeyEvent.VK_UP, KeyEvent.VK_DOWN,
				KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT);
		EngineDetails ed = new EngineDetails(640, 480, 50, "test");
		StateManager sm = new StateManager(new TestState0(ed));
		Engine2D engine = new Engine2D(cd, ed, sm);
		engine.start();
	}

}
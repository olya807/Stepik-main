import com.company.RobotConnection;
import com.company.RobotConnectionException;
import com.company.RobotConnectionManager;

public class moveRobot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        RobotConnection conn = null;
        for (int i = 0; i < 3; i++) {
            try {
                robotConnectionManager.getConnection();
                conn.moveRobotTo(toX, toY);
                break;
            } finally {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
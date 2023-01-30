import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarService {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("автобусы не нуждаются в техобслуживании перед заездом");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runCarService() {
        Transport<?> transport = transportQueue.poll();
        if (transport != null);
        }
        }
    }


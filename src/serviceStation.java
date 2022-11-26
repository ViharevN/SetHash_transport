import java.util.ArrayDeque;
import java.util.Queue;

public class serviceStation <T extends Transport> {
    private String name;

    private Queue<T> queue = new ArrayDeque<>();



    public serviceStation(String name) {
        this.name = name;
    }


    public void addAutoInQueue(T autos) {
        queue.offer(autos);
    }

    public String getAuto(T auto) {
        return auto.getBrand();
    }

    public void repairAuto() {
        T auto = queue.poll();
        if (auto != null) {
            System.out.println(" обслуживание " + getAuto(auto));
            repairAuto();
        } else {
            System.out.println("очередь пуста");
        }
    }

    public Queue<T> getQueue() {
        return queue;
    }
}

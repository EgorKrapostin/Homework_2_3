import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Serviceable> queue;

    public ServiceStation(Queue<Serviceable> queue) {
        this.queue = queue;
    }

    public void addTransportToQueue(Serviceable serviceable) {
        System.out.println("Транспорт становится в очередь");
        System.out.println(queue.offer(serviceable));
    }

    public void technicalInspection(Serviceable serviceable) {
        System.out.println("Транспорт проходит техосмотр и покидает очередь");
        for (Serviceable serviceable1 : queue) {
            System.out.println(queue.remove());
        }
    }
}

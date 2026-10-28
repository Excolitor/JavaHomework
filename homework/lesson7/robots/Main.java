package homework.lesson7.robots;

public class Main {
    public static void main(String[] args) {
        HeadFactory headFactory = new HeadFactoryImpl();
        BodyFactory bodyFactory = new BodyFactoryImpl();

        HeadType[] heads = HeadType.values();
        BodyType[] bodies = BodyType.values();

        int number = 1;

        for (HeadType headType : heads) {
            for (BodyType bodyType : bodies) {
                Robot.Head head = headFactory.createHead(headType);
                Robot.Body body = bodyFactory.createBody(bodyType);

                Robot robot = new Robot("Robot-" + number, head, body);

                System.out.println(robot);
                number++;
            }
        }
    }
}
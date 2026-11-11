package homework.lesson8.genericRobots;

public class Main {
    public static void main(String[] args) {

        GenericFactory<Robot.Head, HeadType> headFactory =
                new HeadFactory();

        GenericFactory<Robot.Body, BodyType> bodyFactory =
                new BodyFactory();

        HeadType[] headTypes = HeadType.values();
        BodyType[] bodyTypes = BodyType.values();

        int counter = 1;

        for (HeadType headType : headTypes) {

            for (BodyType bodyType : bodyTypes) {

                Robot.Head head = headFactory.create(headType);
                Robot.Body body = bodyFactory.create(bodyType);

                Robot<Robot.Head, Robot.Body> robot =
                        new Robot<>("Robot " + counter, head, body);

                System.out.println(robot);

                counter++;
            }
        }
    }
}
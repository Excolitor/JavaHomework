package homework.lesson8.genericRobots;

public class BodyFactory implements GenericFactory<Robot.Body, BodyType> {
    @Override
    public Robot.Body create(BodyType type) {
        return new Robot.Body(type);
    }
}
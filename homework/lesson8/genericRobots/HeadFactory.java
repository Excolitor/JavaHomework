package homework.lesson8.genericRobots;

public class HeadFactory implements GenericFactory<Robot.Head, HeadType> {
    @Override
    public Robot.Head create(HeadType type) {
        return new Robot.Head(type);
    }
}
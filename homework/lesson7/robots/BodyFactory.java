package homework.lesson7.robots;

public interface BodyFactory {
    Robot.Body createBody(BodyType type);
}

class BodyFactoryImpl implements BodyFactory {
    @Override
    public Robot.Body createBody(BodyType type) {
        return new Robot.Body(type);
    }
}
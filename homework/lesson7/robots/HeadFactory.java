package homework.lesson7.robots;

public interface HeadFactory {
    Robot.Head createHead(HeadType type);
}

class HeadFactoryImpl implements HeadFactory {
    @Override
    public Robot.Head createHead(HeadType type) {
        return new Robot.Head(type);
    }
    /////
}
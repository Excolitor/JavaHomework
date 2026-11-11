package homework.lesson8.genericRobots;

public interface GenericFactory<T, E> {
    T create(E type);
}
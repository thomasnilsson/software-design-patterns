import java.util.List;

public class CombiSpecification<T> implements Specification<T> {

    private List<Specification<T>> specs;

    public CombiSpecification(List<Specification<T>> specs) {
        this.specs = specs;
    }

    @Override
    public boolean isSatisfied(T item) {
        boolean satisfied = true;
        for (Specification<T> s : specs) {
            satisfied = satisfied && s.isSatisfied(item);
        }
        return satisfied;
    }
}

public interface IEntityRepository<T extends IEntity > {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}

//* generic constrains : to limit the class types that can be pass to here
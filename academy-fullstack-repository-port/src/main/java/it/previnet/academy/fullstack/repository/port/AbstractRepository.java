package it.previnet.academy.fullstack.repository.port;

public interface AbstractRepository<T> {
    T findByToken(Integer token);

    void persist(T entityToPersist);

    void merge(T entityToMerge);

    void flush();

    void remove(T entityToDelete);

    T findReference(Integer token);
}

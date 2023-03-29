package it.previnet.academy.fullstack.repository.port;

public interface AbstractRepository<T> {
    T findByToken(Long token);

    void persist(T entityToPersist);

    void flush();

    void remove(T entityToDelete);

    T findReference(Long token);
}

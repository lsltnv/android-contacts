package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    public boolean theSameAs(T otherItm );

    public boolean equals(Object object);

}

package by.javatr.task1.sort;

import by.javatr.task1.exception.BookListEmpthy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Sort {
    void sort(ArrayList bookList, Comparator<? super List> C) throws BookListEmpthy;
}

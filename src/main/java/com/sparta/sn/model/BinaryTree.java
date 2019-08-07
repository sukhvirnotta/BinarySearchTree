package com.sparta.sn.model;

//import org.kwd.sort.exceptions.ChildNotFoundException;
import com.sparta.sn.exception.ChildNotFoundException;

import java.util.List;

/**
 * Created by keith.dauris on 26/06/2017.
 */
public interface BinaryTree {

    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}

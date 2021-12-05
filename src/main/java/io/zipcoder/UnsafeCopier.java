package io.zipcoder;

import java.util.Iterator;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

//    public Iterator<String> stringIterator;
//    public String copied;



    public UnsafeCopier(String toCopy) {

        super(toCopy);
    }

    public void run() {
        while (stringIterator.hasNext()) {
            copied = copied + stringIterator.next();
            copied = copied + " ";
        }
    }
}

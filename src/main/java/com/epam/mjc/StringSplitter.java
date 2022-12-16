package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> list = new ArrayList<>();
        for (String delimiter : delimiters) {
            source = source.replaceAll(delimiter, " ");
        }
        String[] s = source.split(" ");
        for (String s1 : s) {
            if (!s1.equals("")){
                list.add(s1);
            }
        }
        return list;
    }
}

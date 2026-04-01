package _08_Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex08_04 {
    public static void main(String[] args) {
        String[] names = {"kim", "hong", "Lee", "Park"};

        List<String> KimList = Arrays.stream(names).filter(name -> name.equals("kim")).collect(Collectors.toList());
        System.out.println(names);
    }
}

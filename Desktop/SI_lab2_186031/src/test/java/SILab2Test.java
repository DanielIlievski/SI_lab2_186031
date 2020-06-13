import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    static List<String> createList(String...Elems) {
        return Arrays.stream(Elems)
                .collect(Collectors.toList());
    }

    @Test
    void everyBranchTest() {
        List<String> list = new ArrayList<>();

        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, ()-> SILab2.function(list));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        List<String> l1 = createList("0", "1", "#", "2", "#", "1");
        List<String> l2 = createList("0", "0", "#", "0", "#", "0");
        assertEquals(l1, SILab2.function(l2));

    }

    @Test
    void multipleConditionTest() {
        // if (i - 1 >= 0 && list.get(i - 1).equals("#"))
        // TT -> # # 0
        List<String> l1 = createList("#", "#", "1");
        List<String> l2 = createList("#", "#", "0");
        assertEquals(l1, SILab2.function(l2));
        //TF
        l1 = createList("#", "1", "0");
        l2 = createList( "#", "0", "0");
        assertEquals(l1, SILab2.function(l2));
        //FX
        l1 = createList("0");
        l2 = createList(  "0");
        assertEquals(l1, SILab2.function(l2));

        //if (i + 1 < list.size() && list.get(i + 1).equals("#"))
        // TT -> 0 # #
        l1 = createList("1", "#", "#");
        l2 = createList("0", "#", "#");
        assertEquals(l1, SILab2.function(l2));
        //TF
        l1 = createList("0", "0", "0");
        l2 = createList( "0", "0", "0");
        assertEquals(l1, SILab2.function(l2));
        //FX
        l1 = createList("0");
        l2 = createList(  "0");
        assertEquals(l1, SILab2.function(l2));
    }



}
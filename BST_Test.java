import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BST_Test {

    BST<String,String> tree = new BST<>();

    @Test
    public void testInsert() throws Exception{
        tree.insert("hello","hola");
        tree.insert("world","mundo");
    }
    
    @Test
    public void testSearch() throws Exception{
        tree.insert("hello","hola");
        tree.insert("world","mundo");
        assertEquals("hola", tree.search("hello"));
        assertEquals("mundo", tree.search("world"));
    }


}

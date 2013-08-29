package com.github.greengerong;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

public class TreeBuilder {
    public static TreesType create() {
        TreesType tree = null;
        InputStream reader = TreeBuilder.class.getResourceAsStream("/tree.xml");
        try {
            JAXBContext jc = JAXBContext.newInstance(TreesType.class);
            Unmarshaller u = jc.createUnmarshaller();
            tree = (TreesType) u.unmarshal(reader);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return tree;
    }
}

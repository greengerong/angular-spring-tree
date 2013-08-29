
package com.github.greengerong;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "trees")
public class TreesType {

    protected List<TreeType> tree;

    public List<TreeType> getTree() {
        if (tree == null) {
            tree = new ArrayList<TreeType>();
        }
        return this.tree;
    }

}

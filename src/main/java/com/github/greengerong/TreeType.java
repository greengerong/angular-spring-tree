
package com.github.greengerong;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for treeType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="treeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1-1-1"/>
 *               &lt;enumeration value="1-1"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2-1-1"/>
 *               &lt;enumeration value="2-1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tree1-1-1"/>
 *               &lt;enumeration value="tree1-1"/>
 *               &lt;enumeration value="tree1"/>
 *               &lt;enumeration value="tree1-2-1"/>
 *               &lt;enumeration value="tree1-2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="selected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tree" type="{}treeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "tree")
public class TreeType {

    @XmlElement()
    protected String id;
    @XmlElement()
    protected String name;
    @XmlElement()
    protected boolean selected;
    @XmlElement()
    protected TreeType tree;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the selected property.
     *
     * @return possible object is
     *         {@link String }
     */
    public boolean getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the tree property.
     *
     * @return possible object is
     *         {@link TreeType }
     */
    public TreeType getTree() {
        return tree;
    }

    /**
     * Sets the value of the tree property.
     *
     * @param value allowed object is
     *              {@link TreeType }
     */
    public void setTree(TreeType value) {
        this.tree = value;
    }

    public boolean isHasChild() {
        return this.tree != null;
    }

    public String getSelectedValue() {
        return selected ? "Yes" : "No";
    }

}

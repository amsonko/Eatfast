/**
 * 
 */
package eatfast.dbservice.bean;

import java.io.Serializable;

/**
 * @author amadou
 *
 */
public interface BeanI<ID> extends Serializable {
    /**
     * 
     * @return id
     */
    ID getId();
    /**
     * set id
     * @param id id
     */
    void setId(ID id);
}

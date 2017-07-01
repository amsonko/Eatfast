package eatfast.dbservice.bean.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import eatfast.dbservice.bean.IngredientI;

@Entity 
public class Ingredient implements IngredientI {

    /**
     * SERIAL ID
     */
    private static final long serialVersionUID = -5149462714111760027L;

    /**
     * id
     */
    @Id
    @Column(name = "ingeredient_id")
    private Long id;
    
    /**
     * ingredient name
     */
    private String name;

    /*** getters/setters ***/
    
    @Override
    public Long getId() {
       return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

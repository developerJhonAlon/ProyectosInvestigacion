/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe_innovativa.recursos;

import java.math.BigDecimal;

/**
 *
 * @author PC1
 */
public class DataTableColumn {
    private String header;
    private String property;
    public DataTableColumn(String header, String property) {
        this.header = header;
        this.property = property;
    }
    public String getHeader() {
        return header;
    }
    public String getProperty() {
        return property;
    }    

    public void setHeader(String header) {
        this.header = header;
    }

    public void setProperty(String property) {
        this.property = property;
    }
    
} 
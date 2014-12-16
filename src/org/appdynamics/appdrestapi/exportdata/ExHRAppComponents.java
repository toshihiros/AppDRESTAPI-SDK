/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * <application-components>
<application-component>1stTier</application-component>
</application-components>
 */
public class ExHRAppComponents {
    private ArrayList<String> appComponent;
    
    public ExHRAppComponents(){}

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<String> getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(ArrayList<String> appComponent) {
        this.appComponent = appComponent;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        for(String app:appComponent){
            bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(app);
        }
        return bud.toString();
    }
    

    public String toXML(){
        StringBuilder bud =new StringBuilder();
        for(String app:appComponent){
            bud.append(AppExportS.XElement(7, AppExportS.APPLICATION_COMPONENT, app));
        }
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.appComponent != null ? this.appComponent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExHRAppComponents other = (ExHRAppComponents) obj;
        if (this.appComponent != other.appComponent && (this.appComponent == null || !this.appComponent.equals(other.appComponent))) {
            return false;
        }
        return true;
    }
    
    
}

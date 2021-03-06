/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb.components.strings;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WDisplayString;
import com.webobjects.eocontrol.EOEnterpriseObject;

/**
 * Full blown display string with all the bells and whistles.<br />
 * Of the value displayed is an EO, uses the userPresentableDescription()
 * @d2wKey class
 * @d2wKey omitTags
 */
//FIXME AK: should actually use keyWhenRelationship
public class ERD2WDisplayString extends D2WDisplayString {
	/**
	 * Do I need to update serialVersionUID?
	 * See section 5.6 <cite>Type Changes Affecting Serialization</cite> on page 51 of the 
	 * <a href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object Serialization Spec</a>
	 */
	private static final long serialVersionUID = 1L;

    public ERD2WDisplayString(WOContext context) {
        super(context);
    }
    
    @Override
    public Object objectPropertyValue() {
    	Object object = super.objectPropertyValue();
    	if (object instanceof EOEnterpriseObject) {
			EOEnterpriseObject eo = (EOEnterpriseObject) object;
			return eo.userPresentableDescription();
		}
    	return super.objectPropertyValue();
    }
}

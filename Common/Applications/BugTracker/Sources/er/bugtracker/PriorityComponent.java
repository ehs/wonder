/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */

package er.bugtracker;
import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;

public class PriorityComponent extends WOComponent {

    public PriorityComponent(WOContext aContext) {
        super(aContext);
    }

    public EOEnterpriseObject object;
    public String key;

    public String filename() {
        Number priority=(Number)object.valueForKeyPath("priority.sortOrder");
        String result=null;
        if (priority!=null) {
            int c=priority.intValue();
            if (c==2) return "gyrophare.gif";
            else if (c==3) return "doctor.gif";
            else if (c==4) return "bandaid.gif";
            else if (c==1) return "fire.gif";
        }
        return result;
    }
}
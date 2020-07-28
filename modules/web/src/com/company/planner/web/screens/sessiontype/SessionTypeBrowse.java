package com.company.planner.web.screens.sessiontype;

import com.haulmont.cuba.gui.screen.*;
import com.company.planner.entity.SessionType;

@UiController("planner_SessionType.browse")
@UiDescriptor("session-type-browse.xml")
@LookupComponent("sessionTypesTable")
@LoadDataBeforeShow
public class SessionTypeBrowse extends StandardLookup<SessionType> {
}
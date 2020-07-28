package com.company.planner.web.screens.sessiontype;

import com.haulmont.cuba.gui.screen.*;
import com.company.planner.entity.SessionType;

@UiController("planner_SessionType.edit")
@UiDescriptor("session-type-edit.xml")
@EditedEntityContainer("sessionTypeDc")
@LoadDataBeforeShow
public class SessionTypeEdit extends StandardEditor<SessionType> {
}
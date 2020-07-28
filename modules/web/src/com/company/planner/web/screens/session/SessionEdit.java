package com.company.planner.web.screens.session;

import com.company.planner.entity.SessionType;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.planner.entity.Session;

import javax.inject.Inject;

@UiController("planner_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
    //@Inject
    //private CollectionContainer<SessionType> typesDc;
    @Inject
    protected LookupField<String> typeField;
}
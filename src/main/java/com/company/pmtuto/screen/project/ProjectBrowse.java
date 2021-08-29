package com.company.pmtuto.screen.project;

import io.jmix.ui.screen.*;
import com.company.pmtuto.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}
package com.company.pmtuto.screen.task;

import io.jmix.ui.screen.*;
import com.company.pmtuto.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}
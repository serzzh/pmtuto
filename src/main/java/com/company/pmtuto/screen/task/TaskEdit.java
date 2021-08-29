package com.company.pmtuto.screen.task;

import io.jmix.ui.screen.*;
import com.company.pmtuto.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.pmtuto.app.TaskService;


@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
    @Autowired
    private TaskService taskService; // (1)

    @Subscribe
    public void onInitEntity(InitEntityEvent<Task> event) {
        event.getEntity().setAssignee(taskService.findLeastBusyUser()); // (2)
    }
}